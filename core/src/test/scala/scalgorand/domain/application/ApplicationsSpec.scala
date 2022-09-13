package scalgorand.domain.application

import scalgorand.domain.application.ApplicationsData.applicationsData
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object ApplicationsSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for Applications serialization") {
      val decoded = applicationsData.fromJson[Applications]
      assertTrue(decoded.isRight)
    }
}
