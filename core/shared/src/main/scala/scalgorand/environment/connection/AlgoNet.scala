package scalgorand.environment.connection

import zio.Task
import zio.macros.accessible

@accessible
trait AlgoNet {
  def getAlgoHost: Task[String]
  def getAlgoPort: Task[Int]
  def getKmdHost: Task[String]
  def getKmdPort: Task[Int]
  def getIndexerHost: Task[String]
  def getIndexPort: Task[Int]
}
