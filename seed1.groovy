pipelineJob("Seed job 1") {
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
