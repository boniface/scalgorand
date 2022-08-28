package scalgorand.domain.ledger

import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object SupplySpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test1") {
      val supplyData =
        """
          |{
          |  "current_round": 20210775,
          |  "online-money": 10011370733321181,
          |  "total-money": 10123815444300550
          |}
          |""".stripMargin

          val decoded = supplyData.fromJson[Supply]
          assertTrue(decoded.isRight)
    }
}
