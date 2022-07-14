folder('Smoke Tests'){
    description('my description')
    displayName('Smoke Tests')
}
pipelineJob("/Smoke Tests/Analytics - AMP Article - Features - Features - LG5-5201") {
  definition {
    cps {
      script('''
        pipeline {
          agent any
          stages {
            stage('Build'){
                steps{
                    sh 'COMPONENT=MT/AMPArticles/Analytics/Features TESTCASE=SmokeTestMTFeaturesAMPArticle npm run devtools-kubernetes'
                }
            }
          }
        }
    ''')   
    }
  }
}
