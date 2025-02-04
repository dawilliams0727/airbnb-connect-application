FROM eclipse-temurin:23-jdk-alpine AS builder
LABEL authors="pheno"
WORKDIR /spring
COPY . .
RUN ["./mvnw", "dependency:go-offline"]
RUN ["./mvnw", "clean", "package", "-DskipTests"]

FROM eclipse-temurin:23-jre-alpine
WORKDIR /spring
COPY --from=builder /spring/target/*.jar spring_backend.jar
ENV SERVER_PORT=9000
EXPOSE ${SERVER_PORT}
CMD ["sh", "-c", "java -jar spring_backend.jar --server-port=${SERVER_PORT}"]

