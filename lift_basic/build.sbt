name := "lift_basic_sbt11"

version := "0.1"

scalaVersion := "2.9.1"

//Lift Deps
{
	var liftVersion = "2.4"	
	libraryDependencies ++= Seq(
	    "net.liftweb" %% "lift-webkit" 	% liftVersion % "compile->default",
	    "net.liftweb" %% "lift-mapper" 	% liftVersion % "compile->default",
	    "net.liftweb" %% "lift-wizard" 	% liftVersion % "compile->default")
}

//Other deps
libraryDependencies ++= Seq(
  "junit" 		% "junit" 		% "4.5" 		% "test->default",
  "org.eclipse.jetty" 	% "jetty-webapp" 	% "8.0.1.v20110908" 	% "container",  
  "javax.servlet" 	% "servlet-api" 	% "2.5" 		% "provided->default",
  "ch.qos.logback" 	% "logback-classic" 	% "0.9.26" 		% "compile->default"
)

//Settings 
seq(webSettings :_*)



