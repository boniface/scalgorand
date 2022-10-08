package scalgorand.domain.application

import scalgorand.domain.accounts.AccountCreatedAppliationsData.createdApplications
import scalgorand.domain.application.ApplicationsData.applicationsData
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

import scala.language.postfixOps

object ApplicationsSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] = {
    test("Test for Applications serialization") {
      val decoded  = applicationsData.fromJson[Applications]
      assertTrue(decoded.isRight)
      val decoded2 = createdApplications.fromJson[Applications]
      assertTrue(decoded.isRight)
    }
  }
}
