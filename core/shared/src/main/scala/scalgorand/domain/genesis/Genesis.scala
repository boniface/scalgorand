package scalgorand.domain.genesis

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class Genesis(
  alloc: List[Allocations],
  devmode: Boolean,
  fees: String,
  id: String,
  network: String,
  proto: String,
  rwd: String,
)
object Genesis{
  private type JsonEntity = Genesis
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
