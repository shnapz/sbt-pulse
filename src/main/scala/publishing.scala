package pulse.plugin

import sbt._, Keys._
import bintray._

object publishing {

  def ignore = Seq(
    publish := { },
    publishLocal := { },
    publishArtifact in Compile := false,
    publishArtifact in Test := false
  )

  def settings = Seq(
    organization := "impulse-io",
    pomExtra := <scm>
        <url>http://github.com/gpulse/services</url>
        <connection>scm:git:git@github.com:gpulse/sbt-pulse.git</connection>
      </scm>,
    publishArtifact in Test := false,
    homepage := Some(url("http://www.impulso.io")),
    publishMavenStyle := false,
    resolvers += Resolver.url("Impulso resolver", url("https://dl.bintray.com/impulse-io"))(Resolver.ivyStylePatterns),
    licenses := ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.txt")) :: Nil
  )
}
