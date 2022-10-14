package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class StateProofReveal (
  participant: Option[StateProofParticipant],
  position: Option[Int],
  @jsonField("sig-slot") sigSlot: Option[StateProofSigSlot]
)

object StateProofReveal {
  private type JsonEntity = StateProofReveal
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}