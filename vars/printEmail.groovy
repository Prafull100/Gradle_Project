def call() {
  // Get current user and job name
  def user = getCurrentUser()
  def jobName = getCurrentJobName()

  // Print email variable with user and job name
  def email = "${user}@mycompany.com"
  echo "Email: ${email} (User: ${user}, Job: ${jobName})"
}

def getCurrentUser() {
  return env.USER // Retrieve the current user from the environment variable
}

def getCurrentJobName() {
  return env.JOB_NAME // Retrieve the current job name from the environment variable
}
