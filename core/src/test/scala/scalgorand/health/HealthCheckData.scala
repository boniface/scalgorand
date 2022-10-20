package scalgorand.domain.health

object HealthCheckData {

  val healthCheck: String =
    """
      |{
      |    "data": {
      |        "migration-required": false,
      |        "read-only-mode": true
      |    },
      |    "db-available": true,
      |    "is-migrating": false,
      |    "message": "24945549",
      |    "round": 24945549,
      |    "version": "2.14.1"
      |}
      |
      |""".stripMargin

}