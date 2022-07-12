pipelineJob("Seed job 1") {
  definition {
    cps {
      script('''
        pipeline {
          agent any
          stages {

            stage('Build'){
                steps {
                    sh 'COMPONENT=${COMPONENT} TESTCASE=${TESTCASE} SERVER=${SERVER} npm run devtools-kubernetes'
                }
            }

          }
        }
      }
    ''')   
    }
  }
}
