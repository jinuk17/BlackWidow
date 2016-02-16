name := "BlackWidow"

version := "1.0"

lazy val `blackwidow` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq( jdbc , anorm , cache , ws )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

resolvers ++= Seq(
  "webjars"    at "http://webjars.github.com/m2"
)

libraryDependencies ++= Seq(
  "org.webjars"               %% "webjars-play"       % "2.3.0",
  "org.webjars"               % "bootstrap"           % "3.3.6",
  "org.webjars"               % "jquery"              % "1.8.3"
)