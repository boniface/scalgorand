package scalgorand.domain.node

import zio.Scope
import zio.json.DecoderOps
import zio.test.{Spec, TestEnvironment, ZIOSpecDefault, assertTrue}

object StatusSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test1") {
      val statusData =
        """
          |{
          |  "catchpoint": "",
          |  "catchpoint-acquired-blocks": 0,
          |  "catchpoint-processed-accounts": 0,
          |  "catchpoint-total-accounts": 0,
          |  "catchpoint-total-blocks": 0,
          |  "catchpoint-verified-accounts": 0,
          |  "catchup-time": 0,
          |  "last-catchpoint": "20230000#ZGZ7HANYKY76CYHCABNFEORWAGQIUJPS5I3BMWSU6DOT4LLKAMFA",
          |  "last-round": 20235722,
          |  "last-version": "https://github.com/algorandfoundation/specs/tree/2dd5435993f6f6d65691140f592ebca5ef19ffbd",
          |  "next-version": "https://github.com/algorandfoundation/specs/tree/2dd5435993f6f6d65691140f592ebca5ef19ffbd",
          |  "next-version-round": 20235723,
          |  "next-version-supported": true,
          |  "stopped-at-unsupported-round": false,
          |  "time-since-last-round": 1164224427
          |}
          |""".stripMargin

      val decoded = statusData.fromJson[Status]
      assertTrue(decoded.isRight)
    }
}
