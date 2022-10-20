package scalgorand.domain.health

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class HealthCheck(
  data: Option[HealthData],
  errors: Option[List[String]],
  message: String,
  round: Int,
  version: String,
  @jsonField("db-available") dbAvailable: Boolean,
  @jsonField("is-migrating")  isMigrating: Boolean
)

object HealthCheck {
  private type JsonEntity = HealthCheck
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
  
}
