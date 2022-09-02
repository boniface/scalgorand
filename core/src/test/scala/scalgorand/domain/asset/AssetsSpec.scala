package scalgorand.domain.asset

import scalgorand.domain.asset.AssetsData.assetsData
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object AssetsSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for Assets Serialization") {
      val decoded = assetsData.fromJson[Assets]
      assertTrue(decoded.isRight)
    }
}
