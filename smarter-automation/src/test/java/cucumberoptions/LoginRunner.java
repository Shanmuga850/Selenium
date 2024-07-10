package cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/features/Login.feature",
		glue     = "stepdefinitions",
		plugin= {"pretty","html:target/cucumber-reports.html","json:jsonreport/Login.json"},
		monochrome=true  )

public class LoginRunner extends AbstractTestNGCucumberTests{

}



