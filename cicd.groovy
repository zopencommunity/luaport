node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/ZOSOpenTools/luaport.git'), string(name: 'PORT_DESCRIPTION', value: 'Lua interpreter' )]
  }
}
