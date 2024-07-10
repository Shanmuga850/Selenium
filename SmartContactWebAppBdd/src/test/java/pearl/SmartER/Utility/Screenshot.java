package pearl.SmartER.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public static void captureScreenshot(WebDriver driver,String screenshotName) {
		
		//TakesScreenshot ts=(TakesScreenshot)driver;
		//File file_source=ts.getScreenshotAs(OutputType.FILE);
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File file_source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file_source,new File("./SCreenshots/"+screenshotName+".png"));
			System.out.println("Screenshot Taken");
		}
		
		catch(Exception e) {
			
			System.out.println("Exception While Taking Screenshot "+e.getMessage());
		}
		
		
	}

}
