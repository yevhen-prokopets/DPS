pipeline {
  
  agent any
  
  stages{
    
    stage("Test"){
      
      steps{
        sh 'mvn clean test'
      }
    }
    stage("Reports") {
      
      steps{
                allure([
                    includeProperties: false,
                    jdk: '',
                    properties: [],
                    reportBuildPolicy: 'ALWAYS',
                    results: [[path: 'target/allure-results']]
                ])
            }
  }

}
}
