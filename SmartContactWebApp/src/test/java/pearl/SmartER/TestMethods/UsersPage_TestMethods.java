package pearl.SmartER.TestMethods;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pearl.SmartER.PageObjects.UsersPage_Objects;

public class UsersPage_TestMethods extends BaseClassMain {
 public static WebDriver driver;
	
	public UsersPage_TestMethods(WebDriver driver) {
		this.driver=driver;
	}
	
 
	//Initialising WebDriver
//	public void webdriver_initialise() throws InterruptedException, IOException {
//		
//		driver=initialise_Driver();
//		Thread.sleep(10000);
//		
//	}
//	
	//Logging in as User
		public void temporary_Login() throws InterruptedException {
			
			driver.findElement(By.xpath("//*[@formcontrolname='username']")).sendKeys("ccuser08");
			Thread.sleep(2000);		
			driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys("Qwerty@123");
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			Thread.sleep(12000);
			
		}
	
	//Logging in as Super User
		public void super_Login() throws InterruptedException {
			
			driver.findElement(By.xpath("//*[@formcontrolname='username']")).sendKeys("admin2");
			Thread.sleep(2000);		
			driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys("pumeX@123!@#");
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			Thread.sleep(12000);
		}
		
	//Super Admin Navigation
		public void super_Login_Navigation() throws Exception {
			driver.findElement(By.xpath("//body//div[@id='wrapper']//div[@id='page-wrapper']//div//div//div//div//div//div[1]//a[1]//img[1]")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[normalize-space()='List']")).click();
			Thread.sleep(3000);
			WebElement we=driver.findElement(By.xpath("//select[@formcontrolname='hospitalid']"));
			Select s=new Select(we);
			s.selectByVisibleText("Kochi");
			Thread.sleep(5000);
			WebElement wb=driver.findElement(By.xpath("//select[@formcontrolname='departmentid']"));
			Select s1=new Select(wb);
			s1.selectByVisibleText("Critical Care");
			Thread.sleep(2000);
		}
		
		
		//Logging in as demo user
		public void demo_Login() throws Exception {
			driver.findElement(By.xpath("//*[@formcontrolname='username']")).sendKeys("Temp_User");
			Thread.sleep(2000);		
			driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys("Qwerty@123");
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			Thread.sleep(12000);
			driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
			Thread.sleep(1000);
		}

		
	//Navigating to List Page
	public void users_List() throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='List']")).click();
		Thread.sleep(3000);
	}
	
	//Navigating to User Roles Page
	public void user_Roles() throws Exception{
		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='User Roles']")).click();
		Thread.sleep(3000);
	}
	
	//Navigating to Change Password Page
	public void change_Password() throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Change Password']")).click();
		Thread.sleep(3000);
	}
	
	

	
			
//	//Navigating to Users tab
//	public void users_Tab() throws InterruptedException {
//		driver.findElement(By.xpath("//body//div[@id='wrapper']//div[@id='page-wrapper']//div//div//div//div//div//div[1]//a[1]//img[1]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
//		driver.findElement(By.xpath("//a[normalize-space()='List']")).click();
//		Thread.sleep(3000);
//		WebElement we=driver.findElement(By.xpath("//select[@formcontrolname='hospitalid']"));
//		Select s=new Select(we);
//		s.selectByVisibleText("Kochi");
//		Thread.sleep(5000);
//		WebElement wb=driver.findElement(By.xpath("//select[@formcontrolname='departmentid']"));
//		Select s1=new Select(wb);
//		s1.selectByVisibleText("Critical Care");
//		Thread.sleep(2000);
//		
//	}
//	
	//Creating user without filling any mandatory fields
	public void verify_User_Creation_Without_Credentials() throws InterruptedException {
		
		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.save_Btn_Click();
		Thread.sleep(500);
		obj.username_Validation_Message_Lbl();
		obj.name_Validation_Message_Lbl();
		obj.title_Validation_Message_Lbl();
		obj.email_Validation_Message_Lbl();
		obj.phoneno_Validation_Message_Lbl();
		obj.role_Vaidation_Message_Lbl();
		obj.level_Validation_Message_Lbl();
		
	}
	
	//Creating user with valid credentials
	public void verify_User_Creation() throws InterruptedException {
		UsersPage_Objects obj=new UsersPage_Objects(driver);
//		temporary_Login();
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.username_Txt("USERNAME2");
		Thread.sleep(1000);
		obj.name_Txt("NAME2");
		Thread.sleep(1000);
		obj.usertitle_Txt("TITLE2");
		Thread.sleep(1000);
		obj.email_Txt("EMAIL2@GMAIL.COM");
		Thread.sleep(1000);
		obj.phoneno_Txt("1234576892");
		Thread.sleep(1000);
		obj.roles_Txt();
		Thread.sleep(1000);
//		obj.level_Dropdown(); 
//		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.save_Validation_Message_Lbl();
	}
	
	//Creating a duplicate user
	public void verify_Duplicate_User_Creation() throws InterruptedException {
		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.username_Txt("USERNAME2");
		Thread.sleep(1000);
		obj.name_Txt("NAME2");
		Thread.sleep(1000);
		obj.usertitle_Txt("TITLE2");
		Thread.sleep(1000);
		obj.email_Txt("EMAIL2@GMAIL.COM");
		Thread.sleep(1000);
		obj.phoneno_Txt("1234576892");
		Thread.sleep(1000);
		obj.roles_Txt();
		Thread.sleep(1000);
//		obj.level_Dropdown();
//		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.username_Already_Exists();
	}
	
	//Creating user without providing the Username
	public void create_New_User_Without_Username() throws InterruptedException {
		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.name_Txt("NAME");
		Thread.sleep(1000);
		obj.usertitle_Txt("TITLE");
		Thread.sleep(1000);
		obj.email_Txt("EMAIL@GMAIL.COM");
		Thread.sleep(1000);
		obj.phoneno_Txt("1234567890");
		Thread.sleep(1000);
		obj.roles_Txt();
		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.username_Validation_Message_Lbl();
	}
	
	//Creating user without providing the Name
	public void create_New_User_Without_Name() throws InterruptedException {
		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.username_Txt("USERNAME");
		Thread.sleep(1000);
		obj.usertitle_Txt("TITLE");
		Thread.sleep(1000);
		obj.email_Txt("EMAIL@GMAIL.COM");
		Thread.sleep(1000);
		obj.phoneno_Txt("1234567890");
		Thread.sleep(1000);
		obj.roles_Txt();
		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.name_Validation_Message_Lbl();
	}
	
	//Creating user without providing the Title
	public void create_New_User_Without_Usertitle() throws InterruptedException {
		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.username_Txt("USERNAME");
		Thread.sleep(1000);
		obj.name_Txt("NAME");
		Thread.sleep(1000);
		obj.email_Txt("EMAIL@GMAIL.COM");
		Thread.sleep(1000);
		obj.phoneno_Txt("1234567890");
		Thread.sleep(1000);
		obj.roles_Txt();
		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.title_Validation_Message_Lbl();
	}
	
	//Creating user without providing the Email
	public void create_New_User_Without_Email() throws InterruptedException {
		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.username_Txt("USERNAME");
		Thread.sleep(1000);
		obj.name_Txt("NAME");
		Thread.sleep(1000);
		obj.usertitle_Txt("TITLE");
		Thread.sleep(1000);
		obj.phoneno_Txt("1234567890");
		Thread.sleep(1000);
		obj.roles_Txt();
		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.email_Validation_Message_Lbl();
	}
	
	//Creating user without providing the Phone Number
	public void create_New_User_Without_Phone_Number() throws InterruptedException {
		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.username_Txt("USERNAME7");
		Thread.sleep(1000);
		obj.name_Txt("NAME");
		Thread.sleep(1000);
		obj.usertitle_Txt("TITLE");
		Thread.sleep(1000);
		obj.email_Txt("EMAIL7@GMAIL.COM");
		Thread.sleep(1000);
		obj.roles_Txt();
		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.phoneno_Validation_Message_Lbl();
	}
	
	//Creating user without providing the Role
	public void create_New_User_Without_Role() throws InterruptedException {
		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.username_Txt("USERNAME");
		Thread.sleep(1000);
		obj.name_Txt("NAME");
		Thread.sleep(1000);
		obj.usertitle_Txt("TITLE");
		Thread.sleep(1000);
		obj.email_Txt("EMAIL@GMAIL.COM");
		Thread.sleep(1000);
		obj.phoneno_Txt("1234567890");
		Thread.sleep(1000);
		obj.level_Dropdown();
		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.role_Vaidation_Message_Lbl();
	}
	
	//Creating user without providing the Level
	public void create_New_User_Without_Level() throws InterruptedException {
		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.username_Txt("USERNAME6");
		Thread.sleep(1000);
		obj.name_Txt("NAME");
		Thread.sleep(1000);
		obj.usertitle_Txt("TITLE");
		Thread.sleep(1000);
		obj.email_Txt("EMAIL6@GMAIL.COM");
		Thread.sleep(1000);
		obj.phoneno_Txt("1234567890");
		Thread.sleep(1000);
		obj.roles_Txt();
		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.level_Validation_Message_Lbl();
	} 
	
	//Checking if users tab is enabled
	public void verify_Users_Button_Enabed() throws InterruptedException {
		UsersPage_Objects obj=new UsersPage_Objects(driver);
		Thread.sleep(10000);
		obj.users_Btn();
	}
	
	//Edit existing user
	public void edit_Existing_User() throws InterruptedException {
		UsersPage_Objects obj=new UsersPage_Objects(driver);
//		obj.community_hospital_btn();
//		Thread.sleep(10000);
//		obj.dashboard_users_btn_click();
//		Thread.sleep(5000);
		obj.edit_Btn_Click();
		Thread.sleep(10000);
		obj.username_Txt_Clear();
		Thread.sleep(1000);
		obj.username_Txt("NADEEM");	
		Thread.sleep(500);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.save_Validation_Message_Lbl();
	}
	
	//Check edited entry
	public void check_Edited_Entry() throws InterruptedException {
		UsersPage_Objects obj=new UsersPage_Objects(driver);
//		obj.users_Btn_Click();
//		Thread.sleep(1000);
//		obj.list_Btn_Click();
//		Thread.sleep(5000);
		obj.search_By_Username_Txt("CCUser1");
		Thread.sleep(3000);
		String actual = obj.search_Result_Username_Txt();
		System.out.println("Actual Username is "+actual);
		String expected = "CCUser1";
		System.out.println("Expected Username is "+expected);
		Assert.assertEquals(actual, expected);
	}
	
		//Delete confirmation window
		public void delete_Confirmation_Window() throws Exception {
			UsersPage_Objects obj=new UsersPage_Objects(driver);
			obj.search_By_Username_Txt("demouser1");
			Thread.sleep(1500);
			obj.delete_Btn_Click();
			Thread.sleep(2000);
			obj.delete_Confirmation_Window();
			
			
		}
		
		//Click on delete user
		public void delete_User() throws Exception {
			UsersPage_Objects obj=new UsersPage_Objects(driver);
			obj.search_By_Username_Txt("demouser1");
			Thread.sleep(1000);
			obj.delete_Btn_Click();
			Thread.sleep(2000);
			obj.delete_Conformation_Btn();
			Thread.sleep(2000);
			obj.deleted_Confirmation_Alertbox();
			
		}
		//Checking if a deleted entry is available
		public void deletion_Status() throws InterruptedException {
		
//			obj.search_By_Username_Txt("CCUser1");
			Thread.sleep(3000);
			List<WebElement>list=driver.findElements(By.xpath("//div[@id='page-wrapper']//app-content//app-users//div//div//div//div//div//div//div//table//tbody"));
			System.out.println("________________________________________________________________________________________");
			for(WebElement element:list) {
				String value=element.getText();
				System.out.println(value);
				System.out.println("________________________________________________________________________________________");
				if(value.contains("CCuser3")) {
					System.out.println("FAILURE !! User not deleted !!");
				} else {
					System.out.println("SUCCESS !! User already deleted !!"); 
				}
				}
		}
		
		//Creating new user with photo, saving and checking for preview
		public void verify_Uploaded_Image_Preview () throws InterruptedException {
			UsersPage_Objects obj=new UsersPage_Objects(driver);
			Thread.sleep(2000);
			obj.create_User_Btn_Click();
			obj.username_Txt("DEMOUSERNAME5"); 
			Thread.sleep(1000);
			obj.name_Txt("DEMONAME2");
			Thread.sleep(1000);
			obj.usertitle_Txt("DEMOTITLE2");
			Thread.sleep(1000);
			obj.email_Txt("DEMOEMAIL5@GMAIL.COM");
			Thread.sleep(1000);
			obj.phoneno_Txt("2345567890");
			Thread.sleep(1000);
			obj.upload_Photo_Btn();
			obj.roles_Txt();
			Thread.sleep(1000);
			obj.save_Btn_Click();
			Thread.sleep(1000);
			obj.save_Validation_Message_Lbl();
			Thread.sleep(5000);
			obj.search_By_Username_Txt("DEMOUSERNAME5");
			obj.edit_Btn_Click();
			Thread.sleep(3000);
			obj.uploaded_Image_Preview();
			
		}
		
	
		
		//Checking if an invalid email format can be used to create a user
		public void verify_Email_Format_Is_Valid() throws Exception {
			UsersPage_Objects obj=new UsersPage_Objects(driver);
			obj.create_User_Btn_Click();
			Thread.sleep(1000);
			obj.email_Txt("DEMOEMAIL@GMAIL");
			Thread.sleep(1000);
			obj.save_Btn_Click();
			Thread.sleep(1000);
			obj.invalid_Email_Validation_Message_Lbl();
			Thread.sleep(2000);
			}
		
		//Checking to see if a file of invalid format can be uploaded
		public void verify_Invalid_Uploaded_Image_Format() throws Exception {
			UsersPage_Objects obj=new UsersPage_Objects(driver);
			obj.create_User_Btn_Click();
			obj.username_Txt("SAMPLEUSER"); 
			Thread.sleep(1000);
			obj.name_Txt("SAMPLEDEMONAME");
			Thread.sleep(1000);
			obj.usertitle_Txt("SAMPLEDEMOTITLE");
			Thread.sleep(1000);
			obj.email_Txt("SAMPLEEMAIL@GMAIL.COM");
			Thread.sleep(1000);
			obj.phoneno_Txt("234567890");
			Thread.sleep(1000);
			obj.upload_Invalid_File();
			obj.roles_Txt();
			Thread.sleep(1000);
			obj.save_Btn_Click();
			Thread.sleep(3000);
			obj.invalid_Filetype_Upload_Lbl_Is_Enabled();
		}
		
		//Check if level will be deselected if role is removed
		public void verify_Level_Deselection_On_Role_Removal() throws Exception {
			UsersPage_Objects obj=new UsersPage_Objects(driver);
			
			obj.create_User_Btn_Click();
			Thread.sleep(1000);
			obj.roles_Txt();
			Thread.sleep(1500);
			obj.roles_Remove_Btn_Click();
			Thread.sleep(2000);
			obj.level_Dropdown();
			Thread.sleep(4000);
		}
		
		
		//Check whether location dropdown is working and a location can be selected
		public void verify_Location_Dropdown_Selection() throws Exception {
			UsersPage_Objects obj=new UsersPage_Objects(driver);
			obj.dashboard_Location_Dropdown();
		}
		
		
		//Check whether department dropdown is working and a department can be selected
		public void verify_Department_Dropdown_Selection() throws Exception {
			UsersPage_Objects obj=new UsersPage_Objects(driver);
			obj.dashboard_Department_Dropdown();
		}
		
		//Check whether status dropdown is working and a status can be selected
		public void verify_Status_Dropdown_Selection() throws Exception {
			UsersPage_Objects obj=new UsersPage_Objects(driver);
			obj.dashboard_Status_Dropdown();
		}
		
		
		//Checking is create user button is enabled
		public void verify_Create_User_Button_Enabled() throws Exception {
			UsersPage_Objects obj=new UsersPage_Objects(driver);
			obj.create_User_Btn_Enabled();
		}
		
		//Checking whether status dropdown is working and a status can be selected
		public void verify_Status_Dropdown_In_Create_User() throws Exception {
			UsersPage_Objects obj=new UsersPage_Objects(driver);
			obj.create_User_Btn_Click();
			Thread.sleep(1000);
			obj.status_Dropdown_Selection();
			Thread.sleep(1000);
		}
		
		//Checking whether location dropdown is working and a location can be selected
		public void verify_Location_Selection_In_Create_User() throws Exception {
			UsersPage_Objects obj=new UsersPage_Objects(driver);
			obj.create_User_Btn_Click();
			Thread.sleep(1000);
			obj.location_Dropdown_Selection();
			Thread.sleep(1000);
		}
		
		//Checking whether department  dropdown is working and a department  can be selected
		public void verify_Department_Selection_In_Create_User() throws Exception {
			UsersPage_Objects obj=new UsersPage_Objects(driver);
			obj.create_User_Btn_Click();
			Thread.sleep(1000);
			obj.department_Dropdown_Selection();
			Thread.sleep(1000);
		}
		
		//Checking whether role  dropdown is working and a role  can be selected
		public void verify_Role_Selection_In_Create_User() throws Exception {
			UsersPage_Objects obj=new UsersPage_Objects(driver);
			obj.create_User_Btn_Click();
			Thread.sleep(1000);
			obj.role_Selection();
			Thread.sleep(1000);
		}
		
		//Checking whether level  dropdown is working and a level  can be selected
		public void verify_Level_Selection_In_Create_User() throws Exception {
			UsersPage_Objects obj=new UsersPage_Objects(driver);
			obj.create_User_Btn_Click();
			Thread.sleep(1000);
			obj.level_Dropdown_Selection();
			Thread.sleep(1000);
		}
		//Checking whether language  dropdown is working and a language  can be selected
				public void verify_Language_Selection_In_Create_User() throws Exception {
					UsersPage_Objects obj=new UsersPage_Objects(driver);
					obj.create_User_Btn_Click();
					Thread.sleep(1000);
					obj.language_Dropdown_Selection();
					Thread.sleep(1000);
				}
				
				//CHecking is all checkboxes are clickable
				public void verify_Checkbox_Clicks() throws Exception {
					UsersPage_Objects obj=new UsersPage_Objects(driver);
					obj.create_User_Btn_Click();
					Thread.sleep(1000);
					obj.checkbox_Clicks();
					Thread.sleep(2000);
				}
			
				//Creating a new role without providing an data
				public void verify_Role_Creation_Without_Credentials() throws Exception {
					UsersPage_Objects obj= new UsersPage_Objects(driver);
					obj.create_Role_Btn_Click();
					Thread.sleep(1000);
					obj.create_Role_Save_Btn_Click();
					Thread.sleep(1000);
					obj.role_Required_Validation_Lbl();
				}
				
				//Creating a new role with providing an data
				public void verify_Role_Creation_With_Credentials() throws Exception {
					UsersPage_Objects obj= new UsersPage_Objects(driver);
					obj.create_Role_Btn_Click();
					Thread.sleep(1000);
					obj.new_Role_Txt_Input("New Role 7");
					obj.select_level_dropdown();
					Thread.sleep(1000);
					obj.create_Role_Save_Btn_Click();
					Thread.sleep(1500);
					obj.new_Role_Creation_Success_Lbl_Validation();
					
				}
				//Creating a new role with providing an data
				public void verify_Duplicate_Role_Creation() throws Exception {
					UsersPage_Objects obj= new UsersPage_Objects(driver);
					obj.create_Role_Btn_Click();
					Thread.sleep(1000);
					obj.new_Role_Txt_Input("New Role 5");
					obj.select_level_dropdown();
					Thread.sleep(1000);
					obj.create_Role_Save_Btn_Click();
					Thread.sleep(1500);
					obj.duplicate_Role_Creation_Validation_Lbl();
					
					
				} 
				
				//Checking if password can be changed without providing existing or new passwords
				public void verify_Blank_Password_Change() throws Exception {
					UsersPage_Objects obj=new UsersPage_Objects(driver);
					obj.change_Password_Btn_Click();
					Thread.sleep(3000);
					obj.reset_Btn_Click();
					Thread.sleep(1000);
					obj.blank_Password_Change_Validation_Messages();
					
				}
				
				//Checking if password can be changed successfully
				public void verify_Successful_Password_Change() throws Exception {
					UsersPage_Objects obj=new UsersPage_Objects(driver);
					obj.users_Btn_Click();
					Thread.sleep(1000);
					obj.change_Password_Btn_Click();
					Thread.sleep(3000);
					obj.current_Password_Txt("Qwerty@123");
					Thread.sleep(1000);
					obj.new_Password_Txt("Abcd@123");
					Thread.sleep(1000);
					obj.retype_Password_Txt("Abcd@123");
					Thread.sleep(1000);
					obj.reset_Btn_Click();
					Thread.sleep(1000);
					obj.password_Change_Successful();
					Thread.sleep(1000);
				}
				
				
				//Checking if password can be changed without providing new passwords
				public void verify_Password_Change_Without_Newpassword() throws Exception {
					UsersPage_Objects obj=new UsersPage_Objects(driver);
					obj.users_Btn_Click();
					Thread.sleep(1000);
					obj.change_Password_Btn_Click();
					Thread.sleep(3000);
					obj.current_Password_Txt("Abcd@123");
					obj.reset_Btn_Click();
					Thread.sleep(1000);
					obj.password_Change_Without_Newpassword_Validation_Messages();
				}
				
				public void verify_Two_Different_Passwords() throws Exception{
					UsersPage_Objects obj=new UsersPage_Objects(driver);
					obj.users_Btn_Click();
					Thread.sleep(1000);
					obj.change_Password_Btn_Click();
					Thread.sleep(3000);
					obj.current_Password_Txt("Qwerty@123");
					Thread.sleep(1000);
					obj.new_Password_Txt("Abcd@123");
					Thread.sleep(1000);
					obj.retype_Password_Txt("123@Abcd");
					obj.reset_Btn_Click();
					Thread.sleep(1000);
					obj.two_Passwords_Doesnot_Match_Lbl();
				}
				
				public void verify_Incorrect_Pattern() throws Exception{
					UsersPage_Objects obj=new UsersPage_Objects(driver);
					obj.users_Btn_Click();
					Thread.sleep(1000);
					obj.change_Password_Btn_Click();
					Thread.sleep(3000);
					obj.current_Password_Txt("Qwerty@123");
					Thread.sleep(1000);
					obj.new_Password_Txt("ABCD");
					Thread.sleep(1000);
					obj.retype_Password_Txt("ABC");
					obj.reset_Btn_Click();
					Thread.sleep(1000);
					obj.pattern_Incorrect_Lbl();
				}
				
			
		

		
	
}
