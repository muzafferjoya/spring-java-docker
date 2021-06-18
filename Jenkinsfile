pipeline {
	environment{
	registry = "muzaffarjoya/spring-java"
	registryCredential = 'docker-hub'
	dockerImage = ''
}
  agent { dockerfile true}
  stages {
    stage('Checkout SCM') {
            steps {
               git 'https://github.com/muzafferjoya/spring-java-docker.git'
            }
            
        }
stage('Building image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
	}

    stage('Running Build') {
      steps {
        echo 'Successfully build the docker image and running this command inside it!'
      }
    }
  }

