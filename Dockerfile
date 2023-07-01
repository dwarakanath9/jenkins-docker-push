FROM openjdk:11-jre-slim
EXPOSE 8080
ADD target/enkins-docker-push.jar enkins-docker-push.jar
ENTRYPOINT ["java", "-jar","/enkins-docker-pushgit a.jar"]