package scalgorand.domain.accounts

import scalgorand.domain.accounts.AccountApplicationData.accountApplication
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object AccountApplicationSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for AccountApplication serialization") {
      val decoded = accountApplication.fromJson[AccountApplication]
      assertTrue(decoded.isRight)
    }
}
