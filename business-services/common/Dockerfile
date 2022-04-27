FROM java:8
WORKDIR /
ADD target/one-1.0-SNAPSHOT.jar //
EXPOSE 8111
ENTRYPOINT [ "java", "-jar", "/one-1.0-SNAPSHOT.jar"]

#FROM java:8
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} one-1.0-SNAPSHOT.jar
#ENTRYPOINT ["java","-jar","/one-1.0-SNAPSHOT.jar"]
