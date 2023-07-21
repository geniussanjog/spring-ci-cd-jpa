FROM openjdk:11
EXPOSE 8091
ADD target/springboot-ci-cd-jpa.jar springboot-ci-cd-jpa.jar
ENTRYPOINT ["java","-jar","/springboot-ci-cd-jpa.jar"]