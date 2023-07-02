FROM openjdk:11-jre-slim
EXPOSE 8080
ADD target/jenkins-docker-push-*.jar jenkins-docker-k8s.jar
ENTRYPOINT ["java", "-jar","/jenkins-docker-k8s.jar"]