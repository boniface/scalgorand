package scalgorand.domain.application

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class Applications (
  applications: List[Application],
  @jsonField("current-round") currentRound: BigInt,
  @jsonField("next-token") nextToken: BigInt
)

object Applications {
  private type JsonEntity = Applications
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
