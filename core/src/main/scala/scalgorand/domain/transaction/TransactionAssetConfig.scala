package scalgorand.domain.transaction

import scalgorand.domain.asset.AssetParams
import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class TransactionAssetConfig (
  @jsonField("asset-id") assetId: Int,
  params: AssetParams
)

object TransactionAssetConfig {
  private type JsonEntity = TransactionAssetConfig
  implicit val decoder: JsonDecoder[TransactionAssetConfig] = DeriveJsonDecoder.gen[TransactionAssetConfig]
  implicit val encoder: JsonEncoder[TransactionAssetConfig] = DeriveJsonEncoder.gen[TransactionAssetConfig
  ]
}
