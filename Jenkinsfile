@Library('TestLib') _

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        sendMail(steps)
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
