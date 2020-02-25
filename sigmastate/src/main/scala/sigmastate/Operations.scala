package sigmastate

import sigmastate.lang.SigmaPredef.PredefinedFuncRegistry
import sigmastate.lang.StdSigmaBuilder

/** WARNING: This file is generated by GenInfoObjects tool.
  * Don't edit it directly, use the tool instead to regenerate.
  * The operations are alphabetically sorted.
  */
object Operations {
  val predefinedOps = new PredefinedFuncRegistry(StdSigmaBuilder)
  trait InfoObject {
    def argInfos: Seq[ArgInfo]
  }

  object ANDInfo extends InfoObject {
    private val func = predefinedOps.funcs("allOf")
    val conditionsArg: ArgInfo = func.argInfo("conditions")
    val argInfos: Seq[ArgInfo] = Array(conditionsArg)
  }

  object AppendInfo extends InfoObject {
    private val method = SMethod.fromIds(12, 9)
    val thisArg: ArgInfo = method.argInfo("this")
    val otherArg: ArgInfo = method.argInfo("other")
    val argInfos: Seq[ArgInfo] = Array(thisArg, otherArg)
  }

  object ApplyInfo extends InfoObject {
    private val func = predefinedOps.specialFuncs("apply")
    val funcArg: ArgInfo = func.argInfo("func")
    val argsArg: ArgInfo = func.argInfo("args")
    val argInfos: Seq[ArgInfo] = Array(funcArg, argsArg)
  }

  object AtLeastInfo extends InfoObject {
    private val func = predefinedOps.funcs("atLeast")
    val boundArg: ArgInfo = func.argInfo("bound")
    val childrenArg: ArgInfo = func.argInfo("children")
    val argInfos: Seq[ArgInfo] = Array(boundArg, childrenArg)
  }

  object BinAndInfo extends InfoObject {
    private val func = predefinedOps.funcs("&&")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object BinOrInfo extends InfoObject {
    private val func = predefinedOps.funcs("||")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object BinXorInfo extends InfoObject {
    private val func = predefinedOps.funcs("^")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object BitAndInfo extends InfoObject {
    private val func = predefinedOps.funcs("bit_&")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object BitInversionInfo extends InfoObject {
    private val func = predefinedOps.funcs("unary_~")
    val inputArg: ArgInfo = func.argInfo("input")
    val argInfos: Seq[ArgInfo] = Array(inputArg)
  }

  object BitOrInfo extends InfoObject {
    private val func = predefinedOps.funcs("bit_|")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object BitShiftLeftInfo extends InfoObject {
    private val func = predefinedOps.funcs("bit_<<")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object BitShiftRightInfo extends InfoObject {
    private val func = predefinedOps.funcs("bit_>>")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object BitShiftRightZeroedInfo extends InfoObject {
    private val func = predefinedOps.funcs("bit_>>>")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object BitXorInfo extends InfoObject {
    private val func = predefinedOps.funcs("bit_^")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object BoolToSigmaPropInfo extends InfoObject {
    private val func = predefinedOps.funcs("sigmaProp")
    val conditionArg: ArgInfo = func.argInfo("condition")
    val argInfos: Seq[ArgInfo] = Array(conditionArg)
  }

  object ByIndexInfo extends InfoObject {
    private val method = SMethod.fromIds(12, 2)
    val thisArg: ArgInfo = method.argInfo("this")
    val indexArg: ArgInfo = method.argInfo("index")
    val defaultArg: ArgInfo = method.argInfo("default")
    val argInfos: Seq[ArgInfo] = Array(thisArg, indexArg, defaultArg)
  }

  object ByteArrayToBigIntInfo extends InfoObject {
    private val func = predefinedOps.funcs("byteArrayToBigInt")
    val inputArg: ArgInfo = func.argInfo("input")
    val argInfos: Seq[ArgInfo] = Array(inputArg)
  }

  object ByteArrayToLongInfo extends InfoObject {
    private val func = predefinedOps.funcs("byteArrayToLong")
    val inputArg: ArgInfo = func.argInfo("input")
    val argInfos: Seq[ArgInfo] = Array(inputArg)
  }

  object CalcBlake2b256Info extends InfoObject {
    private val func = predefinedOps.funcs("blake2b256")
    val inputArg: ArgInfo = func.argInfo("input")
    val argInfos: Seq[ArgInfo] = Array(inputArg)
  }

  object CalcSha256Info extends InfoObject {
    private val func = predefinedOps.funcs("sha256")
    val inputArg: ArgInfo = func.argInfo("input")
    val argInfos: Seq[ArgInfo] = Array(inputArg)
  }

  object ConstantPlaceholderInfo extends InfoObject {
    private val func = predefinedOps.specialFuncs("placeholder")
    val indexArg: ArgInfo = func.argInfo("index")
    val argInfos: Seq[ArgInfo] = Array(indexArg)
  }

  object CreateAvlTreeInfo extends InfoObject {
    private val func = predefinedOps.funcs("avlTree")
    val operationFlagsArg: ArgInfo = func.argInfo("operationFlags")
    val digestArg: ArgInfo = func.argInfo("digest")
    val keyLengthArg: ArgInfo = func.argInfo("keyLength")
    val valueLengthOptArg: ArgInfo = func.argInfo("valueLengthOpt")
    val argInfos: Seq[ArgInfo] = Array(operationFlagsArg, digestArg, keyLengthArg, valueLengthOptArg)
  }

  object CreateProveDHTupleInfo extends InfoObject {
    private val func = predefinedOps.funcs("proveDHTuple")
    val gArg: ArgInfo = func.argInfo("g")
    val hArg: ArgInfo = func.argInfo("h")
    val uArg: ArgInfo = func.argInfo("u")
    val vArg: ArgInfo = func.argInfo("v")
    val argInfos: Seq[ArgInfo] = Array(gArg, hArg, uArg, vArg)
  }

  object CreateProveDlogInfo extends InfoObject {
    private val func = predefinedOps.funcs("proveDlog")
    val valueArg: ArgInfo = func.argInfo("value")
    val argInfos: Seq[ArgInfo] = Array(valueArg)
  }

  object DecodePointInfo extends InfoObject {
    private val func = predefinedOps.funcs("decodePoint")
    val inputArg: ArgInfo = func.argInfo("input")
    val argInfos: Seq[ArgInfo] = Array(inputArg)
  }

  object DeserializeContextInfo extends InfoObject {
    private val func = predefinedOps.funcs("executeFromVar")
    val idArg: ArgInfo = func.argInfo("id")
    val argInfos: Seq[ArgInfo] = Array(idArg)
  }

  object DeserializeRegisterInfo extends InfoObject {
    private val func = predefinedOps.funcs("executeFromSelfReg")
    val idArg: ArgInfo = func.argInfo("id")
    val defaultArg: ArgInfo = func.argInfo("default")
    val argInfos: Seq[ArgInfo] = Array(idArg, defaultArg)
  }

  object DivisionInfo extends InfoObject {
    private val func = predefinedOps.funcs("/")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object DowncastInfo extends InfoObject {
    private val func = predefinedOps.specialFuncs("downcast")
    val inputArg: ArgInfo = func.argInfo("input")
    val argInfos: Seq[ArgInfo] = Array(inputArg)
  }

  object EQInfo extends InfoObject {
    private val func = predefinedOps.funcs("==")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object ExistsInfo extends InfoObject {
    private val method = SMethod.fromIds(12, 4)
    val thisArg: ArgInfo = method.argInfo("this")
    val pArg: ArgInfo = method.argInfo("p")
    val argInfos: Seq[ArgInfo] = Array(thisArg, pArg)
  }

  object ExponentiateInfo extends InfoObject {
    private val method = SMethod.fromIds(7, 3)
    val thisArg: ArgInfo = method.argInfo("this")
    val kArg: ArgInfo = method.argInfo("k")
    val argInfos: Seq[ArgInfo] = Array(thisArg, kArg)
  }

  object ExtractAmountInfo extends InfoObject {
    private val method = SMethod.fromIds(99, 1)
    val thisArg: ArgInfo = method.argInfo("this")
    val argInfos: Seq[ArgInfo] = Array(thisArg)
  }

  object ExtractBytesInfo extends InfoObject {
    private val method = SMethod.fromIds(99, 3)
    val thisArg: ArgInfo = method.argInfo("this")
    val argInfos: Seq[ArgInfo] = Array(thisArg)
  }

  object ExtractBytesWithNoRefInfo extends InfoObject {
    private val method = SMethod.fromIds(99, 4)
    val thisArg: ArgInfo = method.argInfo("this")
    val argInfos: Seq[ArgInfo] = Array(thisArg)
  }

  object ExtractCreationInfoInfo extends InfoObject {
    private val method = SMethod.fromIds(99, 6)
    val thisArg: ArgInfo = method.argInfo("this")
    val argInfos: Seq[ArgInfo] = Array(thisArg)
  }

  object ExtractIdInfo extends InfoObject {
    private val method = SMethod.fromIds(99, 5)
    val thisArg: ArgInfo = method.argInfo("this")
    val argInfos: Seq[ArgInfo] = Array(thisArg)
  }

  object ExtractRegisterAsInfo extends InfoObject {
    private val method = SMethod.fromIds(99, 7)
    val thisArg: ArgInfo = method.argInfo("this")
    val regIdArg: ArgInfo = method.argInfo("regId")
    val argInfos: Seq[ArgInfo] = Array(thisArg, regIdArg)
  }

  object ExtractScriptBytesInfo extends InfoObject {
    private val method = SMethod.fromIds(99, 2)
    val thisArg: ArgInfo = method.argInfo("this")
    val argInfos: Seq[ArgInfo] = Array(thisArg)
  }

  object FilterInfo extends InfoObject {
    private val method = SMethod.fromIds(12, 8)
    val thisArg: ArgInfo = method.argInfo("this")
    val pArg: ArgInfo = method.argInfo("p")
    val argInfos: Seq[ArgInfo] = Array(thisArg, pArg)
  }

  object FoldInfo extends InfoObject {
    private val method = SMethod.fromIds(12, 5)
    val thisArg: ArgInfo = method.argInfo("this")
    val zeroArg: ArgInfo = method.argInfo("zero")
    val opArg: ArgInfo = method.argInfo("op")
    val argInfos: Seq[ArgInfo] = Array(thisArg, zeroArg, opArg)
  }

  object ForAllInfo extends InfoObject {
    private val method = SMethod.fromIds(12, 6)
    val thisArg: ArgInfo = method.argInfo("this")
    val pArg: ArgInfo = method.argInfo("p")
    val argInfos: Seq[ArgInfo] = Array(thisArg, pArg)
  }

  object GEInfo extends InfoObject {
    private val func = predefinedOps.funcs(">=")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object GTInfo extends InfoObject {
    private val func = predefinedOps.funcs(">")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object GetVarInfo extends InfoObject {
    private val func = predefinedOps.funcs("getVar")
    val varIdArg: ArgInfo = func.argInfo("varId")
    val argInfos: Seq[ArgInfo] = Array(varIdArg)
  }

  object GroupGeneratorInfo extends InfoObject {
    private val method = SMethod.fromIds(106, 1)
    val thisArg: ArgInfo = method.argInfo("this")
    val argInfos: Seq[ArgInfo] = Array(thisArg)
  }

  object HeightInfo extends InfoObject {
    private val method = SMethod.fromIds(101, 6)
    val thisArg: ArgInfo = method.argInfo("this")
    val argInfos: Seq[ArgInfo] = Array(thisArg)
  }

  object IfInfo extends InfoObject {
    private val func = predefinedOps.specialFuncs("if")
    val conditionArg: ArgInfo = func.argInfo("condition")
    val trueBranchArg: ArgInfo = func.argInfo("trueBranch")
    val falseBranchArg: ArgInfo = func.argInfo("falseBranch")
    val argInfos: Seq[ArgInfo] = Array(conditionArg, trueBranchArg, falseBranchArg)
  }

  object InputsInfo extends InfoObject {
    private val method = SMethod.fromIds(101, 4)
    val thisArg: ArgInfo = method.argInfo("this")
    val argInfos: Seq[ArgInfo] = Array(thisArg)
  }

  object LEInfo extends InfoObject {
    private val func = predefinedOps.funcs("<=")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object LTInfo extends InfoObject {
    private val func = predefinedOps.funcs("<")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object LastBlockUtxoRootHashInfo extends InfoObject {
    private val method = SMethod.fromIds(101, 9)
    val thisArg: ArgInfo = method.argInfo("this")
    val argInfos: Seq[ArgInfo] = Array(thisArg)
  }

  object LogicalNotInfo extends InfoObject {
    private val func = predefinedOps.funcs("unary_!")
    val inputArg: ArgInfo = func.argInfo("input")
    val argInfos: Seq[ArgInfo] = Array(inputArg)
  }

  object LongToByteArrayInfo extends InfoObject {
    private val func = predefinedOps.funcs("longToByteArray")
    val inputArg: ArgInfo = func.argInfo("input")
    val argInfos: Seq[ArgInfo] = Array(inputArg)
  }

  object MapCollectionInfo extends InfoObject {
    private val method = SMethod.fromIds(12, 3)
    val thisArg: ArgInfo = method.argInfo("this")
    val fArg: ArgInfo = method.argInfo("f")
    val argInfos: Seq[ArgInfo] = Array(thisArg, fArg)
  }

  object MaxInfo extends InfoObject {
    private val func = predefinedOps.funcs("max")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object MinInfo extends InfoObject {
    private val func = predefinedOps.funcs("min")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object MinerPubkeyInfo extends InfoObject {
    private val method = SMethod.fromIds(101, 10)
    val thisArg: ArgInfo = method.argInfo("this")
    val argInfos: Seq[ArgInfo] = Array(thisArg)
  }

  object MinusInfo extends InfoObject {
    private val func = predefinedOps.funcs("-")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object ModuloInfo extends InfoObject {
    private val func = predefinedOps.funcs("%")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object MultiplyInfo extends InfoObject {
    private val func = predefinedOps.funcs("*")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object MultiplyGroupInfo extends InfoObject {
    private val method = SMethod.fromIds(7, 4)
    val thisArg: ArgInfo = method.argInfo("this")
    val otherArg: ArgInfo = method.argInfo("other")
    val argInfos: Seq[ArgInfo] = Array(thisArg, otherArg)
  }

  object NEQInfo extends InfoObject {
    private val func = predefinedOps.funcs("!=")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object NegationInfo extends InfoObject {
    private val func = predefinedOps.funcs("unary_-")
    val inputArg: ArgInfo = func.argInfo("input")
    val argInfos: Seq[ArgInfo] = Array(inputArg)
  }

  object ORInfo extends InfoObject {
    private val func = predefinedOps.funcs("anyOf")
    val conditionsArg: ArgInfo = func.argInfo("conditions")
    val argInfos: Seq[ArgInfo] = Array(conditionsArg)
  }

  object OptionGetInfo extends InfoObject {
    private val method = SMethod.fromIds(36, 3)
    val thisArg: ArgInfo = method.argInfo("this")
    val argInfos: Seq[ArgInfo] = Array(thisArg)
  }

  object OptionGetOrElseInfo extends InfoObject {
    private val method = SMethod.fromIds(36, 4)
    val thisArg: ArgInfo = method.argInfo("this")
    val defaultArg: ArgInfo = method.argInfo("default")
    val argInfos: Seq[ArgInfo] = Array(thisArg, defaultArg)
  }

  object OptionIsDefinedInfo extends InfoObject {
    private val method = SMethod.fromIds(36, 2)
    val thisArg: ArgInfo = method.argInfo("this")
    val argInfos: Seq[ArgInfo] = Array(thisArg)
  }

  object OutputsInfo extends InfoObject {
    private val method = SMethod.fromIds(101, 5)
    val thisArg: ArgInfo = method.argInfo("this")
    val argInfos: Seq[ArgInfo] = Array(thisArg)
  }

  object PlusInfo extends InfoObject {
    private val func = predefinedOps.funcs("+")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object SelectFieldInfo extends InfoObject {
    private val func = predefinedOps.specialFuncs("selectField")
    val inputArg: ArgInfo = func.argInfo("input")
    val fieldIndexArg: ArgInfo = func.argInfo("fieldIndex")
    val argInfos: Seq[ArgInfo] = Array(inputArg, fieldIndexArg)
  }

  object SelfInfo extends InfoObject {
    private val method = SMethod.fromIds(101, 7)
    val thisArg: ArgInfo = method.argInfo("this")
    val argInfos: Seq[ArgInfo] = Array(thisArg)
  }

  object SigmaAndInfo extends InfoObject {
    private val func = predefinedOps.funcs("allZK")
    val propositionsArg: ArgInfo = func.argInfo("propositions")
    val argInfos: Seq[ArgInfo] = Array(propositionsArg)
  }

  object SigmaOrInfo extends InfoObject {
    private val func = predefinedOps.funcs("anyZK")
    val propositionsArg: ArgInfo = func.argInfo("propositions")
    val argInfos: Seq[ArgInfo] = Array(propositionsArg)
  }

  object SigmaPropBytesInfo extends InfoObject {
    private val method = SMethod.fromIds(8, 1)
    val thisArg: ArgInfo = method.argInfo("this")
    val argInfos: Seq[ArgInfo] = Array(thisArg)
  }

  object SizeOfInfo extends InfoObject {
    private val method = SMethod.fromIds(12, 1)
    val thisArg: ArgInfo = method.argInfo("this")
    val argInfos: Seq[ArgInfo] = Array(thisArg)
  }

  object SliceInfo extends InfoObject {
    private val method = SMethod.fromIds(12, 7)
    val thisArg: ArgInfo = method.argInfo("this")
    val fromArg: ArgInfo = method.argInfo("from")
    val untilArg: ArgInfo = method.argInfo("until")
    val argInfos: Seq[ArgInfo] = Array(thisArg, fromArg, untilArg)
  }

  object SubstConstantsInfo extends InfoObject {
    private val func = predefinedOps.funcs("substConstants")
    val scriptBytesArg: ArgInfo = func.argInfo("scriptBytes")
    val positionsArg: ArgInfo = func.argInfo("positions")
    val newValuesArg: ArgInfo = func.argInfo("newValues")
    val argInfos: Seq[ArgInfo] = Array(scriptBytesArg, positionsArg, newValuesArg)
  }

  object TreeLookupInfo extends InfoObject {
    private val func = predefinedOps.specialFuncs("treeLookup")
    val treeArg: ArgInfo = func.argInfo("tree")
    val keyArg: ArgInfo = func.argInfo("key")
    val proofArg: ArgInfo = func.argInfo("proof")
    val argInfos: Seq[ArgInfo] = Array(treeArg, keyArg, proofArg)
  }

  object UpcastInfo extends InfoObject {
    private val func = predefinedOps.specialFuncs("upcast")
    val inputArg: ArgInfo = func.argInfo("input")
    val argInfos: Seq[ArgInfo] = Array(inputArg)
  }

  object XorInfo extends InfoObject {
    private val func = predefinedOps.funcs("binary_|")
    val leftArg: ArgInfo = func.argInfo("left")
    val rightArg: ArgInfo = func.argInfo("right")
    val argInfos: Seq[ArgInfo] = Array(leftArg, rightArg)
  }

  object XorOfInfo extends InfoObject {
    private val func = predefinedOps.funcs("xorOf")
    val conditionsArg: ArgInfo = func.argInfo("conditions")
    val argInfos: Seq[ArgInfo] = Array(conditionsArg)
  }

}
