
package pearl.SmartER.TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/pearl/SmartER/Features",
		glue     = "pearl.SmartER.StepDefinition",
		plugin= {"pretty","html:target/Regression-reports.html","json:jsonreport/Regression.json"},
		monochrome=true )

public class RegressionTestRunner {

}
