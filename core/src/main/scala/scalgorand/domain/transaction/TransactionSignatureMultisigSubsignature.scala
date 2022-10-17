package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class TransactionSignatureMultisigSubsignature (
  @jsonField("public-key") publicKey: Option[String],
  signature: String
)

object TransactionSignatureMultisigSubsignature {
  private type JsonEntity = TransactionSignatureMultisigSubsignature
  implicit val decoder: JsonDecoder[TransactionSignatureMultisigSubsignature] = DeriveJsonDecoder.gen[TransactionSignatureMultisigSubsignature]
  implicit val encoder: JsonEncoder[TransactionSignatureMultisigSubsignature] = DeriveJsonEncoder.gen[TransactionSignatureMultisigSubsignature]
}
