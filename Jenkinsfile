node {
	stage('Gather Data') {
	    checkout scm
		def repoSrc = load 'LoadRepo.groovy'
		def repoScrape = load 'Scrape.groovy'
		def repoList = repoSrc.fetch()
		dir('meta-data') {
			git url: 'https://github.com/GooeyTests/TempIndex'
			repoList.each {
					repoScrape.exec()
				}
			repoScrape.push()
		}
	}
}
