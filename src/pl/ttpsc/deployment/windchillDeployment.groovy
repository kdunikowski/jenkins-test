package pl.ttpsc.deployment

class windchillDeployment implements Serializable {
	static def distCreationBIF (def steps) {
		try {
			def request = steps.libraryResource 'pl/ttpsc/mailGroups/developers.json'
			
			steps.logDebug('List: [' + request + ']')
			//tool name: 'default', type: 'maven'
			
			steps.bat 'mvn -Dmaven.test.failure.ignore=true test' 
            steps.junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml'
            
            
            steps.sendMail(steps)
			
		} catch (err) {
			steps.logError('Windchill Deployment Failed', '' + err)
		} finally {
			//always after this step - like gather logs etc
		}
	}
}