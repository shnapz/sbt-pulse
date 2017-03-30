package pulse.plugin

import sbt._, Keys._

object GenericPlugin extends AutoPlugin {

  object autoImport {
    val projectName = SettingKey[Option[String]]("project-name")
  }

  import autoImport._

  override def requires = sbtrelease.ReleasePlugin

  override def projectSettings = settings.common
}
