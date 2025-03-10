pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from repository
                git 'https://github.com/bejoykoottumkal/AutomationTestSample-.git'
            }
        }

        stage('Build') {
            steps {
                // Build using Maven
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run TestNG tests
                sh 'mvn clean test'
            }
        }

        stage('Publish Results') {
            steps {
                // Publish TestNG test results
                junit '**/target/surefire-reports/testng-results.xml'

            }
        }
    }
}

