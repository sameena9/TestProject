pipeline
{
	agent any
	
	tool
	{
		maven "MAVEN_HOME"
		
	}
	
	stages
	{
		stage("Compile Stage")
		{
			steps
			{
				bat "mvn clean compile"
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