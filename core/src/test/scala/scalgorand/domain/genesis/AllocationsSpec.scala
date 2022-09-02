package scalgorand.domain.genesis

import zio.Scope
import zio.json.DecoderOps
import zio.test._

object AllocationsSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test Allocations With Options Serialisation") {
      val allocationsData =
        """
          |{
          |      "addr": "7777777777777777777777777777777777777777777777777774MSJUVU",
          |      "comment": "RewardsPool",
          |      "state": {
          |        "algo": 125000000000000,
          |        "onl": 2
          |      }
          |    }
          |""".stripMargin
      val decoded = allocationsData.fromJson[Allocations]
      assertTrue(decoded.isRight)
    }+
      test("Test Allocations Serialisation") {
        val allocationsData =
          """
            |{
            |      "addr": "CQW2QBBUW5AGFDXMURQBRJN2AM3OHHQWXXI4PEJXRCVTEJ3E5VBTNRTEAE",
            |      "comment": "Wallet10",
            |      "state": {
            |        "algo": 320000000000000,
            |        "onl": 1,
            |        "sel": "p2tiuQ2kqJGG049hHOKNIjid4/u1MqlvgXfbxK4tuEY=",
            |        "vote": "E73cc+KB/LGdDHO1o84440WKCmqvbM4EgROMRyHfjDc=",
            |        "voteKD": 10000,
            |        "voteLst": 3000000
            |      }
            |    }
            |""".stripMargin
        val decoded = allocationsData.fromJson[Allocations]
        assertTrue(decoded.isRight)
      }
}
