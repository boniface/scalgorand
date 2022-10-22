package scalgorand.domain.accounts

import scalgorand.domain.transaction.{TransactionInformation}
import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class AccountTransaction(
  transactions: List[TransactionInformation],
  @jsonField("current-round") currentRound: Int,
  @jsonField("next-token") nextToken: Option[String]
)

object AccountTransaction {
  private type JsonEntity = AccountTransaction
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
