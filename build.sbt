name := "testrestapi"

version := "1.0-SNAPSHOT"

val appDependencies = Seq(
     // Add your project dependencies here,
    "postgresql" % "postgresql" % "9.3-1100.jdbc41"
)

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)     

play.Project.playScalaSettings
