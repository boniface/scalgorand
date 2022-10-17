package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class IndexerStateProofMessage (
  @jsonField("block-headers-commitment") blockHeadersCommitment: Option[String],
  @jsonField("field-attested-round") fieldAttestedRound: Option[BigInt],
  @jsonField("latest-attested-round") latestAttestedRound: Option[BigInt],
  @jsonField("ln-proven-weight") lnProvenWeight: Option[BigInt],
  @jsonField("voters-commitment") votersCommitment: Option[String]
)

object IndexerStateProofMessage {
  private type JsonEntity = IndexerStateProofMessage
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
