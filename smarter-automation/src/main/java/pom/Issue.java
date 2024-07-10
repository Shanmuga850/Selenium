package pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;
public class Issue {
	
	public static WebDriver driver;
	
	public Issue(WebDriver driver)
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
	
	public WebElement clickIssueManagement()
	{
		return driver.findElement(By.xpath("//span[text()='Issues Management']"));
	}
	
	public WebElement clickAlerts()
	{
		return driver.findElement(By.xpath("//a[text()=' Alerts ']"));
	}
	
	public void clickJuly1InTheFrom() throws InterruptedException
	{
	 	driver.findElement(By.xpath("(//div[@class='ngx-datepicker-container'])[1]")).click();
	 	 Thread.sleep(3000);
	 	
	 	while(true)
	 	{
	  String text1=driver.findElement(By.xpath("//span[@class='topbar-title']")).getText();
	 	if(text1.equalsIgnoreCase("July 2022"))
	 	{
	 		driver.findElement(By.xpath("//span[text()=' 1 ']")).click(); 
	 		break;
	 	}
	 	else 
	 		driver.findElement(By.xpath("(//div[@class='topbar-container']//*[name()='svg'])")).click();
	 	 }
	 	
	}
	
	public void clickJuly20InTheTo() throws InterruptedException
	{
		driver.findElement(By.xpath("(//div[@class='ngx-datepicker-container'])[2]")).click();
 		Thread.sleep(3000);
 		while(true)
 		{
 	   String text=driver.findElement(By.xpath("//span[@class='topbar-title']")).getText();
 		if(text.equalsIgnoreCase("July 2022"))
 		{
 			driver.findElement(By.xpath("//span[text()=' 20 ']")).click(); 
 			break;
 		}
 		else 
 			driver.findElement(By.xpath("(//div[@class='topbar-container']//*[name()='svg'])[1]")).click();
 		}
	}

	public void clickSearchInTheIssueManagementPage()
	{
		  WebElement search= driver.findElement(By.xpath("(//button[@class='btn btn-block create-btn btn-success'])[1]"));
	 	  JavascriptExecutor js = (JavascriptExecutor) driver;
	 	  js.executeScript("arguments[0].click();", search);
	}
	
	public void verifyNoIssuesAreOpen()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,600)", "");
		 String actualtext = driver.findElement(By.xpath("//td[@align='center']")).getText();
		 String expectedtext = "No data available";
		 Assert.assertEquals(actualtext,expectedtext);
	}
	
	public void verifyProposedDataShouldBeDisplyed()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
			String actualtext = driver.findElement(By.xpath("(//td[@style='width:5%'])[2]")).getText();
		 	String expectedtext="F";
		 	if(actualtext.equalsIgnoreCase(expectedtext))
	       {
			Assert.assertEquals(actualtext, expectedtext);
		    }
			else
			{
				Assert.assertEquals(actualtext,"M");
			}
	}
	
	public WebElement clickLocation()
	{
		return driver.findElement(By.xpath("//select[@formcontrolname='hospitals']"));
	}
	
	public WebElement clickCityHospitalInTheLocation()
	{
		return driver.findElement(By.xpath("//option[text()='City Hospital']"));
	}
	
	public WebElement clickDepartment()
	{
		return driver.findElement(By.xpath("//select[@formcontrolname='departments']"));
	}
	
	public WebElement clickCardiologyInTheDepartment()
	{
		return driver.findElement(By.xpath("//option[text()='Cardiology ']"));
	}
	public void Wait() throws InterruptedException
	{
		Thread.sleep(4000);
	}
}
