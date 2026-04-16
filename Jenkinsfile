def gv
pipeline {
    agent any

    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: ' ')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }

    environment {
        NEW_VERSION = "1.3.0"
    }

    tools {
        maven 'jenkins-maven'
    }

    stages {
        stage('init'){
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }
        
        
        stage('Build') {
            steps {
                script{
                    gv.buildApp()
                //echo "building the application"
                //echo "Building version ${NEW_VERSION}"
                // bat 'mvn -B -DskipTests clean package'
            }
        }

        stage('Test') {
            when {
                expression { params.executeTests }
            }
            steps {
                echo "testing the application"
                // bat 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo "deploying the applicationng"
                // bat 'mvn deploy'
            }
        }
    }
}
}
