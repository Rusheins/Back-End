FROM amazoncorretto:8-alpine-jdk
MAINTAINER emaaristimuno
COPY target/Agus-0.0.1-SNAPSHOT.jar Agus-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Agus-0.0.1-SNAPSHOT.jar"]