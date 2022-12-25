FROM adoptopenjdk/openjdk11:latest as build
ARG JAR_FILE=target/*.jar
EXPOSE 8080
COPY ${JAR_FILE} auth.jar
ENTRYPOINT ["java", "-Xmx2g", "-Xms1024m", "-jar", "/auth.jar"]
# docker build -t auth-image .
# docker run --name auth -p 8080:8080 auth-image