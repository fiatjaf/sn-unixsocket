enablePlugins(ScalaNativePlugin)

ThisBuild / scalaVersion        := "3.1.3"
ThisBuild / organization        := "com.fiatjaf"
ThisBuild / homepage            := Some(url("https://github.com/fiatjaf/sn-unixsocket"))
ThisBuild / licenses            += License.MIT
ThisBuild / developers          := List(tlGitHubDev("fiatjaf", "fiatjaf"))

ThisBuild / version := "0.1.0"
ThisBuild / tlSonatypeUseLegacyHost := false

ThisBuild / scalaVersion := "3.1.3"

lazy val root = project
  .settings(
    name := "sn-unixsocket",
    description := "Simple and naïve library that can read and write from and to a Unix domain socket using libuv.",
    libraryDependencies += "com.github.lolgab" %%% "native-loop-core" % "0.2.1",
  )
  .in(file("."))
