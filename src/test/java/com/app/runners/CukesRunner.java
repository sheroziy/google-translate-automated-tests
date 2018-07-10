package com.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {
				"html:target/cucumber-report",
				"json:target/cucumber.json"
		},
		tags = "@ScenarioOutline",
		features= "src/test/resources/com/app/features/",
		glue="com/app/step/defenitions/",
		dryRun=false
		)

		

public class CukesRunner extends AbstractTestNGCucumberTests {
	
}