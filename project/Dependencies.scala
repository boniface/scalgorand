import sbt._

object Dependencies {
  private val test = Test

  object General {
    private val commonsVersion           = "3.12.0"
    val slf4jVersion                     = "1.7.36"
    private val configVersion            = "1.4.2"
    private val scalaCacheV              = "1.0.0-M6"
    private val parserCombinatorsVersion = "2.1.1"
    private val maxMindGeoIp2Version     = "3.0.1"

    val parserCombinators  = "org.scala-lang.modules" %% "scala-parser-combinators" % parserCombinatorsVersion
    val scalaCache         = "com.github.cb372"       %% "scalacache-core"          % scalaCacheV
    val config             = "com.typesafe"            % "config"                   % configVersion
    val simpleSlf4j        = "org.slf4j"               % "slf4j-api"                % slf4jVersion
    val slf4j              = "org.slf4j"               % "slf4j-simple"             % slf4jVersion
    val all: Seq[ModuleID] =
      Seq(
        config,
        scalaCache,
      )
  }

  object ZIO {

    val zioVersion         = "2.0.0"
    val zioJsonVersion     = "0.3.0-RC8"
    val interopVersion     = "3.2.9.1"
    val loggingVersion     = "0.5.14"
    val zio                = "dev.zio" %% "zio"               % zioVersion
    val streams            = "dev.zio" %% "zio-streams"       % zioVersion
    val macros             = "dev.zio" %% "zio-macros"        % zioVersion
    val catsInterop        = "dev.zio" %% "zio-interop-cats"  % interopVersion
    val logging            = "dev.zio" %% "zio-logging"       % loggingVersion
    val loggingSlf4j       = "dev.zio" %% "zio-logging-slf4j" % loggingVersion
    val zioJson            = "dev.zio" %% "zio-json"          % zioJsonVersion
    val all: Seq[ModuleID] = Seq(zio, streams, macros, catsInterop, logging, loggingSlf4j, zioJson)
  }

  object Cats {
    private val catsV       = "2.7.0"
    private val catsEffectV = "3.3.12"

    val core               = "org.typelevel" %% "cats-core"   % catsV
    val effect             = "org.typelevel" %% "cats-effect" % catsEffectV
    val all: Seq[ModuleID] = Seq(core, effect)
  }

  object AlgoSDKWrapper {
    private val algoSDKVersion = "1.16.0"
    val algoSDK                = "com.algorand" % "algosdk" % algoSDKVersion
    val all: Seq[ModuleID]     = Seq(algoSDK)
  }

  object STTP {
    val sttpVersion        = "3.7.2"
    val zioClient          = "com.softwaremill.sttp.client3" %% "async-http-client-backend-zio" % sttpVersion
    val clientZioJson      = "com.softwaremill.sttp.client3" %% "zio-json"                      % sttpVersion
    val core               = "com.softwaremill.sttp.client3" %% "core"                          % sttpVersion
    val all: Seq[ModuleID] = Seq(zioClient, clientZioJson, core)
  }

  object Enum {
    private val version    = "1.7.0"
    val core               = "com.beachape" %% "enumeratum"       % version
    val circe              = "com.beachape" %% "enumeratum-circe" % version
    val all: Seq[ModuleID] = Seq(core, circe)
  }

  object Config {
    private val version    = "0.17.1"
    private val refinedV   = "0.9.29"
    val pureconfig         = "com.github.pureconfig" %% "pureconfig"         % version
    val pureconfigRefined  = "eu.timepit"            %% "refined-pureconfig" % refinedV
    val all: Seq[ModuleID] = Seq(pureconfig, pureconfigRefined)
  }

  object Logging {
    private val logbackV   = "1.2.11"
    private val typeSafeV  = "3.9.5"
    val Core               = "ch.qos.logback"              % "logback-core"    % logbackV
    val Logback            = "ch.qos.logback"              % "logback-classic" % logbackV
    val typeSafe           = "com.typesafe.scala-logging" %% "scala-logging"   % typeSafeV
    val all: Seq[ModuleID] = Seq(Core, Logback, typeSafe)
  }

  object Testing {
    private val scalaTestVersion              = "3.2.11"
    private val testCassandraContainerVersion = "1.17.2"
    private val testContainerVersion          = "0.40.8"
    private val scalaTestPlusVersion          = "5.0.0"
    private val zioMockVersion                = "1.0.0-RC8"
    val scalaTestPlus   = "org.scalatestplus.play" %% "scalatestplus-play" % scalaTestPlusVersion % test
    val zioTest         = "dev.zio"                %% "zio-test"           % ZIO.zioVersion       % test
    val zioTestSbt      = "dev.zio"                %% "zio-test-sbt"       % ZIO.zioVersion       % test
    val zioTestJunit    = "dev.zio"                %% "zio-test-junit"     % ZIO.zioVersion       % test
    val zioTestMagnolia = "dev.zio"                %% "zio-test-magnolia"  % ZIO.zioVersion       % test
    val scalaTest       = "org.scalatest"          %% "scalatest"          % scalaTestVersion     % test
    val zioClient       =
      "com.softwaremill.sttp.client3" %% "async-http-client-backend-zio" % STTP.sttpVersion % test
    val clientCirce        = "com.softwaremill.sttp.client3" %% "circe"                % STTP.sttpVersion     % test
    val core               = "com.softwaremill.sttp.client3" %% "core"                 % STTP.sttpVersion     % test
    val zioMock            = "dev.zio"                       %% "zio-mock"             % zioMockVersion       % test
    val testContainers     = "com.dimafeng"                  %% "testcontainers-scala" % testContainerVersion % test
    val all: Seq[ModuleID] =
      Seq(
        zioTest,
        zioTestSbt,
        zioTestMagnolia,
        zioClient,
        clientCirce,
        core,
        testContainers,
        scalaTestPlus,
        zioMock,
        zioTestJunit,
      )
  }

}
