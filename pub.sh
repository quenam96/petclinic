#!/bin/bash


sudo systemctl stop tomcat

rm -rf /home/silentbrain/spring-framework-petclinic/target
 
sudo rm -rf $CATALINA_HOME/webapps/petclinic*

 
./mvnw install -P MySQL -Dmaven.test.skip=true


sudo cp /home/silentbrain/spring-framework-petclinic/target/petclinic.war $CATALINA_HOME/webapps/

sudo chown tomcat:tomcat $CATALINA_HOME/webapps/petclinic.war 

sudo systemctl start tomcat


