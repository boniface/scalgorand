package scalgorand.domain.genesis

import scalgorand.domain.genesis.GenesisData.genesisData
import zio.Scope
import zio.json.DecoderOps
import zio.test._


object GenesisSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test Genesis Serialisation"){
       val decoded = genesisData.fromJson[Genesis]
      assertTrue(decoded.isRight)
    }


}
