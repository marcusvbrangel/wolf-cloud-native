#FROM alpine/java:21-jdk
#WORKDIR /app
#COPY target/wolfstore.jar .
#EXPOSE 9090
#ENTRYPOINT ["java", "-jar", "wolfstore.jar"]

#
FROM alpine/java:21-jdk
WORKDIR /app
COPY /target/wolfstore-payment-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]


# Etapa 1: Construção
#FROM maven:3.8.6-openjdk-21 AS build
#WORKDIR /app
#COPY pom.xml .
#COPY src ./src
#RUN mvn clean package -DskipTests
#
## Etapa 2: Execução
#FROM eclipse-temurin:21-jre
#WORKDIR /app
#COPY --from=build /app/target/wolfstore.jar app.jar
#EXPOSE 80
#ENTRYPOINT ["java", "-jar", "app.jar"]