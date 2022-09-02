package scalgorand.domain.asset

object AssetsData {
  val assetsData: String =
    """
      |{
      |  "assets": [
      |    {
      |      "created-at-round": 95070,
      |      "deleted": false,
      |      "index": 1,
      |      "params": {
      |        "clawback": "RZW5QPI4X7NZXUKFJZXOU3F5QQR7Q7MW5ZG3467XDWTMGO3YDUW3YCIJPQ",
      |        "creator": "RZW5QPI4X7NZXUKFJZXOU3F5QQR7Q7MW5ZG3467XDWTMGO3YDUW3YCIJPQ",
      |        "decimals": 0,
      |        "default-frozen": false,
      |        "freeze": "RZW5QPI4X7NZXUKFJZXOU3F5QQR7Q7MW5ZG3467XDWTMGO3YDUW3YCIJPQ",
      |        "manager": "RZW5QPI4X7NZXUKFJZXOU3F5QQR7Q7MW5ZG3467XDWTMGO3YDUW3YCIJPQ",
      |        "name": "asset1",
      |        "name-b64": "YXNzZXQx",
      |        "reserve": "RZW5QPI4X7NZXUKFJZXOU3F5QQR7Q7MW5ZG3467XDWTMGO3YDUW3YCIJPQ",
      |        "total": 10000
      |      }
      |    },
      |    {
      |      "created-at-round": 120860,
      |      "deleted": false,
      |      "index": 15,
      |      "params": {
      |        "clawback": "4FK4BMFSAIA65UDBXVDZIRBKKY3D2PGQMSQ2NSKVMK4Z3ZOEMCHVA6KI6I",
      |        "creator": "4FK4BMFSAIA65UDBXVDZIRBKKY3D2PGQMSQ2NSKVMK4Z3ZOEMCHVA6KI6I",
      |        "decimals": 0,
      |        "default-frozen": false,
      |        "freeze": "4FK4BMFSAIA65UDBXVDZIRBKKY3D2PGQMSQ2NSKVMK4Z3ZOEMCHVA6KI6I",
      |        "manager": "4FK4BMFSAIA65UDBXVDZIRBKKY3D2PGQMSQ2NSKVMK4Z3ZOEMCHVA6KI6I",
      |        "reserve": "4FK4BMFSAIA65UDBXVDZIRBKKY3D2PGQMSQ2NSKVMK4Z3ZOEMCHVA6KI6I",
      |        "total": 10000,
      |        "unit-name": "bcoin",
      |        "unit-name-b64": "YmNvaW4="
      |      }
      |    }
      |  ],
      |  "current-round": 20332345,
      |  "next-token": "15"
      |}
      |""".stripMargin

  val assetData: String =
    """
      |{
      |  "index": 185,
      |  "params": {
      |    "clawback": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
      |    "creator": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
      |    "decimals": 0,
      |    "default-frozen": false,
      |    "freeze": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
      |    "manager": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
      |    "name": "myasset",
      |    "name-b64": "bXlhc3NldA==",
      |    "reserve": "WLH5LELVSEVQL45LBRQYCLJAX6KQPGWUY5WHJXVRV2NPYZUBQAFPH22Q7A",
      |    "total": 100,
      |    "unit-name": "MYA",
      |    "unit-name-b64": "TVlB"
      |  }
      |}
      |""".stripMargin
}
