pipeline {
    agent any 
    stages {
        stage('Pipeline to seed or update all pipelines') {
            steps {
                jobDsl  targets: ['A0_FoldersCreation.groovy'].join('\n')
                jobDsl  targets: ['SmokeTests/*.groovy'].join('\n')
            }
        }
    }
}
