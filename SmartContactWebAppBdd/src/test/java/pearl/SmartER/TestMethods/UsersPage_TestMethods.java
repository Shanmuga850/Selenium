package pearl.SmartER.TestMethods;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pearl.SmartER.PageObjects.UsersPage_Objects;
import pearl.SmartER.Utils.UsersCreationExcel;

public class UsersPage_TestMethods extends BaseClassMain {
	public static WebDriver driver;

	public UsersPage_TestMethods(WebDriver driver) {
		this.driver=driver;
	}


	//Logging in as User
	public void temporary_Login() throws InterruptedException {

		driver.findElement(By.xpath("//*[@formcontrolname='username']")).sendKeys("ccuser08");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys("Qwerty@123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

	}

	//Logging in as Super User
	public void super_Login() throws InterruptedException {

		driver.findElement(By.xpath("//*[@formcontrolname='username']")).sendKeys("admin2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys("pumeX@123!@#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	//Super Admin Navigation
	public void super_Login_Navigation() throws Exception {

		driver.findElement(By.xpath("//body//div[@id='wrapper']//div[@id='page-wrapper']//div//div//div//div//div//div[1]//a[1]//img[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.xpath("//a[normalize-space()='List']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement we=driver.findElement(By.xpath("//select[@formcontrolname='hospitalid']"));
		Select s=new Select(we);
		s.selectByVisibleText("Kochi");
		Thread.sleep(5000);
		WebElement wb=driver.findElement(By.xpath("//select[@formcontrolname='departmentid']"));
		Select s1=new Select(wb);
		s1.selectByVisibleText("Critical Care"); 
		Thread.sleep(5000);
	}


	//Logging in as demo user
	public void demo_Login() throws Exception {

		driver.findElement(By.xpath("//*[@formcontrolname='username']")).sendKeys("Temporary_User");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));	
		driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys("Qwerty@123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));	
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	}


	//Navigating to List Page
	public void users_List() throws InterruptedException {

		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='List']")).click();
		Thread.sleep(6000);
	}

	//Navigating to User Roles Page
	public void user_Roles() throws Exception{

		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='User Roles']")).click();
		Thread.sleep(6000);
	}

	//Navigating to Change Password Page
	public void change_Password() throws InterruptedException {

		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Change Password']")).click();
		Thread.sleep(6000);
	}

	//Navigating to Reset Password Page
	public void reset_Password() throws InterruptedException {

		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Reset Password']")).click();
		Thread.sleep(6000);
	}

	//Navigating to User Uploader Page
	public void user_Uploader() throws InterruptedException {

		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='User Uploader']")).click();
		Thread.sleep(6000);
	}

	//Navigating to Group Mail Page
	public void group_Mail() throws InterruptedException {

		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Group Mail']")).click();
		Thread.sleep(6000);
	}

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
	public void verify_User_Creation() throws InterruptedException, Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(1);
		String name=list.get(2);
		String title=list.get(3);
		String email=list.get(4);
		String phoneno=list.get(5);
		String role=list.get(6);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.username_Txt(username);
		Thread.sleep(1000);
		obj.name_Txt(name);
		Thread.sleep(1000);
		obj.usertitle_Txt(title);
		Thread.sleep(1000);
		obj.email_Txt(email);
		Thread.sleep(1000);
		obj.phoneno_Txt(phoneno);
		Thread.sleep(1000);
		obj.roles_Txt(role);
		Thread.sleep(1000);
		obj.save_Btn_Click();
		obj.save_Validation_Message_Lbl();
	}


	//Creating a duplicate user
	public void verify_Duplicate_User_Creation() throws InterruptedException, Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(1);
		String name=list.get(2);
		String title=list.get(3);
		String email=list.get(4);
		String phoneno=list.get(5);
		String role=list.get(6);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.username_Txt(username);
		Thread.sleep(1000);
		obj.name_Txt(name);
		Thread.sleep(1000);
		obj.usertitle_Txt(title);
		Thread.sleep(1000);
		obj.email_Txt(email); 
		Thread.sleep(1000);
		obj.phoneno_Txt(phoneno);
		Thread.sleep(1000);
		obj.roles_Txt(role);
		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.username_Already_Exists();
	}

	//Creating user without providing the Username
	public void create_New_User_Without_Username() throws InterruptedException, Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String name=list.get(2);
		String title=list.get(3);
		String email=list.get(4);
		String phoneno=list.get(5);
		String role=list.get(6);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.name_Txt(name);
		Thread.sleep(1000);
		obj.usertitle_Txt(title);
		Thread.sleep(1000);
		obj.email_Txt(email);
		Thread.sleep(1000);
		obj.phoneno_Txt(phoneno);
		Thread.sleep(1000);
		obj.roles_Txt(role);
		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.username_Validation_Message_Lbl();
	}

	//Creating user without providing the Name
	public void create_New_User_Without_Name() throws InterruptedException, Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(1);
		String title=list.get(3); 
		String email=list.get(4);
		String phoneno=list.get(5);
		String role=list.get(6);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.username_Txt(username);
		Thread.sleep(1000);
		obj.usertitle_Txt(title);
		Thread.sleep(1000);
		obj.email_Txt(email);
		Thread.sleep(1000);
		obj.phoneno_Txt(phoneno);
		Thread.sleep(1000);
		obj.roles_Txt(role);
		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.name_Validation_Message_Lbl();
	}

	//Creating user without providing the Title
	public void create_New_User_Without_Usertitle() throws InterruptedException, Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(1);
		String name=list.get(2); 
		String email=list.get(4);
		String phoneno=list.get(5);
		String role=list.get(6);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.username_Txt(username);
		Thread.sleep(1000);
		obj.name_Txt(name);
		Thread.sleep(1000);
		obj.email_Txt(email);
		Thread.sleep(1000);
		obj.phoneno_Txt(phoneno);
		Thread.sleep(1000);
		obj.roles_Txt(role);
		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.title_Validation_Message_Lbl();
	}

	//Creating user without providing the Email
	public void create_New_User_Without_Email() throws InterruptedException, Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(1);
		String name=list.get(2);
		String title=list.get(3); 
		String phoneno=list.get(5);
		String role=list.get(6);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.username_Txt(username);
		Thread.sleep(1000);
		obj.name_Txt(name);
		Thread.sleep(1000);
		obj.usertitle_Txt(title);
		Thread.sleep(1000);
		obj.phoneno_Txt(phoneno);
		Thread.sleep(1000);
		obj.roles_Txt(role);
		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.email_Validation_Message_Lbl();
	}

	//Creating user without providing the Phone Number
	public void create_New_User_Without_Phone_Number() throws InterruptedException, Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(1);
		String name=list.get(2);
		String title=list.get(3); 
		String email=list.get(4);
		String role=list.get(6);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.username_Txt(username);
		Thread.sleep(1000);
		obj.name_Txt(name);
		Thread.sleep(1000);
		obj.usertitle_Txt(title);
		Thread.sleep(1000);
		obj.email_Txt(email);
		Thread.sleep(1000);
		obj.roles_Txt(role);
		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.phoneno_Validation_Message_Lbl();
	}

	//Creating user without providing the Role
	public void create_New_User_Without_Role() throws InterruptedException, Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(1);
		String name=list.get(2);
		String title=list.get(3); 
		String email=list.get(4);
		String phoneno=list.get(5);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.username_Txt(username);
		Thread.sleep(1000);
		obj.name_Txt(name);
		Thread.sleep(1000);
		obj.usertitle_Txt(title);
		Thread.sleep(1000);
		obj.email_Txt(email);
		Thread.sleep(1000);
		obj.phoneno_Txt(phoneno);
		Thread.sleep(1000);
		obj.level_Dropdown();
		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.role_Vaidation_Message_Lbl();
	}

	//Creating user without providing the Level
	public void create_New_User_Without_Level() throws InterruptedException, Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(1);
		String name=list.get(2);
		String title=list.get(3); 
		String email=list.get(4);
		String phoneno=list.get(5);
		String role=list.get(6);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
		obj.username_Txt(username);
		Thread.sleep(1000);
		obj.name_Txt(name);
		Thread.sleep(1000);
		obj.usertitle_Txt(title);
		Thread.sleep(1000);
		obj.email_Txt(email);
		Thread.sleep(1000);
		obj.phoneno_Txt(phoneno);
		Thread.sleep(1000);
		obj.roles_Txt(role);
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
	public void edit_Existing_User() throws InterruptedException, Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String searchusername=list.get(1);
		String newusername=list.get(7);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		Thread.sleep(5000);
		obj.search_By_Username_Txt(searchusername);
		Thread.sleep(2000);
		obj.edit_Btn_Click();
		Thread.sleep(10000);
		obj.username_Txt_Clear();
		Thread.sleep(1000); 
		obj.username_Txt(newusername);	
		Thread.sleep(500);
		obj.save_Btn_Click();
		Thread.sleep(500);
		obj.successful_Edit_Validation_Lbl();
	}

	//Check edited entry
	public void check_Edited_Entry() throws InterruptedException, Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(7);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		Thread.sleep(5000);
		obj.search_By_Username_Txt(username);
		Thread.sleep(3000);
		String actual = obj.search_Result_Username_Txt();
		Thread.sleep(2000);
		System.out.println("Actual Username is "+actual);
		String expected = username;
		System.out.println("Expected Username is "+expected);
		Assert.assertEquals(actual, expected);
	}

	//Delete confirmation window
	public void delete_Confirmation_Window() throws Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(7);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.search_By_Username_Txt(username);
		Thread.sleep(1500);
		obj.delete_Btn_Click();
		Thread.sleep(2000);
		obj.delete_Confirmation_Window();


	}

	//Click on delete user
	public void delete_User() throws Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(7);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.search_By_Username_Txt(username);
		Thread.sleep(1000);
		obj.delete_Btn_Click();
		Thread.sleep(2000);
		obj.delete_Conformation_Btn();
		Thread.sleep(2000);
		obj.deleted_Confirmation_Alertbox(); 

	} 
	//Checking if a deleted entry is available
	public void deletion_Status() throws InterruptedException, Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(7);

		Thread.sleep(3000);
		List<WebElement>list2=driver.findElements(By.xpath("//div[@id='page-wrapper']//app-content//app-users//div//div//div//div//div//div//div//table//tbody"));
		System.out.println("________________________________________________________________________________________");
		for(WebElement element:list2) {
			String value=element.getText();
			System.out.println(value);
			System.out.println("________________________________________________________________________________________");
			if(value.contains(username)) {
				System.out.println("FAILURE !! User not deleted !!");
			} else {
				System.out.println("SUCCESS !! User already deleted !!"); 
			}
		}
		Thread.sleep(2000);
	}

	//Creating new user with photo, saving and checking for preview
	public void verify_Uploaded_Image_Preview () throws InterruptedException, Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(8);
		String name=list.get(9);
		String title=list.get(10);
		String email=list.get(11);
		String phoneno=list.get(12);
		String role=list.get(13);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(6000);
		obj.username_Txt(username);
		Thread.sleep(1000);
		obj.name_Txt(name);
		Thread.sleep(1000);
		obj.usertitle_Txt(title);
		Thread.sleep(1000);
		obj.email_Txt(email);
		Thread.sleep(1000);
		obj.phoneno_Txt(phoneno);
		Thread.sleep(1000); 
		obj.upload_Photo_Btn();
		Thread.sleep(1000);
		obj.roles_Txt(role);
		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(5000);
		obj.search_By_Username_Txt(username);
		Thread.sleep(3000);
		obj.edit_Btn_Click();
		Thread.sleep(7000);
		obj.uploaded_Image_Preview();

	}



	//Checking if an invalid email format can be used to create a user
	public void verify_Email_Format_Is_Valid() throws Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String email=list.get(14);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		Thread.sleep(2000);
		obj.create_User_Btn_Click();
		Thread.sleep(3000);
		obj.email_Txt(email);
		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(1000);
		obj.invalid_Email_Validation_Message_Lbl();
		Thread.sleep(2000);
	}

	//Checking to see if a file of invalid format can be uploaded
	public void verify_Invalid_Uploaded_Image_Format() throws Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(21);
		String name=list.get(22);
		String title=list.get(23);
		String email=list.get(24);
		String phoneno=list.get(25);
		String role=list.get(26);


		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(1000);
		obj.username_Txt(username); 
		Thread.sleep(1000);
		obj.name_Txt(name);
		Thread.sleep(1000);
		obj.usertitle_Txt(title);
		Thread.sleep(1000);
		obj.email_Txt(email);
		Thread.sleep(1000);
		obj.phoneno_Txt(phoneno);
		Thread.sleep(1000);
		obj.upload_Invalid_File();
		obj.roles_Txt(role);
		Thread.sleep(1000);
		obj.save_Btn_Click();
		Thread.sleep(3000);
		obj.invalid_Filetype_Upload_Lbl_Is_Enabled();
	}

	//Check if level will be deselected if role is removed
	public void verify_Level_Deselection_On_Role_Removal() throws Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String role=list.get(6);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(1000);
		obj.roles_Txt(role);
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
		Thread.sleep(2000);
		obj.create_User_Btn_Click();
		Thread.sleep(3000);
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
		Thread.sleep(2000);
		obj.create_User_Btn_Click();
		Thread.sleep(3000);
		obj.language_Dropdown_Selection();
		Thread.sleep(1000);
	}

	//CHecking is all checkboxes are clickable
	public void verify_Checkbox_Clicks() throws Exception {
		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.create_User_Btn_Click();
		Thread.sleep(2000);
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

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String newrole=list.get(15);

		UsersPage_Objects obj= new UsersPage_Objects(driver); 
		obj.create_Role_Btn_Click();
		Thread.sleep(1000);
		obj.new_Role_Txt_Input(newrole);
		obj.select_level_dropdown();
		Thread.sleep(1000);
		obj.create_Role_Save_Btn_Click();
		Thread.sleep(1500);
		obj.new_Role_Creation_Success_Lbl_Validation();

	}

	//Creating a new role with providing an data
	public void verify_Duplicate_Role_Creation() throws Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String newrole=list.get(15);

		UsersPage_Objects obj= new UsersPage_Objects(driver);
		obj.create_Role_Btn_Click();
		Thread.sleep(1000);
		obj.new_Role_Txt_Input(newrole);
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

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String currentpassword=list.get(16);
		String newpassword=list.get(17);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.change_Password_Btn_Click();
		Thread.sleep(3000);
		obj.current_Password_Txt(currentpassword);
		Thread.sleep(1000);
		obj.new_Password_Txt(newpassword);
		Thread.sleep(1000);
		obj.retype_Password_Txt(newpassword);
		Thread.sleep(1000);
		obj.reset_Btn_Click();
		Thread.sleep(1000);
		obj.password_Change_Successful();
		Thread.sleep(1000);
	} 


	//Checking if password can be changed without providing new passwords
	public void verify_Password_Change_Without_Newpassword() throws Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String currentpassword=list.get(16);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.change_Password_Btn_Click();
		Thread.sleep(3000);
		obj.current_Password_Txt(currentpassword);
		obj.reset_Btn_Click();
		Thread.sleep(1000);
		obj.password_Change_Without_Newpassword_Validation_Messages();
	}

	//Checking if two different new passwords can be used
	public void verify_Two_Different_Passwords() throws Exception{

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String currentpassword=list.get(16);
		String diffpassword=list.get(18);
		String diffpassword2=list.get(19);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.change_Password_Btn_Click();
		Thread.sleep(3000);
		obj.current_Password_Txt(currentpassword);
		Thread.sleep(1000);
		obj.new_Password_Txt(diffpassword);
		Thread.sleep(1000);
		obj.retype_Password_Txt(diffpassword2);
		obj.reset_Btn_Click();
		Thread.sleep(1000);
		obj.two_Passwords_Doesnot_Match_Lbl();
	}

	//Checking if incorrect pattern password can be used
	public void verify_Incorrect_Pattern() throws Exception{

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String currentpassword=list.get(16);
		String incorrectpattern=list.get(20);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.change_Password_Btn_Click();
		Thread.sleep(3000);
		obj.current_Password_Txt(currentpassword);
		Thread.sleep(1000);
		obj.new_Password_Txt(incorrectpattern);
		Thread.sleep(1000);
		obj.retype_Password_Txt(incorrectpattern);
		obj.reset_Btn_Click();
		Thread.sleep(1000);
		obj.pattern_Incorrect_Lbl();
	}

	//Checking if password can be reset without providing credentials
	public void verify_Blank_Password_Reset() throws InterruptedException {
		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.reset_Password_Reset_Btn_Click();
		Thread.sleep(2000);
		obj.username_Required_Validation_Lbl();
		Thread.sleep(500);
		obj.new_Password_Required_Validation_Lbl();
		Thread.sleep(500);
		obj.retype_Password_Validation_Lbl();
	}

	//Checking if password can be reset without providing passwords
	public void verify_Password_Reset_Invalid_Username() throws InterruptedException, IOException {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(27);
		String newpassword=list.get(28);
		String retype=list.get(29);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.reset_Password_Page_Username_Txt(username);
		Thread.sleep(500);
		obj.reset_Password_New_Password_Txt(newpassword);
		Thread.sleep(500);
		obj.reset_Password_Retype_Password_Txt(retype);
		Thread.sleep(500);
		obj.reset_Password_Reset_Btn_Click();
		Thread.sleep(2000);
		obj.user_Doesnot_Exist_Validaion_Lbl();
	}

	//Checking if password can be reset without providing the new and retype passwords
	public void verify_Password_Reset_Without_Passwords() throws Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(27);
		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.reset_Password_Page_Username_Txt(username);
		Thread.sleep(500);
		obj.reset_Password_Reset_Btn_Click();
		Thread.sleep(2000);
		obj.new_Password_Required_Validation_Lbl();
		Thread.sleep(500);
		obj.retype_Password_Validation_Lbl();
		Thread.sleep(500);	
	}

	//Checking if two different passwords can be used
	public void verify_Two_Different_Passwords_Reset() throws Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(31);
		String newpassword=list.get(28);
		String retype=list.get(30);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.reset_Password_Page_Username_Txt(username);
		Thread.sleep(500);
		obj.reset_Password_New_Password_Txt(newpassword);
		Thread.sleep(500);
		obj.reset_Password_Retype_Password_Txt(retype);
		Thread.sleep(500);
		obj.reset_Password_Reset_Btn_Click();
		Thread.sleep(2000);
		obj.passwords_Donot_Match_Validation_Lbl();
	}

	//CHecking if a password of different pattern can be used
	public void verify_Incorrect_Pattern_Reset() throws Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(31);
		String newpassword=list.get(32);
		String retype=list.get(32);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.reset_Password_Page_Username_Txt(username);
		Thread.sleep(500);
		obj.reset_Password_New_Password_Txt(newpassword);
		Thread.sleep(500);
		obj.reset_Password_Retype_Password_Txt(retype);
		Thread.sleep(500);
		obj.reset_Password_Reset_Btn_Click();
		Thread.sleep(2000);
		obj.password_Reset_Pattern_Validation_Lbl();
	}

	//Checking successful password reset
	public void verify_Successful_Password_Reset() throws Exception {

		UsersCreationExcel uce_obj=new UsersCreationExcel();
		ArrayList<String> list=uce_obj.getdata("Details");
		String username=list.get(31);
		String newpassword=list.get(29);

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.reset_Password_Btn_Click();
		Thread.sleep(4000);
		obj.reset_Password_Page_Username_Txt(username);
		Thread.sleep(500);
		obj.reset_Password_New_Password_Txt(newpassword);
		Thread.sleep(500);
		obj.reset_Password_Retype_Password_Txt(newpassword);
		Thread.sleep(500);
		obj.reset_Password_Reset_Btn_Click();
		Thread.sleep(2000);
		obj.password_Reset_Success_Validation_Lbl();
	}

	//Checking location dropdown in User Uploader
	public void verify_User_Uploader_Location_Dropdown() throws Exception {

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.user_Uploader_Location_Dropdown();
		Thread.sleep(2000);

	}

	//Checking department dropdown in User Uploader
	public void verify_User_Uploader_Department_Dropdown() throws Exception {

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.user_Uploader_Department_Dropdown();
		Thread.sleep(2000);

	}

	//Checking roles dropdown in User Uploader
	public void verify_User_Uploader_Roles_Dropdown() throws Exception {

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.user_Uploader_Roles_Dropdown();
	}

	//Checking download sample CSV button
	public void verify_Download_CSV_Button() throws Exception {

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.download_Sample_CSV_Btn_Enabled();
		Thread.sleep(2000);
	}

	//Checking choose file button
	public void verify_Choose_File_Button() {
		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.user_Uploader_Choose_File_Btn_Enabled();
	}

	//Checking if an invalid format file can be uploaded
	public void verify_Invalid_CSV_FIle_Upload() throws Exception {

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.upload_Invalid_CSV_File();

	}

	//Checking if a valid format file can be uploaded
	public void verify_Valid_CSV_File_Upload() throws Exception {

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		driver.findElement(By.xpath("//body//div[@id='wrapper']//div[@id='page-wrapper']//div//div//div//div//div//div[1]//a[1]//img[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[normalize-space()='Users']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='User Uploader']")).click();
		Thread.sleep(3000);
		obj.user_Uploader_Location_Dropdown();
		Thread.sleep(1500);
		obj.user_Uploader_Department_Dropdown();
		Thread.sleep(1500);
		obj.user_Uploader_Roles_Dropdown();
		Thread.sleep(1500);
		obj.upload_Valid_CSV_File();
		Thread.sleep(2000);
		obj.user_Final_Upload_Btn_Click();
		Thread.sleep(2000);
		obj.successfully_Uploaded_Validation_Lbl();
		Thread.sleep(2000);

	}

	//Checking if email is sent successfully
	public void verify_Successful_Email_Sent() throws Exception {

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.group_Mail_Role_Dropdown_Select();
		Thread.sleep(3000);
		obj.email_To_Be_Removed_Click();
		Thread.sleep(1000);
		obj.group_Mail_Remove_Btn_Click();
		Thread.sleep(1000);
		obj.group_Mail_Subject_Txt();
		Thread.sleep(1000);
		obj.group_Mail_Message_Txt();
		Thread.sleep(1000);
		obj.group_Mail_Send_Btn_Click();
		Thread.sleep(3000);
		obj.message_Sent_Successfully_Lbl();

	}

	//Checking if an email address can be removed from the list
	public void verify_Email_removal() throws Exception {

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.group_Mail_Role_Dropdown_Select();
		Thread.sleep(3000);
		obj.email_To_Be_Removed_Click();
		Thread.sleep(1000);
		obj.group_Mail_Remove_Btn_Click();
		Thread.sleep(1000);
		obj.email_Removal();

	}

	//Checking if an email address can be added
	public void Verify_Email_Addition() throws Exception {

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.group_Mail_Role_Dropdown_Select();
		Thread.sleep(3000);
		obj.email_To_Be_Removed_Click();
		Thread.sleep(1000);
		obj.group_Mail_Remove_Btn_Click();
		Thread.sleep(1000);
		obj.email_To_Be_Removed_Click();
		Thread.sleep(1000);
		obj.group_Mail_Add_Btn_Click();
		Thread.sleep(1000);
		obj.email_Removal_Status();
	}

	//Checking if email can be sent without email address
	public void verify_Email_Without_Address() throws Exception {

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.group_Mail_Subject_Txt();
		Thread.sleep(1000);
		obj.group_Mail_Message_Txt();
		Thread.sleep(1000);
		obj.group_Mail_Send_Btn_Click();
		Thread.sleep(1000);
		obj.email_Required_Lbl();

	}

	//Checking if email can be sent without email subject
	public void verify_Email_Without_Subject() throws Exception {

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.group_Mail_Role_Dropdown_Select();
		Thread.sleep(3000);
		obj.group_Mail_Message_Txt();
		Thread.sleep(1000);
		obj.group_Mail_Send_Btn_Click();
		Thread.sleep(1000);
		obj.subject_Required_Lbl();
	}

	//Checking if email can be sent without email message
	public void verify_Email_Without_Message() throws Exception {

		UsersPage_Objects obj=new UsersPage_Objects(driver);
		obj.group_Mail_Role_Dropdown_Select();
		Thread.sleep(3000);
		obj.group_Mail_Subject_Txt();
		Thread.sleep(1000);
		obj.group_Mail_Send_Btn_Click();
		Thread.sleep(1000);
		obj.message_Required_Lbl();
	}
}
