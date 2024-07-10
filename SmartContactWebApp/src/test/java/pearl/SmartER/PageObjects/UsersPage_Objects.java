package pearl.SmartER.PageObjects;

import javax.lang.model.util.SimpleElementVisitor14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.Select;

public class UsersPage_Objects {
	
	public static WebDriver driver;
	
	public UsersPage_Objects (WebDriver driver) {
		this.driver=driver; 
	}
	
	//Dashboard Elements
	By users_btn = By.xpath("//span[normalize-space()='Users']");
	By list_btn = By.xpath("//a[normalize-space()='List']");
	By community_hospital_btn = By.xpath("//body//div[@id='wrapper']//div[@id='page-wrapper']//div//div//div//div//div//div[1]//a[1]//img[1]");
	By dashboard_users_btn = By.xpath("//body[1]/div[1]/app-root[1]/app-main[1]/div[1]/div[1]/app-content[1]/app-client-dashboard[1]/div[3]/div[1]/div[3]/a[1]/div[1]/div[1]/i[1]");
	
	//Users Page Elements
	By dashboard_location_dropdown = By.xpath("//select[@formcontrolname='hospitalid']");
	By dashboard_department_dropdown = By.xpath("//select[@formcontrolname='departmentid']");
	By dashboard_status_dropdown = By.xpath("//select[@formcontrolname='status']");
	By search_by_username_txt = By.xpath("//input[@placeholder='Search By Username']");
	By search_result_username_txt = By.cssSelector("tbody tr td:nth-child(1)");
	By edit_btn = By.xpath("//tbody/tr[1]/td[8]/a[1]/i[1]"); //(//a[@title='Edit'])[1] ////tbody/tr[1]/td[8]/a[1]/i[1]
	By delete_btn = By.xpath("//body[1]/div[1]/app-root[1]/app-main[1]/div[1]/div[1]/app-content[1]/app-users[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[8]/a[2]/i[1]");
	By delete_confirmation_alertbox = By.xpath("//body/div/div[@role='dialog']/div[1]");
	By delete_confirmation_btn = By.xpath("//button[normalize-space()='Yes,delete it!']");
	By deleted_confirmation_alertbox = By.xpath("//div[@role='dialog']");
	By deleted_confirmation_ok_btn = By.xpath("//button[normalize-space()='OK']");
	By create_user_btn = By.xpath("//button[normalize-space()='Create User']"); 
	
	//Edit User Page Elements
	By username_txt = By.xpath("//input[@placeholder='User Name']");
	By name_txt = By.xpath("//input[@placeholder='Name']");
	By usertitle_txt = By.xpath("//input[@placeholder='User Title']");
	By email_txt = By.xpath("//input[@placeholder='Email']");
	By phoneno_txt = By.xpath("//input[@placeholder='Phone No.']");
	By status_dropdown = By.xpath("//select[@formcontrolname='status']");
	By upload_photo_btn = By.xpath("//input[@name='...']");
	By location_dropdown = By.xpath("//select[@formcontrolname='hsptl']");
	By department_dropdown = By.xpath("//select[@formcontrolname='departments']");
	By roles_txt = By.xpath("//input[@role='combobox']");
	By level_dropdown = By.xpath("//select[@formcontrolname='level']");
	By language_dropdown = By.xpath("//select[@formcontrolname='language']");
	By password_setup_email_chkbox = By.xpath("//span[normalize-space()='Password Setup Mail']");
	By aim_signature_txt = By.xpath("//textarea[@placeholder='AIM Signature']");
	By ad_user_chkbox = By.xpath("//span[normalize-space()='AD User']");
	By daily_summary_chkbox = By.xpath("//span[normalize-space()='Daily Summary']");
	By daily_upload_chkbox = By.xpath("//span[normalize-space()='Daily Upload']");
	By yearly_report_chkbox = By.xpath("//span[normalize-space()='Yearly Report']");
	By three_day_revisits_report_chkbox = By.xpath("//span[normalize-space()='3 Day Revisits']");
	By resident_report_chkbox = By.xpath("//span[normalize-space()='Resident Report']");
	By doctorreport_chkbox = By.xpath("//span[normalize-space()='Doctor Report']");
	By doctor_report_chkbox = By.xpath("//span[normalize-space()='Doctor- Report']");
	By financial_year_report_chkbox = By.xpath("//span[normalize-space()='Financial Year']");
	By npp_report_chkbox = By.xpath("//span[normalize-space()='NPP Report']");
	By nurse_report_chkbox = By.xpath("//span[normalize-space()='Nurse Report']");
	By quarterly_report_chkbox = By.xpath("//span[normalize-space()='Quarterly Report']");
	By monthly_demographics_chkbox = By.xpath("//span[normalize-space()='Monthly Demographics']");
	By physician_chkbox = By.xpath("//span[normalize-space()='Physician']");
	By nurse_chkbox = By.xpath("//span[normalize-space()='Nurse']");
	By npp_chkbx = By.xpath("//span[normalize-space()='NPP']");
	By report_chkbox = By.xpath("//span[normalize-space()='Resident']");
	By technician_chkbox = By.xpath("//span[normalize-space()='Technician']");
	By save_btn = By.xpath("//a[normalize-space()='Save']");
	By back_btn = By.xpath("//button[normalize-space()='Back']");
	By username_validation_message_lbl = By.xpath("//font[normalize-space()='Username required']");
	By name_validation_message_lbl = By.xpath("//font[normalize-space()='Name required']");
	By title_validation_message_lbl = By.xpath("//font[normalize-space()='Title required']");
	By email_validation_message_lbl = By.xpath("//font[normalize-space()='Email required']");
	By phoneno_validation_message_lbl = By.xpath("//font[normalize-space()='Phone Number required']");
	By role_vaidation_message_lbl = By.xpath("//font[normalize-space()='Role required']");
	By level_validation_message_lbl = By.xpath("//font[normalize-space()='Level required']");
	By save_validation_message_lbl = By.xpath("//ngb-alert[@class='alert alert-success alert-dismissible']");
	By username_already_exists_lbl = By.xpath("//font[@color='red']");
	By uploaded_image_preview = By.xpath("//form[@role='form']//div//img");
	By invalid_email_valiation_lbl = By.xpath("//font[normalize-space()='Pattern incorrect']");
	By invalid_filetype_upload_lbl = By.xpath("//font[@color='red']");
	By role_remove_btn = By.xpath("//ng-select[@placeholder='Select Role']//div//div//div//span[@aria-hidden='true'][normalize-space()='×']");
	By role_required_validation_lbl = By.xpath("//font[normalize-space()='User Role required']");
	
	
	//User Roles page elements
	By user_roles_btn = By.xpath("//a[normalize-space()='User Roles']");
	By create_role_btn = By.xpath("//button[normalize-space()='Create Role']");
	By create_role_save_btn = By.xpath("//a[normalize-space()='Save']");
	By new_role_txt = By.xpath("//input[@placeholder='Role']");
	By select_level_dropdown = By.xpath("//select[@formcontrolname='role_level']");
	By new_role_creation_success_lbl = By.xpath("//ngb-alert[@class='alert alert-success alert-dismissible']");
	By duplicate_role_creation_validation_lbl = By.xpath("//ngb-alert[@class='alert alert-danger alert-dismissible']");
	
	//Change Password page elements
	By change_password_btn = By.xpath("//a[normalize-space()='Change Password']");
	By current_password_txt = By.xpath("//input[@placeholder='Current Password']");
	By new_password_txt = By.xpath("//input[@placeholder='New Password']");
	By retype_password_txt = By.xpath("//input[@placeholder='Retype Password']");
	By reset_btn = By.xpath("//button[normalize-space()='Reset']");
	By current_password_required_lbl = By.xpath("//font[normalize-space()='Current password required']");
	By new_password_required_lbl = By.xpath("//font[normalize-space()='New password required']");
	By retype_password_lbl = By.xpath("//font[normalize-space()='Retype Password']");
	By pattern_incorrect_lbl = By.xpath("//font[text()='Pattern Incorrect']");
	By password_change_successfull_lbl = By.xpath("//ngb-alert[@role='alert']");
	By two_passwords_doesnot_match_lbl = By.xpath("//ngb-alert[@class='alert alert-danger alert-dismissible']");
	
	//Click on community button
	public void community_Hospital_Btn() {
		driver.findElement(community_hospital_btn).click();
	}
	
	//Click on Users Tab in after community hospital
	public void dashboard_Users_Btn_Click() {
		driver.findElement(dashboard_users_btn).click();
	} 
	
	//Click users button
	public void users_Btn_Click() {
		driver.findElement(users_btn).click();
	}
	
	//Click list button
	public void list_Btn_Click() {
		driver.findElement(list_btn).click();
	}
	//Check if users button is enabled
	public void users_Btn() {
		driver.findElement(users_btn).isEnabled();
	}
	
	//Click on Create User button
	public void create_User_Btn_Click() throws InterruptedException {
		driver.findElement(create_user_btn).click();
		Thread.sleep(2000);
	}
	
	//Check if create user button is enabled
	public void create_User_Btn_Enabled() throws Exception {
		driver.findElement(create_user_btn).isEnabled();
	}
	
	//Click on Save button
	public void save_Btn_Click() {
		driver.findElement(save_btn).click();
	}
	
	//Passing Username
	public void username_Txt(String username) {
		driver.findElement(username_txt).sendKeys(username);
	}
	
	//Clearing existing Username
	public void username_Txt_Clear() {
		driver.findElement(username_txt).clear();
	}
	
	//Passing Name
	public void name_Txt(String name) {
		driver.findElement(name_txt).sendKeys(name);
	}
	
	//Passing Title
	public void usertitle_Txt(String title) {
		driver.findElement(usertitle_txt).sendKeys(title);
	}
	
	//Passing Email
	public void email_Txt(String email) { 
		driver.findElement(email_txt).sendKeys(email);
	}
	
	//Passing Phone Number
	public void phoneno_Txt(String phone) {
		driver.findElement(phoneno_txt).sendKeys(phone);
	}
	
	//Passing Role
	public void roles_Txt() {
		driver.findElement(roles_txt).sendKeys("Demo");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
	} 
	
	//Clearing role selection
	public void roles_Remove_Btn_Click() {
		driver.findElement(role_remove_btn).click();
	}
	
	//Selecting Level from dropdown
	public void level_Dropdown() {
		WebElement wb = driver.findElement(level_dropdown);
		Select drop=new Select(wb);
		drop.selectByVisibleText("Client Level");
	}	
	
	
	//Getting Username validation message
	public void username_Validation_Message_Lbl() {
		driver.findElement(username_validation_message_lbl).isEnabled();
	}
	
	//Getting Name validation message
	public void name_Validation_Message_Lbl() {
		driver.findElement(name_validation_message_lbl).isEnabled();
	}
	
	//Getting Title validation message
	public void title_Validation_Message_Lbl() {
		driver.findElement(title_validation_message_lbl).isEnabled();
	}
	
	//Getting Email validation message
	public void email_Validation_Message_Lbl() {
		driver.findElement(email_validation_message_lbl).isEnabled();
	}
	
	//Getting Phone Number validation message
	public void phoneno_Validation_Message_Lbl() {
		driver.findElement(phoneno_validation_message_lbl).isEnabled();
	}
	
	//Getting Role vaidation message
	public void role_Vaidation_Message_Lbl() {
		driver.findElement(role_vaidation_message_lbl).isEnabled();
	}
	
	//Getting Level validation message
	public void level_Validation_Message_Lbl() {
		driver.findElement(level_validation_message_lbl).isEnabled();
	}
	
	//Getting Save validation message
	public void save_Validation_Message_Lbl() {
		driver.findElement(save_validation_message_lbl).isEnabled();
	}
	
	//Getting Username exists validation message
	public void username_Already_Exists() {
		driver.findElement(username_already_exists_lbl).isEnabled();
	}
	
	//Click on Edit Button
	public void edit_Btn_Click() {
		driver.findElement(edit_btn).click();
	}
	
	//Retrieve existing username before editing
	public void existing_Username_Retrieval() {
		String ex_username = driver.findElement(username_txt).getText();
		System.out.println("Existing Username : "+ex_username);
	}
	
	//Searching existing username
	public void search_By_Username_Txt(String username) {
		
		driver.findElement(search_by_username_txt).sendKeys(username);
		}
	
	//Click on back button
	public void back_Btn_Click() {
		driver.findElement(back_btn).click();
	}
	
	//Search result username
	public String search_Result_Username_Txt() {
		return driver.findElement(search_result_username_txt).getText();
	}
	
	//Click on delete button
	public void delete_Btn_Click() {
		driver.findElement(delete_btn).click();
	}
	
	//Delete confirmation window
	public void delete_Confirmation_Window() {
		driver.findElement(delete_confirmation_alertbox).isEnabled();
	}
	
	//Confirm deletion
	public void delete_Conformation_Btn() {
		driver.findElement(delete_confirmation_btn).click();
		
	}
	
	//Deleted confirmation alert
	public void deleted_Confirmation_Alertbox() {
		driver.findElement(deleted_confirmation_alertbox).isEnabled();
	}
	
	//Clicking on ok after deleting
	public void deleted_Confirmation_Ok_Btn_Click() {
		driver.findElement(deleted_confirmation_ok_btn);
	}
	
	//Upload photo
	public void upload_Photo_Btn() {
		driver.findElement(upload_photo_btn).sendKeys("D:\\photo.jpg");
		
	}
	
	//Check if the image preview is available
	public void uploaded_Image_Preview() {
		driver.findElement(uploaded_image_preview).isEnabled();
		
	}
	
		
	//Getting invalid Email validation message
		public void invalid_Email_Validation_Message_Lbl() {
			String error =driver.findElement(invalid_email_valiation_lbl).getText();
			System.out.println("The error message is " +error);
		}
		
		//Click on upload photo
		public void upload_Invalid_File() {
			driver.findElement(upload_photo_btn).sendKeys("D:\\Fruits.csv");
		}
			
	//Invalid file type upload label
		public void invalid_Filetype_Upload_Lbl_Is_Enabled() {
			driver.findElement(invalid_filetype_upload_lbl).isEnabled();
			String message =driver.findElement(invalid_filetype_upload_lbl).getText();
			System.out.println("Error message is : "+message);
		}
	
	//Dashboard location dropdown selection
		public void dashboard_Location_Dropdown() {
			WebElement we = driver.findElement(dashboard_location_dropdown);
			Select s=new Select(we);
			s.selectByIndex(0);
		}
		
	//Dashboard department dropdown selection
		public void dashboard_Department_Dropdown() {
			WebElement we = driver.findElement(dashboard_department_dropdown);
			Select s=new Select(we);
			s.selectByIndex(0);
		}
	
		
	//Dashboard status dropdown selection
		public void dashboard_Status_Dropdown() {
			WebElement we=driver.findElement(dashboard_status_dropdown);
			Select s=new Select(we);
			s.selectByIndex(0);
		}
		
	//Create User page status dropdown
		public void status_Dropdown_Selection() {
			WebElement we=driver.findElement(status_dropdown);
			Select s = new Select(we);
			s.selectByVisibleText("Inactive");
			
		}
		
	//Create User page location dropdown
		public void location_Dropdown_Selection() {
			WebElement we=driver.findElement(location_dropdown);
			Select s = new Select(we);
			s.selectByVisibleText("Kochi");
		}
		
	//Create User page department dropdown
			public void department_Dropdown_Selection() {
				WebElement we=driver.findElement(department_dropdown);
				Select s = new Select(we);
				s.selectByVisibleText("Critical Care");
			}
	
		//Create User page role dropdown
		public void role_Selection() {
			driver.findElement(roles_txt).sendKeys("Demo");
			Actions act=new Actions(driver);
			act.sendKeys(Keys.ENTER).build().perform();
		}
			
		//Create User page level dropdown
		public void level_Dropdown_Selection() {
			WebElement we=driver.findElement(level_dropdown);
			Select s = new Select(we);
			s.selectByVisibleText("Client Level");
		}
			
		
	    //Create User page language dropdown
		public void language_Dropdown_Selection() {
			WebElement we=driver.findElement(language_dropdown);
			Select s = new Select(we);
			s.selectByVisibleText("Spanish");
		}
		
		//Checkbox clicks
		public void checkbox_Clicks() throws InterruptedException {
			driver.findElement(password_setup_email_chkbox).click();
			Thread.sleep(500);
			driver.findElement(ad_user_chkbox).click();
			Thread.sleep(500);
			driver.findElement(daily_summary_chkbox).click();
			Thread.sleep(500);
			driver.findElement(daily_upload_chkbox).click();
			Thread.sleep(500);
			driver.findElement(yearly_report_chkbox).click();
			Thread.sleep(500);
			driver.findElement(three_day_revisits_report_chkbox).click();
			Thread.sleep(500);
			driver.findElement(resident_report_chkbox).click();
			Thread.sleep(500);
			driver.findElement(doctorreport_chkbox).click();
			Thread.sleep(500);
			driver.findElement(doctor_report_chkbox).click();
			Thread.sleep(500);
			driver.findElement(financial_year_report_chkbox).click();
			Thread.sleep(500);
			driver.findElement(npp_report_chkbox).click();
			Thread.sleep(500);
			driver.findElement(nurse_report_chkbox).click();
			Thread.sleep(500);
			driver.findElement(quarterly_report_chkbox).click();
			Thread.sleep(500);
			driver.findElement(monthly_demographics_chkbox).click();
			Thread.sleep(500);
			driver.findElement(physician_chkbox).click();
			Thread.sleep(500);
			driver.findElement(nurse_chkbox).click();
			Thread.sleep(500);
			driver.findElement(npp_chkbx).click();
			Thread.sleep(500);
			driver.findElement(report_chkbox).click();
			Thread.sleep(500);
			driver.findElement(technician_chkbox).click();
			Thread.sleep(500);
		}
		
		//Clicking on User Roles button
		public void user_roles_btn_Click() {
			driver.findElement(user_roles_btn).click();
		}
		
		//Clicking on create user button
		public void create_Role_Btn_Click() {
			driver.findElement(create_role_btn).click();
			
		}
		
		//Clicking on save button in create role page
		public void create_Role_Save_Btn_Click() {
			driver.findElement(create_role_save_btn).click();
		}
		
		//Checking if role required label is enabled
		public void role_Required_Validation_Lbl() {
			driver.findElement(role_required_validation_lbl).isEnabled();
			String message = driver.findElement(role_required_validation_lbl).getText();
			System.out.println("The error message is "+message);
		}
		
		//Passing new role
		public void new_Role_Txt_Input(String newrole) {
			driver.findElement(new_role_txt).sendKeys(newrole);
		}
		
		//Selecting level
		public void select_level_dropdown() {
			WebElement we =	driver.findElement(select_level_dropdown);
			Select s= new Select(we);
			s.selectByVisibleText("Client Level");
		}
		
		//Checking for success message on creation of new user
		public void new_Role_Creation_Success_Lbl_Validation() {
			driver.findElement(new_role_creation_success_lbl).isEnabled();
			
		}
		
		//Checking for validation message upon creating duplicate user
		public void duplicate_Role_Creation_Validation_Lbl() {
			driver.findElement(duplicate_role_creation_validation_lbl).isEnabled();
			String error=driver.findElement(duplicate_role_creation_validation_lbl).getText();
			System.out.println("The error message is "+error);
		}
		
		//Clicking on change password button
		public void change_Password_Btn_Click() {
			driver.findElement(change_password_btn).click();
		}
		
		//Clicking on reset button
		public void reset_Btn_Click() {
			driver.findElement(reset_btn).click();
		}
		
		//Checking for validation message (Changing password without giving any passwords)
		public void blank_Password_Change_Validation_Messages() {
			driver.findElement(current_password_required_lbl).isEnabled();
			String current_password_validation = driver.findElement(current_password_required_lbl).getText();
			System.out.println(current_password_validation);
			driver.findElement(new_password_required_lbl).isEnabled();
			String new_password_validation = driver.findElement(new_password_required_lbl).getText();
			System.out.println(new_password_validation);
			driver.findElement(retype_password_lbl).isEnabled();
			String retype_password_validation = driver.findElement(retype_password_lbl).getText();
			System.out.println(retype_password_validation);
		}
		
		//Checking for validation message (Changing password without giving any passwords)
		public void password_Change_Without_Newpassword_Validation_Messages() {
			driver.findElement(new_password_required_lbl).isEnabled();
			String new_password_validation = driver.findElement(new_password_required_lbl).getText();
			System.out.println(new_password_validation);
			driver.findElement(retype_password_lbl).isEnabled();
			String retype_password_validation = driver.findElement(retype_password_lbl).getText();
			System.out.println(retype_password_validation);
		}
				
		//Passing current password
		public void current_Password_Txt(String current_password) {
			driver.findElement(current_password_txt).sendKeys(current_password);
		}
		
		//Passing new password
		public void new_Password_Txt(String new_password) {
			driver.findElement(new_password_txt).sendKeys(new_password);
		}
		
		//Passing retype password
		public void retype_Password_Txt(String retype_password) {
			driver.findElement(retype_password_txt).sendKeys(retype_password);
		}
		
		//Successful password change validation message
		public void password_Change_Successful() {
			driver.findElement(password_change_successfull_lbl).isEnabled();
			String success_message=driver.findElement(password_change_successfull_lbl).getText();
			System.out.println(success_message);
		}
		
		//Two different new passwords validation message
		public void two_Passwords_Doesnot_Match_Lbl() {
			driver.findElement(two_passwords_doesnot_match_lbl).isEnabled();
			String error_message=driver.findElement(two_passwords_doesnot_match_lbl).getText();
			System.out.println(error_message);
		}
		
		//Checking password of incorrect pattern
		public void pattern_Incorrect_Lbl() {
			driver.findElement(pattern_incorrect_lbl).isEnabled();
			String error=driver.findElement(pattern_incorrect_lbl).getText();
			System.out.println(error);
		}
		
		
}
