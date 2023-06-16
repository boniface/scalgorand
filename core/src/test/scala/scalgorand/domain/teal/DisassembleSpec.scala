package scalgorand.domain.teal

import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object DisassembleSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test Teal Disassemble serialization.") {
      val disassembleData =
        """
          |{
          |  "result": "// unsupported version 115\n"
          |}
          |""".stripMargin

      val decoded = disassembleData.fromJson[Disassemble]
      assertTrue(decoded.isRight)
    }
}
