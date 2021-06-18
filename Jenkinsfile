pipeline {
  agent { dockerfile true}
  stages {
    stage('Checkout SCM') {
            steps {
               git 'https://github.com/muzafferjoya/spring-java-docker.git'
            }
            
        }
	stage('Build Docker Container') {
	  steps {
		sh 'docker build -t myapp .'
	}
}

    stage('Running Build') {
      steps {
        echo 'Successfully build the docker image and running this command inside it!'
      }
    }
  }
}
