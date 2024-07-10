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
import pom.Department;
import pom.Search;

@RunWith(Cucumber.class)
	public class DepartmentStepDef extends Base {
		
	  @Given("^Navigate to Departments Page$")
	    public void navigate_to_departments_page() throws Throwable {
	        
		  driver = initializeDriver();
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Department lp = new Department(driver);
			DataDriven d = new DataDriven();
			ArrayList<String> Username=d.getdata("Login");
			ArrayList<String> pass=d.getdata("password");
			ArrayList<String> departmentname=d.getdata("Departmentdetails");
			 lp.getNavigatetoURL();
			 lp.Wait();
			 lp.getUsername().sendKeys(Username.get(1));
			 lp.getPassword().sendKeys(pass.get(1));
			 lp.getLoginbutton();
			 lp.Wait();
			 lp.Wait();
		//ClickCommunityHospital
			lp.clickCommunityHospital();
			lp.Wait();
		//ClickDepartments
			lp.clickDepartments();
			lp.Wait();
		//clickLocation
			lp.selectCityHospitalInTheLocation();
			lp.Wait();
	    }

	    @When("^Click the button 'Create Department' and Enter valid user data and click the Finish button$")
	    public void click_the_button_create_department_and_enter_valid_user_data_and_click_the_Finish_button() throws Throwable {
	    	Department lp = new Department(driver);
	    	lp.clickCreateNewDepartment();
	    	lp.Wait();
			//Form1
			lp.fillForm1InTheCreateDepartment();
			lp.clickNextInTheCreateDepartmentForm();
			//NightShitConig
			lp.clickNextInTheCreateDepartmentForm();
			//Assessment
			lp.clickNextInTheCreateDepartmentForm();
			lp.Wait();
			//Gateway Setting
			lp.fillGatewaySettingInTheCreateDepartmentForm();
			//ClickFinish
			lp.clickFinish();
	    }

	    @Then("^New Department should be saved and displayed on the main page of Department's List$")
	    public void new_department_should_be_saved_and_displayed_on_the_main_page_of_departments_list() throws Throwable {
	        
	    	Department lp = new Department(driver);
	    	driver.navigate().refresh();
			lp.Wait();
			//searching with the newly created department name
		    lp.clickCommunityHospital();
			lp.Wait();
			lp.clickDepartments();
			lp.Wait();
			//Select City Hospital in the location
			lp.selectCityHospitalInTheLocation();
			lp.Wait();
			lp.searchWithNewlyCreatedUSername();
			lp.Wait();
			//Verify with Assertion
			lp.verifyNewlyCreatedDepartmentAddedInTheDepartmentList();
			driver.close();
	    }

	
	}
