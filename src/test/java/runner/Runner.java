package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", plugin = { "pretty", "html:targets/cucumber-html-report" }, 
					glue = { "stepdef" }
					,tags = "@drive-away-insurance-outline" 
					//,dryRun = true
				)
public class Runner {

}