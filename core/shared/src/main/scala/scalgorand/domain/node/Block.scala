package scalgorand.domain.node

import scalgorand.domain.transaction.Transaction
import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class Block(
  currentProtocol: String,
  frac: BigInt,
  hash: String,
  nextProtocol: String,
  nextProtocolApprovals: BigInt,
  nextProtocolSwitchOn: BigInt,
  nextProtocolBefore: BigInt,
  period: BigInt,
  previousHash: String,
  prosper: String,
  rate: BigInt,
  reward: BigInt,
  round: BigInt,
  seed: BigInt,
  timestamp: BigInt,
  txns: List[Transaction],
  upgradeApprove: Boolean,
  upgradePropose: String
  )

object Block {
  private type JsonEntity = Block
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}