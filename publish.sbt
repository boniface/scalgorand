ThisBuild / organization := "zm.hashcode.scalgorand"
ThisBuild / organizationName := "scalgorand"
ThisBuild / organizationHomepage := Some(url("https://www.yourwebsite.com"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/boniface/scalgorand"),
    "scm:git@github.boniface/scalgorand.git"
  )
)

ThisBuild / developers := List(
  Developer(
    id    = "boniface",
    name  = "",
    email = "youremail@address.com",
    url   = url("https://www.yourwebsite.com")
  )
)

ThisBuild / description := "Describe your project here..."
ThisBuild / licenses := List("The Unlicense" -> new URL("https://unlicense.org/"))
ThisBuild / homepage := Some(url("https://github.com/username/project"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }

ThisBuild / publishTo := {
  val nexus = "https://s01.oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

ThisBuild / publishMavenStyle := true

ThisBuild / versionScheme := Some("early-semver")