FROM adoptopenjdk/openjdk11:latest as build
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} notification.jar
ENTRYPOINT ["java", "-Xmx2g", "-Xms1024m", "-jar", "/notification.jar"]
# docker build -t notification-image .
# docker run -p 8081:8081 c6d1b8358438