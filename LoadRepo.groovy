#!/usr/bin/env groovy
def fetch() {
	
	def response = sh(script: 'curl -s https://api.github.com/orgs/terasology/repos', returnStdout: true).trim()
	def json = new groovy.json.JsonSlurperClassic().parseText(response)
        def repos=[]

   json.each {
       repos << it.name
	}
	
	return repos


		
}

return this

    
