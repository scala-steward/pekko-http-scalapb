import sbt._

object Dependencies {

  object Versions {
    val akka                  = "2.5.26"
    val akkaHttp              = "10.1.11"
    val scalaCollectionCompat = "2.1.2"
    val scalaPB               = "0.9.6"
    val scalaPBJson4s         = "0.9.3"
    val scalaTest             = "3.1.0"
  }

  val akkaHttp              = "com.typesafe.akka"      %% "akka-http"               % Versions.akkaHttp
  val scalaCollectionCompat = "org.scala-lang.modules" %% "scala-collection-compat" % Versions.scalaCollectionCompat
  val scalaPB               = "com.thesamet.scalapb"   %% "scalapb-runtime"         % Versions.scalaPB
  val scalaPbJson4s         = "com.thesamet.scalapb"   %% "scalapb-json4s"          % Versions.scalaPBJson4s

  object Provided {
    val akkaStream = "com.typesafe.akka" %% "akka-stream" % Versions.akka % "provided"
  }

  object Test {
    val akkaHttpTestkit = "com.typesafe.akka" %% "akka-http-testkit" % Versions.akkaHttp  % "test"
    val akkaTestkit     = "com.typesafe.akka" %% "akka-testkit"      % Versions.akka      % "test"
    val scalaTest       = "org.scalatest"     %% "scalatest"         % Versions.scalaTest % "test"
  }
}
