package scalgorand.domain.node

import scalgorand.domain.transaction.Transaction
import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class Block(
  earn: Int,
  fees: String,
  proto: String,
  frac: BigInt,
  nextproto: String,
  gen: String,
  gh: String,
  nextyes: BigInt,
  nextswitch: BigInt,
  nextbefore: BigInt,
  period: Option[BigInt],
  prev: String,
  prosper: Option[String],
  rate: Option[BigInt],
  rwd: Option[String],
  rwcalr: Option[BigInt],
  rnd: BigInt,
  seed: String,
  ts: BigInt,
  txns: Option[List[Transaction]],
  upgradeyes: Boolean,
  upgradepropose: Option[String]
  )

object Block {
  private type JsonEntity = Block
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}