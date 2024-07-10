package testidea;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.testng.TestNG;

import cucumberoptions.DepartmentRunner;
import cucumberoptions.IssuesRunner;
import cucumberoptions.LoginRunner;
import cucumberoptions.SearchRunner;
public class ExeGenerator {
	static TestNG testNG;
	public static void main(String[]args) {
			JUnitCore junit = new JUnitCore();
		  junit.addListener(new TextListener(System.out));
		  Result result = junit.run(LoginRunner.class);	
	
	/*	testNG=new TestNG();
		testNG.setTestClasses(new Class[] {LoginRunner.class});
		testNG.run();	*/
  
	}

	
}
