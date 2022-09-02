package scalgorand.domain.transaction

import scalgorand.domain.transaction.PendingTransactionsData.pendingTransactions
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object PendingTransactionsSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for PendingTransactions Serialization") {
      val decoded = pendingTransactions.fromJson[PendingTransactions]
      assertTrue(decoded.isRight)
    }
}
