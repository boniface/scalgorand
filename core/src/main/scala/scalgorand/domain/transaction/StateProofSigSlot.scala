package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class StateProofSigSlot (
  @jsonField("lower-sig-weight") lowerSigWeight: Option[Int],
  signature: Option[StateProofSignature]
)

object StateProofSigSlot {
  private type JsonEntity = StateProofSigSlot
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}