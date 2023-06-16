package scalgorand.domain.accounts

import scalgorand.domain.application.{ApplicationLocalState, ApplicationParams}
import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class AccountApplication(
  @jsonField("app-local-state") appLocalState: Option[ApplicationLocalState],
  @jsonField("created-app") createdApp: Option[ApplicationParams],
  round: BigInt
)

object AccountApplication {
  private type JsonEntity = AccountApplication
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
