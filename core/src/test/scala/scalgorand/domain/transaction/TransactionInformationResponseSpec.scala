package scalgorand.domain.transaction

import scalgorand.domain.transaction.TransactionInformationData.transactionInformation
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object TransactionInformationResponseSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for TransactionInformationResponse serialization.") {
      val decoded = transactionInformation.fromJson[TransactionInformationResponse]
      assertTrue(decoded.isRight)
    }
}
