package scalgorand.domain.accounts

import scalgorand.domain.accounts.AccountTransactionData.accountTransaction
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object AccountTransactionSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for Account Transaction Serialization") {
      val decoded = accountTransaction.fromJson[AccountTransaction]
      assertTrue(decoded.isRight)
    }
}