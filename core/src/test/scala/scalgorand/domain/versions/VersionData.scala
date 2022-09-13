package scalgorand.domain.versions

object VersionData {

  val version: String =
    """
      |{
      |  "versions": [
      |    "v1",
      |    "v2"
      |  ],
      |  "genesis_id": "betanet-v1.0",
      |  "genesis_hash_b64": "mFgazF+2uRS1tMiL9dsj01hJGySEmPN28B/TjjvpVW0=",
      |  "build": {
      |    "major": 3,
      |    "minor": 9,
      |    "build_number": 4,
      |    "commit_hash": "3a4710b1",
      |    "branch": "rel/beta",
      |    "channel": "beta"
      |  }
      |}
      |""".stripMargin

}