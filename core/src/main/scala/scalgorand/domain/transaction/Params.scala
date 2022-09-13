package scalgorand.domain.transaction

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class Params(
  fee: Int,
  @jsonField("consensus-version") consensusVersion: String,
  @jsonField("genesis-hash") genesisHash: String,
  @jsonField("genesis-id") genesisId: String,
  @jsonField("last-round") lastRound: BigInt,
  @jsonField("min-fee") minFee: Int,
)

object Params {
  private type JsonEntity = Params
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
