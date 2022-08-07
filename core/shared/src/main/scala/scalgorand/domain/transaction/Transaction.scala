package scalgorand.domain.transaction

import com.algorand.algosdk.algod.client.model.TransactionResults
import scalgorand.domain.accounts.Address
import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class Transaction(
  fee: BigInt,
  firstRound: BigInt,
  from: String,
  fromRewards: BigInt,
  genesisId: String,
  genesisHash: Byte,
  lastRound: BigInt,
  noteB64: Byte,
  payment: PaymentTransactionType,
  poolError: String,
  round: BigInt,
  tx: String,
  createdAssets: BigInt,
  txtype: String,
  sender: Option[Address],
  xferAssetId: Option[BigInt],
  assetAmount: Option[BigInt]
  )

object Transaction {
  private type JsonEntity = Transaction
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}