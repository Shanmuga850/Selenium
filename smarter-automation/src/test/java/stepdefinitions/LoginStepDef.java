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


import pom.Login;  


	@RunWith(Cucumber.class)
	public class LoginStepDef extends Base  {		
		
		//Login With Invalid Username and Invalid Password
		
		@Given("^Go to the specified url of the application$")
		public void navigating_to_URL() throws Throwable {
			  //  Initializing the driver
			driver =initializeDriver();
		}

		@When("^Enter invalid Username and invalid Password and click 'Login'$")
		public void User_enters_Invalid_Credentials_and_click_login() throws Throwable {
		   // Creating a object for Login POM
			Login lp = new Login(driver);
			
		   // Creating a object for Excel Driven Class
			DataDriven d = new DataDriven();
			ArrayList<String> Username=d.getdata("Login");
			ArrayList<String> pass=d.getdata("password");
			 
			 lp.getNavigatetoURL();
			 lp.getUsername().sendKeys(Username.get(2));
			 lp.getPassword().sendKeys(pass.get(2));
			 lp.getLoginbutton().click();
		}

		@Then("^Validation message should be displayed for Invalid Credentials$")
		public void Verify_the_notification_for_invalid_credentials() throws Throwable {
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 // Creating a object for Login POM
	    
		Login lp = new Login(driver);
		Login.verifyInvalidUser(); 
		

		}

		//Leave the Username and Password fields
		
		@Given("Verify whether User in specified url of the application")
		public void verify_whether_user_in_specified_url_of_the_application() throws Throwable {
		
				driver.navigate().refresh();
				
				// Creating a object for Login POM
			     Login lp = new Login(driver);
				
				 lp.getNavigatetoURL();
				 lp.Wait();
				
			}

		@When("Leave the fields, Username and Password blank and click Login")
		public void Leave_the_fields_Username_and_Password_blank_and_click_Login() throws InterruptedException {
			
			// Creating a object for Login POM
			
			Login lp = new Login(driver);
			 
			 lp.getUsername().click();
			 lp.Wait();
			 lp.getPassword().click();
			 lp.Wait();
			 lp.getUsername().click();
			 lp.getLoginbutton().click();
			
		}

		@Then("Validation message should be displayed that mandatory fields cannot be left blank")
		public void validation_message_should_be_displayed_that_mandatory_fields_cannot_be_left_blank() {
			
			// Creating a object for Login POM
			
			 Login lp = new Login(driver);
			 
			 lp.verifyValidationMessageUsernameisRequired();
			 lp.verifyValidationMessagePasswordIsRequired();	
		}
		
				
			//Login with Invalid Password
				
				@Given("^Verify whether User in the specified url of the application$")
				public void veriy_user_in_the_given_URL() throws Throwable {
				 
					driver.navigate().refresh();
					
					// Creating a object for Login POM
					
					Login lp = new Login(driver);
					
					Login.verifyUserInLoginPage();
					
				}

				@When("^Enter valid Username and invalid Password and click 'Login'$")
				public void user_enter_valid_username_and_invalid_password() throws Throwable {
					
					// Creating a object for Login POM
					Login lp = new Login(driver);
					
					// Creating a object for Excel Driven Class
					DataDriven d = new DataDriven();
					ArrayList<String> Username=d.getdata("Login");
					ArrayList<String> pass=d.getdata("password");
					
					 lp.getUsername().sendKeys(Username.get(1));
					 lp.getPassword().sendKeys(pass.get(2));
					 lp.getLoginbutton().click();
					
				}

				@Then("^Validation message should be displayed for Invalid Password$")
				public void verify_the_notication_for_invalid_password() throws Throwable {
					
					// Creating a object for Login POM
					Login lp = new Login(driver);
					
					Login.verifyInvalidUser();
					
				}
				
				//Login with Invalid Username 
				@Given("^Verify User in the Specified URL$")
				public void verify_user_in_the_given_URL() throws Throwable {
				    driver.navigate().refresh();
				    
					// Creating a object for Login POM
					Login lp = new Login(driver);
					
					Login.verifyUserInLoginPage();
				   
				}

				@When("^Enter invalid Username and valid Password and click login$")
				public void user_enter_Invalid_username_and_valid_password() throws Throwable {
				  
					// Creating a object for Login POM
					Login lp = new Login(driver);
					
					// Creating a object for Excel Driven Class
					DataDriven d = new DataDriven();
					ArrayList<String> Username=d.getdata("Login");
					ArrayList<String> pass=d.getdata("password");
					
					 lp.getUsername().sendKeys(Username.get(3));
					 lp.getPassword().sendKeys(pass.get(1));
					 lp.getLoginbutton().click();
				   
				}

				@Then("^Validation message should be displayed for Invalid Username$")
				public void verify_the_notification_for_invalid_username() throws Throwable {
				    
					// Creating a object for Login POM
					Login lp = new Login(driver);
					
					Login.verifyInvalidUser2();
					
					
				}

				
				//Login with Valid Username and Valid Password	

				@Given("^Verify whether user in the given URL$")
				public void Verify_the_user_in_the_given_URL() throws Throwable {
				    
					driver.navigate().refresh();
					
					// Creating a object for Login POM
					Login lp = new Login(driver);
					
					Login.verifyUserInLoginPage();
					
				}

				@When("^Enter valid Username and Password and click 'Login'$")
				public void User_enters_valid_login_Credentials_and_click_login() throws Throwable {
				   
					// Creating a object for Login POM
					 Login lp = new Login(driver);
					 
					// Creating a object for Excel Driven Class
					 DataDriven d = new DataDriven();
					 ArrayList<String> Username=d.getdata("Login");
					 lp.getUsername().sendKeys(Username.get(5));
					 ArrayList<String> pass=d.getdata("password");
					 lp.getPassword().sendKeys(pass.get(5));
					 lp.getLoginbutton().click();
					 lp.Wait();

				}

				@Then("^Application Home Page should be displayed on successful login$")
				public void verify_that_user_is_successfully_logged_in() throws Throwable {
					// Creating a object for Login POM
					Login lp = new Login(driver);
					
					Login.verifyHomepage();
					driver.close();
					}
	
		


}