package sigmastate.serialization

import sigmastate.SType.TypeCode
import sigmastate.Values.Value
import sigmastate.serialization.ValueSerializer.{deserialize, serialize}
import sigmastate.{SType, TwoArgumentsOperation}

case class TwoArgumentsSerializer[ArgType <: SType, Operation <: TwoArgumentsOperation[ArgType, ArgType, ArgType]](
   override val opCode: Byte,
   constructor: (Value[ArgType], Value[ArgType]) => Operation
 ) extends ValueSerializer[Operation] {

  override def parseBody(bytes: Array[TypeCode], pos: companion.Position): (Value[SType], companion.Consumed) = {
    val (firstArg, consumed) = deserialize(bytes, pos)
    val (secondArg, consumed2) = deserialize(bytes, pos + consumed)

    (constructor(firstArg.asInstanceOf[Value[ArgType]], secondArg.asInstanceOf[Value[ArgType]]), consumed + consumed2)
  }

  override def serializeBody(operation: Operation): Array[TypeCode] =
    serialize(operation.left) ++ serialize(operation.right)
}
