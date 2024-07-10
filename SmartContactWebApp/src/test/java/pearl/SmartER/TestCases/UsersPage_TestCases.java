package pearl.SmartER.TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pearl.SmartER.PageObjects.UsersPage_Objects;
import pearl.SmartER.TestMethods.BaseClass;
import pearl.SmartER.TestMethods.BaseClassMain;
import pearl.SmartER.TestMethods.UsersPage_TestMethods;
import pearl.SmartER.Utility.Screenshot;

@Listeners(pearl.SmartER.TestListners.Listener.class)

public class UsersPage_TestCases extends BaseClassMain {
	
	public static ExtentTest test;
	public static WebDriver driver;
	
	//Initialising WebDriver
	@BeforeMethod
	public void webdriver_initialise() throws InterruptedException, IOException {
		driver=initialise_Driver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		//Maximizing window
		driver.manage().window().maximize();
		

			
		
	}
	@Test(priority = 0, groups = "Negative", description = "USR_TC01 Verify whether a new user can be created without providing any data", enabled = false)
	public void t01_verify_User_Creation_Without_Credentials() throws Exception {
		test=extent.createTest("USR_TC01 Verify whether a new user can be created without providing any data");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
		up_obj.verify_User_Creation_Without_Credentials();
	}
	
	@Test(priority = 1, groups = "Positive", description = "USR_TC02 Verify whether a new user can be created after providing all data", enabled = false)
	public void t02_verify_User_Creation() throws Exception {
		test=extent.createTest("USR_TC02 Verify whether a new user can be created after providing all data");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
		up_obj.verify_User_Creation();
	}
	 
	@Test(priority = 2, groups = "Negative", description = "USR_TC03 Verify if a duplicate user can be created", enabled = false)
	public void tc03_verify_Duplicate_User_Creation() throws Exception {
		test=extent.createTest("USR_TC03 Verify if a duplicate user can be created");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
		up_obj.verify_Duplicate_User_Creation();
		
	}
	
	@Test(priority = 3, groups = "Negative", description = "USR_TC04 Verify whether new user can be created without giving the username", enabled = false)
	public void tc_04_Create_New_User_Without_Username() throws Exception {
		test=extent.createTest("USR_TC04 Verify whether new user can be created without giving the username");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
		up_obj.create_New_User_Without_Username();
	}
	
	@Test(priority = 4, groups = "Negative", description = "USR_TC05 Verify whether new user can be created without giving the name", enabled = false)
	public void tc_05_Create_New_User_Without_Name() throws Exception {
		test=extent.createTest("USR_TC05 Verify whether new user can be created without giving the name");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
		up_obj.create_New_User_Without_Name();
	}
	
	@Test(priority = 5, groups = "Negative", description = "USR_TC06 Verify whether new user can be created without giving the user title", enabled = false)
	public void tc_06_create_New_User_Without_Usertitle() throws Exception {
		test=extent.createTest("USR_TC06 Verify whether new user can be created without giving the user title");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
		up_obj.create_New_User_Without_Usertitle();
	}
	
	@Test(priority = 6, groups = "Negative", description = "USR_TC07 Verify whether new user can be created without giving the user email", enabled = false)
	public void tc_07_Create_New_User_Without_Email() throws Exception {
		test=extent.createTest("USR_TC07 Verify whether new user can be created without giving the user email");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
		up_obj.create_New_User_Without_Email();
	}
	
	@Test(priority = 7, groups = "Negative", description = "USR_TC08 Verify whether new user can be created without giving the phone number", enabled = false)
	public void tc_08_Create_New_User_Without_Phone_Number() throws Exception {
		test=extent.createTest("USR_TC08 Verify whether new user can be created without giving the phone number");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
		up_obj.create_New_User_Without_Phone_Number();
	}
	
	@Test(priority = 8, groups = "Negative", description = "USR_TC09 Verify whether new user can be created without giving the role", enabled = false)
	public void tc_09_create_New_User_Without_Role() throws Exception {
		test=extent.createTest("USR_TC09 Verify whether new user can be created without giving the role");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
		up_obj.create_New_User_Without_Role();
	}
	
	@Test(priority = 9, groups = "Negative", description = "UR_TC10 Verify whether new user can be created without giving the level", enabled = false)
	public void tc_10_create_New_User_WIthout_Level() throws Exception {
		test=extent.createTest("USR_TC10 Verify whether new user can be created without giving the level");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
		up_obj.create_New_User_Without_Level();
	}
	
	@Test (priority = 10, groups = "Positive", description = "USR_TC11 verify_Users_Button_Enabed", enabled = false)
	public void tc_11_Verify_Users_Button_Enabed() throws InterruptedException {
		test=extent.createTest("USR_TC11 verify_Users_Button_Enabed");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.verify_Users_Button_Enabed();
	}
	
	@Test(priority = 11, groups = "Positive", description = "USR_TC12 Verify whether an existing user data can be edited", enabled = false)
	public void tc_12_Edit_Existing_User() throws InterruptedException {
		test=extent.createTest("USR_TC12 Verify whether an existing user data can be edited");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.edit_Existing_User();
	}
	
	@Test(priority = 12, groups = "Positive", description ="USR_TC13 Verify whether an edited entry is saved successfully", enabled = false )
	public void tc_13_Check_Edited_Entry() throws InterruptedException {
		test=extent.createTest("USR_TC13 Verify whether an edited entry is saved successfully");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.check_Edited_Entry();
	}
	

	@Test(priority = 13, groups = "Positive", description = "USR_TC14 Verify whether a confirmation window comes upon clicking the delete button", enabled = false)
	public void tc14_Delete_Confirmation_WIndow() throws Exception {
		test=extent.createTest("USR_TC14 Verify whether a confirmation window comes upon clicking the delete button");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.delete_Confirmation_Window();
	}
	
	@Test(priority = 14, groups = "Positive", description = "USR_TC15 Verify whether an entry can be deleted", enabled = false)
	public void tc15_Delete_User() throws Exception{
		test=extent.createTest("USR_TC15 Verify whether an entry can be deleted");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.delete_User();
	} 
	
	@Test(priority = 15, groups = "Positive", description = "USR_TC16 Verify if a deleted entry is still available", enabled = false)
	public void tc16_Deletion_Status() throws InterruptedException {
		test=extent.createTest("USR_TC16 Verify if a deleted entry is still available");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.deletion_Status();
	}
	
	@Test(priority = 16, groups = "Positive", description = "USR_TC17 Verify whether the uploaded image can be previewed", enabled = false)
	public void tc17_verify_Uploaded_Image_Preview() throws InterruptedException {
		test=extent.createTest("USR_TC17 Verify whether the uploaded image can be previewed");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.verify_Uploaded_Image_Preview();
		
	}
	
	
	
	@Test(priority = 17, groups = "Positive", description = "USR_TC18 Verify whether the email format is valid", enabled = false)
	public void tc18_Verify_Email_Format_Is_Valid() throws Exception {
		test=extent.createTest("USR_TC18 Verify whether the email format is valid");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.verify_Email_Format_Is_Valid();
	}
	
	@Test(priority = 18, groups = "Negative", description = "USR_TC19 Verify whether uploaded image format is invalid", enabled = false)
	public void tc19_Verify_Invalid_Uploaded_Image_Format() throws Exception {
		test=extent.createTest("USR_TC19 Verify whether uploaded image format is invalid");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.verify_Invalid_Uploaded_Image_Format();
	}
	
	@Test(priority = 19, groups = "Negative", description = "USR_TC20 Verify whether level is deselected when role is removed", enabled = false)
	public void tc20_verify_Level_Deselection_On_Role_Removal() throws Exception {
		test=extent.createTest("USR_TC20 Verify whether level is deselected when role is removed");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.verify_Level_Deselection_On_Role_Removal();
		}
	
	@Test(priority = 20, groups = "Positive", description = "USR_TC21 Verify whether the Location dropdown is active and a location can be selected", enabled = false)
	public void tc21_Verify_Location_Dropdown_Selection() throws Exception {
		test=extent.createTest("USR_TC21 Verify whether the Location dropdown is active and a location can be selected");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.verify_Location_Dropdown_Selection();
	}
	
	@Test(priority = 21, groups = "Positive", description = "USR_TC22 Verify whether the department dropdown is active and a location can be selected", enabled = false)
	public void tc22_Verify_Department_Dropdown_Selection() throws Exception {
		test=extent.createTest("USR_TC22 Verify whether the department dropdown is active and a location can be selected");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.verify_Department_Dropdown_Selection();
	}
	
	@Test(priority = 22, groups = "Positive", description = "USR_TC23Verify whether the Status dropdown is active and a status can be selected", enabled = false)
	public void tc23_Verify_Status_Dropdown_Selection() throws Exception {
		test=extent.createTest("USR_TC23Verify whether the Status dropdown is active and a status can be selected");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.verify_Status_Dropdown_Selection();
		
	}
	
	@Test(priority = 23, groups = "Positive", description = "USR_TC24 Verify whether create user button is enabled", enabled = false)
	public void tc24_verify_Create_User_Button_Enabled() throws Exception {
		test=extent.createTest("USR_TC24 Verify whether create user button is enabled");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.verify_Create_User_Button_Enabled();
	}
	
	
	@Test(priority = 24, groups = "Positive", description = "USR_TC25 Verify whether status dropdown is working and a status can be selected", enabled = false)
	public void tc25_Verify_Status_Dropdown_In_Create_User() throws Exception {
		test=extent.createTest("USR_TC25 Verify whether status dropdown is working and a status can be selected");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.verify_Status_Dropdown_In_Create_User();
	}
	
	@Test(priority = 25, groups = "Positive", description = "USR_TC26 Verify whether location dropdown is working and a location can be selected", enabled = false)
	public void tc26_Verify_Location_Selection_In_Create_User() throws Exception {
		test=extent.createTest("USR_TC26 Verify whether location dropdown is working and a location can be selected");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.verify_Location_Selection_In_Create_User();
	}
	
	
	@Test(priority = 26, groups = "Positive", description = "USR_TC27 Verify whether department  dropdown is working and a department  can be selected", enabled = false)
	public void tc27_Verify_Department_Selection_In_Create_User() throws Exception {
		test=extent.createTest("USR_TC27 Verify whether department  dropdown is working and a department  can be selected");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.verify_Department_Selection_In_Create_User();
	}
	
	@Test(priority = 27, groups = "Positive", description = "USR_TC28 Verify whether role dropdown is working and a role can be selected", enabled = false)
	public void tc28_Verify_Role_Selection_In_Create_User() throws Exception {
		test=extent.createTest("USR_TC28 Verify whether role dropdown is working and a role can be selected");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.verify_Role_Selection_In_Create_User();
	}
	
	@Test(priority = 28, groups = "Positive", description = "USR_TC29 Verify whether level dropdown is working and a level can be selected", enabled = false)
	public void tc29_Verify_Level_Selection_In_Create_User() throws Exception {
		test=extent.createTest("USR_TC29 Verify whether level dropdown is working and a level can be selected");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.verify_Level_Selection_In_Create_User();
	}
	
	@Test(priority = 29, groups = "Positive", description = "USR_TC30 Verify whether language dropdown is working and a language can be selected", enabled = false)
	public void tc30_Verify_Language_Selection_In_Create_User() throws Exception {
		test=extent.createTest("USR_TC30 Verify whether language dropdown is working and a language can be selected");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.verify_Language_Selection_In_Create_User();
	}
	
	
	@Test(priority = 30, groups = "Positive", description = "UST_TC31 Verify whether all checkboxes are clickable", enabled = false)
	public void tc31_Verify_Checkbox_Clicks() throws Exception {
		test=extent.createTest("UST_TC31 Verify whether all checkboxes are clickable");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
		up_obj.verify_Checkbox_Clicks();
	}
	
	@Test(priority = 31, groups = "Negetive", description = "USR_TC32 Verify whether a new role can be created without providing any data", enabled = false)
	public void tc32_Verify_Role_Creation_Without_Credentials() throws Exception {
		test=extent.createTest("USR_TC32 Verify whether a new role can be created without providing any data");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.user_Roles();
		up_obj.verify_Role_Creation_Without_Credentials();
	}
	
	
	@Test(priority = 32, groups = "Positive", description = "USR_TC33 Verify whether a new role can be created after providing all data", enabled = false)
	public void tc33_Verify_Role_Creation_With_Credentials() throws Exception {	
		test=extent.createTest("USR_TC33 Verify whether a new role can be created after providing all data");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.user_Roles();
		up_obj.verify_Role_Creation_With_Credentials();
	}
	
	@Test(priority = 33, groups = "Negetive", description = "USR_TC34 Verify if a duplicate role can be created", enabled = false)
	public void tc34_Verify_Duplicate_Role_Creation() throws Exception {	
		test=extent.createTest("USR_TC34 Verify if a duplicate role can be created");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.user_Roles();
		up_obj.verify_Duplicate_Role_Creation();
		
	}
	
	@Test(priority = 34, groups = "Negetive", description = "USR_TC35 Verify whether password can be changed without providing new passwords", enabled = true)
	public void tc35_Verify_Blank_Password_Change() throws Exception {	
		test=extent.createTest("USR_TC35 Verify whether password can be changed without providing new passwords");
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.demo_Login();
		up_obj.change_Password();
		up_obj.verify_Blank_Password_Change();
		
	}
	
	
//	@Test(priority = 35, groups = "Positive", description = "USR_TC36 Verify whether password can be changed successfully", enabled = false)
//	public void tc36_Verify_Successful_Password_Change() throws Exception {
//		test=extent.createTest("USR_TC36 Verify whether password can be changed successfully");
//		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
//		up_obj.demo_Login();
//		up_obj.change_Password();
//		up_obj.verify_Successful_Password_Change();
//	}
//	
//	@Test(priority = 36, groups = "Negetive", description = "USR_TC37 Verify whether password can be changed without providing new passwords", enabled = false)
//	public void tc37_Verify_Password_Change_Without_Newpassword() throws Exception {
//		test=extent.createTest("USR_TC37 Verify whether password can be changed without providing new passwords");
//		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
//		up_obj.demo_Login();
//		up_obj.change_Password();
//		up_obj.verify_Password_Change_Without_Newpassword(); 
//	}
//	
//	@Test(priority = 37, groups = "Negetive", description = "USR_TC38 Verify whether two different new passwords can be used", enabled = false)
//	private void tc38_Verify_Two_Different_Passwords() throws Exception {
//		test=extent.createTest("USR_TC38 Verify whether two different new passwords can be used");
//		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
//		up_obj.demo_Login();
//		up_obj.change_Password();
//		up_obj.verify_Two_Different_Passwords();
//
//	}
//	
//	
//	@Test(priority = 38, groups = "Negetive", description = "USR_TC39 Verify whether paswords of different pattern can be used", enabled = false)
//	private void tc39_Verify_Incorrect_Pattern() throws Exception {
//		
//		test=extent.createTest("USR_TC39 Verify whether paswords of different pattern can be used");
//		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
//		up_obj.demo_Login();
//		up_obj.change_Password();
//		up_obj.verify_Incorrect_Pattern();
//
//	}
	@AfterMethod
	
	public void webdriver_close(ITestResult result) throws InterruptedException {
		
		//Screenshot in case of failure
		if (ITestResult.FAILURE==result.getStatus()) {
					Screenshot.captureScreenshot(driver,result.getName());
				
						
				}


		//Extended Report
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
		driver.quit();
		
	} 
	
	
	
}
