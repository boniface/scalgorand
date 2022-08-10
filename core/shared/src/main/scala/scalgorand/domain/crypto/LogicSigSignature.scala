package scalgorand.domain.crypto

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class LogicSigSignature(
 logic: Array[Byte],
 args: List[Array[Byte]],
 sig: Signature,
 mSig: MultiSigSignature
)

object LogicSigSignature {
  private type JsonEntity = LogicSigSignature
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
