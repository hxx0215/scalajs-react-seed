enablePlugins(ScalaJSPlugin)
enablePlugins(ScalaJSBundlerPlugin)
name := "scala-react"

version := "0.1"

scalaVersion := "2.13.3"

scalaJSUseMainModuleInitializer := true

npmDependencies in Compile += "snabbdom" -> "0.5.3"

npmDependencies in Compile ++= Seq(
  "react" -> "16.13.1",
  "react-dom" -> "16.13.1")

webpackConfigFile := Some(baseDirectory.value / "webpack.config.js")

(npmDevDependencies in Compile) += ("html-webpack-plugin" -> "4.3.0")
(npmDevDependencies in Compile) += ("scalajs-friendly-source-map-loader" -> "0.1.5")

libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "1.7.4"

crossTarget in (Compile, fastOptJS) := baseDirectory.value / "dist"
crossTarget in (Compile, npmUpdate) := baseDirectory.value / "dist"
