package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class TransactionSignature (
  logicsig: Option[TransactionSignatureLogicsig],
  multisig: Option[TransactionSignatureMultisig],
  sig: Option[String]
)

object TransactionSignature {
  private type JsonEntity = TransactionSignature
  implicit val decoder: JsonDecoder[TransactionSignature] = DeriveJsonDecoder.gen[TransactionSignature]
  implicit val encoder: JsonEncoder[TransactionSignature] = DeriveJsonEncoder.gen[TransactionSignature]
}
