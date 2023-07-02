pipeline {
    agent any
    tools{
       maven 'maven_3.8.7'
    }

    stages {
        stage('Build') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/dwarakanath9/jenkins-docker-push']])
                bat 'mvn clean install'

            }
        }
          stage("Docker build"){
                steps{
                bat 'docker version'
                bat 'docker build -t dwarak1262/jenkins-docker-k8s .'
                bat 'docker image list'
                }
        }
                stage("Push Image to Docker Hub"){
                    steps{
                       withCredentials([string(credentialsId: 'docker_password_1', variable: 'DPASSWORD')]){
                          bat 'docker login -u dwarak1262 -p %DPASSWORD%'
                        }
                         bat 'docker push  dwarak1262/jenkins-docker-k8s'
                    }
                }
    }
}
