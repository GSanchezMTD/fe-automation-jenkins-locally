pipeline {
    agent any 
    stages {
        stage('Pipeline to seed or update all pipelines') {
            steps {
                folder('Smoke Tests'){
                    description('my description')
                    displayName('Smoke Tests')
                }
                jobDsl  targets: ['*.groovy'].join('\n')
            }
        }
    }
}
