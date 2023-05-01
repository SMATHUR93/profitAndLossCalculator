# syntax=docker/dockerfile:1

FROM eclipse-temurin:17-jdk-jammy

COPY target/profitAndLossCalculator-0.0.1-SNAPSHOT.jar /app/profitAndLossCalculator-0.0.1-SNAPSHOT.jar

EXPOSE 5003

CMD ["java", "-jar", "/app/profitAndLossCalculator-0.0.1-SNAPSHOT.jar"]