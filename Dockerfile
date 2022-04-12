FROM openjdk:11-jre-slim
ADD target/demo-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java", "-jar", "/app.jar"]
