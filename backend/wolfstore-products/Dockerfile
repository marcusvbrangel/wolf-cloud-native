#FROM alpine/java:21-jdk
#WORKDIR /app
#COPY target/wolfstore.jar .
#EXPOSE 9090
#ENTRYPOINT ["java", "-jar", "wolfstore.jar"]

#
FROM eclipse-temurin:21
WORKDIR /app
COPY /target/wolfstore-products.jar app.jar
RUN groupadd -r appgroup && useradd -r -g appgroup appuser
RUN chown -R appuser:appgroup /app
USER appuser
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]


# Etapa 1: Construção
#FROM eclipse-temurin:21 AS build
#WORKDIR /app
#RUN apt-get update && apt-get install -y maven
#COPY pom.xml .
#COPY src .
#RUN mvn clean package -DskipTests
#
## Etapa 2: Execução
#FROM eclipse-temurin:21-jre
#WORKDIR /app
#COPY --from=build /app/target/wolfstore-products.jar app.jar
#EXPOSE 80
#ENTRYPOINT ["java", "-jar", "app.jar"]