package scalgorand.domain.accounts

object AccountCreatedAppliationsData {

  val createdApplications: String =
    """
      |{
      |  "next-token": "string",
      |  "current-round": 0,
      |  "applications": [
      |    {
      |      "deleted-at-round": 0,
      |      "deleted": true,
      |      "created-at-round": 0,
      |      "id": 0,
      |      "params": {
      |        "global-state": [
      |          {
      |            "value": {
      |              "bytes": "string",
      |              "type": 0,
      |              "uint": 0
      |            },
      |            "key": "string"
      |          }
      |        ],
      |        "clear-state-program": "string",
      |        "creator": "string",
      |        "local-state-schema": {
      |          "num-uint": 0,
      |          "num-byte-slice": 0
      |        },
      |        "approval-program": "string",
      |        "global-state-schema": {
      |          "num-uint": 0,
      |          "num-byte-slice": 0
      |        }
      |      }
      |    }
      |  ]
      | }
      |""".stripMargin

}
