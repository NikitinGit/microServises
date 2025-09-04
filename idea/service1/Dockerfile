FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/service1-0.0.1-SNAPSHOT.jar service1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/service1-0.0.1-SNAPSHOT.jar"]
