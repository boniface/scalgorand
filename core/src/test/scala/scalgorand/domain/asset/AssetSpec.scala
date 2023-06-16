package scalgorand.domain.asset

import scalgorand.domain.asset.AssetsData.assetData
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}


object AssetSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for Asset Serialization") {
      val decoded = assetData.fromJson[Asset]
      assertTrue(decoded.isRight)

    }
}
