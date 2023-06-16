package scalgorand.domain.teal

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class Disassemble(
  result: String
)

object Disassemble {
  private type JsonEntity = Disassemble
  implicit val decoder: JsonDecoder[Disassemble] = DeriveJsonDecoder.gen[Disassemble]
  implicit val encoder: JsonEncoder[Disassemble] = DeriveJsonEncoder.gen[Disassemble]
}
