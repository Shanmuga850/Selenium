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


import pom.Search;

	@RunWith(Cucumber.class)
	public class SearchStepDef extends Base  {		
		
		//Navigate to Search Page
		
		@Given("^User successfully logged in$")
		public void user_successfully_logged_in() throws Throwable {
		    //  Initializing the driver
			driver =initializeDriver();
			
			// Creating a object for Search POM
			Search Search = new Search(driver);
			
			// Creating a object for Excel Driven Class
			DataDriven d = new DataDriven();
			ArrayList<String> Username=d.getdata("Login");
			ArrayList<String> pass=d.getdata("password");
			//Login
			Search.getNavigatetoURL();
			Search.getUsername().sendKeys(Username.get(4));
			Search.getPassword().sendKeys(pass.get(4));
			Search.getLoginbutton().click();
		}

		@When("^User click community hospital and search button$")
		public void User_click_community_hospital_and_search_button() throws Throwable {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			// Creating a object for Search POM
			Search Search = new Search(driver);
			Search.Wait();
			
			Search.clickCommunityHospital().click();
			Search.clickSearch().click();
		}

		@Then("^Verify user redirect into the search page$")
		public void Verify_user_redirect_into_the_search_page() throws Throwable {
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    // Creating a object for Search POM
	    Search Search = new Search(driver);
	    
	    Search.verifyUserInSearchPage();
		
		}
		//Verify whether Search functionality is working correctly
		@Given("^Navigate to application Search page$")
		public void Verify_user_in_the_search_page() throws Throwable {
			// Creating a object for Search POM
			Search Search = new Search(driver);
			
			Search.verifyUserInSearchPage();
			
		}

		@When("^Select Location, Department, From and To and click Search button$")
		public void User_selects_the_Location_Department_From_To_and_click_search() throws Throwable {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
			// Creating a object for Search POM
			Search Search = new Search(driver);
			
			 Search.Wait();
			 Search.selectTheDateInTheFrom();
			 Search.Wait();
		     Search.selectTheDatenInTheTo();
		     Search.Wait();
			 Search.clickLocation().click();
			 Search.Wait();
			 Search.clickCommunityHospitalInTheLocation().click();
			 Search.Wait();
			 Search.clickDepartment().click();
			 Search.Wait();
			 Search.clickCasulaityInTheDepartment().click();
			 Search.Wait();
			 Search.clickSearchInTheSearchpage();
			
			 
			 }

		@Then("^Records should be displayed$")
		public void verify_proposed_searching_data_should_be_displayed() throws Throwable {
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 // Creating a object for Search POM
	    Search Search = new Search(driver);
	    
	    Search.verifyProposedDataIsDisplayedInTheSearchPage();
	    
		
		}
		// Verify whether Search is possible with 'Age' filter
		@Given("^Verify the user in the search page$")
		public void verify_the_user_in_the_search_page() throws Throwable {
			driver.navigate().refresh();
			// Creating a object for Search POM
			Search Search = new Search(driver);
			
			Search.verifyUserInSearchPage();
		}

		@When("^Select Location, Department, From and To, Age and click Search button$")
		public void Select_Location_Department_From_and_To_Age_and_click_Search_button() throws Throwable {
		  
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
			// Creating a object for Search POM
			Search Search = new Search(driver);
			
			 Search.Wait();
			 Search.selectTheDateInTheFrom();
			 Search.Wait();
		     Search.selectTheDatenInTheTo();
		     Search.Wait();
			 Search.clickLocation().click();
			 Search.Wait();
			 Search.clickCommunityHospitalInTheLocation().click();
			 Search.Wait();
			 Search.clickDepartment().click();
			 Search.Wait();
			 Search.clickCasulaityInTheDepartment().click();
			 Search.Wait();
			 Search.clickAgeFilter().click();
			 Search.Wait();
			 Search.clickInfantInTheAgeFilter().click();
			 Search.Wait();
			 Search.clickSearchInTheSearchpage();
		}

		@Then("^Records should be displayed based on the search filters$")
		public void verify_Proposed_age_group_data_should_be_displayed() throws Throwable {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
			// Creating a object for Search POM
			Search Search = new Search(driver);
			
			Search.verifyInfantDetailsAreDisplayed();
		}
		
		//Verify that user is able to search with Gender filter
		@Given("^Verify whether user in the search page$")
		public void check_the_user_in_the_search_page() throws Throwable {
			driver.navigate().refresh();
		
			// Creating a object for Search POM
			Search Search = new Search(driver);
			Search.verifyUserInSearchPage();
		}

		@When("^Select Location, Department, From and To, Gender and click Search button$")
		public void user_Selects_the_Location_Department_From_To_gender_filter_and_click_search() throws Throwable {
		   
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			// Creating a object for Search POM
			Search Search = new Search(driver);
			
			 Search.selectTheDateInTheFrom();
			 Search.Wait();
		     Search.selectTheDatenInTheTo();
		     Search.Wait();
			 Search.clickLocation().click();
			 Search.Wait();
			 Search.clickCommunityHospitalInTheLocation().click();
			 Search.Wait();
			 Search.clickDepartment().click();
			 Search.Wait();
			 Search.clickCasulaityInTheDepartment().click();
			 Search.Wait();
			 Search.clickGenderFilter().click();
			 Search.Wait();
			 Search.clickFemaleInTheGenterFilter().click();
			 Search.Wait();
			 Search.clickSearchInTheSearchpage();
		}

		@Then("^Records should be displayed based on search filters$")
		public void verify_Proposed_gender_data_should_be_displayed() throws Throwable {
		
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
			// Creating a object for Search POM
			Search Search = new Search(driver);
			
			Search.VerifyFemaleDataShouldBeDisplayed();
			driver.close();
		}
		
		
	}
