name := "play-mockws"

scalaVersion := "2.12.8"

crossScalaVersions := Seq("2.11.12", "2.12.8")

scalacOptions ++= Seq("-deprecation", "-feature")

organization := "de.leanovate.play-mockws"

val playVersion = "2.7.2"

fork := true

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play"                             % playVersion % "provided",
  "com.typesafe.play" %% "play-ahc-ws"                      % playVersion % "provided",
  "com.typesafe.play" %% "play-test"                        % playVersion % "provided"
)

libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"    % "3.0.8",
  "org.scalacheck" %% "scalacheck"   % "1.14.0",
  "org.mockito"    %  "mockito-core" % "2.28.2"
) map (_ % Test)

Release.settings
