package scalgorand.domain.accounts

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class AssetHolding(
  amount: BigInt,
  @jsonField("asset-id") assetId: BigInt,
  @jsonField("is-frozen") isFrozen: Boolean,
)

object AssetHolding {
  private type JsonEntity = AssetHolding
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
