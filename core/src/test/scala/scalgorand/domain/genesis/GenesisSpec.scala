package scalgorand.domain.genesis

import zio.Scope
import zio.test.Assertion.equalTo
import zio.test._
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object GenesisSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Genesis Test"){
      val sum = 1 +2
      assertTrue(sum == 3)
    } +
    test("Genesis Test2"){
      val sum = 1 +2
      assertTrue(sum == 3)
    }

}
