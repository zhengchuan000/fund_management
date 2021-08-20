def projectName = 'FundManagementPipeline'
def version = "0.0.${currentBuild.number}"
def dockerImageTag = "${projectName}:${version}"

pipeline {
    agent any
    stages {

        stage('Build docker image') {
            steps {
                // sh "docker stop fund_management/mysql "
                // sh "docker stop fund_management/app"
                // sh "docker rm fund_management/mysql"
                // sh "docker rm fund_management/app"
                // sh "fuser -k 3306"
                sh "docker build -f Dockerfile-mysql -t fund_management/mysql ."
                sh "docker build -f Dockerfile-app -t fund_management/app ."
                sh "docker run --name mysql -d -p 3306:3306 fund_management/mysql"
                sh "docker run --name app --link mysql:mysql fund_management/app"
                }
        }

    }
}