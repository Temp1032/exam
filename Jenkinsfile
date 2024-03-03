pipeline {
    agent any
    tools {maven "Maven-3.9.6"}
    triggers {
        pollSCM 'H/3 * * * *'
    }
    stages {
        stage('Build') {
            steps {
                echo "Building.."
                sh '''
                whoami
                ls
                mvn -v
                '''
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
            }
        }
        stage('Deliver') {
            steps {
                echo 'Deliver....'
            }
        }
    }
}