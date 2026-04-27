pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/Mayurjoshi00/java-exec-jenk.git'
            }
        }

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