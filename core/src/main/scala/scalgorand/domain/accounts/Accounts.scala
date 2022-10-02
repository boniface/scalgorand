package scalgorand.domain.accounts

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class Accounts (
  @jsonField("next-token") nextToken: String,
  @jsonField("current-round") currentRound: BigInt,
  accounts: List[Account]
)

object Accounts {
  private type JsonEntity = Accounts
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
