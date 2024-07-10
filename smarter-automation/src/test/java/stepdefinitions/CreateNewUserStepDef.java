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
import pom.Search;

@RunWith(Cucumber.class)
public class CreateNewUserStepDef extends Base {
	
 
	
//	User is able to navigate a Users List Page
	
    @Given("^User is successfully logged in$")
    public void user_is_successfully_logged_in() throws Throwable {
    	
    	//  Initializing the driver
    	
    	driver =initializeDriver();
    	
    	// Creating a object for UserPage POM
    	
		UserPage user = new UserPage(driver);
		
		// Creating a object for Excel Driven Class
		
		DataDriven d = new DataDriven();
		ArrayList<String> Username=d.getdata("Login");
		ArrayList<String> pass=d.getdata("password");
		
		//Login
		
		user.getNavigatetoURL();
		user.getUsername().sendKeys(Username.get(5));
		user.getPassword().sendKeys(pass.get(5));
		user.getLoginbutton().click();
		user.Wait();
    }

    @When("^User click User and Click list in the user$")
    public void user_click_user_and_click_list_in_the_user() throws Throwable {
    
    // Creating a object for UserPage POM
    	UserPage user = new UserPage(driver);
    	
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	user.clickUser().click();
    	user.Wait();
    	user.clickListInTheUser().click();
    }
  
    
    @Then("^User's List Page should be displayed$")
    public void users_list_page_should_be_displayed() throws Throwable {
    
    // Creating a object for UserPage POM
    	UserPage user = new UserPage(driver);
    	
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        user.Wait();
    	user.verifyThatUserInTheUsersListPage();
    }
    
    
  //  Verify whether a new user can be created 

    @Given("^Navigate to Users -> List Page$")
    public void verify_that_user_in_the_users_list_page() throws Throwable {
    
    // Creating a object for UserPage POM
    	UserPage user = new UserPage(driver);
    	
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	user.verifyThatUserInTheUsersListPage();
        user.Wait();
    }
    
    @When("^Click the button 'Create User' and Enter valid user data and click the Save button$")
    public void user_click_create_user_and_enter_valid_data_and_click_save() throws Throwable {
    	// Creating a object for UserPage POM
    	UserPage user = new UserPage(driver);
    	
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	user.clickCreateUserInTheUserListPage().click();
    	
   	// Creating a object for Excel Driven Class
    	DataDriven d = new DataDriven();
    	ArrayList<String> newuser=d.getdata("addnewuser");
    	
   	// Enter the valid data in the create new user form 
        user.clickUsernameInTheCreateUserPage().sendKeys(newuser.get(1));
   	    user.clickFirstnameInTheCreateUserPage().sendKeys(newuser.get(2));
   	    user.clickTitleInTheCreateUserPage().sendKeys(newuser.get(3));
   	    user.clickEmailInTheCreateUserPage().sendKeys(newuser.get(4));
   	    user.clickMobileNoInTheCreateUserPage().sendKeys(newuser.get(5));
   	    user.clickRoleintheCreateUserPage().click();
   	    user.clickDepartmentAdminRoleInTheCreateUserPage().click();
   	    user.Wait();
   	    user.clickSaveButtonInTheCreateUserPage();

    	
    }

   
    @Then("^New user should be saved and displayed on the main page of User List$")
    public void Verify_that_newly_created_user_displayed_in_the_Users_List() throws Throwable {
   
    // Creating a object for UserPage POM
    	UserPage user = new UserPage(driver);
    	
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	user.verifyThatNewlyCreatedUserDisplayedInTheUsersList();
    }
    
    
    // Verify whether duplicate Usernames are permitted
    
        @Given("^Verify whether user in the Users -> List Page$")
        public void verify_that_user_in_the_create_new_user_page() throws Throwable {
      
        // Creating a object for UserPage POM
        	UserPage user = new UserPage(driver);
        	
           	 driver.navigate().refresh();
           	 user.Wait();
             user.clickCreateUserInTheUserListPage().click();
             user.Wait();
        	 user.verifyThatUserInTheCreateNewUserPage();
        }

        @When("^click the button 'Create User' and Enter a duplicate Username and click the Save button$")
        public void user_enter_existing_user_details_and_click_save() throws Throwable {
        
        // Creating a object for UserPage POM
        	UserPage user = new UserPage(driver);
        	
        	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       
       	// Creating a object for Excel Driven Class
        	DataDriven d = new DataDriven();
        	ArrayList<String> newuser=d.getdata("addnewuser");
        	
        // Enter the already existing Username in the create new user form 
            user.clickUsernameInTheCreateUserPage().sendKeys(newuser.get(1));
       	    user.clickFirstnameInTheCreateUserPage().sendKeys(newuser.get(2));
       	    user.clickTitleInTheCreateUserPage().sendKeys(newuser.get(3));
       	    user.clickEmailInTheCreateUserPage().sendKeys(newuser.get(4));
       	    user.clickMobileNoInTheCreateUserPage().sendKeys(newuser.get(5));
       	    user.clickRoleintheCreateUserPage().click();
       	    user.clickDepartmentAdminRoleInTheCreateUserPage().click();
       	    user.Wait();
       	    user.clickSaveButtonInTheCreateUserPage();
        }

        @Then("^Should not permit saving and validation message should be displayed for the duplicate User Name$")
        public void username_already_exist_validation_message_should_gets_displayed() throws Throwable {
        
        // Creating a object for UserPage POM
        	UserPage user = new UserPage(driver);
        	
        	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        	 user.verifyThatUsernameAlreadyExistsValidationMessageShown();
        }
        
        //Verify whether mandatory fields can be left blank

        @Given("^Verify whether user in the Users -> List -> Create New User Page$")
        public void verify_that_user_in_the_create_a_newuser_page() throws Throwable {
            driver.navigate().refresh();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

      // Creating a object for UserPage POM
            UserPage user = new UserPage(driver);
            
            user.Wait();
            user.verifyThatUserInTheCreateNewUserPage();
        }

        @When("^Leave the mandatory fields blank and click Save button$")
        public void user_click_save() throws Throwable {
        	// Creating a object for UserPage POM
        	  UserPage user = new UserPage(driver);
        	  
        	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        	  user.Wait();
        	  user.clickSaveButtonInTheCreateUserPage();  
        	  user.Wait();
        }

        @Then("^Should not permit saving and validation messages should be  displayed for all the mandatory fields$")
        public void validation_messages_of_the_mandatory_fields_should_gets_displayed() throws Throwable {
        	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        	// Creating a object for UserPage POM
        	UserPage user = new UserPage(driver);         
        	
     	    user.verifyThatUserNameRequiredValidationMessageShown();
     	    user.verifyThatNameRequiredValidationMessageShown();
     	    user.verifyThatTitleRequiredMessageIsShown();
     	    user.verifyThatEmailRequiremessageIsShown();
     	    user.verifyThatPhoneNumberRequiredmessageIsShown();
     	    user.verifyThatRoleRequiredMessageIsShown();
     	    user.verifyThatLevelRequiredMessageIsShown();
     	    driver.close();
        }
}
