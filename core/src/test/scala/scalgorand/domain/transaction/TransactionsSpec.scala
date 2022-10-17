package scalgorand.domain.transaction

import scalgorand.domain.transaction.TransactionsData.{assetTransferTransactions, paymentTransactions}
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object TransactionsSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] = {
    suite("Test for transactions") {
      test("Test for Transactions serialization.") {
        val decoded = paymentTransactions.fromJson[Transactions]
        assertTrue(decoded.isRight)
      }
    }

    test("Test for serialization of assetTransfer Transactions.") {
      val decoded = assetTransferTransactions.fromJson[Transactions]
      assertTrue(decoded.isRight)
    }
  }
}
