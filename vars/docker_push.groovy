def call(String project, String imageTag, String dockerHubUser){
  withCredentials([usernamePassword(
      credentialsId:"dockerHubCred",
      usernameVariable:"dockerHubUser", 
      passwordVariable:"dockerHubPass")]){

    sh "docker login -u  $dockerHubUser -p ${dockerhubpass}"
    // sh 'echo $dockerHubPass | docker login -u $dockerHubUser --password-stdin'
    // sh "docker image tag ${project}:${imageTag} ${env.dockerHubUser}/notes-app:latest"
    // sh "docker push ${env.dockerHubUser}/${project}:${imageTag}"
  }
  sh "docker push ${dockerhubuser}/${project}:${imageTag}"
}
