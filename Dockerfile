FROM openjdk:16
COPY ./target/DevOpsGp1.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "DevOpsGp1.jar", "db:3306", "30000"]