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
                bat 'mvn clean test'
            }
        }
    }
}