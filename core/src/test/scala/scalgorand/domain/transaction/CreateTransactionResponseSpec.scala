package scalgorand.domain.transaction

import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object CreateTransactionResponseSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] = {

    val createTransactionData =
      """
        |{
        |  "txId": "string"
        |}
        |""".stripMargin
    test("Test for CreateTransactionResponseSpec serialization.") {
      val decoded = createTransactionData.fromJson[CreateTransactionResponse]
      assertTrue(decoded.isRight)
    }
  }
}
