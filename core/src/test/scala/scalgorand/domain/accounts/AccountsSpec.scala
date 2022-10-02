package scalgorand.domain.accounts

import scalgorand.domain.accounts.AccountsData.accounts
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object AccountsSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for Accounts Serialization") {
      val decoded = accounts.fromJson[Accounts]
      assertTrue(decoded.isRight)
    }
}
