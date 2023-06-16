package scalgorand.domain.transaction
import scalgorand.domain.application.ApplicationStateSchema
import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class TransactionApplication(
  accounts: Option[List[String]],
  @jsonField("application-args") applicationArgs: Option[List[String]],
  @jsonField("application-id") applicationId: Int,
  @jsonField("approval-program") approvalProgram: Option[String],
  @jsonField("clear-state-program") clearStateProgram: Option[String],
  @jsonField("extra-program-pages") extraProgramPages: Option[Int],
  @jsonField("foreign-apps") foreignApps: Option[List[Int]],
  @jsonField("foreign-assets") foreignAssets: Option[List[Int]],
  @jsonField("global-state-schema") globalStateSchema: Option[ApplicationStateSchema],
  @jsonField("local-state-schema") localStateSchema: Option[ApplicationStateSchema],
  @jsonField("on-completion") onCompletion: String//OnCompletion
)

object TransactionApplication {
  private type JsonEntity = TransactionApplication
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}