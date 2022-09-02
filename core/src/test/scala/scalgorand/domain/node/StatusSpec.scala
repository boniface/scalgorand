package scalgorand.domain.node

import scalgorand.domain.node.StatusData.statusData
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object StatusSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for Status Serialization") {
      val decoded = statusData.fromJson[Status]
      assertTrue(decoded.isRight)
    }
}
