package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class Transactions(
  @jsonField("current-round") currentRound: BigInt,
  @jsonField("next-token") nextToken: Option[String],
  transactions: List[TransactionInformation]
)

object Transactions {
  private type JsonEntity = Transactions
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
