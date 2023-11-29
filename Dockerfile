# Use the official Maven image as a base image
FROM maven:3.8.4-openjdk-17-slim AS build

# Set the working directory to /app
WORKDIR /app

# Copy the POM file to the working directory
COPY pom.xml .

# Copy the entire project to the working directory
COPY src src

# Build the application
RUN mvn clean package -DskipTests

# Find the JAR file in the target directory (adjust the path accordingly)
RUN cp $(find /app -name '*.jar' -type f -print | grep target) /app/app.jar

# Use the official OpenJDK image as a base image
FROM openjdk:17-slim

# Set the working directory to /app
WORKDIR /app

# Copy the JAR file from the build stage to the current stage
COPY --from=build /app/app.jar .

# Expose the port the application runs on
EXPOSE 8080

# Specify the command to run on container start
CMD ["java", "-jar", "app.jar"]
