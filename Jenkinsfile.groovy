pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'mvn --version'
            }
        }
        stage('test') {
            steps {
                bat 'cd C:\\Users\\aistov\\IdeaProjects\\allure'
                bat 'mvn clean test'
            }
        }
    }
}