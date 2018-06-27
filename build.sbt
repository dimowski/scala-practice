name := "progfun"

version := "0.1"

scalaVersion := "2.12.5"

lazy val akkaVersion = "2.5.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion
)