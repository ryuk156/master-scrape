node {
	stage('Gather Data') {
	    checkout scm
		def repoSrc = load 'LoadRepo.groovy'
		def repoFn = load 'Scrape.groovy'
		def repoList = repoSrc.fetch()
		dir('meta-data') {
			git url: 'https://github.com/GooeyTests/TempIndex'
			repoList.each {
					repoFn.scrape()
				}
			repoFn.push()
		}
	}
}
