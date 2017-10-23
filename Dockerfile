FROM openjdk:8-jdk-alpine
MAINTAINER and.digital
WORKDIR /app
VOLUME /tmp
ADD target/volunteering-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app/app.jar