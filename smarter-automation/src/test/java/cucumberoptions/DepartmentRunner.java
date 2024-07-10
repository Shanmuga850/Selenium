package cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;






@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/features/Department.feature",
		glue     = "stepdefinitions",
		plugin= {"pretty","html:target/cucumber-reports.html","json:jsonreport/Department.json"})
public class DepartmentRunner {

}
