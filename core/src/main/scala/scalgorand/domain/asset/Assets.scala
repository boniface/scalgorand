package scalgorand.domain.asset

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class Assets(
 assets: List[Asset],
 @jsonField("current-round") currentRound: Int,
 @jsonField("next-token") nextToken: Option[String]
)

object Assets {
  private type JsonEntity = Assets
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]

}
