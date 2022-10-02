package scalgorand.domain.accounts

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class AccountParticipation (
  @jsonField("state-proof-key") stateProofKey: Option[String],
  @jsonField("vote-participation-key") voteParticipationKey: String,
  @jsonField("vote-last-valid") voteLastValid: BigInt,
  @jsonField("vote-key-dilution") voteKeyDilution: BigInt,
  @jsonField("vote-first-valid") voteFirstValid: BigInt,
  @jsonField("selection-participation-key") selectionParticipationKey: String,
)

object AccountParticipation {
  private type JsonEntity = AccountParticipation
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
