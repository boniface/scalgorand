package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class PendingTransactions(
  @jsonField("top-transactions") topTransactions: List[SignedTransaction],
  @jsonField("total-transactions") totalTransactions: Long
)

object PendingTransactions {
  private type JsonEntity = PendingTransactions
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
