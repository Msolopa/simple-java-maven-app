pipeline {
    agent any

    environment {
        NEW_VERSION = "1.3.0"
    }

    tools {
        maven 'Jenkins-Maven'
    }

    stages {
        stage('Build') {
            steps {
                echo "building the application"
                echo "Building version ${NEW_VERSION}"
                // bat 'mvn -B -DskipTests clean package'
            }
        }

        stage('Test') {
            steps {
                echo "testing the application"
                // bat 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo "deploying the application"
                // bat 'mvn deploy'
            }
        }
    }
}