package scalgorand.domain.accounts

import scalgorand.domain.asset.{AssetParams, MiniAssetHolding}
import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class AccountAsset (
  assetHolding: Option[MiniAssetHolding],
  createdAsset: Option[AssetParams],
  round: Int
)

object AccountAsset {
  private type JsonEntity = AccountAsset
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
