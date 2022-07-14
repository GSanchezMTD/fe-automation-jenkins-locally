pipeline {
    agent any 
    
                folder('Smoke Tests'){
                    description('my description')
                    displayName('Smoke Tests')
        }
    stages {
        stage('Pipeline to seed or update all pipelines') {
            steps {
                jobDsl  targets: ['*.groovy'].join('\n')
            }
        }
    }
}
