FROM maven:3-jdk-8-alpine AS build

WORKDIR /app

COPY . /app

RUN mvn install

FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY --from=build /app/target/my-project-1.0-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java", "-jar", "my-project-1.0-SNAPSHOT.jar"]