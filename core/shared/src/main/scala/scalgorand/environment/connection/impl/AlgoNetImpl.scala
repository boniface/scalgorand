package scalgorand.environment.connection.impl

import scalgorand.environment.connection.AlgoNet
import zio.Task

final case class AlgoNetImpl () extends AlgoNet{
  override def getAlgoHost: Task[String] = ???

  override def getAlgoPort: Task[Int] = ???

  override def getKmdHost: Task[String] = ???

  override def getKmdPort: Task[Int] = ???

  override def getIndexerHost: Task[String] = ???

  override def getIndexPort: Task[Int] = ???
}

object AlgoNetImpl{

}
