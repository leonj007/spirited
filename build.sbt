import play.Project._

name := "TheHolyBible"

version := "1.0"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-native" % "3.2.10")

playScalaSettings
