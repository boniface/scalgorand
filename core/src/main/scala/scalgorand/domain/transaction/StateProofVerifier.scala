package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class StateProofVerifier (
  commitment: Option[String],
  @jsonField("key-lifetime") keyLifetime: Option[BigInt]
)

object StateProofVerifier {
  private type JsonEntity = StateProofVerifier
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
