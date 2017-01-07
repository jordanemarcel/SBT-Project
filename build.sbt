lazy val commonSettings = Seq(
  organization := "marcel.jordane",
  scalaVersion := "2.12.1",
  version := "0.1.0-SNAPSHOT"
)

lazy val root = (project in file("."))
  .settings(commonSettings:_*)
  .settings(
    name := "SBT Project",
    organization := "marcel.jordane",
    scalaVersion := "2.12.1",
    version := "0.1.0-SNAPSHOT"
  )
