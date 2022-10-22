package scalgorand.domain.asset

import scalgorand.domain.transaction.TransactionInformation
import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class AssetTransaction(
 transactions: List[TransactionInformation],
 @jsonField("current-round") currentRound: Int,
 @jsonField("next-token") nextToken: Option[String]
)

object AssetTransaction {
  private type JsonEntity = AssetTransaction
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]

}
