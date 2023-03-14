FROM amazoncorretto:17-alpine-jdk
MAINTAINER RBG4377
COPY target/porfolio-0.0.1-SNAPSHOT.jar backPorfolio.jar
ENTRYPOINT ["java", "-jar", "/backPorfolio.jar"]




