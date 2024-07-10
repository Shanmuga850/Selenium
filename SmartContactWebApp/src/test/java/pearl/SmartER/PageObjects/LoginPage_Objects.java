package pearl.SmartER.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pearl.SmartER.TestMethods.BaseClass;


//Class code correct
public class LoginPage_Objects {//extends BaseClass {
	//SmartERAppVer01

	public static WebDriver driver;


	//REMOVED -2 STEP
	//Web Driver setup
	public LoginPage_Objects (WebDriver driver) {
		//this.driver=driver;
		this.driver=driver;
		//PageFactory.initElements(driver, this);
	} 

	//Login Elements
	By Username_txt = By.xpath("//input[@formcontrolname='username']");
	By Password_txt = By.xpath("//input[@formcontrolname='password']");
	By Login_Btn = By.xpath("//button[text()='Login']");
	
	//Change Password Elements
	By ChangePassword_lbl=By.xpath("//a[@class='txt1']"); // Create or Change password
	By change_pwd_username_txt=By.xpath("//input[@placeholder='Username']");
	By change_pwd_Reg_email_txt=By.xpath("//input[@placeholder='Registered Email']");  
	By createOrChangePwd_btn=By.xpath("//button[normalize-space()='CREATE/CHANGE PASSWORD']");
	 

	//Validation label Messages
	By Invalid_user_vaidation_msg=By.xpath("//div[normalize-space()='Invalid User']");
	
	//Dashboard Page
	By Logout_btn = By.xpath("//i[@title='logout']");


	public void enter_UserName(String username) throws InterruptedException { 
		// TODO Auto-generated method stub

		driver.findElement(Username_txt).sendKeys(username);
		Thread.sleep(2000);

	}

	public void enter_Password (String password) throws InterruptedException {
 
		driver.findElement(Password_txt).sendKeys(password);
		Thread.sleep(2000);
	}


	public void login_Btn () throws InterruptedException {
		driver.findElement(Login_Btn).click();
		Thread.sleep(2000);

	}

//	public void click_change_password () throws InterruptedException {
//		driver.findElement(ChangePassword_lbl).click();
//		Thread.sleep(2000);
//
//	}

	public String invalid_user_msg () throws InterruptedException {
		String aa=driver.findElement(Invalid_user_vaidation_msg).getText();
		Thread.sleep(2000);
		return aa;

	}
	
	//Create / Change password  section 
	public void CreateOrChangePwd_change_lbl_click() throws InterruptedException { 
		// TODO Auto-generated method stub

		driver.findElement(ChangePassword_lbl).click();
		Thread.sleep(2000);

	}
	
	public void enter_change_pwd_UserName(String username) throws InterruptedException { 
		// TODO Auto-generated method stub

		driver.findElement(change_pwd_username_txt).sendKeys(username);
		Thread.sleep(2000);

	}
	
	public void enter_change_pwd_reg_email(String username) throws InterruptedException { 
		// TODO Auto-generated method stub

		driver.findElement(change_pwd_Reg_email_txt).sendKeys(username);
		Thread.sleep(2000);

	}
	
	public void create_or_change_pwd_Btn () throws InterruptedException {
		driver.findElement(createOrChangePwd_btn).click();
		Thread.sleep(2000);

	}
	
	public void Logout_Btn () throws InterruptedException {
		driver.findElement(Logout_btn).click();
		Thread.sleep(2000);
	
	}
	
	public void navigateUrlToLogoutPage () throws InterruptedException {
		driver.navigate().to("https://beta.s-er.co/client/all-clients");
		Thread.sleep(4000);
		
	
	}
	
	






}

