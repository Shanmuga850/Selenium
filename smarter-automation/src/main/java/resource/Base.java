package resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
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
			WebDriver driver = new ChromeDriver();
			return driver;

		}
		//initializing the firefox driver
		if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			//WebDriver driver = new FirefoxDriver();
			return driver;
		}

		//initializing the edge driver
		if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			return driver;
		} 


		return driver;
	}

}
