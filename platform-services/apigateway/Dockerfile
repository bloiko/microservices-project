FROM java:8
WORKDIR /
ADD target/apigateway-0.0.1-SNAPSHOT.jar //
EXPOSE 8089 8089
ENTRYPOINT [ "java", "-jar", "/apigateway-0.0.1-SNAPSHOT.jar"]

#FROM java:8
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} apigateway-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java","-jar","/apigateway-0.0.1-SNAPSHOT.jar"]
