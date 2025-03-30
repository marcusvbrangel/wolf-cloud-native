#FROM alpine/java:21-jdk
#WORKDIR /app
#COPY target/wolfstore.jar .
#EXPOSE 9090
#ENTRYPOINT ["java", "-jar", "wolfstore.jar"]


FROM openjdk:21

# Definir o diretório de trabalho
WORKDIR /app

# Copiar o arquivo JAR do serviço Spring para o contêiner
COPY target/wolfstore.jar .

# Expor a porta do serviço
EXPOSE 8080

# Comando para executar o serviço Spring
ENTRYPOINT ["java", "-jar", "wolfstore.jar"]