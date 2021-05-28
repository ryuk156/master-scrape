

pipeline{
    agent any
    stages{
        stage('Gather Data') {
		steps{
			cleanWs()
			script{
		  def repoSrc = load 'LoadRepo.groovy'
		def repoScrape = load 'Scrape.groovy'
		def repoList = repoSrc.fetch()

		dir('meta-data') {
			git url: 'https://github.com/GooeyTests/TempIndex'
		}

		repoList.each {
			dir(it) {
				git url: "https://github.com/Terasology/${it}"
				repoScrape.exec()
			}
		}

		
		}
		}
		
		
	}
    }
}



