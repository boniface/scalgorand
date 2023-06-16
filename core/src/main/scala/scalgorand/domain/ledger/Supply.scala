package scalgorand.domain.ledger

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class Supply(
   current_round: BigInt,
   @jsonField("online-money") onlineMoney: BigInt,
   @jsonField("total-money") totalMoney:BigInt
 )

object Supply {
  private type JsonEntity = Supply
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
