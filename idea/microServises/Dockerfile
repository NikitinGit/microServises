FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/user-service.jar user-service.jar
ENTRYPOINT ["java","-jar","/user-service.jar"]