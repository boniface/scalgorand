package scalgorand.domain.node

import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object BlockSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test for Block Serialization") {
      val blockData =
        """
          |{
          |    "earn": 24,
          |    "fees": "A7NMWS3NT3IUDMLVO26ULGXGIIOUQ3ND2TXSER6EBGRZNOBOUIQXHIBGDE",
          |    "frac": 9999952855,
          |    "gen": "testnet-v1.0",
          |    "gh": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
          |    "nextbefore": 10001,
          |    "nextproto": "https://github.com/algorand/spec/tree/22726c9dcd12d9cddce4a8bd7e8ccaa707f74101",
          |    "nextswitch": 20001,
          |    "nextyes": 1000,
          |    "prev": "blk-64K4JOMGFBGRU5STWQX5WBVNQMA2Y6MMVSPSFZ3EVRQJ3X5NJCRQ",
          |    "proto": "https://github.com/algorand/spec/tree/a26ed78ed8f834e2b9ccb6eb7d3ee9f629a6e622",
          |    "rate": 250000000,
          |    "rnd": 1000,
          |    "rwcalr": 500000,
          |    "rwd": "7777777777777777777777777777777777777777777777777774MSJUVU",
          |    "seed": "J8HTZL0xooEXeiGwsbAzfuEMoMFPq4mQSzmMtCfOHKE=",
          |    "ts": 1560235455,
          |    "txn": "tGWqr06HVvsHC2hFmu2EhwYBSiMkvIoo5nWxAkUxsLo=",
          |    "upgradeyes": true
          |}
          |""".stripMargin

      val decoded = blockData.fromJson[Block]
      assertTrue(decoded.isRight)
    }
}
