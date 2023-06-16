package scalgorand.domain.application

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class ApplicationLocalState(
  id: Int,
  schema: ApplicationStateSchema,
  deleted: Option[Boolean],
  @jsonField("key-value") keyValue: List[TealKeyValue],
  @jsonField("opted-in-at-round") optedInAtRound: Option[Int],
  @jsonField("closed-out-at-round") closedOutAtRound: Option[Int]
)

object ApplicationLocalState {
  private type JsonEntity = ApplicationLocalState
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
