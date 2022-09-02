package scalgorand.domain.transaction

object PendingTransactionsData {
  val pendingTransactions =
    """
      |{
      |  "top-transactions": [
      |    {
      |      "sig": "vkDOJ6l00B3EmRP8On3HZPd+2A5SkGwLLaxCd6uan1X9qtPxP153U8I+FGEEqdsTQeo/aeM1xXJ2+eyOV9XZBg==",
      |      "txn": {
      |        "amt": 1,
      |        "fee": 1000,
      |        "fv": 20238633,
      |        "gen": "betanet-v1.0",
      |        "gh": "mFgazF+2uRS1tMiL9dsj01hJGySEmPN28B/TjjvpVW0=",
      |        "lv": 20238638,
      |        "note": "kpfUEQ==",
      |        "rcv": "GN73SFRYN2NSQPJMW4Y6HCLR35PAYROB2MOXVWDZTSRL3FKINRHET3LWSM",
      |        "snd": "55XMBS73LT64EJDBNWLA4NXCBN3M32DBTIERY57JR4D2VHCCCMZFV2SFLM",
      |        "type": "pay"
      |      }
      |    },
      |    {
      |      "sig": "8OuKM+12Ip7Xe+AMjUPLDt0nSprUF3D6YEkTNgjGiZB/RAqtK4awwYQBkZO10viBlMlQKgfo09ebhUgRX/7BCw==",
      |      "txn": {
      |        "amt": 1,
      |        "fee": 1000,
      |        "fv": 20238633,
      |        "gen": "betanet-v1.0",
      |        "gh": "mFgazF+2uRS1tMiL9dsj01hJGySEmPN28B/TjjvpVW0=",
      |        "lv": 20238638,
      |        "note": "k5fUEQ==",
      |        "rcv": "E3MJSRIYZU73SUBHB6MOFR6NGZHSAW2V6F35U7QY3INYIIKRNP65SRJYMY",
      |        "snd": "ILNGJYTBE4MTGEMPQMHJQ267ZYJJKZA5JAIDR4ZDNV3H75M543BKUHXPKY",
      |        "type": "pay"
      |      }
      |    }
      |  ],
      |  "total-transactions": 103
      |}
      |""".stripMargin
}
