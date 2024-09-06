# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the build context to the container
COPY target/account-service.jar /app/account-service.jar

# Run the JAR file
CMD ["java", "-jar", "account-service.jar"]