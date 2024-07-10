package pearl.SmartER.TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/pearl/SmartER/Features/Users.feature",
		glue     = "pearl.SmartER.StepDefinition",
		plugin= {"pretty","html:target/User-reports.html","json:jsonreport/User.json"},
		monochrome=true)
public class UsersTestRunner{

}