package scalgorand.domain.asset

import scalgorand.domain.asset.AssetTransactionData.assetTransactionData
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object AssetTransactionSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for Asset Transaction  Serialization") {
      val decoded = assetTransactionData.fromJson[AssetTransaction]
      assertTrue(decoded.isRight)
    }
}
