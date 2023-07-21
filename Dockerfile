FROM openjdk:11
EXPOSE 8091
ADD target/springboot-jpaexample.jar springboot-jpaexample.jar
ENTRYPOINT ["java","-jar","/springboot-jpaexample.jar"]