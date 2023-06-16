package scalgorand.domain.versions

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class Build (
  major: Int,
  minor: Int,
  build_number: Int,
  commit_hash: String,
  branch: String,
  channel: String
)

object Build {
  private type JsonEntity = Build
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
