package scalgorand.domain.genesis

import zio.Scope
import zio.json._
import zio.test._

object StateSpec extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment with Scope, Any] =
    test("Test1") {
      val stateData2 =
        """
          |{
          |        "algo": 100000,
          |        "onl": 2
          |}
          |""".stripMargin
      val stateDate  = stateData2.fromJson[State]
      assertTrue(stateDate == Right(State(100000, 2, None, None, None, None, None)))
    } +
      test("Test2") {
        val stateData2 =
          """
            |{
            |        "algo": 320000000000000,
            |        "onl": 1,
            |        "sel": "h7Ml/mY/PDCPSj33u72quxaMX99n+/VE+wD94/hMdzY=",
            |        "vote": "R9kxsHbji4DlxPOAyLehy8vaiWyLjWdLGWBLnQ5jjY8=",
            |        "voteKD": 10000,
            |        "voteLst": 3000000
            |      }
            |""".stripMargin
        val stateDate  = stateData2.fromJson[State]
        assertTrue(stateDate == Right(
          State(320000000000000,
            1, Some("h7Ml/mY/PDCPSj33u72quxaMX99n+/VE+wD94/hMdzY="),
            Some("R9kxsHbji4DlxPOAyLehy8vaiWyLjWdLGWBLnQ5jjY8="),
            Some(10000),
            Some(3000000),
            None)))
      }
}
