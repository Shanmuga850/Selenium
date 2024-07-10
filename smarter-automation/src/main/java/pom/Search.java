package pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Search {
public static WebDriver driver;
	
	public Search(WebDriver driver)
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
	
	public void verifyUserInSearchPage()
	{
		String actualtext= driver.findElement(By.xpath("//strong[text()='Search']")).getText();
		String expectedtext= "Search";
		Assert.assertEquals(actualtext, expectedtext);
	}
	public WebElement clickCommunityHospital()
	{
		return driver.findElement(By.xpath("//h4[text()='Community Hospital']"));
		
	}
	public WebElement clickSearch()
	{
		return  driver.findElement(By.xpath("//span[text()='Search']"));
	}
	public WebElement clickLocation()
	{
		return  driver.findElement(By.xpath("//select[@formcontrolname='hospitalid']"));
	 
	} 
	public WebElement clickCommunityHospitalInTheLocation()
	{
		return  driver.findElement(By.xpath("//option[text()=' Community Hospital']"));
	}
	public WebElement clickDepartment()
	{
		return driver.findElement(By.xpath("(//select[@name='departmentid'])[1]"));
	}
	public WebElement clickCasulaityInTheDepartment()
	{
		return driver.findElement(By.xpath("//option[text()='Casuality ']"));
	}


	public void clickSearchInTheSearchpage()
	{
      WebElement search= driver.findElement(By.xpath("//button[text()=' Search']"));
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].click();", search);
		
	}
	public void verifyProposedDataIsDisplayedInTheSearchPage()
	{
		String actualtext=driver.findElement(By.xpath("(//td[@style='width:15%!important;'])[1]")).getText();
		String expectedtext="Pending";
	 	if(actualtext.equalsIgnoreCase(expectedtext))
       {
		Assert.assertEquals(actualtext, expectedtext);
	    }
		else
		{
			Assert.assertEquals(actualtext,"Excluded");
		}
	 	
	 	//JavascriptExecutor js = (JavascriptExecutor) driver;
	 	//js.executeScript("window.scrollBy(0,600)", "");
}
public WebElement clickAgeFilter()
{
	return  driver.findElement(By.xpath("//select[@formcontrolname='age_filter']"));
}
public WebElement clickInfantInTheAgeFilter()
{
	return driver.findElement(By.xpath("//option[@value='infant']"));
}
public void verifyInfantDetailsAreDisplayed()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
 	js.executeScript("window.scrollBy(0,600)", "");
	 String actualtext=driver.findElement(By.xpath("(//td[@style='width:10%!important;'])[3]")).getText();
     String expectedtext = "0";
     Assert.assertEquals(actualtext,expectedtext);
}

public WebElement clickGenderFilter()
{
	return driver.findElement(By.xpath("//select[@formcontrolname='gender_filter']"));
}

public WebElement clickFemaleInTheGenterFilter()
{
	return  driver.findElement(By.xpath("//option[@value='F']"));
}
public void VerifyFemaleDataShouldBeDisplayed()
{
	 String actualtext=driver.findElement(By.xpath("(//td[@style='width:10%!important;'])[4]")).getText();
	 String expectedtext="F";
	 Assert.assertEquals(actualtext,expectedtext);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,600)", "");
}
public void selectTheDateInTheFrom()
{
	driver.findElement(By.xpath("(//input[@class='ngx-datepicker-input ng-untouched ng-pristine ng-valid'])[2]")).click();
	 
	
	while(true)
	{
 String text1=driver.findElement(By.xpath("//span[@class='topbar-title']")).getText();
	if(text1.equalsIgnoreCase("July 2022"))
	{
		driver.findElement(By.xpath("//span[text()=' 20 ']")).click(); 
		break;
	}
	else 
		driver.findElement(By.xpath("(//div[@class='topbar-container']//*[name()='svg'])")).click();
	}
	
}

public void selectTheDatenInTheTo()
{
	driver.findElement(By.xpath("//input[@class='ngx-datepicker-input ng-untouched ng-pristine ng-valid']")).click();
	
	while(true)
	{
   String text=driver.findElement(By.xpath("//span[@class='topbar-title']")).getText();
	if(text.equalsIgnoreCase("July 2022"))
	{
		driver.findElement(By.xpath("//span[text()=' 1 ']")).click(); 
		break;
	}
	else 
		driver.findElement(By.xpath("(//div[@class='topbar-container']//*[name()='svg'])[1]")).click();
	}
}


public void Wait() throws InterruptedException
{
	Thread.sleep(3000);
}
}

