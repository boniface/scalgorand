package scalgorand.domain.asset

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class Balances(
  balances: List[MiniAssetHolding],
  @jsonField("current-round") currentRound: BigInt,
  @jsonField("next-token") nextToken: Option[String],
)

object Balances {
  private type JsonEntity = Balances
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
