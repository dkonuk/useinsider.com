# Use a Maven image to build the project
FROM openjdk:22-jdk-slim AS build


RUN apt-get update && apt-get install -y maven

WORKDIR /app

COPY . /app

RUN mvn  install

# Use a Selenium image to run the tests
FROM --platform=linux/arm64 selenium/standalone-chromium:latest

WORKDIR /app

COPY --from=build /app /app

# Set environment variables for Selenide
ENV SELENIDE_BROWSER=chrome
ENV SELENIDE_REMOTE=http://localhost:4444/wd/hub

CMD ["sh", "-c", "mvn test"]