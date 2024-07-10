package pearl.SmartER.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LocationPage_Objects {
WebDriver driver;
	
    By dashboard_tab=By.xpath("//span[normalize-space()='Dashboard']");
	By location_tab=By.xpath("(//div[@class='widget navy-bg p-lg text-center'])[1]");
	By createlocation_btn=By.xpath("//button[normalize-space()='Create Location']");
	By clone_from_dropdown=By.xpath("//select[@formcontrolname='cloned_from']");
	By name_txt=By.xpath("//input[@placeholder='Name']");
	By email_txt=By.xpath("//input[@placeholder='Contact Email']");
	By country_dropdown= By.xpath("(//select[@name='Country'])[1]");
	By contactperson_txt=By.xpath("(//input[@placeholder='Contact Person Name'])[1]");
	By phonenumber_txt=By.xpath("//input[@placeholder='Phone Number']");
	By city_txt=By.xpath("//input[@placeholder='City']");
	By website_txt=By.xpath("//input[@placeholder='Website']");
	By subunit_txt=By.xpath("//input[@placeholder='Subunit']");
	By contactaddress_txt=By.xpath("//input[@placeholder='Contact Address']");
	By starttime_txt=By.xpath("//input[@formcontrolname='StartTime']");
	By endtime_txt=By.xpath("(//input[@formcontrolname='EndTime'])[1]");
	By state_dropdown=By.xpath("(//select[@name='State'])[1]");
	By prefereddateformat_dropdown=By.xpath("//select[@name='date-format']");
	By status_dropdown=By.xpath("(//select[@name='Status'])[1]");
	By logo_image=By.xpath("//input[@name='...']");
	By timezone_dropdown=By.xpath("//select[@name='time-zone']");
	By save_btn=By.xpath("//button[normalize-space()='Save']");
	By back_btn=By.xpath("//a[normalize-space()='Back']");
	By alert_message_label=By.xpath("//ngb-alert[contains(@role,'alert')]");
	By name_tooltip_txt=By.xpath("//div[normalize-space()='Name is required.']");
	By email_tooltip_txt=By.xpath("//div[normalize-space()='Email is required.']");
	By invalid_email_label=By.xpath("//div[@class='error']");
	By character_length=By.xpath("//div[normalize-space()='Minimum 3 characters are required.']");
	By contactperson_tooltip_txt=By.xpath("//div[normalize-space()='Contact Person name is required.']");
	By phonenumber_tooltip_txt=By.xpath("//div[normalize-space()='Phone number is required.']");
	By city_tooltip_txt=By.xpath("//div[normalize-space()='City is required.']");
	By website_tooltip_txt=By.xpath("//div[normalize-space()='Website is required.']");
	By subunit_tooltip_txt=By.xpath("//div[normalize-space()='Subunit is required.']");
	By contactaddress_tooltip_txt=By.xpath("//div[normalize-space()='Contact Address is required.']");
	By country_tooltip_txt=By.xpath("//div[normalize-space()='Country is required.']");
	By state_tooltip_txt=By.xpath("//div[normalize-space()='State is required.']");
	By dateformat_tooltip_txt=By.xpath("//div[normalize-space()='Date format is required.']");
	By timezone_tooltip_txt=By.xpath("(//div[normalize-space()='Timezone is required.'])[1]");
	By startTime_tooltip_txt=By.xpath("(//div[@class='error'])[1]");
	By endTime_tooltip_txt=By.xpath("(//div[@class='error'])[1]");
	
	//view department icon in the location page
	
	By view_department_icon=By.xpath("(//a[@title='View Departments'])[1]");
	//edit icon in the location page
	By edit_icon=By.xpath("(//a[@title='Edit'])[1]");
	//edit icon in row 3
	By edit_icon3=By.xpath("(//a[@title='Edit'])[3]");
	//search field in the location page
	By search_txt=By.xpath("(//input[@id='filter1'])[1]");
	//delete icon in the location page
	By delete_icon=By.xpath("(//a[@title='Delete'])[1]");
	//delete icon no 7 in the location page
	By delete_icon7=By.xpath("(//a[@title='Delete'])[7]");
	// delete confirmation dialog box
	By cancel_delete=By.xpath("//button[normalize-space()='Cancel']");
	// delete confirmation dialog box
	By confirm_delete=By.xpath("//button[normalize-space()='Yes, delete it!']");
	//ok button for delete confirmation
	By confirm_Ok=By.xpath("//button[normalize-space()='OK']");
	//name label in the location page
	By name_label=By.xpath("//a[normalize-space()='Name']");
	//delete confirmation message button click
	By delete_confirmation_msg_box=By.xpath("//button[normalize-space()='Yes, delete it!']");
	//department text in the department page
	By department_txt=By.xpath("(//strong[normalize-space()='Departments'])[1]");
	//page count drop down in location page
	By page_count=By.xpath("//select[@id='select-number']");
	
	public LocationPage_Objects(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	//click on the dashboard tab
	 public void dashboard_tab_click() throws InterruptedException {
     	
     	driver.findElement(dashboard_tab).click();
     	Thread.sleep(2000);
     }
	 
	 //click on the location tab
	 public void location_tab_click() throws InterruptedException {
     	
     	driver.findElement(location_tab).click();
     	Thread.sleep(2000);
     }
	 
	 //click on the name label
	 public void click_name_label() {
		 driver.findElement(name_label).click();
	 }
	 
	 //click on the create location button
	 public void create_location_btn_click() throws InterruptedException{
     	driver.findElement(createlocation_btn).click();
     	Thread.sleep(2000);
     }
	 
	 //Enter key word in the search field
	 public void search_txt_field(String Search) throws InterruptedException{
     	driver.findElement(search_txt).sendKeys(Search);	
  }
	 //press enter
	 public void press_enterkey() {
		 driver.findElement(search_txt).sendKeys(Keys.ENTER); 
	 }
	 
	//enter the name  
	 public void name_txt_field(String Name) throws InterruptedException{
		 driver.findElement(name_txt).clear();
        driver.findElement(name_txt).sendKeys(Name); 	
     }
	 //enter the email
	 public void email_txt_field(String Email) throws InterruptedException {
		 driver.findElement(email_txt).clear();
     	driver.findElement(email_txt).sendKeys(Email);
     }
	 //enter the contact person details
	 public void contactperson_txt_field(String ContactPerson) throws InterruptedException{
		driver.findElement(contactperson_txt).clear();
     	driver.findElement(contactperson_txt).sendKeys(ContactPerson);
     }
	 //enter the phone number
	 public void phonenumber_txt_field(String Phonenumber) throws InterruptedException{
		driver.findElement(phonenumber_txt).clear();
     	driver.findElement(phonenumber_txt).sendKeys(Phonenumber);
 
     }
	 //phone number validation
	 public void phone_num_validation(String Phonenumber) {
		 driver.findElement(phonenumber_txt).clear();
	     driver.findElement(phonenumber_txt).sendKeys(Phonenumber);
	     for (char c : Phonenumber.toCharArray())
		  { if (!Character.isDigit(c)) { 
			 Assert.assertTrue(false);
			  } }
		 
	 }
	 //upload logo
	 public void upload_logo(String logo) {
		 driver.findElement(logo_image).clear();
		  driver.findElement(logo_image).sendKeys(logo);
	 }

	 //enter the city
	 public void city_txt_field(String City) throws InterruptedException {
		driver.findElement(city_txt).clear();
     	driver.findElement(city_txt).sendKeys(City);   	
     }
	 //enter the website
	 public void website_txt_field(String Website) throws InterruptedException{
		driver.findElement(website_txt).clear();
     	driver.findElement(website_txt).sendKeys(Website);	
     }
	 //enter the subunit
	 public void subunit_txt_field(String Subunit) throws InterruptedException{
		 driver.findElement(subunit_txt).clear();
     	driver.findElement(subunit_txt).sendKeys(Subunit);      	
     }
	 //enter the contact address
	 public void contactaddress_txt_field(String Contactaddress) throws InterruptedException{
		 driver.findElement(contactaddress_txt).clear();
     	driver.findElement(contactaddress_txt).sendKeys(Contactaddress);
     }
	 //enter the start time
	 public void starttime_txt_field(String StartTime) throws InterruptedException{
		 driver.findElement(starttime_txt).clear();
		driver.findElement(starttime_txt).sendKeys(StartTime);
     }
	 //enter the end time
	 public void endtime_txt_field(String EndTime) throws InterruptedException{
		 driver.findElement(endtime_txt).clear();
     	driver.findElement(endtime_txt).sendKeys(EndTime);     	
     }
	 //upload the logo
	 public void logo_image_upload(String upload) throws InterruptedException {
	     	driver.findElement(logo_image).sendKeys(upload);
	     	Thread.sleep(2000);
	     }
	 //page count drop down
	 public void select_page_count() throws InterruptedException {
		 WebElement mySelectedElement = driver.findElement(page_count);
		    Select dropdown= new Select(mySelectedElement);
		    dropdown.selectByVisibleText("100");
		    Thread.sleep(4000);
	 }
	 //selecting location name by clone from dropdown
	 public void clone_from_drpdown(String locationName) {
		 WebElement clonefrom=driver.findElement(clone_from_dropdown);
		  Select drp=new Select(clonefrom);
		 drp.selectByVisibleText(locationName);
	 }
      //selecting a state from state drop down list
	 public void state_dropdown_select(String state){
		 WebElement mySelectedElement = driver.findElement(state_dropdown);
	     Select dropdown= new Select(mySelectedElement);
	     dropdown.selectByVisibleText(state);
	     System.out.println("The State selected is "+state)   ; }
	 
	 //selecting a date format from preferred date format dropdown list
	 public void prefereddateformat_dropdown_select(String dateformat) {
		 WebElement mySelectedElement = driver.findElement(prefereddateformat_dropdown);
	     Select dropdown= new Select(mySelectedElement);
	     dropdown.selectByVisibleText(dateformat);
     }
	//selecting a country from country drop down list
	 public void country_drpdown(String country){
     	WebElement mySelectedElement = driver.findElement(country_dropdown);
     	Select dropdown= new Select(mySelectedElement);
     	dropdown.selectByVisibleText(country);
     	System.out.println("The Country selected is "+country);
     }
	//selecting a time zone 
	 public void timezone_dropdown_select(String time){
	     WebElement mySelectedElement = driver.findElement(timezone_dropdown);
	     Select dropdown= new Select(mySelectedElement);
	     dropdown.selectByVisibleText(time);
	     } 
	 //selecting status
	 public void status_dropdown(String status) {
	 WebElement mySelectedElement = driver.findElement(status_dropdown);
     Select dropdown= new Select(mySelectedElement);
     dropdown.selectByVisibleText(status);
     System.out.println("Status is "+status);
	 }
	 //click on the save button
	 public void save_btn_click() throws InterruptedException {
	     	driver.findElement(save_btn).click();
	     	Thread.sleep(2000);
	     }
	//click on the back button 
	 public void back_btn_click() throws InterruptedException {
	     	driver.findElement(back_btn).click();
	     	Thread.sleep(2000);
	     }
	 
	 //verify message to display for sucessful location creation
	 public void sucess_message() throws InterruptedException {
	     String actualmessage=(driver.findElement(alert_message_label).getText());
		 System.out.println(actualmessage);
//		 String expected ="Successfully created new location";
//		 String msg="pass";
//		 Assert.assertTrue(actualmessage.contains(expected), msg);
	 }	 
	 
	 //verify message to display for already existing location
	 public void already_exist_message() throws InterruptedException{	
		 String actualmessage=(driver.findElement(alert_message_label).getText());
		 System.out.println(actualmessage);
		 String expected ="Creation failed!";
		 String msg="fail";
		 Assert.assertTrue(actualmessage.contains(expected), msg);
	 }
//verify message to display for successful location creation/already exist using clone form drop down 
	 public void alertmessage() {
	 String actualmessage=(driver.findElement(By.xpath("//ngb-alert[contains(@role,'alert')]")).getText());
	  if(actualmessage.contains("Successfully created new location")) {
		 System.out.println("sucessfully created");
	  }else if(actualmessage.contains("fail")) {
		 System.out.println("Displays already exist");
	  }
	  else {
		 System.out.println("clone from functionality fails");
	  } 
	 }
	 
	 //verify tooltip message for name 
	 public void tooltip_message_name() throws InterruptedException {
	      String tooltip=driver.findElement(name_tooltip_txt).getText();
		  System.out.println(tooltip);
		  Assert.assertEquals(tooltip, "Name is required.");
	  }
	 //verify tooltip message for email 
	 public void tooltip_message_email() throws InterruptedException {
	     String tooltip=driver.findElement(email_tooltip_txt).getText();
		 System.out.println(tooltip);
		 Assert.assertEquals(tooltip, "Email is required.");
	     }
	 //verify tooltip message for contact person 
	 public void tooltip_message_contactperson() throws InterruptedException {
	     String tooltip=driver.findElement(contactperson_tooltip_txt).getText();
		 System.out.println(tooltip);
		 Assert.assertEquals(tooltip, "Contact Person name is required.");
	     } 
	 //verify tooltip message for phone number 
	 public void tooltip_message_phonenumber() throws InterruptedException {
	     String tooltip=driver.findElement(phonenumber_tooltip_txt).getText();
		 System.out.println(tooltip);
		 Assert.assertEquals(tooltip, "Phone number is required.");
	     } 
	 //verify tooltip message for city 
	 public void tooltip_message_city() throws InterruptedException{
	      String tooltip=driver.findElement(city_tooltip_txt).getText();
		  System.out.println(tooltip);
		  Assert.assertEquals(tooltip, "City is required.");
	     } 
	 //verify tooltip message for website 
	 public void tooltip_message_website() throws InterruptedException{
		 String tooltip=driver.findElement(website_tooltip_txt).getText();
		 System.out.println(tooltip);
		 Assert.assertEquals(tooltip, "Website is required.");	
	     } 
	  //verify tooltip message for subunit 
	 public void tooltip_message_subunit() throws InterruptedException {
		  String tooltip=driver.findElement(subunit_tooltip_txt).getText();
		  System.out.println(tooltip);
		  Assert.assertEquals(tooltip, "Subunit is required.");
		 } 
	 //verify tooltip message for contactaddress 
	 public void tooltip_message_contactaddress() throws InterruptedException{
		  String tooltip=driver.findElement(contactaddress_tooltip_txt).getText();
		  System.out.println(tooltip);
		  Assert.assertEquals(tooltip, "Contact Address is required."); 
	     } 
	  //verify tooltip message for country 
	 public void tooltip_message_country() throws InterruptedException{
		 String tooltip=driver.findElement(country_tooltip_txt).getText();
		 System.out.println(tooltip);
		 Assert.assertEquals(tooltip, "Country is required.");
	     } 
	 //verify tooltip message for state
	 public void tooltip_message_state() throws InterruptedException{
		 String tooltip=driver.findElement(state_tooltip_txt).getText();
		 System.out.println(tooltip);
		 Assert.assertEquals(tooltip, "State is required."); 
	     } 
	 //verify tooltip message for date format
	 public void tooltip_message_dateformat() throws InterruptedException {
		  String tooltip=driver.findElement(dateformat_tooltip_txt).getText();
		  System.out.println(tooltip);
		  Assert.assertEquals(tooltip, "Date format is required.");
	     } 
	 //verify tooltip message for time zone
	 public void tooltip_message_timezone() throws InterruptedException{
		 String tooltip=driver.findElement(timezone_tooltip_txt).getText();
		 System.out.println(tooltip);
		 Assert.assertEquals(tooltip, "Timezone is required."); 
	     } 
	 //verify user is giving invalid email format
	 public void email_validation() {
		 String tooltip=driver.findElement(invalid_email_label).getText();
		 System.out.println(tooltip);
		 Assert.assertEquals(tooltip, "Please enter a valid email address");  
	 }
	 //verify length of the name entered is as per the requirement
	 public void character_length_of_name() {
		 String tooltip=driver.findElement(character_length).getText();
		 System.out.println(tooltip);
		 Assert.assertEquals(tooltip, "Minimum 3 characters are required."); 
	 }
	 //verify startTime format
	 public void start_time_format_validation() {
		 String tooltip=driver.findElement(startTime_tooltip_txt).getText();
		 System.out.println(tooltip);
		 Assert.assertEquals(tooltip, "Please Enter a Valid Time");
	 }
	 //verify endTime format
	 public void end_time_format_validation() throws InterruptedException {
		 String tooltip=driver.findElement(endTime_tooltip_txt).getText();
		 System.out.println(tooltip);
		 Thread.sleep(2000);
		 Assert.assertEquals(tooltip, "Please Enter a Valid Time");
	 }
	//clicking the view icon
	 public void view_icon_click() {
		 driver.findElement(view_department_icon).click();
	 }
	//clicking the edit icon
	 public void edit_icon_click() throws InterruptedException {
		 driver.findElement(edit_icon).click();
		 Thread.sleep(3000);
	 }
	 
	 //clicking the edit icon of third row
	 public void edit_icon3() throws InterruptedException {
		 driver.findElement(edit_icon3).click();
		 Thread.sleep(3000);
	 }
	 //clicking the delete icon
	 public void delete_icon_click() throws InterruptedException {
		 driver.findElement(delete_icon).click();
		 Thread.sleep(2000);
	 }
	 //clicking delete icon no 7
	 public void delete_icon7_click() throws InterruptedException {
		 driver.findElement(delete_icon7).click();
		 Thread.sleep(2000);
	 }
	 //cancel delete
	public void cancel_delete() {
		driver.findElement(cancel_delete).click();
	}
	//confirm delete
	public void confirm_delete() {
		driver.findElement(confirm_delete).click();
	}
	//click ok for deleting
	public void confirmOK() throws InterruptedException {
		driver.findElement(confirm_Ok).click();
		  Thread.sleep(2000);
	}
	//confirmation message display
	public void confirmationMessage_display() {
		String confirmationmsg=driver.findElement(delete_confirmation_msg_box).getText();
		  System.out.println(confirmationmsg);
		  Assert.assertEquals(confirmationmsg, "Yes, delete it!");
	}
	//verify department text is displayed in the department page
	public void department_txt_isDisplayed() {
		Boolean department_txt1=driver.findElement(department_txt).isDisplayed();
		System.out.println(department_txt1);
	}
	
	//verify create location button isEnabled
	public void create_location_button_isEnabled() {
		WebElement createlocationbtn=driver.findElement(createlocation_btn);
	 	Boolean button= createlocationbtn.isEnabled();
	 	System.out.println(button);
	}
	//verify clientDropDown disabled
	public void client_drpdwn() {
		 WebElement clienttxt=driver.findElement(By.xpath("//select[@formcontrolname='ClientId']"));
		 if(clienttxt.isEnabled()) {
			 System.out.println( "The dropdown enabled is " +clienttxt.isEnabled());
		 }
		 else {
			 System.out.println( "The dropdown is disabled " +clienttxt.isEnabled());
		 }
	}
}


