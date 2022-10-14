package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class TransactionAssetFreeze (
  address: String,
  @jsonField("asset-id") assetId: Int,
  @jsonField("new-freeze-status") newFreezeStatus: Boolean
)

object  TransactionAssetFreeze {
  private type JsonEntity = TransactionAssetFreeze
  implicit val decoder: JsonDecoder[TransactionAssetFreeze] = DeriveJsonDecoder.gen[TransactionAssetFreeze]
  implicit val encoder: JsonEncoder[TransactionAssetFreeze] = DeriveJsonEncoder.gen[TransactionAssetFreeze]
}
