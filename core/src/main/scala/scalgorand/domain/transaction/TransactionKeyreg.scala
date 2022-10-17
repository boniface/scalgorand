package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class TransactionKeyreg (
  @jsonField("non-participation") nonParticipation: Option[Boolean],
  @jsonField("selection-participation-key") selectionParticipationKey: Option[String],
  @jsonField("state-proof-key") stateProofKey: Option[String],
  @jsonField("vote-first-valid") voteFirstValid: Option[BigInt],
  @jsonField("vote-key-dilution") voteKeyDilution: Option[Int],
  @jsonField("vote-last-valid") voteLastValid: Option[BigInt],
  @jsonField("vote-participation-key") voteParticipationKey: Option[BigInt],
)

object TransactionKeyreg {
  private type JsonEntity = TransactionKeyreg
  implicit val decoder: JsonDecoder[TransactionKeyreg] = DeriveJsonDecoder.gen[TransactionKeyreg]
  implicit val encoder: JsonEncoder[TransactionKeyreg] = DeriveJsonEncoder.gen[TransactionKeyreg]
}
