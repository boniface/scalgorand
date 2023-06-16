package scalgorand.domain.accounts


import scalgorand.domain.application.{ApplicationLocalState}

import zio.json.{DeriveJsonDecoder, DeriveJsonEncoder, JsonDecoder, JsonEncoder, jsonField}

/**
  * 
  *
  * @param appsLocalStates  List[ApplicationLocalState] (required) - List of application local states
  * @param currentRound Int (required) - Round at which the results were computed.
  * @param nextToken  String (optional) - Used for pagination, when making another request provide this token with the next parameter.
  */
case class AccountApplicationLocalState(
  @jsonField("apps-local-states") appsLocalStates: List[ApplicationLocalState],
  @jsonField("current-round") currentRound: Int,
  @jsonField("next-token") nextToken: Option[String]
)

object AccountApplicationLocalState {
  private type JsonEntity = AccountApplicationLocalState
  implicit val decoder: JsonDecoder[JsonEntity] = DeriveJsonDecoder.gen[JsonEntity]
  implicit val encoder: JsonEncoder[JsonEntity] = DeriveJsonEncoder.gen[JsonEntity]
}
