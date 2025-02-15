package sigmastate.interpreter

import sigmastate.{NodePosition, ProofTree, SigSerializer, SigmaConjecture, SigmaProofOfKnowledgeLeaf, UncheckedConjecture, UncheckedLeaf, UncheckedSigmaTree}
import sigmastate.Values.{ErgoTree, SigmaBoolean}
import sigmastate.basics.DLogProtocol.{DLogInteractiveProver, ProveDlog}
import sigmastate.basics.{DiffieHellmanTupleInteractiveProver, ProveDHTuple}
import sigmastate.basics.VerifierMessage.Challenge


trait ProverUtils extends Interpreter {

  /**
    * Generate commitments for a given ergoTree (mixed-tree) and public keys.
    *
    * First, the given tree is to be reduced to crypto-tree (sigma-tree) by using context provided.
    */
  def generateCommitmentsFor(ergoTree: ErgoTree,
                             context: CTX,
                             generateFor: Seq[SigmaBoolean]): HintsBag = {
    val (aotRes, jitRes) = fullReduction(ergoTree, context, Interpreter.emptyEnv)
    val evalMode = getEvaluationMode(context)
    val reducedTree = if (evalMode.okEvaluateAot) aotRes.value else jitRes.value
    generateCommitmentsFor(reducedTree, generateFor)
  }

  /**
    * A method which is is generating commitments for all the public keys provided.
    *
    * Currently only keys in form of ProveDlog and ProveDiffieHellman are supported, not more complex subtrees.
    *
    * @param sigmaTree - crypto-tree
    * @param generateFor - public keys for which commitments should be generated
    * @return generated commitments (private, containing secret randomness, and public, containing only commitments)
    */
  def generateCommitmentsFor(sigmaTree: SigmaBoolean,
                             generateFor: Seq[SigmaBoolean]): HintsBag = {

    def traverseNode(sb: SigmaBoolean,
                     bag: HintsBag,
                     position: NodePosition): HintsBag = {
      sb match {
        case sc: SigmaConjecture =>
          sc.children.zipWithIndex.foldLeft(bag) { case (b, (child, idx)) =>
            traverseNode(child, b, position.child(idx))
          }
        case leaf: SigmaProofOfKnowledgeLeaf[_, _] =>
          if (generateFor.contains(leaf)) {
            val (r, a) = leaf match {
              case _: ProveDlog =>
                DLogInteractiveProver.firstMessage()
              case pdh: ProveDHTuple =>
                DiffieHellmanTupleInteractiveProver.firstMessage(pdh)
              case _ => ???
            }
            val hints = Seq(OwnCommitment(leaf, r, a, position), RealCommitment(leaf, a, position))
            bag.addHints(hints: _*)
          } else {
            bag
          }
      }
    }

    traverseNode(sigmaTree, HintsBag.empty, position = NodePosition.CryptoTreePrefix)
  }

  /**
    * A method which is extracting partial proofs of secret knowledge for particular secrets with their
    * respective public images given. Useful for distributed signature applications.
    *
    * See DistributedSigSpecification for examples of usage.
    *
    * @param context                   - context used to reduce the proposition
    * @param ergoTree                 - proposition to reduce
    * @param proof                     - proof for reduced proposition
    * @param realSecretsToExtract      - public keys of secrets with real proofs
    * @param simulatedSecretsToExtract - public keys of secrets with simulated proofs
    * @return - bag of OtherSecretProven and OtherCommitment hints
    */
  def bagForMultisig(context: CTX,
                     ergoTree: ErgoTree,
                     proof: Array[Byte],
                     realSecretsToExtract: Seq[SigmaBoolean],
                     simulatedSecretsToExtract: Seq[SigmaBoolean] = Seq.empty): HintsBag = {
    val (aotRes, jitRes) = fullReduction(ergoTree, context, Interpreter.emptyEnv)
    val evalMode = getEvaluationMode(context)
    val reducedTree = if (evalMode.okEvaluateAot) aotRes.value else jitRes.value
    bagForMultisig(context, reducedTree, proof, realSecretsToExtract, simulatedSecretsToExtract)
  }

  /**
    * A method which is extracting partial proofs of secret knowledge for particular secrets with their
    * respective public images given. Useful for distributed signature applications.
    *
    * See DistributedSigSpecification for examples of usage.
    *
    * @param context                   - context used to reduce the proposition
    * @param sigmaTree                 - public key (in form of a sigma-tree)
    * @param proof                     - signature for the key
    * @param realSecretsToExtract      - public keys of secrets with real proofs
    * @param simulatedSecretsToExtract - public keys of secrets with simulated proofs
    * @return - bag of OtherSecretProven and OtherCommitment hints
    */
  def bagForMultisig(context: CTX,
                     sigmaTree: SigmaBoolean,
                     proof: Array[Byte],
                     realSecretsToExtract: Seq[SigmaBoolean],
                     simulatedSecretsToExtract: Seq[SigmaBoolean]): HintsBag = {

    val ut = SigSerializer.parseAndComputeChallenges(sigmaTree, proof)(null)
    val proofTree = computeCommitments(ut).get.asInstanceOf[UncheckedSigmaTree]

    def traverseNode(tree: ProofTree,
                     realPropositions: Seq[SigmaBoolean],
                     simulatedPropositions: Seq[SigmaBoolean],
                     hintsBag: HintsBag,
                     position: NodePosition): HintsBag = {
      tree match {
        case inner: UncheckedConjecture =>
          inner.children.zipWithIndex.foldLeft(hintsBag) { case (hb, (c, idx)) =>
            traverseNode(c, realPropositions, simulatedPropositions, hb, position.child(idx))
          }
        case leaf: UncheckedLeaf[_] =>
          val realFound = realPropositions.contains(leaf.proposition)
          val simulatedFound = simulatedPropositions.contains(leaf.proposition)
          if (realFound || simulatedFound) {
            val hints = if (realFound) {
              Seq(
                RealCommitment(leaf.proposition, leaf.commitmentOpt.get, position),
                RealSecretProof(leaf.proposition, Challenge @@ leaf.challenge, leaf, position)
              )
            } else {
              Seq(
                SimulatedCommitment(leaf.proposition, leaf.commitmentOpt.get, position),
                SimulatedSecretProof(leaf.proposition, Challenge @@ leaf.challenge, leaf, position)
              )
            }
            hintsBag.addHints(hints: _*)
          } else hintsBag
      }
    }

    traverseNode(proofTree, realSecretsToExtract, simulatedSecretsToExtract, HintsBag.empty, NodePosition.CryptoTreePrefix)
  }

}
