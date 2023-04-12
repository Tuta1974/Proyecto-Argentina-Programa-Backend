FROM amazoncorretto:11-alpine-jdk
MAINTAINER Tuta
COPY target/tuta-0.0.1-SNAPSHOT.jar tuta_app.jar
ENTRYPOINT ["java","-jar","/tuta_app.jar"]