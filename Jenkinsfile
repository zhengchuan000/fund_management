def projectName = 'FundManagementPipeline'
def version = "0.0.${currentBuild.number}"
def dockerImageTag = "${projectName}:${version}"

pipeline {
    agent any
    stages {

        stage('Build docker image') {
            steps {
                // sh "docker stop mysql"
                // sh "docker stop /app"
                // sh "docker rm mysql"
                // sh "docker rm /app"
                // sh "docker-compose up"
                sh "docker build -f Dockerfile-mysql -t fund_management/mysql ."
                sh "docker build -f Dockerfile-app -p 8080:8080 -t fund_management/app ."
                }
        }

    }
}