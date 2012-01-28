name := "lift_mongo_basic_sbt11"

scalaVersion := "2.9.1"

seq(webSettings :_*)

//Lift dependencies
{
	var liftVersion = "2.4"
	libraryDependencies ++= Seq(
	    "net.liftweb" %% "lift-webkit" 		% liftVersion % "compile->default",
	    "net.liftweb" %% "lift-mapper" 		% liftVersion % "compile->default",
	    "net.liftweb" %% "lift-wizard" 		% liftVersion % "compile->default",
	    "net.liftweb" %% "lift-mongodb" 		% liftVersion % "compile->default",
	    "net.liftweb" %% "lift-mongodb-record" 	% liftVersion % "compile->default")
}

//Other Deps
libraryDependencies ++= Seq(
  "junit" 		% "junit" 		% "4.5" 		% "test->default",
  "org.eclipse.jetty" 	% "jetty-webapp" 	% "8.0.1.v20110908" 	% "container",  
  "javax.servlet" 	% "servlet-api" 	% "2.5" 		% "provided->default",
  "ch.qos.logback" 	% "logback-classic" 	% "0.9.26" 		% "compile->default",
  "com.foursquare" 	%% "rogue"              % "1.1.1" intransitive()
)

