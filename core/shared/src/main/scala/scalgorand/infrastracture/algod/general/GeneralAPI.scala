package scalgorand.infrastracture.algod.general

import scalgorand.domain.genesis.Genesis
import scalgorand.infrastracture.InfrastructureError
import zio.IO
import zio.macros.accessible

@accessible
trait GeneralAPI {
 def getGenesis: IO[Option[InfrastructureError], Genesis]
  def getHealth
  def getVersion
  def getMetrics
}
