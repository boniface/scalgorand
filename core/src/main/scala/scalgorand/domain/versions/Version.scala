package scalgorand.domain.versions

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class Version(
  versions: Array[String],
  genesis_id: String,
  genesis_hash_b64: String,
  build: Build
)

object Version {
  private type JsonEntity = Version
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
