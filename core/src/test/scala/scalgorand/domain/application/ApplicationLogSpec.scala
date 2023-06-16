package scalgorand.domain.application

import scalgorand.domain.application.ApplicationLogResponseData.applicationLogData
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object ApplicationLogSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for Application Log serialization") {
      val decoded = applicationLogData.fromJson[ApplicationLog]
      assertTrue(decoded.isRight)
    }
}
