FROM openjdk:8
EXPOSE 8080
ADD target/springboot-docker-aws.jar springboot-docker-aws.jar
ENTRYPOINT ["java","-jar","/springboot-docker-aws.jar"]