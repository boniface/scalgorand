package scalgorand.domain.accounts

object AccountByAccountIdData {

  val accountsByAccountIdData: String =
    """
      |{
      |  "current-round": 0,
      |  "account": {
      |    "participation": {
      |      "state-proof-key": "string",
      |      "vote-participation-key": "string",
      |      "vote-last-valid": 0,
      |      "vote-key-dilution": 0,
      |      "vote-first-valid": 0,
      |      "selection-participation-key": "string"
      |    },
      |    "amount": 0,
      |    "address": "string",
      |    "created-at-round": 0,
      |    "apps-local-state": [
      |      {
      |        "schema": {
      |          "num-uint": 0,
      |          "num-byte-slice": 0
      |        },
      |        "deleted": true,
      |        "closed-out-at-round": 0,
      |        "key-value": [
      |          {
      |            "value": {
      |              "bytes": "string",
      |              "type": 0,
      |              "uint": 0
      |            },
      |            "key": "string"
      |          }
      |        ],
      |        "opted-in-at-round": 0,
      |        "id": 0
      |      }
      |    ],
      |    "created-assets": [
      |      {
      |        "destroyed-at-round": 0,
      |        "deleted": true,
      |        "created-at-round": 0,
      |        "index": 0,
      |        "params": {
      |          "creator": "string",
      |          "unit-name": "string",
      |          "manager": "string",
      |          "metadata-hash": "string",
      |          "url-b64": "string",
      |          "url": "string",
      |          "clawback": "string",
      |          "default-frozen": true,
      |          "unit-name-b64": "string",
      |          "total": 0,
      |          "freeze": "string",
      |          "decimals": 19,
      |          "name": "string",
      |          "reserve": "string",
      |          "name-b64": "string"
      |        }
      |      }
      |    ],
      |    "apps-total-schema": {
      |      "num-uint": 0,
      |      "num-byte-slice": 0
      |    },
      |    "reward-base": 0,
      |    "pending-rewards": 0,
      |    "created-apps": [
      |      {
      |        "deleted-at-round": 0,
      |        "deleted": true,
      |        "created-at-round": 0,
      |        "id": 0,
      |        "params": {
      |          "global-state": [
      |            {
      |              "value": {
      |                "bytes": "string",
      |                "type": 0,
      |                "uint": 0
      |              },
      |              "key": "string"
      |            }
      |          ],
      |          "clear-state-program": "string",
      |          "creator": "string",
      |          "local-state-schema": {
      |            "num-uint": 0,
      |            "num-byte-slice": 0
      |          },
      |          "approval-program": "string",
      |          "global-state-schema": {
      |            "num-uint": 0,
      |            "num-byte-slice": 0
      |          }
      |        }
      |      }
      |    ],
      |    "total-assets-opted-in": 0,
      |    "total-apps-opted-in": 0,
      |    "closed-at-round": 0,
      |    "total-created-apps": 0,
      |    "deleted": true,
      |    "assets": [
      |      {
      |        "amount": 0,
      |        "deleted": true,
      |        "opted-out-at-round": 0,
      |        "asset-id": 0,
      |        "is-frozen": true,
      |        "opted-in-at-round": 0
      |      }
      |    ],
      |    "round": 0,
      |    "total-created-assets": 0,
      |    "amount-without-pending-rewards": 0,
      |    "auth-addr": "string",
      |    "rewards": 0,
      |    "status": "string",
      |    "sig-type": "sig"
      |  }
      |}
      |""".stripMargin

}
