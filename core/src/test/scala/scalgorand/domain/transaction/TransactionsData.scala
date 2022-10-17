package scalgorand.domain.transaction

object TransactionsData {

  val paymentTransactions: String =
    """
      |{
      |  "current-round": 24688042,
      |  "next-token": "vgAAAAAAAAAAAAAA",
      |  "transactions": [
      |    {
      |      "close-rewards": 0,
      |      "closing-amount": 0,
      |      "confirmed-round": 1,
      |      "fee": 10000,
      |      "first-valid": 0,
      |      "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
      |      "genesis-id": "testnet-v1.0",
      |      "id": "QOOBRVQMX4HW5QZ2EGLQDQCQTKRF3UP3JKDGKYPCXMI6AVV35KQA",
      |      "intra-round-offset": 0,
      |      "last-valid": 1000,
      |      "payment-transaction": {
      |        "amount": 100000000,
      |        "close-amount": 0,
      |        "receiver": "3NVE2MK2QYZQFOZ5XIRQTM7JRHNPUBV7QKLYLT7OO6QXFHXMRIAUXXNCBM"
      |      },
      |      "receiver-rewards": 0,
      |      "round-time": 1560210480,
      |      "sender": "GD64YIY3TWGDMCNPP553DZPPR6LDUSFQOIJVFDPPXWEG3FVOJCCDBBHU5A",
      |      "sender-rewards": 0,
      |      "signature": {
      |        "sig": "tlAccbsxpTazfxt3Yu69Li98QvH6nDAPNHdU8LUkpBLxu1umNePq0NwfHbrtv3hW4dxKQw32SbszeMrv5X64Cg=="
      |      },
      |      "tx-type": "pay"
      |    },
      |    {
      |      "close-rewards": 0,
      |      "closing-amount": 0,
      |      "confirmed-round": 97,
      |      "fee": 1000,
      |      "first-valid": 94,
      |      "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
      |      "id": "ZDQV5D6L35NG4DRBRKH6SNKAMCQZGWKCQBYJX5L5FTFLHL7EFJ6A",
      |      "intra-round-offset": 0,
      |      "last-valid": 1094,
      |      "payment-transaction": {
      |        "amount": 100000,
      |        "close-amount": 0,
      |        "receiver": "3EU7VVR3VJWK3FTDMP2MNDSTCLFGBLGYG6U52MYDWRHQ2OBWQHYYBB2HMM"
      |      },
      |      "receiver-rewards": 0,
      |      "round-time": 1560212880,
      |      "sender": "3NVE2MK2QYZQFOZ5XIRQTM7JRHNPUBV7QKLYLT7OO6QXFHXMRIAUXXNCBM",
      |      "sender-rewards": 200,
      |      "signature": {
      |        "sig": "MtwLCdJveyHy5rtqJDAruyOzyazHHBO4JnfbePW0Yflcdzg3fRdMXGBf9ekkZHOY+1YBXVFbh3kFDYIkx+HbBg=="
      |      },
      |      "tx-type": "pay"
      |    },
      |    {
      |      "close-rewards": 0,
      |      "closing-amount": 0,
      |      "confirmed-round": 190,
      |      "fee": 10000,
      |      "first-valid": 188,
      |      "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
      |      "genesis-id": "testnet-v1.0",
      |      "id": "ESE4WLMULXSMHMISDRYU7YLS4E7X6YDNJAGFH55K2HXGFQITZ2TA",
      |      "intra-round-offset": 0,
      |      "last-valid": 1188,
      |      "payment-transaction": {
      |        "amount": 100000000,
      |        "close-amount": 0,
      |        "receiver": "I6RLZMTFFNR6URYGAZ77CMQ2Z4T55NURVTBI6BBQGCQXGUI5EWT4GODLGY"
      |      },
      |      "receiver-rewards": 0,
      |      "round-time": 1560215205,
      |      "sender": "GD64YIY3TWGDMCNPP553DZPPR6LDUSFQOIJVFDPPXWEG3FVOJCCDBBHU5A",
      |      "sender-rewards": 799999596,
      |      "signature": {
      |        "sig": "XAjiuED6LWWtKzlghrFbFAPhzXx9dE1fPZOxBcY4oFV8Z5j4Nhakh+wFaXHzotiORB/2xGMLWMAhZL/SafVHCg=="
      |      },
      |      "tx-type": "pay"
      |    }
      |  ]
      |}
      |""".stripMargin

  val assetTransferTransactions: String =
    """
      |{
      |  "current-round": 24799836,
      |  "next-token": "WAMyAAAAAAAAAAAA",
      |  "transactions": [
      |    {
      |      "asset-transfer-transaction": {
      |        "amount": 0,
      |        "asset-id": 185,
      |        "close-amount": 0,
      |        "receiver": "X2YHQU7W6OJG66TMLL3PZ7JQS2D42YEGATBBNDXH22Q6JSNOFR6LVZYXXM"
      |      },
      |      "close-rewards": 0,
      |      "closing-amount": 0,
      |      "confirmed-round": 3268527,
      |      "fee": 1000,
      |      "first-valid": 3268525,
      |      "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
      |      "genesis-id": "testnet-v1.0",
      |      "id": "2DALV2WRPYMRQKMLZLGN6O2VZCRE74VB3ZIZDVD6QX57FEBEUTDA",
      |      "intra-round-offset": 0,
      |      "last-valid": 3269525,
      |      "receiver-rewards": 0,
      |      "round-time": 1574660000,
      |      "sender": "X2YHQU7W6OJG66TMLL3PZ7JQS2D42YEGATBBNDXH22Q6JSNOFR6LVZYXXM",
      |      "sender-rewards": 0,
      |      "signature": {
      |        "sig": "TPGBaw4eCubNlyRHl6EtGKXOkGlg9pfB5Z5cmNvyYYCs/xjKgd/TZFO+6CBV+C0MSVBbcRLXJaW8CV7wrAxHBw=="
      |      },
      |      "tx-type": "axfer"
      |    },
      |    {
      |      "asset-transfer-transaction": {
      |        "amount": 0,
      |        "asset-id": 185,
      |        "close-amount": 0,
      |        "receiver": "T4EWBDWPEXNLEILKLD74RBLO4HFEGY522ELHW6JIGCNRX5TISUHCUU6QRM"
      |      },
      |      "close-rewards": 0,
      |      "closing-amount": 0,
      |      "confirmed-round": 3268582,
      |      "fee": 1000,
      |      "first-valid": 3268580,
      |      "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
      |      "genesis-id": "testnet-v1.0",
      |      "id": "RHE6PIYDGABCLANEVC6OCJOGKOIPJFUXIXWGKW5C6VV2Y2IMZC2Q",
      |      "intra-round-offset": 1,
      |      "last-valid": 3269580,
      |      "receiver-rewards": 0,
      |      "round-time": 1574660236,
      |      "sender": "T4EWBDWPEXNLEILKLD74RBLO4HFEGY522ELHW6JIGCNRX5TISUHCUU6QRM",
      |      "sender-rewards": 0,
      |      "signature": {
      |        "sig": "QoDACb5nvZqRwgOKn9DN+v0QqoqEK0e8UlMDgzvqfMwwCsJkDkQd00uX0U7aEPT+rt1KAcgQCqQU0VVGkQbLAQ=="
      |      },
      |      "tx-type": "axfer"
      |    },
      |    {
      |      "asset-transfer-transaction": {
      |        "amount": 0,
      |        "asset-id": 185,
      |        "close-amount": 0,
      |        "receiver": "ZYQX7BZ6LGTD7UCS7J5RVEAKHUJPK3FNJFZV2GPUYS2TFIADVFHDBKTN7I"
      |      },
      |      "close-rewards": 0,
      |      "closing-amount": 0,
      |      "confirmed-round": 3276954,
      |      "fee": 1000,
      |      "first-valid": 3276953,
      |      "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
      |      "id": "Q35X63EYQUKOJP5QEDXDVGP4QW6NXIL2E7O7R5JXJXTC3457FGWA",
      |      "intra-round-offset": 0,
      |      "last-valid": 3277953,
      |      "note": "hq+i4ygcsiI=",
      |      "receiver-rewards": 0,
      |      "round-time": 1574696191,
      |      "sender": "ZYQX7BZ6LGTD7UCS7J5RVEAKHUJPK3FNJFZV2GPUYS2TFIADVFHDBKTN7I",
      |      "sender-rewards": 0,
      |      "signature": {
      |        "sig": "eMP818g4e8GmE11h8UYPyCtKqf8udiv/Pi2UQCmrj1SApl3nxZh/W7uE3pQaAV6gV1D5GfWCo6A8qfV0HwXqDA=="
      |      },
      |      "tx-type": "axfer"
      |    },
      |    {
      |      "asset-transfer-transaction": {
      |        "amount": 10,
      |        "asset-id": 185,
      |        "close-amount": 0,
      |        "receiver": "ZYQX7BZ6LGTD7UCS7J5RVEAKHUJPK3FNJFZV2GPUYS2TFIADVFHDBKTN7I"
      |      },
      |      "close-rewards": 0,
      |      "closing-amount": 0,
      |      "confirmed-round": 3277587,
      |      "fee": 1000,
      |      "first-valid": 3277586,
      |      "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
      |      "id": "IC6EGLEBQNTMD4BGO5IAED3JEVBSLYWKL6R3HXLYH5B5HS4ZV76A",
      |      "intra-round-offset": 0,
      |      "last-valid": 3278586,
      |      "note": "d0hDCeoMgSE=",
      |      "receiver-rewards": 0,
      |      "round-time": 1574698906,
      |      "sender": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
      |      "sender-rewards": 0,
      |      "signature": {
      |        "sig": "8XqF3qdtzj3/AFxAV0nU1Mp6DcEDib9JesAQQeKk8mjy9mrVt/DTCzd8dYKXob0RBp2Hrk7AJmZdaX61Q5pyAQ=="
      |      },
      |      "tx-type": "axfer"
      |    },
      |    {
      |      "asset-transfer-transaction": {
      |        "amount": 10,
      |        "asset-id": 185,
      |        "close-amount": 0,
      |        "receiver": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
      |        "sender": "ZYQX7BZ6LGTD7UCS7J5RVEAKHUJPK3FNJFZV2GPUYS2TFIADVFHDBKTN7I"
      |      },
      |      "close-rewards": 0,
      |      "closing-amount": 0,
      |      "confirmed-round": 3277656,
      |      "fee": 1000,
      |      "first-valid": 3277654,
      |      "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
      |      "id": "KPBWQOVGVUQPMC32JZBEDQBJ2J564RKJ6NSS22SX5SQTEVR76SSQ",
      |      "intra-round-offset": 0,
      |      "last-valid": 3278654,
      |      "note": "bcdBhW3salw=",
      |      "receiver-rewards": 0,
      |      "round-time": 1574699199,
      |      "sender": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
      |      "sender-rewards": 0,
      |      "signature": {
      |        "sig": "oAYiHp6RwAIS/iZDvEogKFnOKP05rdPuygVWOAjcGNh7iO1+Osh2QHIs/VweqGJaIrlTkgbtXTQtt50goRQ1CQ=="
      |      },
      |      "tx-type": "axfer"
      |    }
      |  ]
      |}
      |""".stripMargin
}
