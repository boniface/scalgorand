package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class TransactionStateProof (
  message: Option[IndexerStateProofMessage],
  @jsonField("state-proof") stateProof: Option[StateProofFields],
  @jsonField("state-proof-type") stateProofType: Option[Int]
)

object TransactionStateProof {
  private type JsonEntity = TransactionStateProof
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}