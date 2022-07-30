package scalgorand.domain.genesis

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class State(
  algo: Int,
  onl: Int,
  sel: Option[String],
  stprf: Option[String],
  vote: Option[String],
  voteKD: Option[Int],
  voteLst: Option[Int],
)
object State {
  private type JsonEntity = State
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]

}
