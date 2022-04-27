FROM java:8
WORKDIR /
ADD target/two-1.0-SNAPSHOT.jar //
EXPOSE 8088
ENTRYPOINT [ "java", "-jar", "/two-1.0-SNAPSHOT.jar"]

#FROM java:8
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} two-1.0-SNAPSHOT.jar
#ENTRYPOINT ["java","-jar","/two-1.0-SNAPSHOT.jar"]
