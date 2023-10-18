# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-oracle

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY build/libs/DadJokesCentral-0.0.1-SNAPSHOT.jar /app/

# Expose the port that your Spring Boot application will listen on (default is 8080)
EXPOSE 8080

# Specify the command to run your application when the container starts
CMD ["java", "-jar", "DadJokesCentral-0.0.1-SNAPSHOT.jar"]