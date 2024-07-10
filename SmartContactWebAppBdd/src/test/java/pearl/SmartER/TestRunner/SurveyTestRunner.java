package pearl.SmartER.TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/pearl/SmartER/Features/Survey.feature",
		glue     = "pearl.SmartER.StepDefinition",
		plugin= {"pretty","html:target/Survey-reports.html","json:jsonreport/Survey.json"},
		monochrome=true )

public class SurveyTestRunner{

}