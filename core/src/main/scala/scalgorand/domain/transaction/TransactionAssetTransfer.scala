package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class TransactionAssetTransfer (
  amount: Int,
  @jsonField("asset-id") assetId: Int,
  @jsonField("close-amount") closeAmount: Option[BigInt],
  @jsonField("close-to") closeTo: Option[String],
  receiver: String,
  sender: Option[String]
)

object TransactionAssetTransfer {
  private type JsonEntity = TransactionAssetTransfer
  implicit val decoder: JsonDecoder[TransactionAssetTransfer] = DeriveJsonDecoder.gen[TransactionAssetTransfer]
  implicit val encoder: JsonEncoder[TransactionAssetTransfer] = DeriveJsonEncoder.gen[TransactionAssetTransfer]
}
