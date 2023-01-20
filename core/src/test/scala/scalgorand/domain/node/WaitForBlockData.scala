package scalgorand.domain.node

object WaitForBlockData {

  val waitForBlock: String =
    """
      |{
      |  "catchpoint": "",
      |  "catchpoint-acquired-blocks": 0,
      |  "catchpoint-processed-accounts": 0,
      |  "catchpoint-processed-kvs": 0,
      |  "catchpoint-total-accounts": 0,
      |  "catchpoint-total-blocks": 0,
      |  "catchpoint-total-kvs": 0,
      |  "catchpoint-verified-accounts": 0,
      |  "catchpoint-verified-kvs": 0,
      |  "catchup-time": 0,
      |  "last-catchpoint": "27140000#Y4RTR63TE5KACOB3UXSHHEE3QYXVRACYYQBC3DUA27USCFBPEZLA",
      |  "last-round": 27143021,
      |  "last-version": "https://github.com/algorandfoundation/specs/tree/44fa607d6051730f5264526bf3c108d51f0eadb6",
      |  "next-version": "https://github.com/algorandfoundation/specs/tree/44fa607d6051730f5264526bf3c108d51f0eadb6",
      |  "next-version-round": 27143022,
      |  "next-version-supported": true,
      |  "stopped-at-unsupported-round": false,
      |  "time-since-last-round": 3369624280
      |}
      |""".stripMargin

}