name := "lift_blank_sbt11"

scalaVersion := "2.9.1"

seq(webSettings :_*)

{
	val liftVersion = "2.4-M4"
	libraryDependencies ++= Seq(
	  "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default",
	  "net.liftweb" %% "lift-mapper" % liftVersion % "compile->default",
	  "net.liftweb" %% "lift-wizard" % liftVersion % "compile->default"
	)
}

libraryDependencies ++= Seq(
  "junit" 		% "junit" 		% "4.5" 	% "test->default",
  "org.mortbay.jetty" 	% "jetty" 		% "6.1.22" 	% "container",
  "javax.servlet" 	% "servlet-api" 	% "2.5" 	% "provided->default",
  "com.h2database" 	% "h2" 			% "1.2.138",
  "ch.qos.logback" 	% "logback-classic" 	% "0.9.26" 	% "compile->default"
)

