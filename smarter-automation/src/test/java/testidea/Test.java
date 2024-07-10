package testidea;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import excel.DataDriven;
import pom.Department;
import pom.Issue;
import pom.Login;
import pom.UserPage;
import pom.Search;
import resource.Base;

public class Test extends Base {

	public static void main(String[] args) throws InterruptedException, IOException  {
		
		 driver =initializeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 Department lp = new Department(driver);
		 Issue issue = new Issue(driver);
		 lp.getNavigatetoURL();
		// DataDriven d = new DataDriven();
		// ArrayList<String> Username=d.getdata("Login");
		 lp.getUsername().sendKeys("admin2");
		// ArrayList<String> pass=d.getdata("password");
		 lp.getPassword().sendKeys("pumeX@123!@#");
		 lp.getLoginbutton();
		 lp.Wait();
		 lp.Wait();
		 driver.findElement(By.xpath("//img[@src='https://api-beta.s-er.co/media/client_logos/ba386d18-b11.jpg']")).click();
		//driver.findElement(By.xpath("(//a/img)[1]")).click();
			lp.Wait();
		//ClickDepartments
			lp.clickDepartments();
			lp.Wait();
		//clickLocation
			lp.selectCityHospitalInTheLocation();
			lp.Wait();
			//Search with the existing username
			driver.findElement(By.xpath("//input[@placeholder='Search By Name']")).sendKeys("Test5");
			driver.findElement(By.xpath("//input[@placeholder='Search By Name']")).sendKeys(Keys.ENTER);
			lp.Wait();
			lp.Wait();
			lp.clickEditIcon();
			//driver.close();
			
			
			
		
	}

	}


	
