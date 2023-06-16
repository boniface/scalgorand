package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class PaymentTransactionType(
   amount: BigInt,
   close: Option[String],
   closeamount: Option[BigInt],
   closerewards: Option[BigInt],
   to: String,
   torewards: Option[BigInt]
 )

object PaymentTransactionType {
  private type JsonEntity = PaymentTransactionType
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
