package scalgorand.domain.node

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class WaitForBlock (
  catchpoint: Option[String],
  @jsonField("catchpoint-acquired-blocks") catchPointAcquiredBlocks: Option[BigInt],
  @jsonField("catchpoint-processed-accounts") catchPointProcessedAccounts: Option[BigInt],
  @jsonField("catchpoint-processed-kvs") catchPointProcessedKVs: Option[BigInt],
  @jsonField("catchpoint-total-accounts") catchPointTotalAccounts: Option[BigInt],
  @jsonField("catchpoint-total-blocks") catchPointTotalBlocks: Option[BigInt],
  @jsonField("catchpoint-total-kvs") catchPointTotalKvs: Option[BigInt],
  @jsonField("catchpoint-verified-accounts") catchPointVerifiedAccounts: Option[BigInt],
  @jsonField("catchpoint-verified-kvs") catchPointVerifiedKvs: Option[BigInt],
  @jsonField("catchup-time") catchUpTime: BigInt,
  @jsonField("last-catchpoint") lastCatchpoint: Option[String],
  @jsonField("last-round") lastRound: BigInt,
  @jsonField("last-version") lastVersion: String,
  @jsonField("next-version") nextVersion: String,
  @jsonField("next-version-round") nextVersionRound: BigInt,
  @jsonField("next-version-supported") nextVersionSupported: Boolean,
  @jsonField("stopped-at-unsupported-round") stoppedAtUnsupportedRound: Boolean,
  @jsonField("time-since-last-round") timeSinceLastRound: BigInt
)

object WaitForBlock {
  private type JsonEntity = WaitForBlock
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encode: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
