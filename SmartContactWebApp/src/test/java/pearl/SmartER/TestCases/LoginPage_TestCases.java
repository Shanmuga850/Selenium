package pearl.SmartER.TestCases;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pearl.SmartER.PageObjects.LoginPage_Objects;
import pearl.SmartER.TestMethods.BaseClassMain;
import pearl.SmartER.TestMethods.LoginPage_TestMethods;
import pearl.SmartER.Utility.ExtendReport;
import pearl.SmartER.Utility.Screenshot;


@Listeners(pearl.SmartER.TestListners.Listener.class)

public class LoginPage_TestCases extends BaseClassMain{//extends BaseClassMain{

	public static ExtentTest test; // extent report -test

	public static WebDriver driver;

	//	public void BaseClassMain(WebDriver driver) {
	//		super.driver=driver;
	//		
	//		// TODO Auto-generated constructor stub
	//	}


	@BeforeMethod
	public void webdriver_initialise() throws InterruptedException, IOException {
		//driver=browser_setup();

		driver=initialise_Driver();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);

	}


	String testfromexcel;
	@Test(priority=1,groups="Positive",description="Verify valid Login")
	public static void tc01_valid_login() throws InterruptedException, IOException  {

		test=extent.createTest("Valid_Login");
		LoginPage_TestMethods lptm=new LoginPage_TestMethods(driver);
		lptm.tc01_valid_login();

		//		test=extent.createTest("Valid_Login");
		//		test.log(Status.INFO,"Inside valid login");
		//		test.pass("PASS");
		//		test.fail("FAIL");  



	}

	@Test(priority=2,groups="Negative",description="Invalid Login with blank user name and password")
	public static void tc02_invalid_login() throws InterruptedException {

		test=extent.createTest("InValid_Login");
		LoginPage_TestMethods lptm=new LoginPage_TestMethods(driver);
		lptm.tc02_invalid_login();

		//		test=extent.createTest("Invalid Login");
		//		test.log(Status.INFO,"Inside invalid login");
		//		test.pass("PASS");
		//		test.fail("FAIL");


	}

	@Test(priority=3,groups="Negative",description="Valid user name and invalid password")
	public static void tc03_valid_username_and_invalid_password() throws InterruptedException {

		test=extent.createTest("Valid_username_and_invalid_password");
		LoginPage_TestMethods lptm=new LoginPage_TestMethods(driver);
		lptm.tc03_valid_username_and_invalid_Password();

	}

	@Test(priority=4,groups="Negative",description="Invalid user name and valid password")
	public static void tc04_invalid_username_and_valid_password() throws InterruptedException {

		test=extent.createTest("Invalid_username_and_valid_password");
		LoginPage_TestMethods lptm=new LoginPage_TestMethods(driver);
		lptm.tc04_invalid_username_and_valid_Password();


	}

	//Create-Change pwd
	@Test(priority=5,groups="Positive",description="Verify change pwd using valid username and registered email")
	public static void tc05_verify_createOrChangePwdWithValidData() throws InterruptedException {

		test=extent.createTest("verify_createOrChangePwdWithValidData");

		LoginPage_TestMethods lptm=new LoginPage_TestMethods(driver);
		lptm.tc05_change_password();


	}


	@Test(priority=6,groups="Positive",description="Verify super user login")
	public static void tc05_verify_superUser_Login() throws InterruptedException {

		test=extent.createTest("verify_superUser_Login");
		LoginPage_TestMethods lptm=new LoginPage_TestMethods(driver);
		lptm.tc06_superUser_Login();

	}



	@Test(priority=7,groups="Positive",description="Verify super user logout")
	public static void tc05_verify_superUser_Logout() throws InterruptedException, IOException {

		test=extent.createTest("verify_superUser_Logout");
		LoginPage_TestMethods lptm=new LoginPage_TestMethods(driver);
		lptm.tc07_superUser_logout();

	}

	@AfterMethod
	public void webdriver_close(ITestResult result) throws InterruptedException {

		// Screenshot 
		if (ITestResult.FAILURE==result.getStatus()) {
			Screenshot.captureScreenshot(driver,result.getName());
		}


		//Extent Report 
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
