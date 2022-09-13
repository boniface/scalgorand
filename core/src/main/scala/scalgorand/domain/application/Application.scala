package scalgorand.domain.application

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class Application (
   deleted: Option[Boolean],
   id: BigInt,
   params: ApplicationParams,
   @jsonField("created-at-round") createdAtRound:  Option[BigInt],
   @jsonField("deleted-at-round") deletedAtRound: Option[BigInt]
 )

object Application {
  private type JsonEntity = Application
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
