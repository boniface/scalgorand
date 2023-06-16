package scalgorand.domain.health

import zio.json.jsonField
import zio.json.JsonDecoder
import zio.json.DeriveJsonDecoder
import zio.json.JsonEncoder
import zio.json.DeriveJsonEncoder

case class HealthData(
    @jsonField("migration-required") migrationRequired: Option[Boolean],
    @jsonField("read-only-mode") readOnlyMode: Option[Boolean],
)

object HealthData {
    private type JsonEntity = HealthData
    implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
    implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}