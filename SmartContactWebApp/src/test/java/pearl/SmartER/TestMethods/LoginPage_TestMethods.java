package pearl.SmartER.TestMethods;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pearl.SmartER.Data.SuperAdminLoginTest;
import pearl.SmartER.PageObjects.LoginPage_Objects;
import pearl.SmartER.TestMethods.BaseClassMain;

import pearl.SmartER.Utils.UserCredentialsExcel;

import pearl.SmartER.Utils.ConfigReader;

public class LoginPage_TestMethods extends BaseClassMain {

	public static WebDriver driver;

	public LoginPage_TestMethods(WebDriver driver) { 
		
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}


	///--coomented initialise method
//	public void webdriver_initialise() throws InterruptedException, IOException {
//		
//		driver=initialise_Driver();
//		
//	}
	
	
	//**Valid username & Password
	public static void tc01_valid_login () throws InterruptedException, IOException {
      
		
		//---username & password taken from excel 
//		UserCredentialsExcel exl_user = new UserCredentialsExcel();
//		ArrayList<String> excel_data_arraylist=exl_user.getdata("User");
//		String username = excel_data_arraylist.get(1);
//		String password = excel_data_arraylist.get(2); 
//		
//		System.out.println("User Name : " + username);
//		System.out.println("Password  : " +password);
		
		ConfigReader cr=new ConfigReader();  // Config file 
		
		LoginPage_Objects lpo=new LoginPage_Objects(driver);
		
		//**lpo.enter_UserName("projectadmin");
		//**lpo.enter_Password("test@123*A");
		
		lpo.enter_UserName(cr.getUsername()); //username : projectadmin -- taken from  Config.properties file
		lpo.enter_Password(cr.getPassword()); //password : test@123*A -- taken from  Config.properties file
		lpo.login_Btn();
		
		

	}

	//**Blank username and password
	public static void tc02_invalid_login () throws InterruptedException {

		LoginPage_Objects lpo=new LoginPage_Objects(driver);
		lpo.enter_UserName(" ");
		lpo.enter_Password(" ");
		lpo.login_Btn();
		lpo.invalid_user_msg();
		Assert.assertEquals(lpo.invalid_user_msg(), " Invalid User ");

	}

	//**Valid username and invalid password
	public static void tc03_valid_username_and_invalid_Password () throws InterruptedException {

		LoginPage_Objects lpo=new LoginPage_Objects(driver);
		lpo.enter_UserName("projectadmin");
		lpo.enter_Password("proj1234"); //Wrong pwd
		lpo.login_Btn();

	}

	//**Valid username and invalid password
	public static void tc04_invalid_username_and_valid_Password () throws InterruptedException {

		LoginPage_Objects lpo=new LoginPage_Objects(driver);
		lpo.enter_UserName("pearlsoftuser"); // wrong username
		lpo.enter_Password("test@123*A");
		lpo.login_Btn();
		

	}
	
	public static void tc05_change_password () throws InterruptedException {
		
		LoginPage_Objects lpo=new LoginPage_Objects(driver);
		lpo.CreateOrChangePwd_change_lbl_click();
		lpo.enter_change_pwd_UserName("pearl");
		lpo.enter_change_pwd_reg_email("pearl@ghail.com");
		lpo.create_or_change_pwd_Btn();
		
		
	}
	
	public static void tc06_superUser_Login() throws InterruptedException {
		
		SuperAdminLoginTest sat=new SuperAdminLoginTest();
		sat.superAdmin_login();
		
		
	}
	
	public static void tc07_superUser_logout() throws InterruptedException, IOException {
		
		tc01_valid_login();  //*Valid Login method from this class
		LoginPage_Objects lpo=new LoginPage_Objects(driver);
		lpo.navigateUrlToLogoutPage();
		lpo.Logout_Btn();
	}
	
	
}
