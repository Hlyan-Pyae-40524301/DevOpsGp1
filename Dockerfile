FROM openjdk:16
COPY ./target/DevOpsGp-1.0-SNAPSHOT-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "DevOpsGp-1.0-SNAPSHOT-jar-with-dependencies.jar"]