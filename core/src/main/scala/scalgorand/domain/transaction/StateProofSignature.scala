package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class StateProofSignature (
  proof: Option[MerkleArrayProof],
  @jsonField("falcon-signature") falconSignature: Option[String],
  @jsonField("merkle-array-index") merkleArrayIndex: Option[Int],
  @jsonField("verifying-key") verifyingKey: Option[String]
)

object StateProofSignature {
  private type JsonEntity = StateProofSignature
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
