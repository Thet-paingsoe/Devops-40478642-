FROM openjdk:latest
COPY ./target/first_project-v0.1-alpha-4-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "first_project-v0.1-alpha-4-jar-with-dependencies.jar"]