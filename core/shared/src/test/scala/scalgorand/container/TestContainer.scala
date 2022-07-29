package scalgorand.container

import com.dimafeng.testcontainers.GenericContainer
import zio.{Scope, Task, URIO, ZIO}

trait TestCassandraContainer  {
  def getHost: Task[String]
  def getPort: Task[Int]
}
object TestCassandraContainer {
  def apply: URIO[Scope, TestCassandraContainer] = {
    val algodPort          = 4001
    val kmdPort            = 4002
    val indexerPort        = 8980
    val datastaxEnterprise = "matteojug/algorand-sandbox-dev:3.8.1"
    val datastaxEnv        = Map(
      "DS_LICENSE" -> "accept",
      "JVM_EXTRA_OPTS" -> "-Dcassandra.skip_wait_for_gossip_to_settle=0 -Dcassandra.load_ring_state=false -Dcassandra.initial_token=1 -Dcassandra.num_tokens=nil -Dcassandra.allocate_tokens_for_local_replication_factor=nil",
    )
    val vanillaEnv         = Map(
      "CASSANDRA_ENDPOINT_SNITCH" -> "GossipingPropertyFileSnitch",
      "CASSANDRA_DC"              -> "dc1",
      "CASSANDRA_NUM_TOKENS"      -> "1",
      "CASSANDRA_START_RPC"       -> "false",
      "JVM_EXTRA_OPTS"            -> datastaxEnv("JVM_EXTRA_OPTS"),
    )

    val container = GenericContainer(
      dockerImage = datastaxEnterprise,
      env = vanillaEnv,
      exposedPorts = Seq(algodPort, kmdPort, indexerPort),
    )

    ZIO
      .acquireRelease(ZIO.succeed(container.start()))(_ => ZIO.succeed(container.stop()))
      .as(
        new TestCassandraContainer {
          override def getHost: Task[String] = ZIO.attempt(container.host)
          override def getPort: Task[Int]    = ZIO.attempt(container.mappedPort(9042))
        },
      )
  }
}
