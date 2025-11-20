
pipeline {
    agent any

    tools {
        // Le nom doit correspondre au Maven configuré dans Jenkins
        maven "M2_HOME"
        jdk "JDK17"
    }

    environment {
        // Variables si nécessaire
        PROJECT_NAME = "tpfoyer"
    }

    stages {

        stage('Checkout') {
            steps {
                echo "Fetching project from Git..."
                checkout scm
            }
        }

        stage('Install Dependencies') {
            steps {
                echo "Running mvn clean install..."
                sh "mvn clean install -DskipTests"
            }
        }

        stage('Run Tests') {
            steps {
                echo "Running tests..."
                sh "mvn test"
            }
        }

        stage('Build') {
            steps {
                echo "Building the project..."
                sh "mvn package -DskipTests"
            }
        }

        stage('Archive Artifact') {
            steps {
                echo "Archiving build artifacts..."
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo "BUILD SUCCESS ✔"
        }
        failure {
            echo "BUILD FAILED ❌"
        }
    }
}
