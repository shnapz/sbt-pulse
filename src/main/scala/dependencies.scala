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
    val fs2        = "0.9.4"
    val kafka      = "0.10.1.0"
  }

  object kafka {
    val core = "org.apache.kafka" %% "kafka" % versions.kafka
  }

  object fs2 {
    val core = "co.fs2" %% "fs2-core" % versions.fs2
    val io   = "co.fs2" %% "fs2-io"   % versions.fs2
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
