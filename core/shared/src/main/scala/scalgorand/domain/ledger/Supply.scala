package scalgorand.domain.ledger

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class Supply(
   round: BigInt,
   onlineMoney: BigInt,
   totalMoney:BigInt
 )

object Supply {
  private type JsonEntity = Supply
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
