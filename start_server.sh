#!/bin/bash 
echo "$(tput setaf 1)$(tput setab 7)HBS Server starting$(tput sgr 0)"
echo HBS Server starting
cd /home/ismail/my_project/maven/hbs_server/
mvn clean
mvn package
java -jar target/hbs-server-1.0-SNAPSHOT.jar  server config.yml
echo "hbs server stopping"
