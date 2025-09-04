FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/service2-0.0.1-SNAPSHOT.jar service2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/service2-0.0.1-SNAPSHOT.jar"]
