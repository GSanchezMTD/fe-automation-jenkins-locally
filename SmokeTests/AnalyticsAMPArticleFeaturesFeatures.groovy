def jobName = 'Analytics - AMP Article - Features - Features - LG5-5201';
def path1 = "ONO/Front End/FE Smoke Tests - Staging/";
def path2 = "ONO/Front End/FE Smoke Tests - Preproduction behind Akamai";
def path3 = "ONO/Front End/FE Smoke Tests - Production/";
def component = "MT/AMPArticles/Analytics/Features";
def testcase = "SmokeTestMTFeaturesAMPArticle";
def server1 = "carbon-stg";
def server2 = "carbon-preprod-akamai";
def server3 = "prod";

def paths = ["ONO/Front End/FE Smoke Tests - Staging/", "ONO/Front End/FE Smoke Tests - Preproduction behind Akamai", "ONO/Front End/FE Smoke Tests - Production/"];
def servers = ["carbon-stg", "carbon-preprod-akamai", "prod"];
def i = 0;

servers.each{ value -> 
  pipelineJob("${paths[i]}" + "${jobName}") {
  definition {
    cps {
      script('''
        pipeline {
          agent any
          stages {
            stage('Build'){
                steps{
                    sh 'COMPONENT='''+"${component}"+''' TESTCASE='''+"${testcase}"+''' SERVER='''+"${servers[i]}"+''' npm run devtools-kubernetes'
                }
            }
          }
        }
    ''')
    }
  }
  }
  i = i + 1;
}
