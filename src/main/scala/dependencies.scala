package pulse.plugin

import sbt._, Keys._

object dependencies {

  def _test     (module: ModuleID): ModuleID = module % "test"
  def _provided (module: ModuleID): ModuleID = module % "provided"

  object versions {
    val scalatest  = "2.2.6"
    val shapeless  = "2.3.2"
    val simulacrum = "0.10.0"
    val commons    = "3.5"
    val cats       = "0.9.0"
    val sl4j       = "1.7.25"
    object fs2 {
      val core     = "0.9.4"
      val cats     = "0.3.0"
    }

    val kafka      = "0.10.2.0"
    val log4s = "1.3.4"
    object twitter {
      val finagle = "6.42.0"
    }

    val config  = "1.3.1"
    val refined = "0.8.0"
  }

  object typesafe {
    val config = "com.typesafe" % "config" % versions.config
  }

  object refined {
    val core = "eu.timepit" %% "refined" % versions.refined
  }

  object finagle {
    val core   = "com.twitter" %% "finagle-http"   % versions.twitter.finagle
  }

  object sl4j {
    val simple = "org.slf4j" % "slf4j-simple" % versions.sl4j
  }

  object log4s {
    val core = "org.log4s" %% "log4s" % versions.log4s
  }

  object kafka {
    val core = "org.apache.kafka" %% "kafka" % versions.kafka
  }

  object fs2 {
    val core = "co.fs2" %% "fs2-core" % versions.fs2.core
    val io   = "co.fs2" %% "fs2-io"   % versions.fs2.core
    val cats = "co.fs2" %% "fs2-cats" % versions.fs2.cats
  }

  object cats {
    val all = "org.typelevel" %% "cats" % versions.cats
  }

  object scalatest {
    val core = "org.scalatest" %% "scalatest" % versions.scalatest
  }

  object shapeless {
    val core = "com.chuusai" %% "shapeless" % versions.shapeless
  }

  object simulacrum {
    val core = "com.github.mpilquist" %% "simulacrum" % versions.simulacrum
  }

  object apache {
    val lang = "org.apache.commons" % "commons-lang3" % versions.commons
  }

}
