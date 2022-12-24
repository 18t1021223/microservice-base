FROM adoptopenjdk/openjdk11:latest as build
ARG JAR_FILE=target/*.jar
EXPOSE 8014
COPY ${JAR_FILE} api-doc.jar
ENTRYPOINT ["java", "-Xmx2g", "-Xms1024m", "-jar", "/api-doc.jar"]
# docker build -t api-doc-image .
# docker run --name docs -p 8014:8014 api-doc-image