package scalgorand.domain.application

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

case class ApplicationLog (
  
  @jsonField("application-id") applicationId: BigInt,
  @jsonField("current-round") currentRound: BigInt,
  @jsonField("next-token") nextToken: Option[String],
  @jsonField("log-data") logData: Option[List[ApplicationLogData]],
)

object ApplicationLog {
  private type JsonEntity = ApplicationLog
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
