pipelineJob("ONO/Front End/FE Smoke Tests - Staging/Analytics - AMP Article - Features - Features - LG5-5201") {
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
pipelineJob("ONO/Front End/FE Smoke Tests - Preproduction behind Akamai/Analytics - AMP Article - Features - Features - LG5-5201") {
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
pipelineJob("ONO/Front End/FE Smoke Tests - Production/Analytics - AMP Article - Features - Features - LG5-5201") {
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
