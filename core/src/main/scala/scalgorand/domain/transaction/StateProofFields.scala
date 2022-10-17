package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class StateProofFields (
  reveals: Option[StateProofReveal],
  @jsonField("part-proof") partProof: Option[MerkleArrayProof],
  @jsonField("position-to-reveal") positiontoReveal: Option[List[Int]],
  @jsonField("salt-version") saltVersion: Option[Int],
  @jsonField("sig-commit") sigCommit: Option[String],
  @jsonField("sig-proofs") sigProofs: Option[MerkleArrayProof],
  @jsonField("signed-weight") signedWeight: Option[Int]
 )

object StateProofFields {
  private type JsonEntity = StateProofFields
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
