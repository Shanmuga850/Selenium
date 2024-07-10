package normaltestcases;

import java.util.concurrent.TimeUnit;

import resource.Base;

public class Login extends Base {

	public static void main(String[] args) {
		 driver =initializeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 

	}

}
