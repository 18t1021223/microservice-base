FROM adoptopenjdk/openjdk11:latest as build
ARG JAR_FILE=build/libs/*.jar
ENV ENV_PROFILE=default
ENTRYPOINT ["java", "-Xmx2g", "-Xms1024m", "-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=${ENV_PROFILE}", "-jar", "/notification.jar"]
COPY ${JAR_FILE} notification.jar
# docker build -t notification-image .
# docker run -p 8081:8081 c6d1b8358438