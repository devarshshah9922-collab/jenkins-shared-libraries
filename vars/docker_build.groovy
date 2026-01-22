def call(String projectName, String imageTag, String dockerHubUser){
  echo 'This is to build the code'
  sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
}
