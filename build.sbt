name := "scala-storm-spike"

organization := "com.example"

version := "0.0.1"

scalaVersion := "2.9.1"



libraryDependencies ++= Seq(
  "com.github.velvia" %% "scala-storm" % "0.2.2"
)

resolvers ++= Seq("clojars" at "http://clojars.org/repo/",
                  "clojure-releases" at "http://build.clojure.org/releases")

initialCommands := "import com.example.scalastormspike._"

