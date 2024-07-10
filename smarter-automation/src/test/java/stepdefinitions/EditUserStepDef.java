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


import pom.UserPage;



	@RunWith(Cucumber.class)
	public class EditUserStepDef extends Base {

		 @Given("^Navigate to User's List Page$")
		    public void navigate_to_user_s_list_page() throws Throwable {
			//  Initializing the driver
	    	 driver = initializeDriver();
	    	 
	    	// Creating a object for UserPage POM
	    	  UserPage user = new UserPage(driver);
	    	  
	    	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    	 
	    	 
	    	 DataDriven d = new DataDriven();
	    	 ArrayList<String> Username=d.getdata("Login");
	 		 ArrayList<String> pass=d.getdata("password");
		
			 user.getNavigatetoURL();
			 user.getUsername().sendKeys(Username.get(5));
			 user.getPassword().sendKeys(pass.get(5));
			 user.getLoginbutton().click();
			 user.Wait();
			 user.clickUser().click();
			 user.clickListInTheUser().click();
			 user.Wait();
	    }

		 @When("^Select the specify user and Edit the required fields and click the Save button$")
		    public void select_the_specify_user_and_edit_the_required_fields_and_click_the_save_button() throws Throwable {
	    	UserPage user = new UserPage(driver);
	    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    	user.clickEditButtonBasedOnName();
			user.Wait();
			user.editAndChangeName();
			user.editAndChangeUserTitle();
			user.editAndChangeGmail();
			user.editChangeMobileNo();
			user.Wait();
			user.clickSaveButtonInTheCreateUserPage();
	    }

		 @Then("^Should save the user with the edited details$")
		    public void should_save_the_user_with_the_edited_details() throws Throwable {
	    	 UserPage user = new UserPage(driver);
	    	 user.verifyThatEditedUserDataIsDisplayedOnTheUserListPage();
	    	 driver.close();
	    }

}
	








