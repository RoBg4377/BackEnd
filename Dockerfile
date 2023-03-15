
FROM amazoncorretto:11-alpine-jdk
MAINTAINER rodrigobenavides
COPY target/porfolio-0.0.1-SNAPSHOT.jar backPorfolio.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/backPorfolio.jar"]