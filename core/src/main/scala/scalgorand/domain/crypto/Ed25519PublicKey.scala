package scalgorand.domain.crypto

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class Ed25519PublicKey(
  bytes: Array[Byte]
)

object Ed25519PublicKey {
  private type JsonEntity = Ed25519PublicKey
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
