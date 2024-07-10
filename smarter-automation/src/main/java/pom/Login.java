package pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class Login  {
	
	public static WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
	}  
	
	
	public  void getNavigatetoURL()           
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
	
	public static void verifyHomepage()
	{
		String ExpectedTitle=driver.getTitle();
		//System.out.println(ExpectedTitle);
		String ActualTitle="SmartContact | Auscura";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
	} 
	
	public static void verifyInvalidUser()
	{
		String Invalidtext =driver.findElement(By.xpath("//div[@class='error']")).getText();
		//System.out.println(Invalidtext);
		String Actualtext = "Username or password is incorrect.";
		Assert.assertEquals(Invalidtext,Actualtext);
	}
	
	public static void verifyInvalidUser2()
	{
		String Invalidtext =driver.findElement(By.xpath("//div[@class='error']")).getText();
		//System.out.println(Invalidtext);
		String Actualtext = "Invalid User";
		Assert.assertEquals(Invalidtext,Actualtext);
	}
	
	public static void verifyUserInLoginPage()
	{
		String ExpectedURL = driver.getCurrentUrl();
		String ActualURL = "https://beta.s-er.co/";
		Assert.assertEquals(ExpectedURL,ActualURL);
	}
	
	public void verifyValidationMessageUsernameisRequired()
	{	
		 String validationtext =driver.findElement(By.xpath("(//div[@class='error'])[1]")).getText();
		 String expectedtext="Username is required.";
		 Assert.assertEquals(validationtext,expectedtext);
	}
	public void verifyValidationMessagePasswordIsRequired()
	{
		 String validationtext1 =driver.findElement(By.xpath("(//div[@class='error'])[2]")).getText();
		 String expectedtext1="Password is required.";
		 Assert.assertEquals(validationtext1,expectedtext1);	
	}
	public void Wait() throws InterruptedException
	{
		Thread.sleep(3000);
	}

}
