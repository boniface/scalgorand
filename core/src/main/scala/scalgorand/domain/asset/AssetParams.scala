package scalgorand.domain.asset

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class AssetParams(
                      clawback: Option[String],
                      creator: String,
                      decimals: BigInt,
                      @jsonField("default-frozen") defaultFrozen: Option[Boolean],
                      freeze: Option[String],
                      manager: Option[String],
                      name: Option[String],
                      @jsonField("name-b64") nameB64: Option[String],
                      reserve: Option[String],
                      total: Option[BigInt],
                      @jsonField("unit-name") unitName: Option[String],
                      @jsonField("unit-nameb64") unitNameB64: Option[String],
                      url: Option[String],
                      urlB64: Option[String]
)

object AssetParams {
  private type JsonEntity = AssetParams
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
