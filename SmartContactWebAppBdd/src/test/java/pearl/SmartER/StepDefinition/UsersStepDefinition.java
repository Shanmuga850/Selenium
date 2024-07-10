package pearl.SmartER.StepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pearl.SmartER.TestMethods.BaseClassMain;
import pearl.SmartER.TestMethods.UsersPage_TestMethods;

@RunWith(Cucumber.class)


//Verify user can be created without credentials

public class UsersStepDefinition extends BaseClassMain{
	@Given("Invoking the browser")
	public void invoking_The_Browser() throws Exception {
		driver=initializeDriver();

	}

	@When("Navigate to Home page")
	public void navigate_To_Home_Page() throws Exception {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
	}


	@Then("Verify user can be created without credentials")
	public void verify_User_Can_Be_Created_Without_Credentials() throws InterruptedException {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_User_Creation_Without_Credentials();
		driver.close();
	}

	// Verify whether a new user can be created after providing all data

	@Given("^Invoking browser$")
	public void invoking_Browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Navigate to the Home page$")
	public void navigate_To_The_Home_Page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
	}

	@Then("^Verify user can be created after providing all data$")
	public void verify_User_Can_Be_Created_After_Providing_All_Data() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_User_Creation();
		driver.close();
	}

	//Verify if a duplicate user can be created

	@Given("^Invoking webbrowser$")
	public void invoking_Webbrowser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Navigate to homepage$")
	public void navigate_To_Homepage() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
	}

	@Then("^Verify if a duplicate user can be created$")
	public void verify_If_A_Duplicate_User_Can_Be_Created() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_Duplicate_User_Creation();
		driver.close();
	}

	//Verify whether new user can be created without giving the username

	@Given("^Opening the browser$")
	public void opening_The_Browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Navigating to home page$")
	public void navigating_To_Home_Page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
	}

	@Then("^Verify whether new user can be created without giving the username$")
	public void verify_Whether_New_User_Can_Be_Created_Without_Giving_The_Username() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.create_New_User_Without_Username();
		driver.close();
	}

	//Verify whether new user can be created without giving the name

	@Given("^Opening the web browser$")
	public void opening_the_web_browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Navigating to homepage$")
	public void navigating_to_homepage() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
	}

	@Then("^Verify whether new user can be created without giving the name$")
	public void verify_whether_new_user_can_be_created_without_giving_the_name() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.create_New_User_Without_Name();
		driver.close();
	}

	//Verify whether new user can be created without giving the title

	@Given("^Opening the webbrowser$")
	public void opening_the_webbrowser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Navigating to the homepage$")
	public void navigating_to_the_homepage() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
	}

	@Then("^Verify whether new user can be created without giving the title$")
	public void verify_whether_new_user_can_be_created_without_giving_the_title() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.create_New_User_Without_Usertitle();
		driver.close();
	}

	//Verify whether new user can be created without giving the email

	@Given("^Open the webbrowser$")
	public void open_the_webbrowser() throws Throwable {
		driver=initializeDriver();

	}

	@When("^Navigating to the home page$")
	public void navigating_to_the_home_page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
	}

	@Then("^Verify whether new user can be created without giving the email$")
	public void verify_whether_new_user_can_be_created_without_giving_the_email() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.create_New_User_Without_Email();
		driver.close();
	}

	//Verify whether new user can be created without giving the phone number

	@Given("^Load the browser$")
	public void load_the_browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Go to home page$")
	public void go_to_home_page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
	}

	@Then("^Verify whether new user can be created without giving the phone number$")
	public void verify_whether_new_user_can_be_created_without_giving_the_phone_number() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.create_New_User_Without_Phone_Number();
		driver.close();
	}

	//Verify whether new user can be created without giving the role

	@Given("^Load browser$")
	public void load_browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Go to homepage$")
	public void go_to_homepage() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
	}

	@Then("^Verify whether new user can be created without giving the role$")
	public void verify_whether_new_user_can_be_created_without_giving_the_role() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.create_New_User_Without_Role();
		driver.close();
	}

	//Verify whether new user can be created without giving the level

	@Given("^Load the web browser$")
	public void load_the_web_browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Go to the home page$")
	public void go_to_the_home_page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.super_Login();
		up_obj.super_Login_Navigation();
	}

	@Then("^Verify whether new user can be created without giving the level$")
	public void verify_whether_new_user_can_be_created_without_giving_the_level() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.create_New_User_Without_Level();
		driver.close();
	}

	//Verify Users button is enabled

	@Given("^Load web browser$")
	public void load_web_browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Load the home page$")
	public void load_the_home_page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
	}

	@Then("^Verify whether Users button is enabled$")
	public void verify_whether_users_button_is_enabled() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_Users_Button_Enabed();
		driver.close();

	}

	//Verify whether an existing user data can be edited

	@Given("^Load the webbrowser$")
	public void load_the_webbrowser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Navigate to home page$")
	public void navigate_to_home_page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
	}

	@Then("^Verify whether an existing user data can be edited$")
	public void verify_whether_an_existing_user_data_can_be_edited() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.edit_Existing_User();
		driver.close();
	}

	//Verify whether an edited entry is saved successfully

	@Given("^Loads the browser$")
	public void loads_the_browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Navigate to the home page$")
	public void navigate_to_the_home_page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();

	}

	@Then("^Verify whether an edited entry is saved successfully$")
	public void verify_whether_an_edited_entry_is_saved_successfully() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.check_Edited_Entry();
		driver.close();
	}

	//Verify whether a confirmation window comes upon clicking the delete button

	@Given("^Loads the web browser$")
	public void loads_the_web_browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Navigate to the homepage$")
	public void navigate_to_the_homepage() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
	}

	@Then("^Verify whether a confirmation window comes upon clicking the delete button$")
	public void verify_whether_a_confirmation_window_comes_upon_clicking_the_delete_button() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.delete_Confirmation_Window();
		driver.close();
	}

	//Verify whether an entry can be deleted

	@Given("^Loads the webbrowser$")
	public void loads_the_webbrowser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Navigates to homepage$")
	public void navigates_to_homepage() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
	}

	@Then("^Verify whether an entry can be deleted$")
	public void verify_whether_an_entry_can_be_deleted() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.delete_User();
		driver.close();
	}

	//Verify if a deleted entry is still available

	@Given("^Loads webbrowser$")
	public void loads_webbrowser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Navigates to the homepage$")
	public void navigates_to_the_homepage() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();

	}

	@Then("^Verify if a deleted entry is still available$")
	public void verify_if_a_deleted_entry_is_still_available() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.deletion_Status();
		driver.close();
	}

	//Verify whether the uploaded image can be previewed

	@Given("^Open web browser$")
	public void open_web_browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Navigates to the home page$")
	public void navigates_to_the_home_page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();

	}

	@Then("^Verify whether the uploaded image can be previewed$")
	public void verify_whether_the_uploaded_image_can_be_previewed() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_Uploaded_Image_Preview();
		driver.close();
	} 

	//Verify whether the email format is valid

	@Given("^Opens web browser$")
	public void opens_web_browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Navigates to the users list$")
	public void navigates_to_the_users_list() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();

	}

	@Then("^Verify whether the email format is valid$")
	public void verify_whether_the_email_format_is_valid() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_Email_Format_Is_Valid();
		driver.close();
	}

	//Verify whether uploaded image format is invalid

	@Given("^User loads the web browser$")
	public void user_loads_the_web_browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Navigates to the users list screen$")
	public void navigates_to_the_users_list_screen() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();

	}

	@Then("^Verify whether uploaded image format is invalid$")
	public void verify_whether_uploaded_image_format_is_invalid() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_Invalid_Uploaded_Image_Format();
		driver.close();
	}

	//Verify whether level is deselected when role is removed

	@Given("^User loads web browser$")
	public void user_loads_web_browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Navigates to users list page$")
	public void navigates_to_users_list_page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
	}

	@Then("^Verify whether level is deselected when role is removed$")
	public void verify_whether_level_is_deselected_when_role_is_removed() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_Level_Deselection_On_Role_Removal();
		driver.close();
	}

	//Verify whether the Location dropdown is active and a location can be selected

	@Given("^User loads the browser$")
	public void user_loads_the_browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Navigates to edit user page$")
	public void navigates_to_edit_user_page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
	}

	@Then("^Verify whether the Location dropdown is active and a location can be selected$")
	public void verify_whether_the_location_dropdown_is_active_and_a_location_can_be_selected() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_Location_Dropdown_Selection();
		driver.close();
	}

	//Verify whether the Department dropdown is active and a department can be selected

	@Given("^Invoke the web browser$")
	public void invoke_the_web_browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^Navigates to the edit user page$")
	public void navigates_to_the_edit_user_page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
	}

	@Then("^Verify whether the department dropdown is active and a department can be selected$")
	public void verify_whether_the_department_dropdown_is_active_and_a_department_can_be_selected() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_Department_Dropdown_Selection();
		driver.close();
	}

	//Verify whether the Status dropdown is active and a status can be selected

	@Given("^Invoke the webbrowser$")
	public void invoke_the_webbrowser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^User navigates to the edit user page$")
	public void user_navigates_to_the_edit_user_page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
	}

	@Then("^Verify whether the Status dropdown is active and a status can be selected$")
	public void verify_whether_the_status_dropdown_is_active_and_a_status_can_be_selected() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_Status_Dropdown_Selection();
		driver.close();
	}

	//Verify whether create user button is enabled

	@Given("^Invoke web browser$")
	public void invoke_web_browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^User navigates to the users page$")
	public void user_navigates_to_the_users_page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();

	}

	@Then("^Verify whether create user button is enabled$")
	public void verify_whether_create_user_button_is_enabled() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_Create_User_Button_Enabled();
		driver.close();
	}

	//Verify whether status dropdown is working and a status can be selected

	@Given("^User invokes webbrowser$")
	public void user_invokes_webbrowser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^The user navigates to the user list page$")
	public void the_user_navigates_to_the_user_list_page() throws Throwable { 
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();

	}

	@Then("^Verify whether status dropdown is working and a status can be selected$")
	public void verify_whether_status_dropdown_is_working_and_a_status_can_be_selected() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_Status_Dropdown_In_Create_User();
		driver.close();
	}

	//Verify whether location dropdown is working and a location can be selected

	@Given("^User invokes web browser$")
	public void user_invokes_web_browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^The user navigates to users list page$")
	public void the_user_navigates_to_users_list_page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();

	}

	@Then("^Verify whether location dropdown is working and a location can be selected$")
	public void verify_whether_location_dropdown_is_working_and_a_location_can_be_selected() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_Location_Selection_In_Create_User();
		driver.close();
	}

	//Verify whether department dropdown is working and a department can be selected

	@Given("^The user invokes web browser$")
	public void the_user_invokes_web_browser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^The user navigates to the users list page$")
	public void the_user_navigates_to_the_users_list_page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();

	}

	@Then("^Verify whether department dropdown is working and a department can be selected$")
	public void verify_whether_department_dropdown_is_working_and_a_department_can_be_selected() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_Department_Selection_In_Create_User();
		driver.close();
	}

	//Verify whether role dropdown is working and a role can be selected

	@Given("^The user invokes webbrowser$")
	public void the_user_invokes_webbrowser() throws Throwable {
		driver=initializeDriver();
	}

	@When("^The user navigates to the users list screen$")
	public void the_user_navigates_to_the_users_list_screen() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();

	}

	@Then("^Verify whether role dropdown is working and a role can be selected$")
	public void verify_whether_role_dropdown_is_working_and_a_role_can_be_selected() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_Role_Selection_In_Create_User();
		driver.close();
	}

	//Verify whether level dropdown is working and a level can be selected

	@Given("^Web browser is loaded$")
	public void web_browser_is_loaded() throws Throwable {
		driver=initializeDriver();
	}

	@When("^The users logs in to the users list page$")
	public void the_users_logs_in_to_the_users_list_page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();

	}

	@Then("^Verify whether level dropdown is working and a level can be selected$")
	public void verify_whether_level_dropdown_is_working_and_a_level_can_be_selected() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_Level_Selection_In_Create_User();
		driver.close();
	}

	//Verify whether language dropdown is working and a language can be selected

	@Given("^Web browser is loaded by the user$")
	public void web_browser_is_loaded_by_the_user() throws Throwable {
		driver=initializeDriver();
	}

	@When("^The user logs into the users list page$")
	public void the_user_logs_into_the_users_list_page() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.temporary_Login();
		up_obj.users_List();
	}

	@Then("^Verify whether language dropdown is working and a language can be selected$")
	public void verify_whether_language_dropdown_is_working_and_a_language_can_be_selected() throws Throwable {
		UsersPage_TestMethods up_obj=new UsersPage_TestMethods(driver);
		up_obj.verify_Language_Selection_In_Create_User();
		driver.close();
	}



}