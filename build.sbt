ThisBuild / scalaVersion := "2.12.6"
ThisBuild / organization := "me.ypan"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello"
  )
