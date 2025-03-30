FROM alpine/java:21-jdk
WORKDIR /app
COPY target/wolfstore.jar .
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "wolfstore.jar"]