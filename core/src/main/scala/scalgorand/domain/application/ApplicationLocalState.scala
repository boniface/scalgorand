package scalgorand.domain.application

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class ApplicationLocalState(
  id: Int,
  schema: ApplicationStateSchema,
  @jsonField("key-value") keyValue: List[TealKeyValue]
)

object ApplicationLocalState {
  private type JsonEntity = ApplicationLocalState
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
