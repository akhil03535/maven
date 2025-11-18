pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/akhil03535/maven.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the Maven project...'
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            echo "Pipeline completed!"
        }
    }
}
