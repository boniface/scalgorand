package scalgorand.domain.crypto

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class MultiSigSubSignature(
  key: Ed25519PublicKey,
  signature: Signature
)

object MultiSigSubSignature {
  private type JsonEntity = MultiSigSubSignature
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
