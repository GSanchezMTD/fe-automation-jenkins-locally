def path1 = "ONO/Front End/FE Smoke Tests - Staging/";

def component = "MT/AMPArticles/Analytics/Features";
def testcase = "SmokeTestMTFeaturesAMPArticle";
def server1 = "carbon-stg";
def server2 = "carbon-preprod-akamai";
def server3 = "prod";

pipelineJob(${path1} + "Analytics - AMP Article - Features - Features - LG5-5201") {
  definition {
    cps {
      script('''
        pipeline {
          agent any
          stages {
            stage('Build'){
                steps{
                    sh 'COMPONENT='''+${component}+''' TESTCASE='''+${testcase}+''' SERVER='''+${server1}+''' npm run devtools-kubernetes'
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
                    sh 'COMPONENT='''+${component}+''' TESTCASE='''+${testcase}+''' SERVER='''+${server1}+''' npm run devtools-kubernetes'
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
                    sh 'COMPONENT='''+${component}+''' TESTCASE='''+${testcase}+''' SERVER='''+${server1}+''' npm run devtools-kubernetes'
                }
            }
          }
        }
    ''')
    }
  }
}
