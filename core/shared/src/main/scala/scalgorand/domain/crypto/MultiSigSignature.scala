package scalgorand.domain.crypto

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class MultiSigSignature(
  version: Int,
  threshold: Int,
  subSigs: List[MultiSigSubSignature]
)

object MultiSigSignature {
  private type JsonEntity = MultiSigSignature
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
