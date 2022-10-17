package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class OnCompletion(
  noop:String,
  optin: String,
  closeout: String,
  clear: String,
  update: String,
  delete: String
  )

object OnCompletion {
  private type JsonEntity = OnCompletion
  implicit val decoder: JsonDecoder[OnCompletion] = DeriveJsonDecoder.gen[OnCompletion]
  implicit val encoder: JsonEncoder[OnCompletion] = DeriveJsonEncoder.gen[OnCompletion]
}
