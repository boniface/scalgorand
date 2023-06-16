package scalgorand.domain.application

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class ApplicationStateSchema (
  @jsonField("num-byte-slice") numByteSlice: Int,
  @jsonField("num-uint") numUint: Int
)

object ApplicationStateSchema {
  private type JsonEntity = ApplicationStateSchema
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
