package scalgorand.domain.application

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class ApplicationParams (
  creator: String,
  @jsonField("approval-program") approvalProgram: String,
  @jsonField("clear-state-program") clearStateProgram: String,
  @jsonField("extra-program-pages") extraProgramPages: Option[Int],
  @jsonField("global-state") globalState: Option[List[TealKeyValue]],
  @jsonField("global-state-schema") globalStateSchema: Option[ApplicationStateSchema],
  @jsonField("local-state-schema") localStateSchema: Option[ApplicationStateSchema]
)

object ApplicationParams {
  private type JsonEntity = ApplicationParams
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
