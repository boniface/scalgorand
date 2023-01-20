package scalgorand.domain.node

import scalgorand.domain.node.WaitForBlockData.waitForBlock
import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object WaitForBlockSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test ("Test WaitForBlock serialization.") {
      val decoded = waitForBlock.fromJson[WaitForBlock]
      assertTrue(decoded.isRight)
    }
}
