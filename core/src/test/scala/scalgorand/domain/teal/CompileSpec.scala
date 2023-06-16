package scalgorand.domain.teal

import scalgorand.domain.teal.CompileData.compileOutput
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object CompileSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test Teal Compile serialization.") {
      val decoded = compileOutput.fromJson[Compile]
      assertTrue(decoded.isRight)
    }
}
