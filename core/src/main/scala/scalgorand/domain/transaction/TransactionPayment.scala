package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class TransactionPayment (
  amount: BigInt,
  @jsonField("close-amount") closeAmount: Option[BigInt],
  @jsonField("close-remainder-to") closeRemainderTo: Option[String],
  receiver: String
)

object TransactionPayment {
  private type JsonEntity = TransactionPayment
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}