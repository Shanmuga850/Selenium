package pearl.SmartER.TestMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pearl.SmartER.PageObjects.LocationPage_Objects;
import pearl.SmartER.Utils.LocationCreationExcel;
import pearl.SmartER.Utils.UserCredentialsExcel;




public class LocationPage_TestMethods extends BaseClassMain  {
	public static WebDriver driver;

  public LocationPage_TestMethods(WebDriver driver)
		{
			this.driver=driver;
			
		}
  
  //temporary login
   public void locationpage_temporary_login() throws InterruptedException
	 {
		driver.findElement(By.xpath("//*[@formcontrolname='username']")).sendKeys("aimadmin2");
		driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys("Qwerty@123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(8000);
	 }
   
  //super admin login
   public void locationpage_superadmin_login() throws InterruptedException
	 {
		driver.findElement(By.xpath("//*[@formcontrolname='username']")).sendKeys("projectadmin");
		driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys("test@123*A");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//h4[text()='Community Hospital']")).click();
		Thread.sleep(5000);
	 }

 //verify create location button is enabled
   public void verify_create_location_button_enabled() throws InterruptedException {  
 	LocationPage_Objects lpo=new LocationPage_Objects(driver);
 	lpo.dashboard_tab_click();
 	lpo.location_tab_click();  
 	lpo.create_location_button_isEnabled();
   }
   
                        
   //create location page test cases
   
   //verify create location page is displayed
   public void verify_create_location_page_displayed() throws InterruptedException {
 	  
 		LocationPage_Objects lpo=new LocationPage_Objects(driver);
 		lpo.dashboard_tab_click();
 		lpo.location_tab_click();  
 		lpo.create_location_btn_click();
 	    String actualurl=driver.getCurrentUrl();
 	    System.out.println(actualurl);
 	    String expectedurl="https://beta.s-er.co/client/addhospital/5";
 	    Assert.assertEquals(actualurl, expectedurl);
 	
   }
   
   //verify location created sucessfully with valid details
  public void create_location_with_valid_details() throws InterruptedException, IOException {
	
		
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  //redirects to the dashboard page
	  lpo.dashboard_tab_click();
	  //redirects to the location page
	  lpo.location_tab_click();
	  //redirects to the create location page
	  lpo.create_location_btn_click();
	  //enter valid data in all the mandatory fields
	  
	  
//		---username & password taken from excel 
//			LocationCreationExcel exl_lc = new LocationCreationExcel();
//			ArrayList<String> excel_data_arraylist=exl_lc.getdata("Details");
//			Thread.sleep(3000);
			
			
			//---username & password taken from excel 
			//UserCredentialsExcel exl_user = new UserCredentialsExcel();
	LocationCreationExcel exl_user = new LocationCreationExcel();
			ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
//			String username = excel_data_arraylist.get(1);
//			String password = excel_data_arraylist.get(2); 
//			
//			System.out.println("User Name : " + username);
//			System.out.println("Password  : " +password);
			
			String name = excel_data_arraylist.get(1);
			String email  = excel_data_arraylist.get(2); 
			String contactperson = excel_data_arraylist.get(3);
			String phonenumber=excel_data_arraylist.get(4); 
			String city=excel_data_arraylist.get(5);
			String website=excel_data_arraylist.get(6);
			String subunit=excel_data_arraylist.get(7);
			String contactaddress=excel_data_arraylist.get(8);
			String logoupload=excel_data_arraylist.get(9);
			String country=excel_data_arraylist.get(10);
			String state=excel_data_arraylist.get(11);
			String prefereddate=excel_data_arraylist.get(12);
			String timezone=excel_data_arraylist.get(13);
			String starttime=excel_data_arraylist.get(14);
			String endtime=excel_data_arraylist.get(15);
			
			
			
//			System.out.println("Loc Name : " + name);
//			System.out.println("email  : " +email);
//			System.out.println("contactperson : " + contactperson);
			
//			
	   
	  lpo.name_txt_field(name); //values from excel
	  //Thread.sleep(3000);
	  lpo.email_txt_field(email);
	  //Thread.sleep(3000);
	  lpo.contactperson_txt_field(contactperson);
	  //Thread.sleep(3000);
	  lpo.phonenumber_txt_field(phonenumber);
	  lpo.city_txt_field(city);
	  lpo.website_txt_field(website);
	  lpo.subunit_txt_field(subunit);
	  lpo.contactaddress_txt_field(contactaddress);
	  lpo.logo_image_upload(logoupload);
	  lpo.country_drpdown(country);
	  lpo.state_dropdown_select(state);
	  lpo.prefereddateformat_dropdown_select(prefereddate);
	  lpo.timezone_dropdown_select(timezone);
	  LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
	  lpo.starttime_txt_field(starttime);
	  lpo.endtime_txt_field(endtime);
	  
	  
	  
	  //data saved when click on the save button
	  lpo.save_btn_click();
	  lp.scroll_up();
	  //verify success message displayed
	  lpo.sucess_message();
	  Thread.sleep(3000);
	
	  }
  
  //verify user can create location without name
    public void create_location_without_providing_name() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
	  
	  //For test
//	  UserCredentialsExcel exl_user1= new UserCredentialsExcel();
//		ArrayList<String> excel_data_arraylist1=exl_user1.getdata("User");
//		String username = excel_data_arraylist1.get(1);
//		String password = excel_data_arraylist1.get(2); 
////		
//		System.out.println("User Name : " + username);
//		System.out.println("Password  : " +password);
		
		
		
		String name = "";
		String email  = excel_data_arraylist.get(2); 
		
		String contactperson = excel_data_arraylist.get(3);
		String phonenumber=excel_data_arraylist.get(4); 
		String city=excel_data_arraylist.get(5);
		String website=excel_data_arraylist.get(6);
		String subunit=excel_data_arraylist.get(7);
		String contactaddress=excel_data_arraylist.get(8);
		String logoupload=excel_data_arraylist.get(9);
		String country=excel_data_arraylist.get(10);
		String state=excel_data_arraylist.get(11);
		String prefereddate=excel_data_arraylist.get(12);
		String timezone=excel_data_arraylist.get(13);
		String starttime=excel_data_arraylist.get(14);
		String endtime=excel_data_arraylist.get(15);
		
		
	  lpo.name_txt_field(name);
	  lpo.email_txt_field(email);
	  lpo.contactperson_txt_field(contactperson);
	  lpo.phonenumber_txt_field(phonenumber);
	  lpo.city_txt_field(city);
	  lpo.website_txt_field(website);
	  lpo.subunit_txt_field(subunit);
	  lpo.contactaddress_txt_field(contactaddress);
	  lpo.logo_image_upload(logoupload);
      lpo.country_drpdown(country);
      lpo.state_dropdown_select(state);
      lpo.prefereddateformat_dropdown_select(prefereddate);
      lpo.timezone_dropdown_select(timezone);
      LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
      lpo.starttime_txt_field(starttime);
	 lpo.endtime_txt_field(endtime);
   	  lpo.save_btn_click();
	  lpo.tooltip_message_name();
	  	  
  }
   //verify user can create location without email
  public void create_location_without_providing_valid_email() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
	  
	  //For test
//	  UserCredentialsExcel exl_user1= new UserCredentialsExcel();
//		ArrayList<String> excel_data_arraylist1=exl_user1.getdata("User");
//		String username = excel_data_arraylist1.get(1);
//		String password = excel_data_arraylist1.get(2); 
////		
//		System.out.println("User Name : " + username);
//		System.out.println("Password  : " +password);
		
		
		
		String name = excel_data_arraylist.get(1);
		String email  = ""; 
		
		String contactperson = excel_data_arraylist.get(3);
		String phonenumber=excel_data_arraylist.get(4); 
		String city=excel_data_arraylist.get(5);
		String website=excel_data_arraylist.get(6);
		String subunit=excel_data_arraylist.get(7);
		String contactaddress=excel_data_arraylist.get(8);
		String logoupload=excel_data_arraylist.get(9);
		String country=excel_data_arraylist.get(10);
		String state=excel_data_arraylist.get(11);
		String prefereddate=excel_data_arraylist.get(12);
		String timezone=excel_data_arraylist.get(13);
		String starttime=excel_data_arraylist.get(14);
		String endtime=excel_data_arraylist.get(15);
		
		
	  lpo.name_txt_field(name);
	  lpo.email_txt_field(email);
	  lpo.contactperson_txt_field(contactperson);
	  lpo.phonenumber_txt_field(phonenumber);
	  lpo.city_txt_field(city);
	  lpo.website_txt_field(website);
	  lpo.subunit_txt_field(subunit);
	  lpo.contactaddress_txt_field(contactaddress);
	  lpo.logo_image_upload(logoupload);
      lpo.country_drpdown(country);
      lpo.state_dropdown_select(state);
      lpo.prefereddateformat_dropdown_select(prefereddate);
      lpo.timezone_dropdown_select(timezone);
      LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
      lpo.starttime_txt_field(starttime);
	 lpo.endtime_txt_field(endtime);
   	  lpo.save_btn_click();
	  lpo.tooltip_message_email();
	  	  
  }
  public void create_location_without_providing_contact_person() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
	  
	  //For test
//	  UserCredentialsExcel exl_user1= new UserCredentialsExcel();
//		ArrayList<String> excel_data_arraylist1=exl_user1.getdata("User");
//		String username = excel_data_arraylist1.get(1);
//		String password = excel_data_arraylist1.get(2); 
////		
//		System.out.println("User Name : " + username);
//		System.out.println("Password  : " +password);
		
		
		
		String name = excel_data_arraylist.get(1);
		String email  = excel_data_arraylist.get(2); 
		
		String contactperson = "";
		String phonenumber=excel_data_arraylist.get(4); 
		String city=excel_data_arraylist.get(5);
		String website=excel_data_arraylist.get(6);
		String subunit=excel_data_arraylist.get(7);
		String contactaddress=excel_data_arraylist.get(8);
		String logoupload=excel_data_arraylist.get(9);
		String country=excel_data_arraylist.get(10);
		String state=excel_data_arraylist.get(11);
		String prefereddate=excel_data_arraylist.get(12);
		String timezone=excel_data_arraylist.get(13);
		String starttime=excel_data_arraylist.get(14);
		String endtime=excel_data_arraylist.get(15);
		
		
	  lpo.name_txt_field(name);
	  lpo.email_txt_field(email);
	  lpo.contactperson_txt_field(contactperson);
	  lpo.phonenumber_txt_field(phonenumber);
	  lpo.city_txt_field(city);
	  lpo.website_txt_field(website);
	  lpo.subunit_txt_field(subunit);
	  lpo.contactaddress_txt_field(contactaddress);
	  lpo.logo_image_upload(logoupload);
      lpo.country_drpdown(country);
      lpo.state_dropdown_select(state);
      lpo.prefereddateformat_dropdown_select(prefereddate);
      lpo.timezone_dropdown_select(timezone);
      LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
      lpo.starttime_txt_field(starttime);
	 lpo.endtime_txt_field(endtime);
   	  lpo.save_btn_click();
	  lpo.tooltip_message_contactperson();
	  	  
  }
  
  //verify user can create location without phone number
  public void create_location_without_providing_phoneNumber_field() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
	  
	  //For test
//	  UserCredentialsExcel exl_user1= new UserCredentialsExcel();
//		ArrayList<String> excel_data_arraylist1=exl_user1.getdata("User");
//		String username = excel_data_arraylist1.get(1);
//		String password = excel_data_arraylist1.get(2); 
////		
//		System.out.println("User Name : " + username);
//		System.out.println("Password  : " +password);
		
		
		
		String name = excel_data_arraylist.get(1);
		String email  = excel_data_arraylist.get(2); 
		
		String contactperson = excel_data_arraylist.get(3);
		String phonenumber=""; 
		String city=excel_data_arraylist.get(5);
		String website=excel_data_arraylist.get(6);
		String subunit=excel_data_arraylist.get(7);
		String contactaddress=excel_data_arraylist.get(8);
		String logoupload=excel_data_arraylist.get(9);
		String country=excel_data_arraylist.get(10);
		String state=excel_data_arraylist.get(11);
		String prefereddate=excel_data_arraylist.get(12);
		String timezone=excel_data_arraylist.get(13);
		String starttime=excel_data_arraylist.get(14);
		String endtime=excel_data_arraylist.get(15);
		
		
	  lpo.name_txt_field(name);
	  lpo.email_txt_field(email);
	  lpo.contactperson_txt_field(contactperson);
	  lpo.phonenumber_txt_field(phonenumber);
	  lpo.city_txt_field(city);
	  lpo.website_txt_field(website);
	  lpo.subunit_txt_field(subunit);
	  lpo.contactaddress_txt_field(contactaddress);
	  lpo.logo_image_upload(logoupload);
      lpo.country_drpdown(country);
      lpo.state_dropdown_select(state);
      lpo.prefereddateformat_dropdown_select(prefereddate);
      lpo.timezone_dropdown_select(timezone);
      LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
      lpo.starttime_txt_field(starttime);
	 lpo.endtime_txt_field(endtime);
   	  lpo.save_btn_click();
	  lpo.tooltip_message_phonenumber();
	  	  
  }
  //verify user can create location without city
  public void create_location_without_providing_city_field() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
	  
	  //For test
//	  UserCredentialsExcel exl_user1= new UserCredentialsExcel();
//		ArrayList<String> excel_data_arraylist1=exl_user1.getdata("User");
//		String username = excel_data_arraylist1.get(1);
//		String password = excel_data_arraylist1.get(2); 
////		
//		System.out.println("User Name : " + username);
//		System.out.println("Password  : " +password);
		
		
		
		String name = excel_data_arraylist.get(1);
		String email  = excel_data_arraylist.get(2); 
		
		String contactperson = excel_data_arraylist.get(3);
		String phonenumber=excel_data_arraylist.get(4); 
		String city="";
		String website=excel_data_arraylist.get(6);
		String subunit=excel_data_arraylist.get(7);
		String contactaddress=excel_data_arraylist.get(8);
		String logoupload=excel_data_arraylist.get(9);
		String country=excel_data_arraylist.get(10);
		String state=excel_data_arraylist.get(11);
		String prefereddate=excel_data_arraylist.get(12);
		String timezone=excel_data_arraylist.get(13);
		String starttime=excel_data_arraylist.get(14);
		String endtime=excel_data_arraylist.get(15);
		
		
	  lpo.name_txt_field(name);
	  lpo.email_txt_field(email);
	  lpo.contactperson_txt_field(contactperson);
	  lpo.phonenumber_txt_field(phonenumber);
	  lpo.city_txt_field(city);
	  lpo.website_txt_field(website);
	  lpo.subunit_txt_field(subunit);
	  lpo.contactaddress_txt_field(contactaddress);
	  lpo.logo_image_upload(logoupload);
      lpo.country_drpdown(country);
      lpo.state_dropdown_select(state);
      lpo.prefereddateformat_dropdown_select(prefereddate);
      lpo.timezone_dropdown_select(timezone);
      LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
      lpo.starttime_txt_field(starttime);
	 lpo.endtime_txt_field(endtime);
   	  lpo.save_btn_click();
	  lpo.tooltip_message_city();
	  	  
  }
  //verify user can create location without website
  public void create_location_without_providing_website_field() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
	  
	  //For test
//	  UserCredentialsExcel exl_user1= new UserCredentialsExcel();
//		ArrayList<String> excel_data_arraylist1=exl_user1.getdata("User");
//		String username = excel_data_arraylist1.get(1);
//		String password = excel_data_arraylist1.get(2); 
////		
//		System.out.println("User Name : " + username);
//		System.out.println("Password  : " +password);
		
		
		
		String name = excel_data_arraylist.get(1);
		String email  = excel_data_arraylist.get(2); 
		
		String contactperson = excel_data_arraylist.get(3);
		String phonenumber=excel_data_arraylist.get(4);
		String city=excel_data_arraylist.get(5);
		String website="";
		String subunit=excel_data_arraylist.get(7);
		String contactaddress=excel_data_arraylist.get(8);
		String logoupload=excel_data_arraylist.get(9);
		String country=excel_data_arraylist.get(10);
		String state=excel_data_arraylist.get(11);
		String prefereddate=excel_data_arraylist.get(12);
		String timezone=excel_data_arraylist.get(13);
		String starttime=excel_data_arraylist.get(14);
		String endtime=excel_data_arraylist.get(15);
		
		
	  lpo.name_txt_field(name);
	  lpo.email_txt_field(email);
	  lpo.contactperson_txt_field(contactperson);
	  lpo.phonenumber_txt_field(phonenumber);
	  lpo.city_txt_field(city);
	  lpo.website_txt_field(website);
	  lpo.subunit_txt_field(subunit);
	  lpo.contactaddress_txt_field(contactaddress);
	  lpo.logo_image_upload(logoupload);
      lpo.country_drpdown(country);
      lpo.state_dropdown_select(state);
      lpo.prefereddateformat_dropdown_select(prefereddate);
      lpo.timezone_dropdown_select(timezone);
      LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
      lpo.starttime_txt_field(starttime);
	 lpo.endtime_txt_field(endtime);
   	  lpo.save_btn_click();
	  lpo.tooltip_message_website();
	  	  
  }
  
  //verify user can create location without subunit
  public void create_location_without_providing_subunit_field() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
	  
	  //For test
//	  UserCredentialsExcel exl_user1= new UserCredentialsExcel();
//		ArrayList<String> excel_data_arraylist1=exl_user1.getdata("User");
//		String username = excel_data_arraylist1.get(1);
//		String password = excel_data_arraylist1.get(2); 
////		
//		System.out.println("User Name : " + username);
//		System.out.println("Password  : " +password);
		
		
		
		String name = excel_data_arraylist.get(1);
		String email  = excel_data_arraylist.get(2); 
		
		String contactperson = excel_data_arraylist.get(3);
		String phonenumber=excel_data_arraylist.get(4); 
		String city=excel_data_arraylist.get(5);
		String website=excel_data_arraylist.get(6);
		String subunit="";
		String contactaddress=excel_data_arraylist.get(8);
		String logoupload=excel_data_arraylist.get(9);
		String country=excel_data_arraylist.get(10);
		String state=excel_data_arraylist.get(11);
		String prefereddate=excel_data_arraylist.get(12);
		String timezone=excel_data_arraylist.get(13);
		String starttime=excel_data_arraylist.get(14);
		String endtime=excel_data_arraylist.get(15);
		
		
	  lpo.name_txt_field(name);
	  lpo.email_txt_field(email);
	  lpo.contactperson_txt_field(contactperson);
	  lpo.phonenumber_txt_field(phonenumber);
	  lpo.city_txt_field(city);
	  lpo.website_txt_field(website);
	  lpo.subunit_txt_field(subunit);
	  lpo.contactaddress_txt_field(contactaddress);
	  lpo.logo_image_upload(logoupload);
      lpo.country_drpdown(country);
      lpo.state_dropdown_select(state);
      lpo.prefereddateformat_dropdown_select(prefereddate);
      lpo.timezone_dropdown_select(timezone);
      LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
      lpo.starttime_txt_field(starttime);
	 lpo.endtime_txt_field(endtime);
   	  lpo.save_btn_click();
	  lpo.tooltip_message_subunit();
	  	  
  }
  //verify user can create location without contact address
  public void create_location_without_providing_contactAddress_field() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
	  
	  //For test
//	  UserCredentialsExcel exl_user1= new UserCredentialsExcel();
//		ArrayList<String> excel_data_arraylist1=exl_user1.getdata("User");
//		String username = excel_data_arraylist1.get(1);
//		String password = excel_data_arraylist1.get(2); 
////		
//		System.out.println("User Name : " + username);
//		System.out.println("Password  : " +password);
		
		
		
		String name = excel_data_arraylist.get(1);
		String email  = excel_data_arraylist.get(2); 
		
		String contactperson = excel_data_arraylist.get(3);
		String phonenumber=excel_data_arraylist.get(4);
		String city=excel_data_arraylist.get(5);
		String website=excel_data_arraylist.get(6);
		String subunit=excel_data_arraylist.get(7);
		String contactaddress="";
		String logoupload=excel_data_arraylist.get(9);
		String country=excel_data_arraylist.get(10);
		String state=excel_data_arraylist.get(11);
		String prefereddate=excel_data_arraylist.get(12);
		String timezone=excel_data_arraylist.get(13);
		String starttime=excel_data_arraylist.get(14);
		String endtime=excel_data_arraylist.get(15);
		
		
	  lpo.name_txt_field(name);
	  lpo.email_txt_field(email);
	  lpo.contactperson_txt_field(contactperson);
	  lpo.phonenumber_txt_field(phonenumber);
	  lpo.city_txt_field(city);
	  lpo.website_txt_field(website);
	  lpo.subunit_txt_field(subunit);
	  lpo.contactaddress_txt_field(contactaddress);
	  lpo.logo_image_upload(logoupload);
      lpo.country_drpdown(country);
      lpo.state_dropdown_select(state);
      lpo.prefereddateformat_dropdown_select(prefereddate);
      lpo.timezone_dropdown_select(timezone);
      LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
      lpo.starttime_txt_field(starttime);
	 lpo.endtime_txt_field(endtime);
   	  lpo.save_btn_click();
	  lpo.tooltip_message_contactaddress();
	  	  
  }
  //verify user can create location without selecting country
  public void create_location_without_selecting_country_dropdown() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
	  
	  //For test
//	  UserCredentialsExcel exl_user1= new UserCredentialsExcel();
//		ArrayList<String> excel_data_arraylist1=exl_user1.getdata("User");
//		String username = excel_data_arraylist1.get(1);
//		String password = excel_data_arraylist1.get(2); 
////		
//		System.out.println("User Name : " + username);
//		System.out.println("Password  : " +password);
		
		
		
		String name = excel_data_arraylist.get(1);
		String email  = excel_data_arraylist.get(2); 
		
		String contactperson = excel_data_arraylist.get(3);
		String phonenumber=excel_data_arraylist.get(4); 
		String city=excel_data_arraylist.get(5);
		String website=excel_data_arraylist.get(6);
		String subunit=excel_data_arraylist.get(7);
		String contactaddress=excel_data_arraylist.get(8);
		String logoupload=excel_data_arraylist.get(9);
		//String country="";
		//String state=excel_data_arraylist.get(11);
		String prefereddate=excel_data_arraylist.get(12);
		String timezone=excel_data_arraylist.get(13);
		String starttime=excel_data_arraylist.get(14);
		String endtime=excel_data_arraylist.get(15);
		
		
	  lpo.name_txt_field(name);
	  lpo.email_txt_field(email);
	  lpo.contactperson_txt_field(contactperson);
	  lpo.phonenumber_txt_field(phonenumber);
	  lpo.city_txt_field(city);
	  lpo.website_txt_field(website);
	  lpo.subunit_txt_field(subunit);
	  lpo.contactaddress_txt_field(contactaddress);
	  lpo.logo_image_upload(logoupload);
      //lpo.country_drpdown(country);
      //lpo.state_dropdown_select(state);
      lpo.prefereddateformat_dropdown_select(prefereddate);
      lpo.timezone_dropdown_select(timezone);
      LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
      lpo.starttime_txt_field(starttime);
	 lpo.endtime_txt_field(endtime);
   	  lpo.save_btn_click();
	  lpo.tooltip_message_country();
	  	  
  }
  //verify user can create location without selecting state
  public void create_location_without_selecting_state_dropdown() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
	  
	  //For test
//	  UserCredentialsExcel exl_user1= new UserCredentialsExcel();
//		ArrayList<String> excel_data_arraylist1=exl_user1.getdata("User");
//		String username = excel_data_arraylist1.get(1);
//		String password = excel_data_arraylist1.get(2); 
////		
//		System.out.println("User Name : " + username);
//		System.out.println("Password  : " +password);
		
		
		
		String name = excel_data_arraylist.get(1);
		String email  = excel_data_arraylist.get(2); 
		
		String contactperson = excel_data_arraylist.get(3);
		String phonenumber=excel_data_arraylist.get(4); 
		String city=excel_data_arraylist.get(5);
		String website=excel_data_arraylist.get(6);
		String subunit=excel_data_arraylist.get(7);
		String contactaddress=excel_data_arraylist.get(8);
		String logoupload=excel_data_arraylist.get(9);
		String country=excel_data_arraylist.get(10);
		//String state="";
		String prefereddate=excel_data_arraylist.get(12);
		String timezone=excel_data_arraylist.get(13);
		String starttime=excel_data_arraylist.get(14);
		String endtime=excel_data_arraylist.get(15);
		
		
	  lpo.name_txt_field(name);
	  lpo.email_txt_field(email);
	  lpo.contactperson_txt_field(contactperson);
	  lpo.phonenumber_txt_field(phonenumber);
	  lpo.city_txt_field(city);
	  lpo.website_txt_field(website);
	  lpo.subunit_txt_field(subunit);
	  lpo.contactaddress_txt_field(contactaddress);
	  lpo.logo_image_upload(logoupload);
      lpo.country_drpdown(country);
      //lpo.state_dropdown_select(state);
      lpo.prefereddateformat_dropdown_select(prefereddate);
      lpo.timezone_dropdown_select(timezone);
      LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
      lpo.starttime_txt_field(starttime);
	 lpo.endtime_txt_field(endtime);
   	  lpo.save_btn_click();
	  lpo.tooltip_message_state();
	  	  
  }
//verify user can create location without selecting prefered date format
  public void create_location_without_selecting_preferedDateFormat_dropdown() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
	  
	  //For test
//	  UserCredentialsExcel exl_user1= new UserCredentialsExcel();
//		ArrayList<String> excel_data_arraylist1=exl_user1.getdata("User");
//		String username = excel_data_arraylist1.get(1);
//		String password = excel_data_arraylist1.get(2); 
////		
//		System.out.println("User Name : " + username);
//		System.out.println("Password  : " +password);
		
		
		
		String name = excel_data_arraylist.get(1);
		String email  = excel_data_arraylist.get(2); 
		
		String contactperson = excel_data_arraylist.get(3);
		String phonenumber=excel_data_arraylist.get(4); 
		String city=excel_data_arraylist.get(5);
		String website=excel_data_arraylist.get(6);
		String subunit=excel_data_arraylist.get(7);
		String contactaddress=excel_data_arraylist.get(8);
		String logoupload=excel_data_arraylist.get(9);
		String country=excel_data_arraylist.get(10);
		String state=excel_data_arraylist.get(11);
		//String prefereddate="";
		String timezone=excel_data_arraylist.get(13);
		String starttime=excel_data_arraylist.get(14);
		String endtime=excel_data_arraylist.get(15);
		
		
	  lpo.name_txt_field(name);
	  lpo.email_txt_field(email);
	  lpo.contactperson_txt_field(contactperson);
	  lpo.phonenumber_txt_field(phonenumber);
	  lpo.city_txt_field(city);
	  lpo.website_txt_field(website);
	  lpo.subunit_txt_field(subunit);
	  lpo.contactaddress_txt_field(contactaddress);
	  lpo.logo_image_upload(logoupload);
      lpo.country_drpdown(country);
      lpo.state_dropdown_select(state);
     // lpo.prefereddateformat_dropdown_select(prefereddate);
      lpo.timezone_dropdown_select(timezone);
      LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
      lpo.starttime_txt_field(starttime);
	 lpo.endtime_txt_field(endtime);
   	  lpo.save_btn_click();
	  lpo.tooltip_message_dateformat();
	  	  
  }
  //verify user can create location without selecting timezone
  public void create_location_without_selecting_timeZone_dropdown() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
	  
	  //For test
//	  UserCredentialsExcel exl_user1= new UserCredentialsExcel();
//		ArrayList<String> excel_data_arraylist1=exl_user1.getdata("User");
//		String username = excel_data_arraylist1.get(1);
//		String password = excel_data_arraylist1.get(2); 
////		
//		System.out.println("User Name : " + username);
//		System.out.println("Password  : " +password);
		
		
		
		String name = excel_data_arraylist.get(1);
		String email  = excel_data_arraylist.get(2); 
		
		String contactperson = excel_data_arraylist.get(3);
		String phonenumber=excel_data_arraylist.get(4);
		String city=excel_data_arraylist.get(5);
		String website=excel_data_arraylist.get(6);
		String subunit=excel_data_arraylist.get(7);
		String contactaddress=excel_data_arraylist.get(8);
		String logoupload=excel_data_arraylist.get(9);
		String country=excel_data_arraylist.get(10);
		String state=excel_data_arraylist.get(11);
		String prefereddate=excel_data_arraylist.get(12);
		//String timezone="";
		String starttime=excel_data_arraylist.get(14);
		String endtime=excel_data_arraylist.get(15);
		
		
	  lpo.name_txt_field(name);
	  lpo.email_txt_field(email);
	  lpo.contactperson_txt_field(contactperson);
	  lpo.phonenumber_txt_field(phonenumber);
	  lpo.city_txt_field(city);
	  lpo.website_txt_field(website);
	  lpo.subunit_txt_field(subunit);
	  lpo.contactaddress_txt_field(contactaddress);
	  lpo.logo_image_upload(logoupload);
      lpo.country_drpdown(country);
      lpo.state_dropdown_select(state);
      lpo.prefereddateformat_dropdown_select(prefereddate);
      //lpo.timezone_dropdown_select(timezone);
      LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
      lpo.starttime_txt_field(starttime);
	 lpo.endtime_txt_field(endtime);
   	  lpo.save_btn_click();
	  lpo.tooltip_message_timezone();
	  	  
  }
  
  //verify user can create location with already existing name
  public void create_location_with_already_existing_name() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
	  
	  //For test
//	  UserCredentialsExcel exl_user1= new UserCredentialsExcel();
//		ArrayList<String> excel_data_arraylist1=exl_user1.getdata("User");
//		String username = excel_data_arraylist1.get(1);
//		String password = excel_data_arraylist1.get(2); 
////		
//		System.out.println("User Name : " + username);
//		System.out.println("Password  : " +password);
		
		
		
		String name = excel_data_arraylist.get(17);
		String email  = excel_data_arraylist.get(2); 
		
		String contactperson = excel_data_arraylist.get(3);
		String phonenumber=excel_data_arraylist.get(4); 
		String city=excel_data_arraylist.get(5);
		String website=excel_data_arraylist.get(6);
		String subunit=excel_data_arraylist.get(7);
		String contactaddress=excel_data_arraylist.get(8);
		String logoupload=excel_data_arraylist.get(9);
		String country=excel_data_arraylist.get(10);
		String state=excel_data_arraylist.get(11);
		String prefereddate=excel_data_arraylist.get(12);
		String timezone=excel_data_arraylist.get(13);
		String starttime=excel_data_arraylist.get(14);
		String endtime=excel_data_arraylist.get(15);
		
		
	  lpo.name_txt_field(name);
	  lpo.email_txt_field(email);
	  lpo.contactperson_txt_field(contactperson);
	  lpo.phonenumber_txt_field(phonenumber);
	  lpo.city_txt_field(city);
	  lpo.website_txt_field(website);
	  lpo.subunit_txt_field(subunit);
	  lpo.contactaddress_txt_field(contactaddress);
	  lpo.logo_image_upload(logoupload);
      lpo.country_drpdown(country);
      lpo.state_dropdown_select(state);
      lpo.prefereddateformat_dropdown_select(prefereddate);
      lpo.timezone_dropdown_select(timezone);
      LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
      lpo.starttime_txt_field(starttime);
	 lpo.endtime_txt_field(endtime);
   	  lpo.save_btn_click();
	  lpo.already_exist_message();
  }
  
  //verify user can create location with blank data
  public void create_location_with__blankData() throws InterruptedException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  lpo.save_btn_click();
	  LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_up(); 
	  lpo.tooltip_message_name();
	  lpo.tooltip_message_email();
	  lpo.tooltip_message_contactperson();
	  lpo.tooltip_message_phonenumber();
	  lpo.tooltip_message_website();
	  lpo.tooltip_message_subunit();
	  lpo.tooltip_message_contactaddress();
	  lpo.tooltip_message_country();
	  lpo.tooltip_message_state();
	  lpo.tooltip_message_timezone();
	  lpo.tooltip_message_dateformat();
	  lpo.tooltip_message_city();
			  
}
  public void verify_create_location_with_optional_field_blank() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
	  
	  //For test
//	  UserCredentialsExcel exl_user1= new UserCredentialsExcel();
//		ArrayList<String> excel_data_arraylist1=exl_user1.getdata("User");
//		String username = excel_data_arraylist1.get(1);
//		String password = excel_data_arraylist1.get(2); 
////		
//		System.out.println("User Name : " + username);
//		System.out.println("Password  : " +password);
		
		
		
		String newname = excel_data_arraylist.get(23);
		String email  = excel_data_arraylist.get(2); 
		
		String contactperson = excel_data_arraylist.get(3);
		String phonenumber=excel_data_arraylist.get(4); 
		String city=excel_data_arraylist.get(5);
		String website=excel_data_arraylist.get(6);
		String subunit=excel_data_arraylist.get(7);
		String contactaddress=excel_data_arraylist.get(8);
		//String logoupload="";
		String country=excel_data_arraylist.get(10);
		String state=excel_data_arraylist.get(11);
		String prefereddate=excel_data_arraylist.get(12);
		String timezone=excel_data_arraylist.get(13);
		//String starttime="";
		//String endtime="";
		
		
	  lpo.name_txt_field(newname);
	  lpo.email_txt_field(email);
	  lpo.contactperson_txt_field(contactperson);
	  lpo.phonenumber_txt_field(phonenumber);
	  lpo.city_txt_field(city);
	  lpo.website_txt_field(website);
	  lpo.subunit_txt_field(subunit);
	  lpo.contactaddress_txt_field(contactaddress);
	  //lpo.logo_image_upload(logoupload);
      lpo.country_drpdown(country);
      lpo.state_dropdown_select(state);
      lpo.prefereddateformat_dropdown_select(prefereddate);
      lpo.timezone_dropdown_select(timezone);
      LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
      //lpo.starttime_txt_field(starttime);
	  //lpo.endtime_txt_field(endtime);
   	  lpo.save_btn_click();
	  lpo.alertmessage();
	  
	
			  
}
  
  //verify invalid email format
  public void email_validation() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
		String invalidEmail = excel_data_arraylist.get(24);
	  lpo.email_txt_field(invalidEmail);
	  lpo.email_validation(); 
  }
  
  //verify character length of name is as per the requirement
  
  public void character_length_of_name_field() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
		String invalidname = excel_data_arraylist.get(26);
	  lpo.name_txt_field(invalidname);
	  lpo.character_length_of_name();
	  
  }
  
  //verify phone number validation
  public void validating_phone_number_field( ) throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click(); 
	  LocationCreationExcel exl_user = new LocationCreationExcel();
	  ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
		String invalidPhnNum = excel_data_arraylist.get(25);
	  lpo.phone_num_validation(invalidPhnNum);
  }
  
 //verify the functionality of status dropdown
  public void verify_status_dropdown_functionality( ) throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  Thread.sleep(3000);
	  lpo.select_page_count();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
	  ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
	  String locname = excel_data_arraylist.get(16);
	  lpo.search_txt_field(locname);
	  lpo.press_enterkey();
	  Thread.sleep(5000);
	  lpo.edit_icon_click();
	  lpo.status_dropdown("Inactive");
      lpo.save_btn_click();
	  Thread.sleep(5000);
//	  String actualtext1="Location2";
//	  lpo.search_txt_field(actualtext1);
//	  lpo.press_enterkey();
//	  Thread.sleep(5000);
	  LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.location_allName_data(locname);  
	  
  }
  

  //verify website field validation
   public void verify_website_field_validation() throws InterruptedException, IOException {
	   LocationPage_Objects lpo=new LocationPage_Objects(driver);
		  lpo.dashboard_tab_click();
		  lpo.location_tab_click();
		  lpo.create_location_btn_click(); 
		  LocationCreationExcel exl_user = new LocationCreationExcel();
		  ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
		  String website = excel_data_arraylist.get(27);
		 
		 lpo.website_txt_field(website);
		  if(website.contains(".co")) {
			  System.out.println("valid");
		  }
		  else {
			  System.out.println("invalid");
		  }
		  }
   

  //verify user can select a country and the selected country is displayed correctly
  public void verify_user_can_select_country() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  
      WebElement dropdown = driver.findElement(By.xpath("(//select[@name='Country'])[1]")); 
      if(dropdown.isEnabled() && dropdown.isDisplayed())
      { 
    	  System.out.println("Dropdown is enabled and visible"); 
    	  } 
      else { System.out.println("Dropdown is not visible"); }
      LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
		String country=excel_data_arraylist.get(10);
      Select select = new Select(dropdown); 
      int listSize = select.getOptions().size(); 
      System.out.println("List size: " +listSize); 
      select.selectByVisibleText(country);
      String getText = select.getFirstSelectedOption().getText();
      System.out.println("Option chosen: " +getText); 
      Assert.assertEquals(getText, country);
  }
  
  //verify country list displayed
      public void verify_country_list_displayed() throws InterruptedException {
    	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
    	  lpo.dashboard_tab_click();
    	  lpo.location_tab_click();
    	  lpo.create_location_btn_click();
          WebElement dropdown = driver.findElement(By.xpath("(//select[@name='Country'])[1]")); 
          Select select = new Select(dropdown); 
          List<WebElement>allelements = select.getOptions();
          int size=allelements.size();
          for(int i=0;i<size;i++)
          {
        	 String options=allelements.get(i).getText();
        	 System.out.println(options); 
          }
          System.out.println("Countrylist " +allelements); 
      }
     
        
      //verify country list is sorted
      public void verify_country_list_is_sorted() throws InterruptedException {
    	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
    	  lpo.dashboard_tab_click();
    	  lpo.location_tab_click();
    	  lpo.create_location_btn_click();
    	  WebElement dropdown = driver.findElement(By.xpath("(//select[@name='Country'])[1]"));
    	  Select drp=new Select(dropdown);
    	  List<WebElement>allElements=drp.getOptions();
    	  List originalList=new ArrayList();
    	  for(WebElement ele:allElements) {
    		  originalList.add(ele.getText()); }
    	  System.out.println("The available country list is "+ originalList);
    	  //temporary list
    	  List temporaryList=new ArrayList(originalList);
    	  System.out.println ( "Temporary list is "+ temporaryList); 
    	  Collections.sort(temporaryList);
    	  System.out.println("Sorted list is "+ temporaryList);
    	 if(originalList.equals(temporaryList)) {
    		 System.out.println("Sorted");
    		 }
    	 else {
    		 System.out.println("not sorted");
    	 }
    	 } 	 
        
      //verify_data_populated_in_state_dropdown_after_selecting_country
      public void verify_data_populated_in_state_dropdown_after_selecting_country() throws InterruptedException, IOException {
    	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
    	  lpo.dashboard_tab_click();
    	  lpo.location_tab_click();
    	  lpo.create_location_btn_click();
    	  LocationCreationExcel exl_user = new LocationCreationExcel();
    	  ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
  		String country=excel_data_arraylist.get(10);
          lpo.country_drpdown(country);
          Thread.sleep(3000);
          WebElement dropdown = driver.findElement(By.xpath("(//select[@name='State'])[1]")); 
          
		
          Select select = new Select(dropdown); 
          List<WebElement>allelements = select.getOptions();
          int size=allelements.size();
          for(int i=0;i<size;i++)
          {
        	 String options=allelements.get(i).getText();
        	 System.out.println(options); 
          }
          System.out.println("Statelist " +allelements); 
      }
          
  //verify start time format validation 
      public void startTime_format_validation() throws InterruptedException, IOException {
    	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
    	  lpo.dashboard_tab_click();
    	  lpo.location_tab_click();
    	  lpo.create_location_btn_click();
    	  LocationCreationExcel exl_user = new LocationCreationExcel();
    	  ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
    	  String invalidStartTime = excel_data_arraylist.get(28);
    	  lpo.starttime_txt_field(invalidStartTime);
    	  lpo.start_time_format_validation(); 
      }
      
    //verify end time format validation  
      public void endTime_format_validation() throws InterruptedException, IOException {
    	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
    	  lpo.dashboard_tab_click();
    	  lpo.location_tab_click();
    	  lpo.create_location_btn_click();
    	  LocationCreationExcel exl_user = new LocationCreationExcel();
    	  ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
    	  String invalidEndTime = excel_data_arraylist.get(29);  
    	  lpo.endtime_txt_field(invalidEndTime);
    	  lpo.end_time_format_validation();  
      }
      
//Verify back button redirect to location page
  public void verify_back_button_navigates_to_locationPage() throws InterruptedException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  lpo.back_btn_click();
	  Thread.sleep(3000);
	  String actualurl=driver.getCurrentUrl();
	  System.out.println(actualurl);
	  String expectedurl="https://beta.s-er.co/client/hospitals/5";
	  Assert.assertEquals(actualurl, expectedurl);
  }
  
//Verify data populated using clone dropdown
  public void verify_data_populated_using_clone_dropDown() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click(); 
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
		String locname = excel_data_arraylist.get(21);
	  lpo.clone_from_drpdown(locname);
	  String clonefrom = excel_data_arraylist.get(16);
	  lpo.name_txt_field(clonefrom);
	  Thread.sleep(2000);
	  lpo.save_btn_click();
	  lpo.alertmessage();
  }
  
  
  //verify logo uploading
  public void verify_user_can_upload_logo() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  lpo.create_location_btn_click();
	  LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
	  ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
	  String logoupload=excel_data_arraylist.get(9);
	  lpo.upload_logo(logoupload);
	  
  }
  
 
                    //location page test cases
  
//verify client dropdown disabled
 public void client_drpdwn__isEnabled() throws InterruptedException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click(); 
	  lpo.client_drpdwn();
 }
  
  //verify view department icon redirect to department page
  public void verify_view_department_Icon_redirects_to_department_page() throws InterruptedException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
		lpo.dashboard_tab_click();
		lpo.location_tab_click();
		Thread.sleep(3000);
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.scroll_down();
		lpo.view_icon_click();
		Thread.sleep(3000);
		lpo.department_txt_isDisplayed();  	
  }
  
//verify edit button redirect to update hospital page
  public void verify_edit_button_redirects_to_updateHospital_page() throws InterruptedException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
	  lpo.edit_icon_click();
	  String expectedUrl="https://beta.s-er.co/client/updatehospital/4/5";
	  String actualUrl=driver.getCurrentUrl();
	  Assert.assertEquals(actualUrl, expectedUrl);	 
  }
  
  //verify confirmation message displayed when user clicks on the delete button
  public void verify_delete_confirmation_dialogbox_displayed() throws InterruptedException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.scroll_down();
	  lpo.delete_icon_click();
	  lpo.confirmationMessage_display();
  }
  
  //verify user can edit location name
  
  public void verify_user_can_edit_location_name() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
		lpo.dashboard_tab_click();
		lpo.location_tab_click();
		Thread.sleep(3000);
		lpo.select_page_count();
		LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
		String name = excel_data_arraylist.get(1);
		lpo.search_txt_field(name);
		lpo.press_enterkey();
		Thread.sleep(5000);
		lpo.edit_icon_click();
		String newLocationName=excel_data_arraylist.get(17);
		lpo.name_txt_field(newLocationName);
		lpo.save_btn_click();
		Thread.sleep(5000);
		lpo.select_page_count();
		lpo.search_txt_field(newLocationName);
		lpo.press_enterkey();
		Thread.sleep(5000);
		//LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		//lp.location_column_data_1(newLocationName);
		
  }
  
 //verify user can edit contact person name
  
  public void verify_user_can_edit_contact_person_name() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
		lpo.dashboard_tab_click();
		lpo.location_tab_click();
		Thread.sleep(3000);
		lpo.select_page_count();
		LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
		String newLocationName=excel_data_arraylist.get(17);
		lpo.search_txt_field(newLocationName);
		lpo.press_enterkey();
		Thread.sleep(5000);
		lpo.edit_icon_click();
		String contactPersonNew=excel_data_arraylist.get(18);
		lpo.contactperson_txt_field(contactPersonNew);
		lpo.save_btn_click();
		Thread.sleep(5000);
		lpo.select_page_count();
		lpo.search_txt_field(newLocationName);
		lpo.press_enterkey();
		Thread.sleep(5000);
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.location_column_data_1(contactPersonNew);
  }
  
//verify user can edit phone number
  public void verify_user_can_edit_phoneNumber() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
		lpo.dashboard_tab_click();
		lpo.location_tab_click();
		Thread.sleep(3000);
		lpo.select_page_count();
		LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
		String newLocationName=excel_data_arraylist.get(17);
		lpo.search_txt_field(newLocationName);
		lpo.press_enterkey();
		Thread.sleep(5000);
		lpo.edit_icon_click();
		String phoneNumnew=excel_data_arraylist.get(19);
		lpo.phonenumber_txt_field(phoneNumnew);
		lpo.save_btn_click();
		Thread.sleep(5000);
		lpo.select_page_count();
		lpo.search_txt_field(newLocationName);
		lpo.press_enterkey();
		Thread.sleep(5000);
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.location_column_data_1(phoneNumnew);
  }
//verify user can edit email
  public void verify_user_can_edit_email() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
		lpo.dashboard_tab_click();
		lpo.location_tab_click();
		Thread.sleep(3000);
		lpo.select_page_count();
		LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
		String newLocationName=excel_data_arraylist.get(17);
		lpo.search_txt_field(newLocationName);
		lpo.press_enterkey();
		Thread.sleep(5000);
		lpo.edit_icon_click();
		String newEmail=excel_data_arraylist.get(20);
		lpo.email_txt_field(newEmail);
		lpo.save_btn_click();
		Thread.sleep(5000);
		lpo.select_page_count();
		lpo.search_txt_field(newLocationName);
		lpo.press_enterkey();
		Thread.sleep(5000);
		LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
		lp.location_column_data_1(newEmail);
		
  }
  
  //Verify Search functionality in the 'location' page by entering a valid search keyword
  public void verify_search_field_functionality() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  Thread.sleep(2000);
	  lpo.select_page_count();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
	  ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
	  String searchName=excel_data_arraylist.get(21);
	  lpo.search_txt_field(searchName);
	  lpo.press_enterkey();
	  Thread.sleep(5000);
	  LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.location_allName_data(searchName);
  }
  
 
  //verify delete functionality
  public void verify_delete_functionality() throws InterruptedException, IOException {
	  LocationPage_Objects lpo=new LocationPage_Objects(driver);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  Thread.sleep(2000);
	  lpo.select_page_count();
	  LocationCreationExcel exl_user = new LocationCreationExcel();
		ArrayList<String> excel_data_arraylist=exl_user.getdata("Details");
		String newLocationName=excel_data_arraylist.get(17);
	 
	  lpo.search_txt_field(newLocationName);
	  lpo.press_enterkey();
	  Thread.sleep(5000);
	  lpo.delete_icon_click();
	  lpo.confirm_delete();
	  Thread.sleep(2000);
	  //click on the confirm msg
	  lpo.confirmOK();
	  Thread.sleep(2000);
	  lpo.dashboard_tab_click();
	  lpo.location_tab_click();
	  Thread.sleep(2000); 
	  //verify the count updated after deleting location 
	  LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	  lp.page_count();
  }
  
 //checking count is  displayed correctly after creating /deleting  
public void page_count() throws InterruptedException {
	 LocationPage_TestMethods lp=new LocationPage_TestMethods(driver);
	 lp.scroll_down();
	 LocationPage_Objects lpo=new LocationPage_Objects(driver);
	 lpo.select_page_count();
	 int count=1;
	 List<WebElement> list_data=driver.findElements(By.xpath("//table[@class='footable table table-stripped toggle-arrow-tiny']/tbody/tr"));
	
	  for(int i=1;i<list_data.size();i++)
	  {	  
	  list_data.get(i);
	 count=count+1;
	  }  
	  System.out.println("Showing 1 to "+ count +" of "+count);
	 
	 String text= driver.findElement(By.xpath("(//span)[50]")).getText();
	 System.out.println(text);
	 Assert.assertEquals(text, "Showing 1 to "+ count +" of "+count);
     }

  
  public void scroll_down() throws InterruptedException {
	  String javascript2 = "window.scrollBy(0,500)";  
	  JavascriptExecutor jsExecutor2 = (JavascriptExecutor) driver;  
	  jsExecutor2.executeScript(javascript2);
	  Thread.sleep(3000); 
  }
  
  public void scroll_up() throws InterruptedException {
	  String javascript2 = "window.scrollBy(0,-500)";  
	  JavascriptExecutor jsExecutor2 = (JavascriptExecutor) driver;  
	  jsExecutor2.executeScript(javascript2); 
	   
  }
 
                          //collecting data from web table

//verify row count
public void location_dataTable_row_count() {
	  int tableRowCount=driver.findElements(By.xpath("//table[@class='footable table table-stripped toggle-arrow-tiny']/tbody/tr")).size();
      System.out.println("The number of rows in the table is" +tableRowCount);
}

//verify column count
public void location_dataTable_column_count() {
	  int tableColumn=driver.findElements(By.xpath("//table[@class='footable table table-stripped toggle-arrow-tiny']/thead/tr/th")).size();
      System.out.println("Number of columns"+tableColumn);
}

//location_header_names
public void location_header() {
	  List<WebElement> listname=driver.findElements(By.xpath("//table[@class='footable table table-stripped toggle-arrow-tiny']/thead/tr/th"));
      for(WebElement element: listname)
	  {
	  String value=element.getText();
	  System.out.println("Header name list : "+value);
	  }
}

//Location_column_data
public void location_column_data() {
	  List<WebElement> list_data=driver.findElements(By.xpath("//table[@class='footable table table-stripped toggle-arrow-tiny']/tbody/tr"));
	  int i=0;
	  for(WebElement data_element: list_data)
	  {	  
	  String value=data_element.getText();
	  System.out.println("Header data list per row : "+" [" +i+"] "+value);
	  i++;
		  }
}

public void location_column_data_1(String name) {
	  List<WebElement> list_data=driver.findElements(By.xpath("//table[@class='footable table table-stripped toggle-arrow-tiny']/tbody/tr[1]"));
	  for(WebElement data_element: list_data)
	  {	  
	  String value=data_element.getText();
	  if(value.contains(name)) {
		  System.out.println("data updated successfully");}
		  else {
		  Assert.assertEquals(name, value);
		  }
	  	  }
	  
	 
}


//collecting column wise name list in the location page  
	  public void location_allName_data(String locname ) {

		  List<WebElement> list_data=driver.findElements(By.xpath("//table[@class='footable table table-stripped toggle-arrow-tiny']/tbody/tr/td[1]"));
		  //for  name --table[contains(@class,'footable')]//tr//td[1]
		  for(WebElement data_element: list_data)
		  {  
		  String actualvalue=data_element.getText();
		 if(actualvalue.contentEquals(locname)){
			  System.out.println("Location found");
		  }
		 else {
			 System.out.println("No location found");
		 }
		  }
	  }
	  
	
	//collecting column wise contact person list in the location page 		   
	  public void location_allContactPerson_data(String contactName) {
			 
		  List<WebElement> list_data=driver.findElements(By.xpath("//table[@class='footable table table-stripped toggle-arrow-tiny']/tbody/tr/td[2]"));
		  for(WebElement data_element: list_data)
		  {  
		  String actualvalue=data_element.getText();
		  if(actualvalue.contentEquals(contactName)){
			  System.out.println("Success");
		  }
		  }
		  
			  } 
	  

		//collecting column wise phone number list in the  location page  
		  public void location_allPhoneNumber_data(String phoneNumber) {
		  List<WebElement> list_data=driver.findElements(By.xpath("//table[@class='footable table table-stripped toggle-arrow-tiny']/tbody/tr/td[3]"));
			  for(WebElement data_element: list_data)
			  {  
			  String actualvalue=data_element.getText();
			  if(actualvalue.contentEquals(phoneNumber)){
				  System.out.println("Success");
			  }
			 				  }
			  
			  }  
      
		  
		//collecting column wise email id list in the location page web table
		  public void location_all_email_ids(String email) {
		   List<WebElement> list_data=driver.findElements(By.xpath("//table[@class='footable table table-stripped toggle-arrow-tiny']/tbody/tr/td[4]"));
			 for(WebElement data_element: list_data)
			  {
			  String actualvalue=data_element.getText();
			  if(actualvalue.contentEquals(email)){
				  System.out.println("Success");
			  }
			
			  }  
		  }
		 
		  
		  //check whether the data selected is correct
      public void data_selected(String data) {
	  List<WebElement> listname=driver.findElements(By.xpath("//table[@class='footable table table-stripped toggle-arrow-tiny']/thead/tr/th"));
      for(WebElement element: listname)
	  {
	  String value=element.getText();
	  if (listname.contains(data)) {
		  Assert.assertEquals(value, data);
//	  System.out.println("Header name list : "+value);
	  }
 }
	 
 }
      

	 } 

 




