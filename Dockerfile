FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/meteo-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} meteo.jar


ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/meteo.jar"]