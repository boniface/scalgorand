package scalgorand.domain.transaction

import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object ParamsSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for Params serialization") {
      val paramsData =
        """
          |{
          |  "consensus-version": "https://github.com/algorandfoundation/specs/tree/433d8e9a7274b6fca703d91213e05c7e6a589e69",
          |  "fee": 0,
          |  "genesis-hash": "mFgazF+2uRS1tMiL9dsj01hJGySEmPN28B/TjjvpVW0=",
          |  "genesis-id": "betanet-v1.0",
          |  "last-round": 20591674,
          |  "min-fee": 1000
          |}
          |""".stripMargin

      val decoded = paramsData.fromJson[Params]
      assertTrue(decoded.isRight)
    }

}
