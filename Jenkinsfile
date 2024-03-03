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
                java -version
                javac -version
                echo $JAVA_HOME
                which java
                '''
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
                sh '''
                JAVA_HOME=/opt/java/openjdk/bin/java
                mvn compile
                '''
            }
        }
        stage('Deliver') {
            steps {
                echo 'Deliver....'
                sh '''
                mvn javadoc:javadoc
                '''
                // mvn -Dmaven.javadoc.skip=true verify
            }
        }
    }
}