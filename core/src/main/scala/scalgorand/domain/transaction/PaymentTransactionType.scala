package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class PaymentTransactionType(
   amount: BigInt,
   close: String,
   closeAmount: BigInt,
   closerewards: BigInt,
   to: String,
   toRewards: BigInt
 )

object PaymentTransactionType {
  private type JsonEntity = PaymentTransactionType
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
