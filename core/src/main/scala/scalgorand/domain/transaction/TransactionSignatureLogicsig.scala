package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class TransactionSignatureLogicsig (
  args: Option[List[String]],
  logic: String,
  signature: Option[String],
  @jsonField("multisig-signature") multisigSignature: TransactionSignatureMultisig
)

object TransactionSignatureLogicsig {
  private type JsonEntity = TransactionSignatureLogicsig
  implicit val decoder: JsonDecoder[TransactionSignatureLogicsig] = DeriveJsonDecoder.gen[TransactionSignatureLogicsig]
  implicit val encoder: JsonEncoder[TransactionSignatureLogicsig] = DeriveJsonEncoder.gen[TransactionSignatureLogicsig]
}
