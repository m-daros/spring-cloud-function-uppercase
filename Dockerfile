FROM openjdk:8-alpine

COPY ./target/spring-cloud-function-uppercase-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch spring-cloud-function-uppercase-0.0.1-SNAPSHOT.jar'

ENTRYPOINT [ "java", "-jar", "spring-cloud-function-uppercase-0.0.1-SNAPSHOT.jar" ]