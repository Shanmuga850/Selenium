package pearl.SmartER.Data;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import pearl.SmartER.Utils.ExcelUtil;

import pearl.SmartER.Utils.UserCredentialsExcel;

public  class DemoData {
	
//	public static WebDriver driver;
//	
//	public static  WebDriver user_credntials_data() throws IOException, InterruptedException {
//	
//	UserCredentialExcel exl_user = new UserCredentialExcel();
//	ArrayList<String> excel_data_arraylist=exl_user.getdata("projectadmin");
//	String username = excel_data_arraylist.get(1);
//	String password = excel_data_arraylist.get(2);
//	
//	System.out.println("User Name : " + username);
//	System.out.println("Password  : " +password);
//	
//	return driver;
//	}
	
	
	public static void main(String[]args) throws IOException
	{
		UserCredentialsExcel exl_user = new UserCredentialsExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("User");
		String username = excel_data_arraylist.get(1);
		String password = excel_data_arraylist.get(2);
		
		System.out.println("User Name : " + username);
		System.out.println("Password  : " +password);
	}

}
