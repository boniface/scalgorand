package scalgorand.domain.accounts

import scalgorand.domain.asset.AssetParams
import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class AccountAsset (
  @jsonField("asset-holding") assetHolding: Option[AssetHolding],
  @jsonField("created-asset") createdAsset: Option[AssetParams],
  round: Int
)

object AccountAsset {
  private type JsonEntity = AccountAsset
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
