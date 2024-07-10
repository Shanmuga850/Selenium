package pearl.SmartER.TestMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//SmartContactWebApp

public class BaseClass {


	public static WebDriver driver;
	
	//Browser Open
	
	public static WebDriver browser_setup() throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);

		// Navigate to the Smart Contact Login
		driver.get("https://beta.s-er.co");
		Thread.sleep(10000);
		
		System.out.println("Base Class driver INSIDE is : " + driver);
		return driver;
	}


	//Browser close
	
	public static void browser_close() {
		driver.quit();

	}

}
