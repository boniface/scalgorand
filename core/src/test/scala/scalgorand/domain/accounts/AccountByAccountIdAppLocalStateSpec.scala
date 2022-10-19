package scalgorand.domain.accounts

import scalgorand.domain.accounts.AccountByAccountIdAppLocalStateData.accountByAccountIdAppLocalStateData
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object AccountByAccountIdAppLocalStateSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for AccountByAccountIdAppLocalStateSpec Serialization.") {
      val decoded = accountByAccountIdAppLocalStateData.fromJson[AccountAppsLocalStateResponse]
      assertTrue(decoded.isRight)
    }
}
