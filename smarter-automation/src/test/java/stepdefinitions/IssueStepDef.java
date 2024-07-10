package stepdefinitions;
import resource.Base;

import java.sql.Driver;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import excel.DataDriven;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


import pom.Issue;
import pom.UserPage;



	@RunWith(Cucumber.class)
public class IssueStepDef extends Base{
		
		  @Given("^Navigate to Issue management -> Alerts page$")
		    public void navigate_to_issue_management_alerts_page() throws Throwable {
			  
			//  Initializing the driver
			     driver =initializeDriver();
		    	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    	 
		    	// Creating a object for Excel Driven Class
		    	 DataDriven d = new DataDriven();
		    	 ArrayList<String> Username=d.getdata("Login");
		 		 ArrayList<String> pass=d.getdata("password");
		 		 
		 		// Creating a object for Issue POM
		 		 Issue issue = new Issue(driver);
		 		 
		 		 issue.getNavigatetoURL();
		 		 issue.getUsername().sendKeys(Username.get(6));
		 		 issue.getPassword().sendKeys(pass.get(6));
		 		 issue.getLoginbutton().click();
		 		 issue.Wait();
		 		 issue.clickIssueManagement().click();
		 		 issue.Wait();
		 		 issue.clickAlerts().click();
		 		 issue.Wait();
		    }

		    @When("^Select Location, Department, From , To and click Search button$")
		    public void select_location_department_from_and_to_and_click_search_button() throws Throwable {
		    	
		    	// Creating a object for Issue POM
		    		Issue issue = new Issue(driver);
		    		issue.Wait();
		    		issue.clickJuly1InTheFrom();
		    		issue.clickJuly20InTheTo();
				 	issue.Wait();
				 	issue.clickSearchInTheIssueManagementPage();
		    }

		    @Then("^Records should be displayed based on the search  filters$")
		    public void records_should_be_displayed_based_on_the_search_filters() throws Throwable {
		    
		    	// Creating a object for Issue POM
		    	Issue issue = new Issue(driver);
		    	
		     	issue.verifyProposedDataShouldBeDisplyed();
		        driver.close();
		    }


}
