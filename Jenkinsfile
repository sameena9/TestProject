pipeline
{
	agent any
	
	tools
	{
		maven "MAVEN_HOME"
		
	}
	
	stages
	{
		stage("Compile Stage")
		{
			steps
			{
			    bat "mvn -Dmaven.test.failure.ignore=true clean package"
			}
		}
		
		stage("Testing Stage")
		{
			steps
			{
				bat "mvn test"
			}
		}
	}
		
}