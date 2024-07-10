package pearl.SmartER.TestMethods;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

//import excel.DataDriven;
import io.github.bonigarcia.wdm.WebDriverManager;
import pearl.SmartER.Utils.ExcelUtil;
import pearl.SmartER.Other.DateTime;
import pearl.SmartER.Utils.ConfigReader;

public class BaseClassMain extends ExcelUtil {

	public static ExtentReports extent;
	public static ExtentHtmlReporter reporter; 
	public static WebDriver driver;
	//public ExcelUtil exl_util;
	//public ArrayList<String> excel_data_arraylist;
	//public String browser;

	@BeforeSuite
	public static WebDriver initialise_Driver() throws IOException, InterruptedException
	{

		//		extent =new ExtentReports();
		//		reporter =new ExtentHtmlReporter("extendBase001.html");
		//		extent.attachReporter(reporter);

		//Weddrive initialise

		ExcelUtil exl_util = new ExcelUtil();
		ArrayList<String> excel_data_arraylist=exl_util.getdata("browser");
		String browser = excel_data_arraylist.get(1);

		//System.out.println("ARRAYLIST :" + exl_util.getdata("browser") );

		//String browser = "chrome";
		//System.out.println(excel_data_arraylist.get(1));

		//initializing the chrome driver
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("BROWSER: " + browser);

			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resource\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);

			//window maximize
			driver.manage().window().maximize();

			ConfigReader cr=new ConfigReader();
			driver.get(cr.getUrl());   // URL from config file ("https://beta.s-er.co");

			//driver.get("https://beta.s-er.co");
			return driver;

		}
		//initializing the firefox driver
		if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			//WebDriver driver = new FirefoxDriver();

			FirefoxOptions options = new FirefoxOptions();
			options.addPreference("security.fileuri.strict_origin_policy", false);
			WebDriver driver = new FirefoxDriver(options);
			//window maximize
			driver.manage().window().maximize();

			ConfigReader cr=new ConfigReader();
			driver.get(cr.getUrl());   // URL from config file ("https://beta.s-er.co");

			//driver.get("https://beta.s-er.co");
			return driver;
		}

		//initializing the edge driver
		if(browser.equalsIgnoreCase("edge"))
		{			
			WebDriverManager.edgedriver().setup();
			
			EdgeOptions options = new EdgeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			WebDriver driver = new EdgeDriver(options);
		/*	EdgeOptions options = new EdgeOptions();
			options.setCapability("ms:edgeOptions", "--allow-running-insecure-content");
			WebDriver driver = new EdgeDriver(options);   */
			
			WebDriverManager.edgedriver().setup();
			driver.get("https://beta.s-er.co");
			return driver;
		} 


		return driver;
	}

	private static FirefoxDriver FireFoxDriver(FirefoxOptions options) {
		// TODO Auto-generated method stub
		return null;
	}

	//Faisala code
	@BeforeTest
	public void beforetest()
	{

		DateTime dt=new DateTime();
		String cdt=dt.dateAndTime();

		System.out.println("c time ctc : "+ cdt);

		String report_path= "./Extent Reports/SmarterExtentReport_"+cdt+".html";
		System.out.println("Report Path : "+ report_path);


		reporter=new ExtentHtmlReporter("./Extent Reports/SmarterExtentReport_User&Survey.html");

		//reporter=new ExtentHtmlReporter(report_path);

		reporter.config().setDocumentTitle("Automation report");
		reporter.config().setReportName("Password Change");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname","localhost");
		extent.setSystemInfo("os","windows10");
		extent.setSystemInfo("testername","Dhanesh");
		extent.setSystemInfo("browsername","chrome");


	}

	@AfterTest
	public void aftertest()
	{

		extent.flush();
		//driver.quit();;

	}

	@AfterSuite
	public void tearDown()
	{

		driver.quit();

	}
}



