
FROM maven:3.8.4-openjdk-17 AS build

WORKDIR /app
COPY . .

RUN mvn clean install


FROM openjdk:17-jdk-slim

WORKDIR /app

EXPOSE 8080

COPY --from=build /app/target/deploy_render-1.0.0.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
