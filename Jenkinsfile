pipeline {
    agent any

    tools {
        maven 'Maven-Default'     // the Maven name you added in Jenkins Global Tools
        jdk 'jdk11'               // OR whatever JDK name is configured
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn -B clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo "Build Success!"
        }
        failure {
            echo "Build Failed!"
        }
    }
}
