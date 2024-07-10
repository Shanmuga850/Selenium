package pearl.SmartER.StepDefinition;

import java.io.IOException;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pearl.SmartER.TestMethods.BaseClassMain;
import pearl.SmartER.TestMethods.SurveyPage_TestMethods;

@RunWith(Cucumber.class)
public class SurveyStepDefinition extends BaseClassMain{

	// Scenario-1: Verify User is able to view survey button
	@Given("User Navigates to SmartER Login Page1")
	public void Go_to_Specified_url_of_the_application() {
		//Initialize the Driver
		driver = initializeDriver();
	}

	@When("User Enter into the Homepage of the Application")
	public void User_Enter_into_the_Homepage_of_the_Application() throws IOException, InterruptedException {
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}

	@Then("Verify user is able to view Survey Button")
	public void verify_user_is_able_to_view_survey_button() throws IOException, InterruptedException {
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify User is able to view survey Button
		stm.verifySurveyButtonIsVisible();
		driver.close();

	}

	//Scenario-2: Verify Whether User is able to enter Question Bank

	@Given("User Navigates to SmartER Login Page2")
	public void Go_to_Speficified_URL_of_the_application() {
		//Initialize the Driver
		driver = initializeDriver();
	}

	@When("User Enter Into the Homepage of the Application")
	public void User_Enter_Into_the_Homepage_of_the_Application() throws IOException, InterruptedException {
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}

	@Then("Verify User is able to enter Question Bank")
	public void verify_user_is_able_to_enter_question_bank() throws InterruptedException, IOException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify User in the Quesiton Bank Page
		stm.verifyUserintheQuestionBankPage();

		//Close the driver
		driver.close();
	}

	//Scenario-3: Verify Whether User is able to enter Question Bank
	@Given("User Navigates to SmartER Login Page3")
	public void Go_To_Specified_URL_of_the_application() {
		//Initialize the Driver
		driver = initializeDriver();

	}

	@When("User Enter Into The Homepage of the Application")
	public void User_Enter_Into_The_Homepage_of_the_Application() throws IOException, InterruptedException {
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();

	}

	@Then("Verify User is able to enter Add From Warehouse")
	public void verify_user_is_able_to_enter_add_from_warehouse() throws InterruptedException {
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify User in the Ware House Page
		stm.verifyUserInTheWarehouse();

		//Close the Driver
		driver.close();
	}

	//Scenario-4 : Verify Whether User is able to create a New Question with valid data
	@Given("User Navigates to SmartER Login Page4")
	public void user_navigates_to_smart_er_login_page4() {

		//Initialize the Driver
		driver = initializeDriver();
	}

	@When("User Enter into The Homepage of the Application")
	public void user_enter_into_the_homepage_of_the_application() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}

	@Then("Verify Whether user can create a new question")
	public void verify_whether_user_can_create_a_new_question() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify Created Question Displayed in the Question Bank
		stm.verifyCreatedQuestionDisplayedInTheQuestionBank();

		//closing the driver
		driver.close();

	}

	//Scenario-5: Verify Whether User is able to create a new question without filling any data
	@Given("User Navigates to SmartER Login Page5")
	public void user_navigates_to_smart_er_login_page5() {
		//Initialize the Driver
		driver = initializeDriver();
	}
	@When("User enter into the Homepage of the application")
	public void user_enter_into_the_homepage_of_the_application5() throws IOException, InterruptedException {
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}
	@Then("Verify Validation messages are displayed")
	public void verify_validation_messages_are_displayed() throws InterruptedException, IOException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		stm.verifyQuestionRequireValidationMessageIsDisplayed();

		//Verify option require validation message is displayed
		stm.verifyOptionRequireValidationMessageIsDisplayed();

		//closing the driver
		driver.close();
	}

	//Scenario-6:  Verify Whether User is able to return the Creating a New Question Page into Question Bank
	@Given("User Navigates to SmartER Login Page6")
	public void user_navigates_to_smart_er_login_page6() {
		//Initialize the Driver
		driver = initializeDriver();
	}

	@When("User Enter into the Homepage OF the application")
	public void user_enter_into_the_homepage_of_the_application6() throws IOException, InterruptedException {
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}
	@Then("Verify User can return from Create a new question page into Question Bank Page")
	public void verify_user_can_return_from_create_a_new_question_page_into_question_bank_page() throws InterruptedException, IOException {
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify user return create new question page into question bank page
		stm.verifyUserReturnCreateNewQuestionPageIntoQuestionBankPage();

		//closing the driver
		driver.close();
	}

	//Scenario-7: Verify Whether the User can able to search a Question
	@Given("User Navigates to SmartER Login Page7")
	public void user_navigates_to_smart_er_login_page7() {

		//Initialize the Driver
		driver = initializeDriver();	
	}

	@When("User Enter INTO the Homepage OF the application")
	public void user_enter_into_the_homepage_of_the_application7() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}

	@Then("Verify Whether the user can search a question in the search field")
	public void verify_whether_the_user_can_search_a_question_in_the_search_field() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify searched quesiton displayed in the question bank
		stm.verifySearchedQuestionDisplayedInTheQuestionBank();

		//closing the driver
		driver.close();

	}

	//Scenario-8 : Verify Whether the User can delete the question in the question bank
	@Given("User Navigates to SmartER Login Page8")
	public void user_navigates_to_smart_er_login_page8() {

		//Initialize the Driver
		driver = initializeDriver();	
	}

	@When("User Enter InTo the Homepage of the application")
	public void user_enter_in_to_the_homepage_of_the_application8() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}
	@Then("Verify Whether the can delete the question in the question bank")
	public void verify_whether_the_can_delete_the_question_in_the_question_bank() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		stm.verifySearchedQuestionDisplayedInTheQuestionBank();

		//Delete the specified question
		stm.deleteTheSpecifiedQuestion();

		//closing the driver
		driver.close();
	}

	//Scenario-9: Verify Whether User is able to enter Current Surveys
	@Given("User Navigates to SmartER Login Page9")
	public void user_navigates_to_smart_er_login_page9() {

		//Initialize the Driver
		driver = initializeDriver();
	}

	@When("User Enter Into The HomePage of the application")
	public void user_enter_into_the_home_page_of_the_application9() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}

	@Then("Verify Whether User is able to enter the current Survey page")
	public void verify_whether_user_is_able_to_enter_the_current_survey_page() throws InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify user in the current survey page
		stm.verifyUserInTheCurrentSurveyPage();

		//closing the driver
		driver.close();
	}

	//Scenario-10: Verify Whether User is able to view Create Survey
	@Given("User Navigates to SmartER Login Page10")
	public void user_navigates_to_smart_er_login_page10() {
		//Initialize the Driver
		driver = initializeDriver();
	}

	@When("User Enter Into the Homepage of the application")
	public void user_enter_into_the_homepage_of_the_application10() throws IOException, InterruptedException {
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}

	@Then("Verify Whether User is able to view Create Survey")
	public void verify_whether_user_is_able_to_view_create_survey() throws InterruptedException {
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify create survey button is visible
		stm.verifyCreateSurveyButtonIsVisible();

		//closing the driver
		driver.close();

	}

	//Scenario-11: Verify Whether User is able to create a new survey
	@Given("User Navigates to SmartER Login Page11")
	public void user_navigates_to_smart_er_login_page11() {

		//Initialize the Driver
		driver = initializeDriver();	
	}

	@When("User Enter Into the Homepage of the application11")
	public void user_enter_into_the_homepage_of_the_application11() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}
	@Then("Verify Whether User is able to create a new survey")
	public void verify_whether_user_is_able_to_create_a_new_survey() throws InterruptedException, IOException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify survey successfully created validation
		stm.verifySurveySuccessfullyCreatedValidation();

		//closing the driver
		driver.close();
	}

	//Scenario-12: Verify Whether User is allow to create a new survey with already exiting data
	@Given("User Navigates to SmartER Login Page12")
	public void user_navigates_to_smart_er_login_page12() {

		//Initialize the Driver
		driver = initializeDriver();	
	}
	@When("User Enter Into the Homepage of the application12")
	public void user_enter_into_the_homepage_of_the_application12() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}
	@Then("Verify Whether User is allow to create a new survey with already exiting data")
	public void verify_whether_user_is_allow_to_create_a_new_survey_with_already_exiting_data() throws InterruptedException, IOException {
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify survey already exist validation
		stm.VerifySurveyAlreadyExistValidation();

		//closing the driver
		driver.close();
	}

	//Scenario-13: Verify Whether User is able to go to the Survey Definition form after filling all mandatory fileds in the Survey form in the Create Survey Page
	@Given("User Navigates to SmartER Login Page13")
	public void user_navigates_to_smart_er_login_page13() {

		//Initialize the Driver
		driver = initializeDriver();
	}
	@When("User Enter Into the Homepage of the application13")
	public void user_enter_into_the_homepage_of_the_application13() throws IOException, InterruptedException {
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();

	}
	@Then("Verify Whether User is able to go to the Survey Definition form after filling all mandatory fileds in the Survey form in the Create Survey Page")
	public void verify_whether_user_is_able_to_go_to_the_survey_definition_form_after_filling_all_mandatory_fileds_in_the_survey_form_in_the_create_survey_page() throws InterruptedException, IOException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify user in the survey definition page
		stm.verifyUserInTheSurveyDefinitionPage();
		
		//closing the driver
		driver.close();
	}

	//Scenario-14:  Verify Whtether User is allow to go Survey into a Survey Definition form without entering any data into a survey form in the Create Survey Page
	@Given("User Navigates to SmartER Login Page14")
	public void user_navigates_to_smart_er_login_page14() {

		//Initialize the Driver
		driver = initializeDriver();
	}

	@When("User Enter Into the Homepage of the application14")
	public void user_enter_into_the_homepage_of_the_application14() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();	
	}

	@Then("Verify Whtether User is allow to go Survey into a Survey Definition form without entering any data into a survey form in the Create Survey Page")
	public void verify_whtether_user_is_allow_to_go_survey_into_a_survey_definition_form_without_entering_any_data_into_a_survey_form_in_the_create_survey_page() throws InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify name validation message
		stm.verifyNameValidationMessage();

		//Verify age group validation message
		stm.verifyAgeGroupValidationMessage();

		//Verify header validation message
		stm.verifyHeaderValidationMessage();

		//closing the driver
		driver.close();
	}

	//Scenario-15: Verify Whether User is able to go to the Response Definition form after filling all mandatory fileds in the Survey Definition form in the Create Survey Page
	@Given("User Navigates to SmartER Login Page15")
	public void user_navigates_to_smart_er_login_page15() {

		//Initialize the Driver
		driver = initializeDriver();
	}

	@When("User Enter Into the Homepage of the application15")
	public void user_enter_into_the_homepage_of_the_application15() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();	
	}
	@Then("Verify Whether User is able to go to the Response Definition form after filling all mandatory fileds in the Survey Definition form in the Create Survey Page")
	public void verify_whether_user_is_able_to_go_to_the_response_definition_form_after_filling_all_mandatory_fileds_in_the_survey_definition_form_in_the_create_survey_page() throws InterruptedException, IOException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify user in the response definition page
		stm.verifyUserInTheResponseDefinitionPage();

		//closing the driver
		driver.close();
	}

	//Scenario-16: Verify Whether User is allow to go to the Response Definition form without entering any data into the mandatory fields in the Survey Definition form in the Create Survey Page
	@Given("User Navigates to SmartER Login Page16")
	public void user_navigates_to_smart_er_login_page16() {

		//Initialize the Driver
		driver = initializeDriver();
	}
	@When("User Enter Into the Homepage of the application16")
	public void user_enter_into_the_homepage_of_the_application16() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();	
	}
	@Then("Verify Whether User is allow to go to the Response Definition form without entering any data into the mandatory fields in the Survey Definition form in the Create Survey Page")
	public void verify_whether_user_is_allow_to_go_to_the_response_definition_form_without_entering_any_data_into_the_mandatory_fields_in_the_survey_definition_form_in_the_create_survey_page() throws InterruptedException, IOException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify email subject validation message
		stm.verifyEmailSubjectValidationMessage();

		//Verify email message validation message
		stm.verifyEmailMessageValidationMessage();

		//Verify text message validiton message
		stm.verifyTextMessageValidationMessage();

		// Verify disclaimer validation message
		stm.verifyDisclaimerValidationMessage();

		//Verify close thank you validation message
		stm.verifyCloseThankYouValidationMessage();

		//Verify thank you header validation message
		stm.verifyThankYouHeaderValidationMessage();

		//closing the driver
		driver.close();
	}

	//Scenario-17:  Verify Whether User is able to go to the Alert Definition form after filling all mandatory fileds in the Response Definition form in the Create Survey Page
	@Given("User Navigates to SmartER Login Page17")
	public void user_navigates_to_smart_er_login_page17() {

		//Initialize the Driver
		driver = initializeDriver();
	}

	@When("User Enter Into the Homepage of the application17")
	public void user_enter_into_the_homepage_of_the_application17() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();	
	}
	@Then("Verify Whether User is able to go to the Alert Definition form after filling all mandatory fileds in the Response Definition form in the Create Survey Page")
	public void verify_whether_user_is_able_to_go_to_the_alert_definition_form_after_filling_all_mandatory_fileds_in_the_response_definition_form_in_the_create_survey_page() throws InterruptedException, IOException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify user in the alert definition page
		stm.verifyUserInTheAlertDefinitionPage();

		//closing the driver
		driver.close();
	}

	//Scenario-18: Verify Whether User is allow to go to the Alert Definition form without entering any data into the mandatory fields in the Response Definition form in the Create Survey Page
	@Given("User Navigates to SmartER Login Page18")
	public void user_navigates_to_smart_er_login_page18() {

		//Initialize the Driver
		driver = initializeDriver();
	}
	@When("User Enter Into the Homepage of the applicaton18")
	public void user_enter_into_the_homepage_of_the_applicaton18() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();	
	}
	@Then("Verify Whether User is allow to go to the Alert Definition form without entering any data into the mandatory fields in the Response Definition form in the Create Survey Page")
	public void verify_whether_user_is_allow_to_go_to_the_alert_definition_form_without_entering_any_data_into_the_mandatory_fields_in_the_response_definition_form_in_the_create_survey_page() throws InterruptedException, IOException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify subject validation message
		stm.verifySubjectValidationMessage();

		//Verify header response validation message
		stm.verifyHeaderResponseValidationMessage();

		//Verify email response message validation message
		stm.verifyEmailResponseMessageValidationMessage();
		
		//Verify sms response message validation message
		stm.verifySmsResponseMessageValidationMessage();

		//closing the driver
		driver.close();
	}

	//Scenario-19: Verify Whether User is able to create a new survey without entering any data into the Alert Definition form
	@Given("User Navigates to SmartER Login Page19")
	public void user_navigates_to_smart_er_login_page19() {

		//Initialize the Driver
		driver = initializeDriver();
	}
	@When("User Enter Into the Homepage of the application19")
	public void user_enter_into_the_homepage_of_the_application19() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();	
	}
	@Then("Verify Whether User is able to create a new survey without entering any data into the Alert Definition form")
	public void verify_whether_user_is_able_to_create_a_new_survey_without_entering_any_data_into_the_alert_definition_form() throws InterruptedException, IOException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify alert definition page require validation
		stm.verifyAlertDefinitionPageRequireValidation();

		//closing the driver
		driver.close();

	}

	//Scenario-20: Verify Whether User is able to return the Creating a New Survey Page into Survey Page
	@Given("User Navigates to SmartER Login Page20")
	public void user_navigates_to_smart_er_login_page20() {

		//Initialize the Driver
		driver = initializeDriver();
	}
	@When("User Enter Into the Homepage of the application20")
	public void user_enter_into_the_homepage_of_the_application20() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();	
	}
	@Then("Verify Whether User is able to return the Creating a New Survey Page into Survey Page")
	public void verify_whether_user_is_able_to_return_the_creating_a_new_survey_page_into_survey_page() throws InterruptedException, IOException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify User return to the currect survey page
		stm.verifyUserReturnToTheCurrentSurveyPage();
		
		//closing the driver
		driver.close();
	}

	//Scenario-21: Verify Whether User is able to search a Survey
	@Given("User Navigates to SmartER Login Page21")
	public void user_navigates_to_smart_er_login_page21() {

		//Initialize the Driver
		driver = initializeDriver();
	}
	@When("User Enter Into the Homepage of the application21")
	public void user_enter_into_the_homepage_of_the_application21() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();	
	}
	@Then("Verify Whether User is able to search a Survey")
	public void verify_whether_user_is_able_to_search_a_survey() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify searched name is displayed
		stm.verifySearchedNameIsDisplayed();

		//closing the driver
		driver.close();
	}

	//Scenario-22: Verify Whether User is able to search a Survey with Location
	@Given("User Navigates to SmartER Login Page22")
	public void user_navigates_to_smart_er_login_page22() {

		//Initialize the Driver
		driver = initializeDriver();
	}
	@When("User Enter Into the Homepage of the application22")
	public void user_enter_into_the_homepage_of_the_application22() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();	
	}
	@Then("Verify Whether User is able to search a Survey with Location")
	public void verify_whether_user_is_able_to_search_a_survey_with_location() throws InterruptedException, IOException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify searched location is displayed
		stm.verifySearchedLocationIsDisplayed();

		//closing the driver
		driver.close();
	}

	//Scenario-23: Verify Whether User is able to search a Survey with Department
	@Given("User Navigates to SmartER Login Page23")
	public void user_navigates_to_smart_er_login_page23() {

		//Initialize the Driver
		driver = initializeDriver();
	}

	@When("User Enter into the Homepage of the applicaton23")
	public void user_enter_into_the_homepage_of_the_applicaton23() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();	
	}
	@Then("Verify Whether User is able to search a Survey with Department")
	public void verify_whether_user_is_able_to_search_a_survey_with_department() throws InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify Searched department is displayed
		stm.verifySearchedDepartmentIsDisplayed();

		//closing the driver
		driver.close();
	}

	//Scenario-24: Verify Whether User is able to search a Survey with Survey Type
	@Given("User Navigates to SmartER Login Page24")
	public void user_navigates_to_smart_er_login_page24() {

		//Initialize the Driver
		driver = initializeDriver();
	}
	@When("User Enter into the Homepage of the applciaton24")
	public void user_enter_into_the_homepage_of_the_applciaton24() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();	
	}
	@Then("Verify Whether User is able to search a Survey with Survey Type")
	public void verify_whether_user_is_able_to_search_a_survey_with_survey_type() throws InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify User is able to search a survey with survey type
		stm.verifyUserIsAbleToSearchASurveyWithSurveyType();

		//closing the driver
		driver.close();
	}

	//Scenario-25: Verify Whether User is able to search a Survey with Location, Department and Survey Type
	@Given("User Navigates to SmartER Login Page25")
	public void user_navigates_to_smart_er_login_page25() {

		//Initialize the Driver
		driver = initializeDriver();
	}
	@When("User Enter into the Homepage of the application25")
	public void user_enter_into_the_homepage_of_the_application25() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}
	@Then("Verify Whether User is able to search a Survey with Location, Department and Survey Type")
	public void verify_whether_user_is_able_to_search_a_survey_with_location_department_and_survey_type() throws InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify User is able to search a survey with location department and survey type
		stm.verifyUserIsAbleToSearchASurveyWithLocationDepartmentAndSurveyType();

		//closing the driver
		driver.close();
	}

	//Scenario-26: Verify Whether User is able to edit a Survey
	@Given("User Navigates to SmartER Login Pager26")
	public void user_navigates_to_smart_er_login_pager26() {

		//Initialize the Driver
		driver = initializeDriver();
	}
	@When("User Enter into the Homepage of the application26")
	public void user_enter_into_the_homepage_of_the_application26() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}
	@Then("Verify Whether User is able to edit a Survey")
	public void verify_whether_user_is_able_to_edit_a_survey() throws InterruptedException, IOException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify Edited Survey is displayed
		stm.verifyEditedSurveyIsDisplayed();

		//closing the driver
		driver.close();
	}

	//Scenario-27: Verify Whether User is able to delete a Survey
	@Given("User Navigates to SmartER Login Page27")
	public void user_navigates_to_smart_er_login_page27() {

		//Initialize the Driver
		driver = initializeDriver();
	}

	@When("User Enter into the Homepage of the application27")
	public void user_enter_into_the_homepage_of_the_application27() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}
	@Then("Verify Whether User is able to delete a Survey")
	public void verify_whether_user_is_able_to_delete_a_survey() throws InterruptedException, IOException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify User is able to delete a survey
		stm.verifyUserIsAbleToDeleteASurvey();
		
		//closing the driver
		driver.close();
	}

	//Scenario-28: Verify Whether User is able to enter a setting in the Survey
	@Given("User Navigates to SmartER Login Page28")
	public void user_navigates_to_smart_er_login_page28() {

		//Initialize the Driver
		driver = initializeDriver();
	}
	@When("User Enter into the Homepage of the application28")
	public void user_enter_into_the_homepage_of_the_application28() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}
	@Then("Verify Whether User is able to enter a setting in the Survey")
	public void verify_whether_user_is_able_to_enter_a_setting_in_the_survey() throws InterruptedException, IOException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Verify User in the Setting Page
		stm.verifyUserInTheSettingPage();

		//closing the driver
		driver.close();
	}

	//Scenario-29: Verify Whether User is able to Edit setting in the Survey
	@Given("User Navigates to SmartER Login Page29")
	public void user_navigates_to_smart_er_login_page29() {

		//Initialize the Driver
		driver = initializeDriver();
	}
	@When("User Enter into the Homepage of the application29")
	public void user_enter_into_the_homepage_of_the_application29() throws IOException, InterruptedException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}
	@Then("Verify Whether User is able to Edit setting in the Survey")
	public void verify_whether_user_is_able_to_edit_setting_in_the_survey() throws InterruptedException, IOException {

		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);
		
		//Verify Setting Successfully Added
		stm.verifySettingSuccessfullyAdded();
		
		//closing the driver
		driver.close();
	}

	//Scenario-30: Verify Whether User is able to return a Survey Page
	@Given("User Navigates to SmartER Login Page30")
	public void user_navigates_to_smart_er_login_page30() {

		//Initialize the Driver
		driver = initializeDriver();
	}
	@When("User Enter into the Homepage of the application30")
	public void user_enter_into_the_homepage_of_the_application30() throws IOException, InterruptedException {
	  
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);

		//Navigating the SmartER Homepage
		stm.navigatetoHomePage();
	}
	@Then("Verify Whether User is able to return a Survey Page")
	public void verify_whether_user_is_able_to_return_a_survey_page() throws InterruptedException, IOException {
	 
		//Initializing the Survey Page Test Methods
		SurveyPage_TestMethods stm = new SurveyPage_TestMethods(driver);
		
		//Verify User is able to Return a survey page
		stm.verifyUserIsAbleToReturnASurveyPage();
		
		//closing the driver
		driver.close();
	}





}
