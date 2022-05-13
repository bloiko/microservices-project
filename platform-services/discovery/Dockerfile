#FROM java:8
#WORKDIR /
#ADD target/discovery-1.0-SNAPSHOT.jar //
#EXPOSE 8087
#ENTRYPOINT [ "java", "-jar", "/discovery-1.0-SNAPSHOT.jar"]

#FROM java:8
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} discovery-1.0-SNAPSHOT.jar
#ENTRYPOINT ["java","-jar","/discovery-1.0-SNAPSHOT.jar"]


FROM maven:3.6.0-jdk-8-alpine as build

VOLUME /tmp
COPY target/discovery*.jar discovery.jar
# Run the jar file
EXPOSE 8761 8761
ENTRYPOINT ["java","-jar","/discovery.jar"]