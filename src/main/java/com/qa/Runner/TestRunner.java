package com.qa.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/USER/eclipse-workspace/CucumberPOM/src/main/java/com/qa/feature/FreeCrm.feature",
		glue={"com/qa/stepDefinitions"},
		format = {"pretty","html:test-outout"},
		monochrome = true,
		strict = true,
		dryRun = false
		)

public class TestRunner {
	

}
