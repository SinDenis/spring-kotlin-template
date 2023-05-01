FROM openjdk:17-slim
ADD target/spring-kotlin-template.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
