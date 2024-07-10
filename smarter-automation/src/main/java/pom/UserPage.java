package pom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import excel.DataDriven;


public class UserPage {

	public static WebDriver driver;
	
	public UserPage(WebDriver driver)
	{
		this.driver = driver;
	}  
	
	public void getNavigatetoURL()
	{
		 driver.get("https://beta.s-er.co/");
	}
	
	public WebElement getUsername()
	{
		return driver.findElement(By.xpath("//input[@formcontrolname='username']"));
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(By.xpath("//input[@formcontrolname='password']"));
	}
	
	public WebElement getLoginbutton()
	{
		return driver.findElement(By.xpath("//button[text()='Login']"));
	}
	
	public WebElement clickUser()
	{
		return driver.findElement(By.xpath("//span[text()='Users']"));
	}
	
	public WebElement clickListInTheUser()
	{
		return driver.findElement(By.xpath("//a[text()=' List ']"));
	}
	
	public void Wait() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	
	public WebElement clickCreateUserInTheUserListPage()
	{
		return driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
	}
	
	public WebElement clickUsernameInTheCreateUserPage()
	{
		return  driver.findElement(By.xpath("//input[@formcontrolname='username']"));
	}
	
	public WebElement clickFirstnameInTheCreateUserPage()
	{
		return  driver.findElement(By.xpath("//input[@formcontrolname='first_name']"));
	}
	
	public WebElement clickTitleInTheCreateUserPage()
	{
		return driver.findElement(By.xpath("//input[@formcontrolname='title']"));
	}
	
	public WebElement clickEmailInTheCreateUserPage()
	{
		return  driver.findElement(By.xpath("//input[@formcontrolname='email']"));
	}
	public WebElement clickMobileNoInTheCreateUserPage()
	{
		return  driver.findElement(By.xpath("//input[@formcontrolname='mobilephone']"));
	}
	
	public WebElement clickRoleintheCreateUserPage()
	{
		return  driver.findElement(By.xpath("//input[@role='combobox']"));
	}
	public WebElement clickDepartmentAdminRoleInTheCreateUserPage()
	{
		return driver.findElement(By.xpath("//span[text()='Department Admin']"));
	}
	public void clickSaveButtonInTheCreateUserPage() throws InterruptedException
	{
		  WebElement save= driver.findElement(By.xpath("//a[text()='Save']"));
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,780)", "");
		    Thread.sleep(5000);
		    save.click();
	}
	
	public void verifyThatUserInTheUsersListPage()
	{
		 String actualtext=driver.findElement(By.xpath("//button[@type='button']")).getText();
		// System.out.println(actualtext);
		 String expectedtext="Create User";
		 Assert.assertEquals(actualtext, expectedtext);
	}
	
	public void verifyThatNewlyCreatedUserDisplayedInTheUsersList()
	{
		  String actualtext =   driver.findElement(By.xpath("//td[text()='shanshan1  ']")).getText();
		    String expectedtext = "shanshan1";
		    Assert.assertEquals(actualtext, expectedtext);
	}
	
	public void verifyThatUsernameAlreadyExistsValidationMessageShown()
	{
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,-780)");	
		    String actualtext=driver.findElement(By.xpath("//div[@class='error']")).getText();
		    String expectedtext="Username already exists.";
		    Assert.assertEquals(actualtext,expectedtext);
	}
	
	public void verifyThatUserInTheCreateNewUserPage()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,-780)");
	    String actualtext=  driver.findElement(By.xpath("//strong[text()='Create/Edit']")).getText();
	    String expectedtext = "Create/Edit";
	    Assert.assertEquals(actualtext,expectedtext);
	}
	
	public void verifyThatUserNameRequiredValidationMessageShown()
	{
		String actualtext =   driver.findElement(By.xpath("//font[text()='Username required']")).getText();
	    String expectedtext = "Username required";  
	    Assert.assertEquals(actualtext,expectedtext);
	 }
	 
	public void verifyThatNameRequiredValidationMessageShown()
	{
		   String actualtext =   driver.findElement(By.xpath("//font[text()='Name required']")).getText();
		    String expectedtext = "Name required";
		    Assert.assertEquals(actualtext,expectedtext);
	}
	
	public void verifyThatTitleRequiredMessageIsShown()
	{
		 String actualtext =  driver.findElement(By.xpath("//font[text()='Title required']")).getText();
		 String expectedtext = "Title required";
		 Assert.assertEquals(actualtext,expectedtext);
	}
	
	public void verifyThatEmailRequiremessageIsShown()
	{
	    String actualtext =  driver.findElement(By.xpath("//font[text()='Email required']")).getText();
	    String expectedtext = "Email required";
	    Assert.assertEquals(actualtext,expectedtext);
	}
	
	public void verifyThatPhoneNumberRequiredmessageIsShown()
	{
		 String actualtext =  driver.findElement(By.xpath("//font[text()='Phone Number required']")).getText();
		 String expectedtext = "Phone Number required";
		 Assert.assertEquals(actualtext,expectedtext);
	}
	
	public void verifyThatRoleRequiredMessageIsShown()
	{
		 String actualtext =  driver.findElement(By.xpath("//font[text()='Role required']")).getText();
		 String expectedtext = "Role required";
	     Assert.assertEquals(actualtext,expectedtext);
	}
	
	public void verifyThatLevelRequiredMessageIsShown()
	{
	    String actualtext =  driver.findElement(By.xpath("//font[text()='Level required']")).getText();
	    String expectedtext = "Level required";
	    Assert.assertEquals(actualtext,expectedtext);
	}
	
	public void clickEditButtonBasedOnName() throws IOException
	{
	List<WebElement> names=driver.findElements(By.xpath("//td[@style='word-break: break-word;']"));
	DataDriven d = new DataDriven();
	ArrayList<String> newuser=d.getdata("edituser");
		for(int i=0;i<names.size();i++)
		{
			String name=names.get(i).getText();
			if(name.equalsIgnoreCase(newuser.get(1)))
			{
				driver.findElements(By.xpath("//i[@class='fa fa-edit text-navy']")).get(i).click();
				break;
			}
		}
	}
	
	public void editAndChangeName() throws IOException
	{
		DataDriven d = new DataDriven();
		ArrayList<String> datadd=d.getdata("edituser");
		driver.findElement(By.xpath("//input[@formcontrolname='first_name']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='first_name']")).sendKeys(datadd.get(2));
	}
	
	public void editAndChangeGmail() throws IOException
	{
		DataDriven d = new DataDriven();
		ArrayList<String> datadd=d.getdata("edituser");
		driver.findElement(By.xpath("//input[@formcontrolname='email']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys(datadd.get(4));
	}
	
	public void editAndChangeUserTitle() throws IOException
	{
		DataDriven d = new DataDriven();
		ArrayList<String> datadd=d.getdata("edituser");
		driver.findElement(By.xpath("//input[@formcontrolname='title']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='title']")).sendKeys(datadd.get(3));
	}
	
	public void editChangeMobileNo() throws IOException
	{
		DataDriven d = new DataDriven();
		ArrayList<String> datadd=d.getdata("edituser");
		driver.findElement(By.xpath("//input[@formcontrolname='mobilephone']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='mobilephone']")).sendKeys(datadd.get(5));
	}
	
	public void verifyThatEditedUserDataIsDisplayedOnTheUserListPage()
	{
		 String actualtext=driver.findElement(By.xpath("//strong[text()='List']")).getText();
	     String expectedtext="List";
		 Assert.assertEquals(actualtext, expectedtext);
	}
	
	
	}
