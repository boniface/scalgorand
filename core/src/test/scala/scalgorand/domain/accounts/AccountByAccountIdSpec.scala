package scalgorand.domain.accounts

import scalgorand.domain.accounts.AccountByAccountIdData.accountsByAccountIdData
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object AccountByAccountIdSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for AccountByAccountIdSpec Serialization.") {
      val decoded = accountsByAccountIdData.fromJson[AccountByAccountId]
      assertTrue(decoded.isRight)
    }
}
