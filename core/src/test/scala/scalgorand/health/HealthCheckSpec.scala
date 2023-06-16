package scalgorand.domain.health

import scalgorand.domain.health.HealthCheckData.healthCheck
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object HealthCheckSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for healthCheck serialization") {
      val decoded = healthCheck.fromJson[HealthCheck]
      assertTrue(decoded.isRight)
    }
}
