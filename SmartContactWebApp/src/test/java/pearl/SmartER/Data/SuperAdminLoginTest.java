package pearl.SmartER.Data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pearl.SmartER.PageObjects.LoginPage_Objects;
import pearl.SmartER.TestMethods.BaseClassMain;
import pearl.SmartER.Utils.UserCredentialsExcel;

public class SuperAdminLoginTest extends BaseClassMain {
	
	public static WebDriver driver;
	
	public void SuperAdminLoginTest(WebDriver driver) {
	this.driver=driver;
	
	// TODO Auto-generated constructor stub
}
	
	
	public void webdriver_initialise() throws InterruptedException, IOException {
		//driver=browser_setup();
		
		driver=initialise_Driver();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		
	}
	
	
	public static void superAdmin_login() throws InterruptedException {
	LoginPage_Objects log_obj=new LoginPage_Objects (driver);
	
	log_obj.enter_UserName("projectadmin");
	log_obj.enter_Password("test@123*A");
	log_obj.login_Btn();
	
	}
	
	
	public static void main(String[]args) throws IOException, InterruptedException
	{

		superAdmin_login();
		System.out.println("entered method superadmin");

	}
}
