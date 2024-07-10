package pom;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import excel.DataDriven;

public class Department {

	
	public static WebDriver driver;
	
	public Department(WebDriver driver)
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
	
	public void getLoginbutton()
	{
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
	
	
	public void clickCommunityHospital()
	{
		// driver.findElement(By.xpath("//img[@src='https://api-beta.s-er.co/media/client_logos/ba386d18-b11.jpg']")).click();
		driver.findElement(By.xpath("(//a/img)[1]")).click();
	}
	
	public void clickDepartments()
	{
	 driver.findElement(By.xpath("(//div[@class='m-b-md'])[2]")).click();
	}
	
	public void selectCityHospitalInTheLocation() throws InterruptedException
	{
		driver.findElement(By.xpath("//select[@formcontrolname='HospitalId']")).click();
		Thread.sleep(3000);
		//selectCityHospital
		driver.findElement(By.xpath("//option[text()=' City Hospital ']")).click();
		
	}
	
	public void clickCreateNewDepartment()
	{
		driver.findElement(By.xpath("//i[@class='fa fa-plus']")).click();
	}
	
	public void fillForm1InTheCreateDepartment() throws IOException
	{
		DataDriven d = new DataDriven();
		ArrayList<String> department=d.getdata("Departmentdetails");
		
		driver.findElement(By.xpath("//input[@formcontrolname='Name']")).sendKeys(department.get(1));
		//Contact Person
		driver.findElement(By.xpath("//input[@formcontrolname='ContactPerson']")).sendKeys(department.get(2));
		//mobile number
		driver.findElement(By.xpath("//input[@formcontrolname='ContactMobilePhone']")).sendKeys(department.get(3));
		//contactmail
		driver.findElement(By.xpath("//input[@formcontrolname='ContactEMail']")).sendKeys(department.get(4));
		//fax
		driver.findElement(By.xpath("//input[@formcontrolname='FaxNo']")).sendKeys(department.get(5));
	}
	
	public void clickNextInTheCreateDepartmentForm()
	{
		driver.findElement(By.xpath("//a[text()='Next']")).click();
	}
	
	public void fillGatewaySettingInTheCreateDepartmentForm() throws IOException
	{
		
		DataDriven d = new DataDriven();
		ArrayList<String> gatewaysetting=d.getdata("GatewaySetting");
		
		//Gateway URL
		driver.findElement(By.xpath("//input[@formcontrolname='EmailURLHost']")).sendKeys(gatewaysetting.get(1));
		//Username
		driver.findElement(By.xpath("//input[@formcontrolname='EmailUserName']")).sendKeys(gatewaysetting.get(2));
		//password
		driver.findElement(By.xpath("//input[@formcontrolname='EmailPassword']")).sendKeys(gatewaysetting.get(3));
		//EmailFrom
		driver.findElement(By.xpath("//input[@formcontrolname='EmailFrom']")).sendKeys(gatewaysetting.get(4));
		//SMSGateWayNumber
		driver.findElement(By.xpath("//input[@formcontrolname='SMSGateWayNumber']")).sendKeys(gatewaysetting.get(5));
		//SMSFrom
		driver.findElement(By.xpath("//input[@formcontrolname='SMSFrom']")).sendKeys(gatewaysetting.get(6));
		//AuthToken
		driver.findElement(By.xpath("//input[@formcontrolname='SMSToken']")).sendKeys(gatewaysetting.get(7));
	}
	
	public void clickFinish()
	{
		driver.findElement(By.xpath("//a[text()='Finish']")).click();
	}
	
	public void searchWithNewlyCreatedUSername() throws IOException
	{
		DataDriven d = new DataDriven();
		ArrayList<String> departmentname=d.getdata("Departmentdetails");
		driver.findElement(By.xpath("//input[@placeholder='Search By Name']")).sendKeys(departmentname.get(1));
		driver.findElement(By.xpath("//input[@placeholder='Search By Name']")).sendKeys(Keys.ENTER);
	}
	
	public void verifyNewlyCreatedDepartmentAddedInTheDepartmentList() throws IOException
	{
		DataDriven d = new DataDriven();
		ArrayList<String> departmentname=d.getdata("Departmentdetails");
		String actualtext =driver.findElement(By.xpath("(//tr/td)[1]")).getText();
		String Expectedtext = departmentname.get(1);
		Assert.assertEquals(actualtext,Expectedtext);
	}
	
	public void clickEditIcon() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//td/a/i)[1]")).click();
	}
	
	public void Wait() throws InterruptedException
	{
		Thread.sleep(3000);
	}
}
