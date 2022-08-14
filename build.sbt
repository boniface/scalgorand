import Boilerplate._
import Dependencies._

inThisBuild(
  List(
    organization := "zm.hashcode",
    homepage     := Some(url("https://github.com/boniface/scalgorand")),
    licenses     := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
    developers   := List(
      Developer("boniface", "Boniface Kabaso", "email", url("https://github.com/boniface")),
      Developer("ferox", "Fernando  Neto", "email", url("https://github.com/ferox")),
      Developer("patrick", "Patric Mwansa", "email", url("https://github.com/patrick")),
      Developer("Lungelo", "Lungelo Ndaba", "email", url("https://github.com/lungelo")),
    ),
  ),
)

addCommandAlias("fix", "; all compile:scalafix test:scalafix; all scalafmtSbt scalafmtAll")
addCommandAlias("check", "; scalafmtSbtCheck; scalafmtCheckAll; Compile / scalafix --check; Test / scalafix --check")
addCommandAlias("coverageReport", "clean coverage test coverageReport coverageAggregate")
addCommandAlias("testDotty", ";scalgorand/test;examples/test")

lazy val dependencies =
  Cats.all ++
    STTP.all ++
    General.all ++
    Config.all ++
    ZIO.all ++
    Enum.all ++
    Logging.all ++
    Testing.all ++
    AlgoSDKWrapper.all

lazy val core = project
  .in(file("core"))
  .settings(stdSettings("scalgorand-core"))
  .settings(
    libraryDependencies ++= dependencies,
    scalacOptions += "-Ymacro-annotations",
    testFrameworks := Seq(new TestFramework("zio.test.sbt.ZTestFramework")),
  )
  .settings(dottySettings)

lazy val docs = project
  .in(file("scalgorand-docs"))
  .settings(
    publish / skip                             := true,
    moduleName                                 := "scalgorand-docs",
    scalacOptions -= "-Yno-imports",
    scalacOptions -= "-Xfatal-warnings",
    scalacOptions += "-Ymacro-annotations",
    ScalaUnidoc / unidoc / unidocProjectFilter := inProjects(core),
    ScalaUnidoc / unidoc / target := (LocalRootProject / baseDirectory).value / "website" / "static" / "api",
    cleanFiles += (ScalaUnidoc / unidoc / target).value,
    docusaurusCreateSite          := docusaurusCreateSite.dependsOn(Compile / unidoc).value,
    docusaurusPublishGhpages      := docusaurusPublishGhpages.dependsOn(Compile / unidoc).value,
  )
  .dependsOn(core)
  .enablePlugins(MdocPlugin, DocusaurusPlugin, ScalaUnidocPlugin)

lazy val examples = project
  .in(file("examples"))
  .settings(stdSettings("examples"))
  .settings(
    publish / skip := true,
    moduleName     := "examples",
  )
  .settings(dottySettings)
  .dependsOn(core)
