def call(String url, String branch) {
  echo 'This is to clone the code'
  git url: "${url}", branch: "${branch}"
  echo 'Code Cloaning successfully'
}
