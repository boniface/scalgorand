package scalgorand.domain.accounts

import scalgorand.domain.accounts.AccountByAccountIdAccountApplicationLocalStateData.accountByAccountIdAccountApplicationLocalState
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object AccountByAccountIdAccountApplicationLocalStateSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for AccountByAccountIdAppLocalStateSpec Serialization.") {
      val decoded = accountByAccountIdAccountApplicationLocalState.fromJson[AccountApplicationLocalState]
      assertTrue(decoded.isRight)
    }
}
