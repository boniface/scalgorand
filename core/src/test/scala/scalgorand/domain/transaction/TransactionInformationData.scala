package scalgorand.domain.transaction

object TransactionInformationData {

  val transactionInformation: String =
    """
      |{
      |  "current-round": 24799553,
      |  "transaction": {
      |    "close-rewards": 0,
      |    "closing-amount": 0,
      |    "confirmed-round": 1,
      |    "fee": 10000,
      |    "first-valid": 0,
      |    "genesis-hash": "SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
      |    "genesis-id": "testnet-v1.0",
      |    "id": "QOOBRVQMX4HW5QZ2EGLQDQCQTKRF3UP3JKDGKYPCXMI6AVV35KQA",
      |    "intra-round-offset": 0,
      |    "last-valid": 1000,
      |    "payment-transaction": {
      |      "amount": 100000000,
      |      "close-amount": 0,
      |      "receiver": "3NVE2MK2QYZQFOZ5XIRQTM7JRHNPUBV7QKLYLT7OO6QXFHXMRIAUXXNCBM"
      |    },
      |    "receiver-rewards": 0,
      |    "round-time": 1560210480,
      |    "sender": "GD64YIY3TWGDMCNPP553DZPPR6LDUSFQOIJVFDPPXWEG3FVOJCCDBBHU5A",
      |    "sender-rewards": 0,
      |    "signature": {
      |      "sig": "tlAccbsxpTazfxt3Yu69Li98QvH6nDAPNHdU8LUkpBLxu1umNePq0NwfHbrtv3hW4dxKQw32SbszeMrv5X64Cg=="
      |    },
      |    "tx-type": "pay"
      |  }
      |}
      |""".stripMargin

}
