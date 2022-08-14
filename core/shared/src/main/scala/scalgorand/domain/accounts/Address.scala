package scalgorand.domain.accounts

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder}

case class Address(
  LEN_BYTES: Int,
  bytes: Array[Byte],
  CHECKSUM_LEN_BYTES: Int,
  EXPECTED_STR_ENCODED_LEN: Int,
  SIGN_ALGO: String,
  KEY_ALGO: String,
  BYTES_SIGN_PREFIX: Array[Byte],
  APP_ID_PREFIX: Array[Byte]
)

object Address {
  private type JsonEntity = Address
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
