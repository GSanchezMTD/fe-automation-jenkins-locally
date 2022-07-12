def githubUrl = "https://github.com/m-goos/jenkins-jobdsl-seedrepo-example.git"

pipelineJob("Seed job 1") {
definition {
    node('build') {
        stage('UIUX - Search - LG5-5254') {
            sh 'COMPONENT=MT/Homepage/UIUX TESTCASE=SmokeTestSearch npm run devtools-kubernetes'
        }
    }
}
}
