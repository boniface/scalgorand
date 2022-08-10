package scalgorand.domain.transaction

import scalgorand.domain.accounts.Address
import scalgorand.domain.crypto.{LogicSigSignature, MultiSigSignature, Signature}
import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class SignedTransaction(
  tx: Transaction,
  sig: Signature,
  mSig: MultiSigSignature,
  lSig: LogicSigSignature,
  authAdd: Address
)

object SignedTransaction {
  private type JsonEntity = SignedTransaction
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
