Jenkinsfile (Declarative Pipeline)
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "Hello World"'
                sh '''
                    echo "MMultiline shell steps works too"
                    ls -lah
                '''
            }
        }
    }
}