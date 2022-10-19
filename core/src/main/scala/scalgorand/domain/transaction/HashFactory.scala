package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}
/**
  * 
  *
  * @param hashType
  */
case class HashFactory (
  @jsonField("hash-type") hashType: Option[Int]
)

object HashFactory {
  private type JsonEntity = HashFactory
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
