package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class TransactionSignatureMultisig (
  subsignature: Option[List[TransactionSignatureMultisigSubsignature]],
  threshold: Option[BigInt],
  version: Option[BigInt]
)

object TransactionSignatureMultisig {
  private type JsonEntity = TransactionSignatureMultisig
  implicit val decoder: JsonDecoder[TransactionSignatureMultisig] = DeriveJsonDecoder.gen[TransactionSignatureMultisig]
  implicit val encoder: JsonEncoder[TransactionSignatureMultisig] = DeriveJsonEncoder.gen[TransactionSignatureMultisig]
}
