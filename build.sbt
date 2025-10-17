version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.17"

lazy val root = (project in file("."))
  .settings(
    name := "Scala_basic"
  )

 libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test