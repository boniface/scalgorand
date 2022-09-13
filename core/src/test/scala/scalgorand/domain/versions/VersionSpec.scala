package scalgorand.domain.versions

import scalgorand.domain.versions.VersionData.version
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object VersionSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for Versions serialization") {
      val decoded = version.fromJson[Version]
      assertTrue(decoded.isRight)
    }
}
