package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\Rekha\\Documents\\Workspace\\CaseStudy_HotelBooking\\src\\main\\resources\\features\\LoginFeature.feature",
		glue = {"StepDefinitions"},
		monochrome = true,
		strict= true,
		dryRun = false,
				plugin= {"pretty",
		 "html:target//html-LoginReports//"}
		
		)

public class LoginRunner {

}
