package scalgorand.infrastracture.indexer.general

import zio.IO

trait GeneralAPI {
 def getGenesis: IO[]
  def getHealth
  def getVersion
  def getMetrics
}
