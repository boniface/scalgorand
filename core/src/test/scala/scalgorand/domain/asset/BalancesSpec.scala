package scalgorand.domain.asset

import scalgorand.domain.asset.BalancesData.balances
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object BalancesSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for Balances Serialization") {
      val decoded = balances.fromJson[Balances]
      assertTrue(decoded.isRight)
    }
}
