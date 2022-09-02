package scalgorand.domain.node

import scalgorand.domain.node.BlockData.blockData
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object BlockSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for Block Serialization") {
      val decoded = blockData.fromJson[Block]
      assertTrue(decoded.isRight)
    }
}
