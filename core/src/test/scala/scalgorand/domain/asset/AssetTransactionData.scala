package scalgorand.domain.asset

object AssetTransactionData {
  val assetTransactionData: String =
    """|
       |{
       |    "current-round": 24936651,
       |    "next-token": "DOB7AQAAAAABAAAA",
       |    "transactions": [
       |        {
       |            "asset-config-transaction": {
       |                "asset-id": 0,
       |                "params": {
       |                    "clawback": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
       |                    "creator": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
       |                    "decimals": 0,
       |                    "default-frozen": false,
       |                    "freeze": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
       |                    "manager": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
       |                    "name": "myasset",
       |                    "name-b64": "bXlhc3NldA==",
       |                    "reserve": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
       |                    "total": 100,
       |                    "unit-name": "MYA",
       |                    "unit-name-b64": "TVlB"
       |                }
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3219067,
       |            "created-asset-index": 185,
       |            "fee": 1000,
       |            "first-valid": 3219066,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "id": "ISOU6PJEOUZQC32Q5KFAZ7BRW5D3TSYMDRNEO4CQARXQFEFG7JXQ",
       |            "intra-round-offset": 0,
       |            "last-valid": 3220066,
       |            "note": "YUBISGGuYks=",
       |            "receiver-rewards": 0,
       |            "round-time": 1574447325,
       |            "sender": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "zbj3sFq/gjtd6CqTSvWS2OsGbeWCvlg4WITnQ41dra3swUkvZvhWzEsydfpnjj4i3GCWFWj4naTpgNePKZa+CQ=="
       |            },
       |            "tx-type": "acfg"
       |        },
       |        {
       |            "asset-transfer-transaction": {
       |                "amount": 0,
       |                "asset-id": 185,
       |                "close-amount": 0,
       |                "receiver": "X2YHQU7W6OJG66TMLL3PZ7JQS2D42YEGATBBNDXH22Q6JSNOFR6LVZYXXM"
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3268527,
       |            "fee": 1000,
       |            "first-valid": 3268525,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "genesis-id": "testnet-v1.0",
       |            "id": "2DALV2WRPYMRQKMLZLGN6O2VZCRE74VB3ZIZDVD6QX57FEBEUTDA",
       |            "intra-round-offset": 0,
       |            "last-valid": 3269525,
       |            "receiver-rewards": 0,
       |            "round-time": 1574660000,
       |            "sender": "X2YHQU7W6OJG66TMLL3PZ7JQS2D42YEGATBBNDXH22Q6JSNOFR6LVZYXXM",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "TPGBaw4eCubNlyRHl6EtGKXOkGlg9pfB5Z5cmNvyYYCs/xjKgd/TZFO+6CBV+C0MSVBbcRLXJaW8CV7wrAxHBw=="
       |            },
       |            "tx-type": "axfer"
       |        },
       |        {
       |            "asset-transfer-transaction": {
       |                "amount": 0,
       |                "asset-id": 185,
       |                "close-amount": 0,
       |                "receiver": "T4EWBDWPEXNLEILKLD74RBLO4HFEGY522ELHW6JIGCNRX5TISUHCUU6QRM"
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3268582,
       |            "fee": 1000,
       |            "first-valid": 3268580,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "genesis-id": "testnet-v1.0",
       |            "id": "RHE6PIYDGABCLANEVC6OCJOGKOIPJFUXIXWGKW5C6VV2Y2IMZC2Q",
       |            "intra-round-offset": 1,
       |            "last-valid": 3269580,
       |            "receiver-rewards": 0,
       |            "round-time": 1574660236,
       |            "sender": "T4EWBDWPEXNLEILKLD74RBLO4HFEGY522ELHW6JIGCNRX5TISUHCUU6QRM",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "QoDACb5nvZqRwgOKn9DN+v0QqoqEK0e8UlMDgzvqfMwwCsJkDkQd00uX0U7aEPT+rt1KAcgQCqQU0VVGkQbLAQ=="
       |            },
       |            "tx-type": "axfer"
       |        },
       |        {
       |            "asset-transfer-transaction": {
       |                "amount": 0,
       |                "asset-id": 185,
       |                "close-amount": 0,
       |                "receiver": "ZYQX7BZ6LGTD7UCS7J5RVEAKHUJPK3FNJFZV2GPUYS2TFIADVFHDBKTN7I"
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3276954,
       |            "fee": 1000,
       |            "first-valid": 3276953,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "id": "Q35X63EYQUKOJP5QEDXDVGP4QW6NXIL2E7O7R5JXJXTC3457FGWA",
       |            "intra-round-offset": 0,
       |            "last-valid": 3277953,
       |            "note": "hq+i4ygcsiI=",
       |            "receiver-rewards": 0,
       |            "round-time": 1574696191,
       |            "sender": "ZYQX7BZ6LGTD7UCS7J5RVEAKHUJPK3FNJFZV2GPUYS2TFIADVFHDBKTN7I",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "eMP818g4e8GmE11h8UYPyCtKqf8udiv/Pi2UQCmrj1SApl3nxZh/W7uE3pQaAV6gV1D5GfWCo6A8qfV0HwXqDA=="
       |            },
       |            "tx-type": "axfer"
       |        },
       |        {
       |            "asset-freeze-transaction": {
       |                "address": "ZYQX7BZ6LGTD7UCS7J5RVEAKHUJPK3FNJFZV2GPUYS2TFIADVFHDBKTN7I",
       |                "asset-id": 185,
       |                "new-freeze-status": true
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3276956,
       |            "fee": 1000,
       |            "first-valid": 3276927,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "id": "VH4LN4PICQPJNAZE6KVCNOYLE3K5XWWZH2OM3HWCSF2TOQU4MGNA",
       |            "intra-round-offset": 0,
       |            "last-valid": 3277927,
       |            "note": "AnwdDiVabq0=",
       |            "receiver-rewards": 0,
       |            "round-time": 1574696199,
       |            "sender": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "TtL+XMfgNcQ1H/Tgdc11yFjLKm+dZ8PskkfTkxwgUih8FS4LW+ADQnmoVxDaolfwaX5km6XHBXY2Fx91e3o/DQ=="
       |            },
       |            "tx-type": "afrz"
       |        },
       |        {
       |            "asset-freeze-transaction": {
       |                "address": "ZYQX7BZ6LGTD7UCS7J5RVEAKHUJPK3FNJFZV2GPUYS2TFIADVFHDBKTN7I",
       |                "asset-id": 185,
       |                "new-freeze-status": false
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3277585,
       |            "fee": 1000,
       |            "first-valid": 3277583,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "id": "LZ2ODDAT4ATAVJUEQW34DIKMPCMBXCCHOSIYKMWGBPEVNHLSEV2A",
       |            "intra-round-offset": 0,
       |            "last-valid": 3278583,
       |            "note": "th4JDxFROQw=",
       |            "receiver-rewards": 0,
       |            "round-time": 1574698897,
       |            "sender": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "5+RrAOnb2MpjTAU/uxy8I/T/QiyOF0riBS42+USrxXffNxDbVqV5wWndXPD+3UWVKy2Oxr416yFh25cATtTxCg=="
       |            },
       |            "tx-type": "afrz"
       |        },
       |        {
       |            "asset-transfer-transaction": {
       |                "amount": 10,
       |                "asset-id": 185,
       |                "close-amount": 0,
       |                "receiver": "ZYQX7BZ6LGTD7UCS7J5RVEAKHUJPK3FNJFZV2GPUYS2TFIADVFHDBKTN7I"
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3277587,
       |            "fee": 1000,
       |            "first-valid": 3277586,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "id": "IC6EGLEBQNTMD4BGO5IAED3JEVBSLYWKL6R3HXLYH5B5HS4ZV76A",
       |            "intra-round-offset": 0,
       |            "last-valid": 3278586,
       |            "note": "d0hDCeoMgSE=",
       |            "receiver-rewards": 0,
       |            "round-time": 1574698906,
       |            "sender": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "8XqF3qdtzj3/AFxAV0nU1Mp6DcEDib9JesAQQeKk8mjy9mrVt/DTCzd8dYKXob0RBp2Hrk7AJmZdaX61Q5pyAQ=="
       |            },
       |            "tx-type": "axfer"
       |        },
       |        {
       |            "asset-transfer-transaction": {
       |                "amount": 10,
       |                "asset-id": 185,
       |                "close-amount": 0,
       |                "receiver": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
       |                "sender": "ZYQX7BZ6LGTD7UCS7J5RVEAKHUJPK3FNJFZV2GPUYS2TFIADVFHDBKTN7I"
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3277656,
       |            "fee": 1000,
       |            "first-valid": 3277654,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "id": "KPBWQOVGVUQPMC32JZBEDQBJ2J564RKJ6NSS22SX5SQTEVR76SSQ",
       |            "intra-round-offset": 0,
       |            "last-valid": 3278654,
       |            "note": "bcdBhW3salw=",
       |            "receiver-rewards": 0,
       |            "round-time": 1574699199,
       |            "sender": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "oAYiHp6RwAIS/iZDvEogKFnOKP05rdPuygVWOAjcGNh7iO1+Osh2QHIs/VweqGJaIrlTkgbtXTQtt50goRQ1CQ=="
       |            },
       |            "tx-type": "axfer"
       |        },
       |        {
       |            "asset-transfer-transaction": {
       |                "amount": 0,
       |                "asset-id": 185,
       |                "close-amount": 0,
       |                "receiver": "RL6VDLXCN5G7N2GRTS7YLVDSFT4PVBBUOVTVS7T26OQ5MLXYQKRMI5ADXY"
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3319621,
       |            "fee": 1000,
       |            "first-valid": 3319619,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "genesis-id": "testnet-v1.0",
       |            "id": "JZCEHMUWIOPBDTZ2KIH5ZO4OBJKVOCLAJ4TIBAKF32XYRC6YJOXA",
       |            "intra-round-offset": 0,
       |            "last-valid": 3320619,
       |            "receiver-rewards": 0,
       |            "round-time": 1574878077,
       |            "sender": "RL6VDLXCN5G7N2GRTS7YLVDSFT4PVBBUOVTVS7T26OQ5MLXYQKRMI5ADXY",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "U+AXPa/yRJE9HvZTpILAojOcajnutKFJ4bm0SjJWcJSI/q4A8n+N4K6Bldyw9VhmLfGplcRizbz0JqXVhFZhAQ=="
       |            },
       |            "tx-type": "axfer"
       |        },
       |        {
       |            "asset-transfer-transaction": {
       |                "amount": 10,
       |                "asset-id": 185,
       |                "close-amount": 0,
       |                "receiver": "RL6VDLXCN5G7N2GRTS7YLVDSFT4PVBBUOVTVS7T26OQ5MLXYQKRMI5ADXY"
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3319686,
       |            "fee": 1000,
       |            "first-valid": 3319685,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "id": "X246M47UNA4ERQVYHEZTCSFEHHVIJV5UO2ZZHSF2OTIRKSZOTPZA",
       |            "intra-round-offset": 0,
       |            "last-valid": 3320685,
       |            "note": "bYq0WNJk6Y8=",
       |            "receiver-rewards": 0,
       |            "round-time": 1574878353,
       |            "sender": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "Vc8JQSH8OFf82zOGWsrrctE4BCxtTYlZ0Q3IaD+q/D1kA9ZsbZE1uuVbYmNRzoN6s3GCrkwuZXdNHRMLy/IsDw=="
       |            },
       |            "tx-type": "axfer"
       |        },
       |        {
       |            "asset-transfer-transaction": {
       |                "amount": 0,
       |                "asset-id": 185,
       |                "close-amount": 0,
       |                "close-to": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
       |                "receiver": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A"
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3332702,
       |            "fee": 1000,
       |            "first-valid": 3332700,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "id": "B5TTDGVJDPUV43UMF5ZQH2IYKMEPY2KAL7WMQK74ZEP6QHVINJ4A",
       |            "intra-round-offset": 0,
       |            "last-valid": 3333700,
       |            "receiver-rewards": 0,
       |            "round-time": 1574933764,
       |            "sender": "X2YHQU7W6OJG66TMLL3PZ7JQS2D42YEGATBBNDXH22Q6JSNOFR6LVZYXXM",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "hlOXT4z3rs/+O34ELt9pKAj7wjObzGgLkuosYdKK/6Kv1+6yLSw9bPKBoNx3s2TxtACneNpg0ezJDSuW0/9UBQ=="
       |            },
       |            "tx-type": "axfer"
       |        },
       |        {
       |            "asset-transfer-transaction": {
       |                "amount": 0,
       |                "asset-id": 185,
       |                "close-amount": 0,
       |                "receiver": "O7NSEPSZB3O26SUJP6OB4TV4ZQVL5WDZ3FTXTWKZPYZO26STJJENLJOTZA"
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3358261,
       |            "fee": 1000,
       |            "first-valid": 3358259,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "id": "COJICD2JDRPUYBPKSB6LEVGC4JFHR2Z45HS3RPJERR4BY7PLLZ6Q",
       |            "intra-round-offset": 0,
       |            "last-valid": 3359259,
       |            "receiver-rewards": 0,
       |            "round-time": 1575042560,
       |            "sender": "O7NSEPSZB3O26SUJP6OB4TV4ZQVL5WDZ3FTXTWKZPYZO26STJJENLJOTZA",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "PsO4pVV1onlXuveaqpjzXHVKZwG8S+gfSAIQeKlUVU2gfmLBQC4NSc7I3gmCjt8+z9MBBE/GKUt7w4wj5ZLbBQ=="
       |            },
       |            "tx-type": "axfer"
       |        },
       |        {
       |            "asset-transfer-transaction": {
       |                "amount": 0,
       |                "asset-id": 185,
       |                "close-amount": 0,
       |                "receiver": "IA35DCXNXDQGDLAOEOC5F36QA4USGS54R5NW3OQXWNTZFHJSFDFOFWO25E"
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3358312,
       |            "fee": 1000,
       |            "first-valid": 3358310,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "id": "WIDVUUR3F6SJCLQNF6GGBXCRB23D2I4EBABF7VO4I3IHJZYGD73A",
       |            "intra-round-offset": 0,
       |            "last-valid": 3359310,
       |            "receiver-rewards": 0,
       |            "round-time": 1575042777,
       |            "sender": "IA35DCXNXDQGDLAOEOC5F36QA4USGS54R5NW3OQXWNTZFHJSFDFOFWO25E",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "96ojog68k6l2ugQAtjEnLAizFTbax/chhIW/u/vVXN3g7KcG8wHmMkTKQ3STlMHSa8x9Cf6kr08fCzNV+HtbAQ=="
       |            },
       |            "tx-type": "axfer"
       |        },
       |        {
       |            "asset-transfer-transaction": {
       |                "amount": 0,
       |                "asset-id": 185,
       |                "close-amount": 0,
       |                "receiver": "O7NSEPSZB3O26SUJP6OB4TV4ZQVL5WDZ3FTXTWKZPYZO26STJJENLJOTZA"
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3435201,
       |            "fee": 1000,
       |            "first-valid": 3435199,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "id": "2NJU6VC3LEZTHIR372LYXXIR2LSYZQROSP22V7N5PXRVLRWTEMOA",
       |            "intra-round-offset": 0,
       |            "last-valid": 3436199,
       |            "receiver-rewards": 0,
       |            "round-time": 1575371197,
       |            "sender": "O7NSEPSZB3O26SUJP6OB4TV4ZQVL5WDZ3FTXTWKZPYZO26STJJENLJOTZA",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "vhcpcNVe9eKHJ+AG6u3nMZWDtF70IZ9AH6EXUKbFSjvRqH76xq2pDmX/mZGnzAN4X5d2euxt4xUzDfBjS1I0Dw=="
       |            },
       |            "tx-type": "axfer"
       |        },
       |        {
       |            "asset-transfer-transaction": {
       |                "amount": 0,
       |                "asset-id": 185,
       |                "close-amount": 0,
       |                "receiver": "X2YHQU7W6OJG66TMLL3PZ7JQS2D42YEGATBBNDXH22Q6JSNOFR6LVZYXXM"
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3437373,
       |            "fee": 1000,
       |            "first-valid": 3437371,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "genesis-id": "testnet-v1.0",
       |            "id": "DAITZFANU2ITSRGGFUNXZRLNIUJWPQRGU6XOQLOWSSE46V2EYCFQ",
       |            "intra-round-offset": 0,
       |            "last-valid": 3438371,
       |            "receiver-rewards": 0,
       |            "round-time": 1575380556,
       |            "sender": "X2YHQU7W6OJG66TMLL3PZ7JQS2D42YEGATBBNDXH22Q6JSNOFR6LVZYXXM",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "GEnzzfI8ngmFI8X1DcoVFS612qX0/Azwkrl27PNlnTmvH+TnWmNNb3MfsL0l85czro1zBdiXPQclGjKs4/qGDA=="
       |            },
       |            "tx-type": "axfer"
       |        },
       |        {
       |            "asset-transfer-transaction": {
       |                "amount": 0,
       |                "asset-id": 185,
       |                "close-amount": 0,
       |                "close-to": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
       |                "receiver": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A"
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3437516,
       |            "fee": 1000,
       |            "first-valid": 3437514,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "id": "ACO5VF5UEINTYCQAZQF7LSPX6DSO4XPT2LY5T6D5WPEOBC3KR26A",
       |            "intra-round-offset": 0,
       |            "last-valid": 3438514,
       |            "receiver-rewards": 0,
       |            "round-time": 1575381173,
       |            "sender": "X2YHQU7W6OJG66TMLL3PZ7JQS2D42YEGATBBNDXH22Q6JSNOFR6LVZYXXM",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "fYSIeOvppY38Lcs0eZbcU6KF+piFqwr9SQm9FlJx6hwpqR8yOgF31GOQNuj3zfhEhXKzKuVCEntOFoMatz4UCA=="
       |            },
       |            "tx-type": "axfer"
       |        },
       |        {
       |            "asset-transfer-transaction": {
       |                "amount": 0,
       |                "asset-id": 185,
       |                "close-amount": 0,
       |                "receiver": "X2YHQU7W6OJG66TMLL3PZ7JQS2D42YEGATBBNDXH22Q6JSNOFR6LVZYXXM"
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3437562,
       |            "fee": 1000,
       |            "first-valid": 3437560,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "genesis-id": "testnet-v1.0",
       |            "id": "JEC6RI6SLP7XFF2RKLIYQMJNUAHGKW77VVR6ZJC4NJDEC7M3VEKQ",
       |            "intra-round-offset": 0,
       |            "last-valid": 3438560,
       |            "receiver-rewards": 0,
       |            "round-time": 1575381371,
       |            "sender": "X2YHQU7W6OJG66TMLL3PZ7JQS2D42YEGATBBNDXH22Q6JSNOFR6LVZYXXM",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "2u5semzfRyv8DP6tSj79K3wsK9ChpfD23mC6YfJufbrXH7Wf8VUF9JWo+FNm+Tsuiyc9/fUmSqzP2InyhAMYBA=="
       |            },
       |            "tx-type": "axfer"
       |        },
       |        {
       |            "asset-transfer-transaction": {
       |                "amount": 0,
       |                "asset-id": 185,
       |                "close-amount": 0,
       |                "close-to": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
       |                "receiver": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A"
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3437623,
       |            "fee": 1000,
       |            "first-valid": 3437621,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "id": "NWOM56PTET6IMVGUAT4WMONT3LH7LSL56L7L3RAGZWKTN35PF7UQ",
       |            "intra-round-offset": 0,
       |            "last-valid": 3438621,
       |            "receiver-rewards": 0,
       |            "round-time": 1575381634,
       |            "sender": "X2YHQU7W6OJG66TMLL3PZ7JQS2D42YEGATBBNDXH22Q6JSNOFR6LVZYXXM",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "sig": "sPKop7Ya3UTMIwyR5wDslJ8JZlTcf/ywf37l/fmz2pTKCle1KtTRfgPEXJ5pBIyrKrRSlv6A4hFBBDCGFTDJAg=="
       |            },
       |            "tx-type": "axfer"
       |        },
       |        {
       |            "asset-transfer-transaction": {
       |                "amount": 0,
       |                "asset-id": 185,
       |                "close-amount": 0,
       |                "receiver": "LCMTN3F5XVAVBKOPDTZDTCSFFIYSGCKNDKNLZ2PZMLF3Z3KPP6GMTO2TFQ"
       |            },
       |            "close-rewards": 0,
       |            "closing-amount": 0,
       |            "confirmed-round": 3437987,
       |            "fee": 1000,
       |            "first-valid": 3437875,
       |            "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
       |            "id": "XC2OOHGVDD7CJJQ7T6EDCBSLIWFRBRGX3NBQU62BGGSTYRVENY2Q",
       |            "intra-round-offset": 0,
       |            "last-valid": 3438875,
       |            "receiver-rewards": 0,
       |            "round-time": 1575383203,
       |            "sender": "LCMTN3F5XVAVBKOPDTZDTCSFFIYSGCKNDKNLZ2PZMLF3Z3KPP6GMTO2TFQ",
       |            "sender-rewards": 0,
       |            "signature": {
       |                "logicsig": {
       |                    "args": [],
       |                    "logic": "ASAJAQIEALkB1R0FwJaxAtAPJgEgziF/hz5Zpj/QUvp7GpAKPRL1bK1Jc10Z9MS1MqADqU4yBCISQABiMgQjEjEWIhIQMRAkEhAzABAkEhAxEiUNEDERIQQSEDMAESEFEhAxEzIDEhAxFTIDEhAzABQxABIQMwASIh01AjUBMRIhBh01BDUDNAE0Aw1AAGg0ATQDEjQCNAQPEEAAWgAxECISMQkoEhAxAiEHDRAxBzIDEhAxCCUSEDEQJBIxEzIDEhAxEiUSEDERIQUSMREhBBIREDEVKBIxAiEHDRAxFDIDEhAxFDEAEjEVMgMSEDEEIQcMEBEQETEBIQgOEA=="
       |                }
       |            },
       |            "tx-type": "axfer"
       |        }
       |    ]
       |}    
       |""".stripMargin

}