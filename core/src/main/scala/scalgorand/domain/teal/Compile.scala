package scalgorand.domain.teal

import zio.json.ast.Json
import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class Compile (
  result: String,
  sourcemap: Option[Map[String, Json]],
  hash: String
 )

object Compile {
  private type JsonEntity = Compile
  implicit val decoder: JsonDecoder[Compile] = DeriveJsonDecoder.gen[Compile]
  implicit val encoder: JsonEncoder[Compile] = DeriveJsonEncoder.gen[Compile]
}
