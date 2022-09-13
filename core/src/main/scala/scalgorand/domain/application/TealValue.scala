package scalgorand.domain.application

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class TealValue (
 bytes: String,
 @jsonField("type") valueType: Int,
 uint: Int
)

object TealValue {
  private type JsonEntity = TealValue
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
