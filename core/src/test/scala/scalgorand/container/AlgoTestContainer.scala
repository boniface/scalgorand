package scalgorand.container

import com.dimafeng.testcontainers.{DockerComposeContainer, ExposedService}
import scalgorand.environment.connection.AlgoNet
import zio.{Scope, Task, ULayer, URIO, ZIO, ZLayer}

import java.io.File

trait AlgoTestContainer extends AlgoNet{

}
object AlgoTestContainer {
  def apply: URIO[Scope, AlgoTestContainer] = {
    val container: DockerComposeContainer =
      DockerComposeContainer(
        new File("core/src/test/resources/docker-compose.yml"),
        exposedServices =
          Seq(ExposedService("algod_1", 4001),
            ExposedService("algod_1", 4002),
            ExposedService("indexer_1", 8980)))

    ZIO
      .acquireRelease(ZIO.succeed(container.start()))(_ => ZIO.succeed(container.stop()))
      .as(
        new AlgoTestContainer {
          override def getAlgoHost: Task[String] = ZIO.attempt(container.getServiceHost("algod_1", 4001))
          override def getAlgoPort: Task[Int]    = ZIO.attempt(container.getServicePort("algod_1", 4001))

          override def getKmdHost: Task[String] = ZIO.attempt(container.getServiceHost("algod_1", 4002))
          override def getKmdPort: Task[Int] = ZIO.attempt(container.getServicePort("algod_1", 4002))

          override def getIndexerHost: Task[String] = ZIO.attempt(container.getServiceHost("indexer_1", 8980))
          override def getIndexPort: Task[Int] = ZIO.attempt(container.getServicePort("indexer_1", 8980))
        },
      )
  }
  val containerLayer: ULayer[AlgoTestContainer] = ZLayer.scoped(AlgoTestContainer.apply)
}
