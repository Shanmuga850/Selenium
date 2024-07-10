package pearl.SmartER.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pearl.SmartER.PageObjects.LocationPage_Objects;
import pearl.SmartER.TestMethods.BaseClass;
import pearl.SmartER.TestMethods.BaseClassMain;
import pearl.SmartER.TestMethods.LocationPage_TestMethods;
import pearl.SmartER.Utility.Screenshot;


public class LocationPage_TestCases extends BaseClassMain {
	
	public static ExtentTest test; // extent report -test
	public static WebDriver driver;
	
	@BeforeMethod
	public void webdriver_initialise() throws InterruptedException, IOException {
		
		driver=initialise_Driver();
		
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
	
	}
	
	
	@Test(priority=1,groups="positive",description="LOC_TC01 verify create location button is enabled") 
	 public void tc01_verify_create_location_button_enabled() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC01 verify create location button is enabled");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_temporary_login(); 
		lp.verify_create_location_button_enabled();
	 }  
	
	
	@Test(priority=2,groups="positive",description="LOC_TC02 verify user can redirect to the create location page  on clicking 'Create location' button") 
	 public void tc02_verify_create_location_page_displayed() throws InterruptedException
	 {
		test=extent.createTest("LOC_TC02 verify user can redirect to the create location page  on clicking 'Create location' button");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		 lp.locationpage_temporary_login();
		lp.verify_create_location_page_displayed();
	 }
	
	
	@Test(priority=3,groups="positive",description="LOC_TC03 verify create location with valid details")
	 public void tc03_verify_create_location_with_valid_details() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC03 verify create location with valid details");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_temporary_login();
		lp.create_location_with_valid_details();
	 }
	
	
	@Test(priority=4,groups="positive",description="LOC_TC04 verify data populated using clone dropdown") 
	 public void tc04_verify_data_populated_using_clone_dropDown() throws InterruptedException, IOException
	 {
		
		test=extent.createTest("LOC_TC04 verify data populated using clone dropdown"); 
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_superadmin_login();
		lp.verify_data_populated_using_clone_dropDown();
	 }

	
	@Test(priority=5,groups="positive",description="LOC_TC05 verify country list displayed") 
	 public void tc05_verify_country_list_displayed() throws InterruptedException
	 {
		test=extent.createTest("LOC_TC05 verify country list displayed");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		 lp.locationpage_temporary_login();
		 lp.verify_country_list_displayed();
	 }
	
	
	@Test(priority=6,groups="positive",description= "LOC_TC06 verify data populated in state dropdown after selecting country")
	public void tc06_verify_data_populated_in_state_dropdown_after_selecting_country() throws InterruptedException, IOException{
		test=extent.createTest("LOC_TC06 verify data populated in state dropdown after selecting country");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_temporary_login();
		lp.verify_data_populated_in_state_dropdown_after_selecting_country();
	}
	
	
	@Test(priority=7,groups="positive",description="LOC_TC07 verify country list is sorted") 
	 public void tc07_verify_country_list_is_sorted() throws InterruptedException
	 {
		
		test=extent.createTest("LOC_TC07 verify country list is sorted"); 
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	     lp.locationpage_temporary_login();  
		lp.verify_country_list_is_sorted();
	 }
	
	
	@Test(priority=8,groups="positive",description="LOC_TC08 verify user can upload logo") 
	 public void tc08_verify_user_can_upload_logo() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC08 verify user can upload logo");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_temporary_login();
		lp.verify_user_can_upload_logo();
	 }	
	
	
	@Test(priority=9,groups="negative",description="LOC_TC09 verify the validation of phone number") 
	 public void tc09_validating_phone_number_field() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC09 verify the validation of phone number");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_temporary_login();
		lp.validating_phone_number_field();
	 }	
	
	
	@Test(priority=10,groups="negative",description="LOC_TC10 verify the validation of email ") 
	 public void tc10_email_validation() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC10 verify the validation of email");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	     lp.locationpage_temporary_login();
	     lp.email_validation();
	 }	
	
	@Test(priority=11,groups="negative",description="LOC_TC11 verify character length of name") 
	 public void tc11_character_length_of_name_field() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC11 verify character length of name");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		 lp.locationpage_temporary_login();
		lp.character_length_of_name_field();
	 }
	
	
	@Test(priority=12,groups="negative",description="LOC_TC12 verify user can enter a valid start time") 
	 public void tc12_startTime_format_validation() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC12 verify user can enter a valid start time");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_temporary_login();
		lp.startTime_format_validation();
	 }	
	
	
	@Test(priority=13,groups="negative",description="LOC_TC13 verify user can enter a valid end time") 
	 public void tc13_endTime_format_validation() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC13 verify user can enter a valid end time");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_temporary_login();
		lp.endTime_format_validation();
	 }	
	
	
	@Test(priority=14,groups="positive",description="LOC_TC14 verify back button redirect to location page") 
	 public void tc14_verify_back_button_navigates_to_locationPage() throws InterruptedException
	 {
		test=extent.createTest("LOC_TC14 verify back button redirect to location page");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		 lp.locationpage_temporary_login();
		lp.verify_back_button_navigates_to_locationPage();
	 }	
	
	
	@Test(priority=15,groups="positive",description="LOC_TC15 verify client dropdown is enabled") 
	 public void tc15_verify_client_drpdwn__isEnabled() throws InterruptedException
	 {
		test=extent.createTest("LOC_TC15 verify client dropdown is enabled");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		 lp.locationpage_temporary_login();
		lp.client_drpdwn__isEnabled();
	 }	
	
	
	@Test(priority=16,groups="positive",description="LOC_TC16 verify 'View department' icon redirects to department page.") 
	 public void tc16_verify_view_department_Icon_redirects_to_department_page() throws InterruptedException
	 {
		test=extent.createTest("LOC_TC16 verify 'View department' icon redirects to department page.");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		 lp.locationpage_temporary_login();
		lp.verify_view_department_Icon_redirects_to_department_page();
	 }
	
	
	@Test(priority=17,groups="positive",description="LOC_TC17 verify edit button redirects to update hospital page") 
	 public void tc17_verify_edit_button_redirects_to_updateHospital_page() throws InterruptedException
	 {
		test=extent.createTest("LOC_TC17 verify edit button redirects to update hospital page");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_temporary_login();
		lp.verify_edit_button_redirects_to_updateHospital_page();
	 }
	 
	
	@Test(priority=18,groups="positive",description="LOC_TC18 verify confirmation message displayed when user clicks on the delete button") 
	 public void tc18_verify_delete_confirmation_dialogbox_displayed() throws InterruptedException
	 {
		test=extent.createTest("LOC_TC18 verify confirmation message displayed when user clicks on the delete button");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		 lp.locationpage_temporary_login();
		 lp.verify_delete_confirmation_dialogbox_displayed();
	 }

	
	@Test(priority=19,groups="positive",description="LOC_TC19 verify user can edit location name") 
	 public void tc19_verify_user_can_edit_location_name() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC19 verify user can edit location name"); 
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_superadmin_login();  
		 lp.verify_user_can_edit_location_name();
	 }	
	
	@Test(priority=20,groups="positive",description="LOC_TC20 verify user can edit contact person name") 
	 public void tc20_verify_user_can_edit_contact_person_name() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC20 verify user can edit contact person name");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_superadmin_login();
		 lp.verify_user_can_edit_contact_person_name();
	 }	
	
	
	@Test(priority=21,groups="positive",description="LOC_TC21 verify user can edit phone number") 
	 public void tc21_verify_user_can_edit_phoneNumber() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC21 verify user can edit phone number");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_superadmin_login();
		 lp.verify_user_can_edit_phoneNumber();
	 }	
	
	
	@Test(priority=22,groups="positive",description="LOC_TC22 verify user can edit email") 
	 public void tc22_verify_user_can_edit_email() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC22 verify user can edit email");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_superadmin_login();
		lp.verify_user_can_edit_email();
	 }
	
	
	@Test(priority=23,groups="positive",description="LOC_TC23 verify Search functionality in the 'location' page by entering a valid search keyword") 
	 public void tc23_verify_search_field_functionality() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC23 verify Search functionality in the 'location' page by entering a valid search keyword");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		 lp.locationpage_superadmin_login();
		 lp.verify_search_field_functionality();
	 }	
	
	
	@Test(priority=24,groups="positive",description="LOC_TC24 verify user can create location without optional fields") 
	 public void tc24_verify_create_location_with_optional_field_blank() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC24 verify user can create location without optional fields");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_temporary_login();
		lp.verify_create_location_with_optional_field_blank();
	 }	
	
	
	@Test(priority=25,groups="negative",description="LOC_TC25 verify user can create location without  name")
	 public void tc25_verify_create_location_without_name() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC25 verify user can create location without  name");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_temporary_login();
		lp.create_location_without_providing_name();
	 }

	
	@Test(priority=26,groups="negative",description="LOC_TC26 verify user can create location without  email")
	 public void tc26_verify_create_location_without_valid_email() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC26 verify user can create location without  email"); 
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);	
		lp.locationpage_temporary_login();
		lp.create_location_without_providing_valid_email();
	 }
	
	
	@Test(priority=27,groups="negative",description="LOC_TC27 verify user can create location without  contact person ")
	 public void tc27_verify_create_location_without_contactPerson_field() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC27 verify user can create location without  contact person");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);	
		lp.locationpage_temporary_login();
		lp.create_location_without_providing_contact_person();
	 }
	
	
	@Test(priority=28,groups="negative",description="LOC_TC28 verify user can create location without  phoneNumber")
	 public void tc28_verify_create_location_without_phoneNumber_field() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC28 verify user can create location without  phoneNumber"); 
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);	
		lp.locationpage_temporary_login();
		lp.create_location_without_providing_phoneNumber_field();
	 }
	
	
	@Test(priority=29,groups="negative",description="LOC_TC29 verify user can create location without  city")
	 public void tc29_verify_create_location_without_city_field() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC29 verify user can create location without  city"); 
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);	
		lp.locationpage_temporary_login();
		lp.create_location_without_providing_city_field();
	 }
	
	
	@Test(priority=30,groups="negative",description="LOC_TC30 verify user can create location without  website")
	 public void tc30_verify_create_location_without_website_field() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC30 verify user can create location without  website"); 
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	    lp.locationpage_temporary_login();
		lp.create_location_without_providing_website_field();
	 }
	
	
	@Test(priority=31,groups="negative",description="LOC_TC31 verify user can create location without subunit")
	 public void tc31_verify_create_location_without_subunit_field() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC31 verify user can create location without subunit"); 
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_temporary_login();
		lp.create_location_without_providing_subunit_field();
	 }
	
	
	@Test(priority=32,groups="negative",description="LOC_TC32 verify user can create location without  contact address details")
	 public void tc32_verify_create_location_without_contactAddress_field() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC32 verify user can create location without  contact address details"); 
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_temporary_login();
		lp.create_location_without_providing_contactAddress_field();
	 }
	
	
	@Test(priority=33,groups="negative",description="LOC_TC33 verify user can  create location without country dropdown") 
	 public void tc33_verify_create_location_without_country_dropdown() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC33 verify user can  create location without country dropdown");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);	
		lp.locationpage_temporary_login();
		lp.create_location_without_selecting_country_dropdown();
	 }
	
	
	@Test(priority=34,groups="negative",description="LOC_TC34 verify user can create location without state dropdown")
	 public void tc34_verify_create_location_without_state_dropdown() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC34 verify user can create location without state dropdown");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);	
		lp.locationpage_temporary_login();
		lp.create_location_without_selecting_state_dropdown();
	 }
	
	
	@Test(priority=35,groups="negative",description="LOC_TC35 verify user can create location without preferred date format dropdown")
	 public void tc35_verify_create_location_without_preferedDateFormat_dropdown() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC35 verify user can create location without preferred date format dropdown");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);	
		lp.locationpage_temporary_login();
		lp.create_location_without_selecting_preferedDateFormat_dropdown();
	 }
	
	
	@Test(priority=36,groups="negative",description="LOC_TC36 verify user can create location without  timezone dropdown") 
	 public void tc36_verify_create_location_without_timeZone_dropdown() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC36 verify user can create location without  timezone dropdown"); 
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);	
		lp.locationpage_temporary_login();
		lp.create_location_without_selecting_timeZone_dropdown();
	 }
	
	
	@Test(priority=37,groups="negative",description="LOC_TC37 verify user can create location with already existing name") 
	 public void tc37_verify_create_location_with_already_existing_name() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC37 verify user can create location with already existing name"); 
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_temporary_login();
		lp.create_location_with_already_existing_name();
	 }
	
	
	@Test(priority=38,groups="negative",description="LOC_TC38 verify user can create location with blank data") 
	 public void tc38_verify_create_location_with_blankData() throws InterruptedException
	 {
		test=extent.createTest("LOC_TC38 verify user can create location with blank data"); 
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_temporary_login();
		lp.create_location_with__blankData();
	 }

	
	@Test(priority=39,groups="positive",description="LOC_TC39 verify website field validation") 
	 public void tc39_verify_website_field_validation() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC39 verify website field validation"); 
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_temporary_login();
		lp.verify_website_field_validation();
	 }
	@Test(priority=40,groups="positive",description="LOC_TC40 verify 'Delete' functionality") 
	 public void tc40_verify_delete_functionality() throws InterruptedException, IOException
	 {
		test=extent.createTest("LOC_TC40 verify 'Delete' functionality");
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.locationpage_superadmin_login();
		lp.verify_delete_functionality();
	 }
	
	@Test(priority=41,groups="positive",description="LOC_TC41 verify on selecting status dropdown as  inactive mode hide the location details") 
	 public void tc41_verify_status_dropdown_functionality() throws InterruptedException, IOException
	 {
		
		test=extent.createTest("LOC_TC41 verify on selecting status dropdown as  inactive mode hide the location details"); 
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	    lp.locationpage_superadmin_login();
		lp.verify_status_dropdown_functionality();
	 }	
 
	@AfterMethod
////	public void browserr_close()  {
////	driver.close();
////}
	public void browserr_close(ITestResult result)  {
		if (ITestResult.FAILURE==result.getStatus()) {
					Screenshot.captureScreenshot(driver,result.getName());	
						
				}
	if(result.getStatus()==ITestResult.FAILURE)
	{
		test.log(Status.FAIL, result.getName());
	}
	else if (result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS, result.getName());
	}

	else if (result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP, result.getName()); 
	}

	driver.close();

}
}


