package pearl.SmartER.TestMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;



//import excel.DataDriven;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClassMain  {

	public static WebDriver driver;

	public static WebDriver initializeDriver()
	{

		String browser = "chrome";
		//initializing the chrome driver
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("BROWSER: " + browser);

			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resource\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();

			//WebDriver driver = new FirefoxDriver();			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(co);
			//window maximize
			driver.manage().window().maximize();
			//Implicit Wait
			driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
			driver.get("https://beta.s-er.co");
			return driver;

		}
		//initializing the firefox driver
		if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			//WebDriver driver = new FirefoxDriver();
			//window maximize
			driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://beta.s-er.co");
			return driver;
		}

		//initializing the edge driver
		if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			//window maximize
			driver.manage().window().maximize();
			driver.get("https://beta.s-er.co");
			return driver;
		} 


		return driver;
	}

}


