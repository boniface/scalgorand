package scalgorand.domain.asset

object BalancesData {

  val balances: String =
    """
      |{
      |  "balances": [
      |    {
      |      "address": "AJTDJM5HIBOZGCKJ3Z4JKJZS3DAPT3IDC3CX3RPCESI3LFKE4ZRAAE7KIM",
      |      "amount": 0,
      |      "deleted": false,
      |      "is-frozen": false,
      |      "opted-in-at-round": 23091132
      |    },
      |    {
      |      "address": "AXWZNCIYOULK62QOJGEFVY5SD6ZJJ5WK4NTJ5M56TOC3SZ2UT7DCDO4VBM",
      |      "amount": 0,
      |      "deleted": false,
      |      "is-frozen": false,
      |      "opted-in-at-round": 14834336
      |    },
      |    {
      |      "address": "BAZXPXEGPFQ7JVOZ7BZUYK36EXLRAWC7MAG3O2SPDWMVCYDMRLCHC6JC2U",
      |      "amount": 0,
      |      "deleted": false,
      |      "is-frozen": false,
      |      "opted-in-at-round": 16973694
      |    }
      |  ],
      |  "current-round": 24074267,
      |  "next-token": "BAZXPXEGPFQ7JVOZ7BZUYK36EXLRAWC7MAG3O2SPDWMVCYDMRLCHC6JC2U"
      |}
      |""".stripMargin

}
