package sigmastate.serialization

import sigmastate.basics.DLogProtocol.ProveDlog
import sigmastate.SGroupElement
import sigmastate.Values.{SigmaBoolean, Value}
import sigmastate.lang.Terms._
import sigmastate.serialization.OpCodes.OpCode
import sigmastate.utils.{SigmaByteReader, SigmaByteWriter}
import sigma.util.Extensions._

case class ProveDlogSerializer(cons: Value[SGroupElement.type] => SigmaBoolean)
  extends SigmaSerializer[ProveDlog, ProveDlog] {

  override def serializeBody(obj: ProveDlog, w: SigmaByteWriter): Unit =
    w.putValue(obj.value)

  override def parseBody(r: SigmaByteReader): SigmaBoolean =
    cons(r.getValue().asValue[SGroupElement.type])
}
