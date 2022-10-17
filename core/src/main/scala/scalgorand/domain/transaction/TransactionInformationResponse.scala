package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class TransactionInformationResponse (
  @jsonField("current-round") currentRound: Int,
  transaction: TransactionInformation
)

object TransactionInformationResponse {
  private type JsonEntity = TransactionInformationResponse
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
