package scalgorand.domain.accounts

import scalgorand.domain.accounts.AccountAssetData.accountAsset
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object AccountAssetSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for AccountAsset serialization") {
      val decoded = accountAsset.fromJson[AccountAsset]
      assertTrue(decoded.isRight)
    }
}
