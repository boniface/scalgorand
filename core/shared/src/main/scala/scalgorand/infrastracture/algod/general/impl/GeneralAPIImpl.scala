package scalgorand.infrastracture.algod.general.impl

import scalgorand.domain.genesis.Genesis
import scalgorand.infrastracture.InfrastructureError.GeneralAPIError
import scalgorand.infrastracture.algod.general.GeneralAPI
import sttp.client3._
import sttp.client3.ziojson.asJson
import zio._

case class GeneralAPIImpl(sttpBackend: SttpBackend[Task, Any]) extends GeneralAPI {
  override def getGenesis: ZIO[Any, Option[GeneralAPIError], Genesis] = {
    val request = basicRequest
      .response(asJson[Genesis])
      .get(uri"http://localhost:4001/genesis")
    val result  = sttpBackend
      .send(request)
      .mapBoth(
        error => GeneralAPIError(error),
        result => result.body,
      )
    result.flatMap {
      case Left(value)  => ZIO.none
      case Right(value) => ZIO.some(value)
    }.some
  }

  override def getHealth: Unit = ???

  override def getVersion: Unit = ???

  override def getMetrics: Unit = ???
}

object GeneralAPIImpl {
  val layer: ZLayer[SttpBackend[Task, Any], Any, GeneralAPIImpl] =
    ZLayer.fromFunction(new GeneralAPIImpl(_))
}
