package scalgorand.infrastracture.algod.general

import scalgorand.domain.genesis.Genesis
import scalgorand.infrastracture.InfrastructureError
import zio.IO


trait GeneralAPI {
  def getGenesis: IO[Option[InfrastructureError], Genesis]

}
