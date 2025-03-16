
FROM openjdk:17
WORKDIR /demo
COPY target/*.jar demo.jar
ENTRYPOINT [ "java", "-jar", "demo.jar" ]
EXPOSE 8080