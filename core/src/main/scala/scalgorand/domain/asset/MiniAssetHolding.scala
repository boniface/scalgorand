package scalgorand.domain.asset

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class MiniAssetHolding (
  address: String,
  amount: BigInt,
  deleted: Option[Boolean],
  @jsonField("is-frozen") isFrozen: Boolean,
  @jsonField("opt-in-at-round") optInAtRound: Option[BigInt],
  @jsonField("opt-out-at-round") optOutAtRound: Option[BigInt]
)

object MiniAssetHolding {
  private type JsonEntity = MiniAssetHolding
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encode: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
