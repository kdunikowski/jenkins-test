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

        stage('Deploy') {
            steps {
                sendMail(steps)
                echo 'Deploying....'
            }
        }
    }
}
