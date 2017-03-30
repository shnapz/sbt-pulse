import pulse.plugin._

name := "sbt-pulse"

sbtPlugin := true

organization := "impulse-io"

scalaVersion := "2.10.6"

addSbtPlugin("com.eed3si9n"      % "sbt-buildinfo"       % "0.6.1")
addSbtPlugin("com.github.gseitz" % "sbt-release"         % "1.0.4")
addSbtPlugin("com.typesafe.sbt"  % "sbt-native-packager" % "1.1.5")
addSbtPlugin("com.dwijnand"      % "sbt-travisci"        % "1.1.0")
addSbtPlugin("me.lessis"         % "bintray-sbt"         % "0.3.0")

publishing.settings

settings.common

bintrayOrganization := Some("impulse-io")

publishMavenStyle := false
