# Use a base image containing Java runtime
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the project's build artifact from the host to the container
COPY target/WigellsPadel-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the application runs on
EXPOSE 8585

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
