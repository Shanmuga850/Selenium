package pearl.SmartER.Utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pearl.SmartER.TestMethods.BaseClassMain;


public class ExtendReport extends BaseClassMain {

	public static void extendReportCreation() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
		String path = System.getProperty("user.dir")+"\\Extent Reports\\dtf.format(now).html";
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path); 
		ExtentHtmlReporter html_reporter= new ExtentHtmlReporter("extendReports.html");

		//--Create ExtentReports and attach reporter(s)
		ExtentReports extent_report=new ExtentReports();
		extent_report.attachReporter(html_reporter);

		//--create a toggle for the given test,add all log events under
		ExtentTest extent_test=extent_report.createTest("SmartER test","check SmTER APPLICATION  functionality");//.createTest("google search","check gs fun");



		extent_test.log(Status.PASS,"Test Passed");
		extent_test.log(Status.FAIL, "Test Failed"); 
		extent_test.pass("TEST PASSED");
		extent_test.info("TEST COMPLETED");
		extent_report.flush();


	}




}
