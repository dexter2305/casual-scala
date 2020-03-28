name := "casual-scala"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"

mainClass in (Compile, packageBin) := Some("edu.learnings.CommandExecer")
mainClass in (Compile, run) := Some("edu.learnings.CommandExecer")