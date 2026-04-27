pipeline {
    agent any

    stages {

        stage('Compile') {
            steps {
                dir('src') {
                    bat 'javac bank/main/MainApp.java'
                }
            }
        }

        stage('Run') {
            steps {
                dir('src') {
                    bat 'java bank.main.MainApp'
                }
            }
        }
    }
}