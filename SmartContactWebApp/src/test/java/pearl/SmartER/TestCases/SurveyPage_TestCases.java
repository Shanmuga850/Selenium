package pearl.SmartER.TestCases;

import java.awt.AWTException;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pearl.SmartER.TestMethods.BaseClassMain;
import pearl.SmartER.TestMethods.SurveyPage_TestMethods;
import pearl.SmartER.Utility.ExtendReport;
import pearl.SmartER.Utility.Screenshot;
@Listeners(pearl.SmartER.TestListners.Listener.class)


public class SurveyPage_TestCases extends BaseClassMain {

	public static ExtentTest test; // extent report -test

	@BeforeMethod()
	public WebDriver initialize() throws IOException, InterruptedException

	{
		//Driver initialization
		driver = initialise_Driver();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		return driver;
	}

	//1
	@Test(priority=1,groups="Positive",description="SUR_TC01 Verify Survey Button Is Visible")
	public void tc01_verifySuveyButtonIsVisible() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC01 Verify Survey Button Is Visible");

		//Initializing the POM Page
		SurveyPage_TestMethods sqb = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		sqb.navigatetoHomePage();

		//Verify the survey button is visible
		sqb.verifySurveyButtonIsVisible();

	}

	//2
	@Test(priority=2,groups="Positive", description= "SUR_TC02 Verify User Is Able To Enter Question Bank")
	public void tc02_verifyUserIsAbleToEnterQuestionBank() throws InterruptedException, IOException

	{
		test=extent.createTest("SUR_TC02 Verify User Is Able To Enter Question Bank");
		
		//Initializing the POM Page
		SurveyPage_TestMethods sqb = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		sqb.navigatetoHomePage();

		//Verify user in the question bank page
		sqb.verifyUserintheQuestionBankPage();

	}

	//3
	@Test(priority=3,description= "SUR_TC03 Verify User Is Able To Enter Warehouse For Clicking  'Add From Warehouse' In The Question Bank")
	public void tc03_verifyUserIsAbleToEnterWarehouse() throws InterruptedException, IOException

	{
		test=extent.createTest("SUR_TC03 Verify User Is Able To Enter Warehouse For Clicking  'Add From Warehouse' In The Question Bank");
		
		//Initializing the POM Page
		SurveyPage_TestMethods sqb = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		sqb.navigatetoHomePage();

		//Verify User in the Warehouse Page
		sqb.verifyUserInTheWarehouse();

	}

	//4
	@Test(priority=4,groups="Positive",description="SUR_TC04 Verify User is able to create a New Question with valid data")
	public void tc04_verifyUserIsAbleToCreateANewQuestion() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC04 Verify User is able to create a New Question with valid data");
		
		//Initializing the POM Page
		SurveyPage_TestMethods sqb = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		sqb.navigatetoHomePage();

		//Verify Created Question Displayed in the Question Bank
		sqb.verifyCreatedQuestionDisplayedInTheQuestionBank();


	}

	//5
	@Test(priority=5,groups="Negative",description="SUR_TC05 Verify Whether User is able to create a New Question without filling mandatory fields")
	public void tc05_verifyUserIsNotAbleToCreateANewQuestionWithoutFillingAnyData() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC05 Verify Whether User is able to create a New Question without filling mandatory fields");
		
		//Initializing the POM Page
		SurveyPage_TestMethods sqb = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		sqb.navigatetoHomePage();

		//Verify Question is Require Validation Message is displayed
		sqb.verifyQuestionRequireValidationMessageIsDisplayed();

		//Verify Option is Require validation Message is displayed
		sqb.verifyOptionRequireValidationMessageIsDisplayed();

	}

	//6
	@Test(priority=6,groups="Positive",description="SUR_TC06 Verify Whether User is able to return the Creating a New Question Page into Question Bank")
	public void tc06_verifyUserIsAbleToRetrunTheQuestionBank() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC06 Verify Whether User is able to return the Creating a New Question Page into Question Bank");
		
		//Initializing the POM Page
		SurveyPage_TestMethods sqb = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		sqb.navigatetoHomePage();

		//Verify user in the question bank page
		sqb.verifyUserReturnCreateNewQuestionPageIntoQuestionBankPage();


	}

	//7
	@Test(priority=7,groups="Positive",description="SUR_TC07 Verify Whether User is able to search a Question")
	public void tc07_verifyUserIsAbleToSearchAQuestionWithQuestionName() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC07 Verify Whether User is able to search a Question");
		
		//Initializing the POM Page
		SurveyPage_TestMethods sqb = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		sqb.navigatetoHomePage();

		//Verify Searched Question is Displayed in the Question bank
		sqb.verifySearchedQuestionDisplayedInTheQuestionBank();

	}

	//8
	@Test(priority=8,groups="positive",description="SUR_TC08 Verify Whether User is able to delete a Question")
	public void tc08_verifyUserIsAbleToDeleteAQuestionInTheQuestionBank() throws IOException, InterruptedException
	
	{
		test=extent.createTest("SUR_TC08 Verify Whether User is able to delete a Question");
		
		//Initializing the POM Page
		SurveyPage_TestMethods sqb = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		sqb.navigatetoHomePage();

		//Verify Searched Question is Displayed in the Question bank
		sqb.verifySearchedQuestionDisplayedInTheQuestionBank();

		//Delete the Specified Question
		sqb.deleteTheSpecifiedQuestion();

	}

	//9
	@Test(priority=9,groups="positive", description="SUR_TC09 Verify Whether User is able to enter Current Surveys")
	public void tc09_verifyUserIsAbleToEnterCurrentSurveys() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC09 Verify Whether User is able to enter Current Surveys");

		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//verify User In the Current Survey Page
		scs.verifyUserInTheCurrentSurveyPage();

	}

	//10
	@Test(priority=10,groups="positive", description="SUR_TC10 Verify Whether User is able to view Create Survey")
	public void tc10_verifyUserIsAbleToViewCreateSurvey() throws IOException, InterruptedException
	
	{
		test=extent.createTest("SUR_TC10 Verify Whether User is able to view Create Survey");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Create Survey Button is Visible
		scs.verifyCreateSurveyButtonIsVisible();
	}

	//11
	@Test(priority=11,groups="positive",description="SUR_TC11 Verify Whether User is able to create a new survey")
	public void tc11_verifyUserIsAllowToCreateANewSurvey() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC11 Verify Whether User is able to create a new survey");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verify the Survey Successfully Created Validation Message
		scs.verifySurveySuccessfullyCreatedValidation();

	}

	//12
	@Test(priority=12,groups="positive",description="SUR_TC12 Verify Whether User is  allow to create a new survey with already existing data")
	public void tc12_verifyUserIsAllowToCreateANewSurveyWithExistingData() throws IOException, InterruptedException

	{

		test=extent.createTest("SUR_TC12 Verify Whether User is  allow to create a new survey with already existing data");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verify Survey already exist validation is shown
		scs.VerifySurveyAlreadyExistValidation();


	}

	//13
	@Test(priority=13,groups="positive", description="SUR_TC13 Verify Whether User is able to go to the Survey Definition form after filling all mandatory fileds in the Survey form in the Create Survey Page")
	public void tc13_verifyUserIsAllowToMoveSurveyIntoASurveyDefinition() throws InterruptedException, IOException

	{
		test=extent.createTest("SUR_TC13 Verify Whether User is able to go to the Survey Definition form after filling all mandatory fileds in the Survey form in the Create Survey Page");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verify User in the Survey with using a Assertion
		scs.verifyUserInTheSurveyDefinitionPage();

	}

	//14
	@Test(priority=14,groups="negative", description="SUR_TC14 Verify Whtether User is allow to go Survey into a Survey Definition form without entering any data into survey form in the Create Survey Page")
	public void tc14_verifyUserIsNotAllowToGoSurveyDefinitionFormWithoutFillingAnyDataInSurveyForm() throws InterruptedException, IOException

	{
		test=extent.createTest("SUR_TC14 Verify Whtether User is allow to go Survey into a Survey Definition form without entering any data into survey form in the Create Survey Page");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verifying the Validation Messages

		//Verify the Name is Required validation message is displayed
		scs.verifyNameValidationMessage();

		//Verify the AgeGroup Validation Message is displayed
		scs.verifyAgeGroupValidationMessage();

		//Verify the Header Validation is Displayed
		scs.verifyHeaderValidationMessage();


	}

	//15
	@Test(priority=15,groups="positive", description="SUR_TC15 Verify Whether User is able to go to the Response Definition form after filling all mandatory fileds in the Survey Definition form in the CreateSurvey Page")
	public void tc15_verifyUserIsAllowToGoSurveyDefinitionFormIntoResponseDefinitionForm() throws InterruptedException, IOException
	
	{

		test=extent.createTest("SUR_TC15 Verify Whether User is able to go to the Response Definition form after filling all mandatory fileds in the Survey Definition form in the CreateSurvey Page");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verify the Response Definition Page is Displayed with using Assertion
		scs.verifyUserInTheResponseDefinitionPage();
	}

	//16
	@Test(priority=16,groups="negative", description="SUR_TC16 Verify Whether User is allow to go to the Response Definition form without entering any data into the mandatory fields in the Survey Definition form in the Create Survey Page")
	public void tc16_verifyUserIsNotAllowToGoResponseDefinitionFormWithoutFillingAnyDataInSurveyDefinitionForm() throws InterruptedException, IOException
	{

		test=extent.createTest("SUR_TC16 Verify Whether User is allow to go to the Response Definition form without entering any data into the mandatory fields in the Survey Definition form in the Create Survey Page");
				
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verify Email Subject is required Validation message is displayed
		scs.verifyEmailSubjectValidationMessage();

		//Verify Email Message is required Validation message is displayed
		scs.verifyEmailMessageValidationMessage();

		//Verify Text Message is required Validation message is displayed
		scs.verifyTextMessageValidationMessage();

		//Verify Disclaimer is required validation message is displayed
		scs.verifyDisclaimerValidationMessage();

		//Verify Thank you message is required validation message is displayed
		scs.verifyCloseThankYouValidationMessage();

		//Verify Thank you header is required validation message is displayed
		scs.verifyThankYouHeaderValidationMessage();
	}

	//17
	@Test(priority=17,groups="positive", description = "SUR_TC17 Verify Whether User is able to go to the Alert Definition form after filling all mandatory fileds in the Response Definition form in the Create Survey Page")
	public void t17_verifyUserIsAllowToGoResponseDefinitionFormIntoAlertDefinitionForm() throws InterruptedException, IOException
	
	{
		test=extent.createTest("SUR_TC17 Verify Whether User is able to go to the Alert Definition form after filling all mandatory fileds in the Response Definition form in the Create Survey Page");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verify User in the Alert Definition Page with using the Assertion
		scs.verifyUserInTheAlertDefinitionPage();


	}

	//18
	@Test(priority=18,groups="negative", description ="SUR_TC18 Verify Whether User is allow to go to the Alert Definition form without entering any data into the mandatory fields in the Response Definition form in the Create Survey Page")
	public void t18_verifyUserIsNotAllowToGoAlertDefinitionFormWithoutFillingAnyDataInResponseDefinitionForm() throws InterruptedException, IOException
	
	{
		test=extent.createTest("SUR_TC18 Verify Whether User is allow to go to the Alert Definition form without entering any data into the mandatory fields in the Response Definition form in the Create Survey Page");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		// Verify the Subject Validation Message is Displayed
		scs.verifySubjectValidationMessage();

		//Verify the Header Response Validation Message is Displayed
		scs.verifyHeaderResponseValidationMessage();

		//Verify the Email Response Validation Message is Displayed
		scs.verifyEmailResponseMessageValidationMessage();

		//Verify the SMS Response Message Validation Message is Displayed
		scs.verifySmsResponseMessageValidationMessage();

	}


	//19
	@Test(priority=19,groups="negative",description="SUR_TC19 Verify Whether User is able to create a new survey without entering any data into the Alert Definition form")
	public void tc19_verifyUserIsNotAllowToCreateANewSurveyWithoutFillingAnyDataIntoTheAlertDefinitionForm() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC19 Verify Whether User is able to create a new survey without entering any data into the Alert Definition form");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verify Alert Definition Page require validation messages are displayed
		scs.verifyAlertDefinitionPageRequireValidation();

	}

	//20
	@Test(priority=20,groups="positive",description="SUR_TC20 Verify Whether User is able to return the Creating a New Survey Page into Survey Page")
	public void tc20_verifyUserIsAbleToRetrunTheQuestionBank() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC20 Verify Whether User is able to return the Creating a New Survey Page into Survey Page");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verify User Return to the Current Survey Page with verifying the create survey Text
		scs.verifyUserReturnToTheCurrentSurveyPage();
	}

	//21
	@Test(priority=21,groups="positive",description="SUR_TC21 Verify Whether User is able to search a Survey")
	public void tc21_verifyUserIsAbleToSearchASurvey() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC21 Verify Whether User is able to search a Survey");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verify Searched Name Should be Displayed
		scs.verifySearchedNameIsDisplayed();
	}

	//22
	@Test(priority=22,groups="positive",description="SUR_TC22 Verify Whether User is able to search a Survey with Location")
	public void tc22_verifyUserIsAbleToSearchASurveyWithLocation() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC22 Verify Whether User is able to search a Survey with Location");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verify Searched Location should be Displayed
		scs.verifySearchedLocationIsDisplayed();

	}

	//23
	@Test(priority=23,groups="positive",description="SUR_TC23 Verify Whether User is able to search a Survey with Department")
	public void tc23_verifyUserIsAbleToSearchASurveyWithDepartment() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC23 Verify Whether User is able to search a Survey with Department");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verify Searched Department is Displayed
		scs.verifySearchedDepartmentIsDisplayed();

	}

	//24
	@Test(priority=24,groups="positive",description="SUR_TC24 Verify Whether User is able to search a Survey with Survey Type")
	public void tc24_verifyUserIsAbleToSearchASurveyWithSurveyType() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC24 Verify Whether User is able to search a Survey with Survey Type");

		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verify User is able to searched with Survey Type
		scs.verifyUserIsAbleToSearchASurveyWithSurveyType();
	}

	//25
	@Test(priority=25,groups="positive",description="SUR_TC25 Verify Whether User is able to search a Survey with Location, Department and Survey Type")
	public void tc25_verifyUserIsAbleToSearchASurveyWithLocationDepartmentAndSurveyType() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC25 Verify Whether User is able to search a Survey with Location, Department and Survey Type");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Searching with Location, Department and Survey Type
		scs.verifyUserIsAbleToSearchASurveyWithLocationDepartmentAndSurveyType();


	}

	//26
	@Test(priority=26,groups="positive",description="SUR_TC26 Verify Whether User is able to edit a Survey")
	public void tc26_verifyUserIsAbleToEditASurvey() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC26 Verify Whether User is able to edit a Survey");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verify Edited Name is displayed in the Survey List
		scs.verifyEditedSurveyIsDisplayed();


	}

	//27
	@Test(priority=62,groups="positive",description="SUR_TC27 Verify Whether User is able to delete a Survey")
	public void tc27_verifyUserIsAbleToDeleteASurvey() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC27 Verify Whether User is able to delete a Survey");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verify User is able to Delete a a Survey
		scs.verifyUserIsAbleToDeleteASurvey();

	}

	//28
	@Test(priority=28,groups="positive",description="SUR_TC28 Verify Whether User is able to enter setting in the Survey")
	public void tc28_verifyUserIsAbleToEnterASettingInTheSurvey() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC28 Verify Whether User is able to enter setting in the Survey");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verify User in the Setting Page
		scs.verifyUserInTheSettingPage();

	}

	//29
	@Test(priority=29,groups="positive",description="SUR_TC29 Verify Whether User is able to Edit setting in the Survey")
	public void tc29_verifyUserIsAbleToEditSettingInTheSurvey() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC29 Verify Whether User is able to Edit setting in the Survey");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verify Setting Successfully edited validation message
		scs.verifySettingSuccessfullyAdded();

	}

	//30
	@Test(priority=30,groups="positive",description="SUR_TC30 Verify Whether User is able to return a Survey Page")
	public void tc30_verifyUserIsAbleToReturnASurveyPage() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC30 Verify Whether User is able to return a Survey Page");
		
		//Initializing the POM Page
		SurveyPage_TestMethods scs = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		scs.navigatetoHomePage();

		//Verify User return to Current Survey Page
		scs.verifyUserIsAbleToReturnASurveyPage();

	}

	//Ware House

	//31
	@Test(priority=31,groups="positive",description="SUR_TC31 Verify Whether User is allow to enter Warehouse")
	public void tc31_verifyUserIsAllowToEnterAWarehouse() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC31 Verify Whether User is allow to enter Warehouse");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//verify Warehouse Button is Displayed
		swh.verifyWareHouseButtonIsVisible();

		//Verify User in the Ware House Page
		swh.verifyUserInTheWareHousePage();

	}

	//32
	@Test(priority=32,groups="positive",description="SUR_TC32 Verify Whether User is able to search a Question in Warehouse")
	public void tc32_verifyUserIsAbleToSearchAQuestionInWarehouse() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC32 Verify Whether User is able to search a Question in Warehouse");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify the searched question is displayed 
		swh.verifySearchedQuestionIsDisplayed();

	}

	//33
	@Test(priority=33,groups="positive",description="SUR_TC33 Verify Whether User is able to search a Question with Groups")
	public void tc33_verifyUserIsAbleToSearchAQuestionWithGroups() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC33 Verify Whether User is able to search a Question with Groups");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify the searched question is displayed 
		swh.verifySelectedGroupIsDisplayed();

	}

	//34
	@Test(priority=34,groups="positive",description="SUR_TC34 Verify Whether User is able to search a Question with Category")
	public void tc34_verifyUserIsAbleToSearchAQuestionWithCategory() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC34 Verify Whether User is able to search a Question with Category");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify the searched question is displayed 
		swh.verifySelectedCategoryIsDisplayed();

	}

	//35
	@Test(priority=35,groups="positive",description="SUR_TC35 Verify Whether User is able to search a Question with Language")
	public void tc35_verifyUserIsAbleToSearchAQuestionWithLanguage() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC35 Verify Whether User is able to search a Question with Language");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify the searched question is displayed 
		swh.verifySelectedLanguageIsDisplayed();

	}

	//36
	@Test(priority=36,groups="positive",description="SUR_TC36 Verify Whether User is able to search a Question with Groups, Category and Language")
	public void tc36_verifyUserIsAbleToSearchAQuestionWithGroupsAndCategoryAndLanguage() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC36 Verify Whether User is able to search a Question with Groups, Category and Language");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify User Is Able To Search A Question With Groups And Category And Language
		swh.verifyUserIsAbleToSearchAQuestionWithGroupsAndCategoryAndLanguage();

	}

	//37
	@Test(priority=37,groups="positive",description="SUR_TC37 Verify Whether User is able to edit a Question")
	public void tc37_verifyUserIsAbleToEditQuestion() throws IOException, InterruptedException, AWTException

	{
		test=extent.createTest("SUR_TC37 Verify Whether User is able to edit a Question");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify Question Successfully Updated
		swh.VerifyQuestionSuccessfullyUpdated();


	}

	//38
	@Test(priority=38,groups="positive",description="SUR_TC38 Verify Whether User is able to delete Question")
	public void tc38_verifyUserIsAbleToDeleteAQuestion() throws IOException, InterruptedException, AWTException

	{
		test=extent.createTest("SUR_TC38 Verify Whether User is able to delete Question");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify User is able to Delete a Question
		swh.verifyUserIsAbleToDeleteAQuestion();

	}

	//39
	@Test(priority=39,groups="positive",description="SUR_TC39 Verify Whether User is able to view a Question by Group Order")
	public void tc39_verifyUserIsAbleToViewAQuestionByGroupOrder() throws IOException, InterruptedException, AWTException

	{
		test=extent.createTest("SUR_TC39 Verify Whether User is able to view a Question by Group Order");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify the searched question is displayed 
		swh.verifyUserIsAbleToViewAQuestionByGroupOrder();


	}

	//40
	@Test(priority=40,groups="positive",description="SUR_TC40 Verify Whether User is able to view a Question by Category Order")
	public void tc40_verifyUserIsAbleToViewAQuestionByCategoryOrder() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC40 Verify Whether User is able to view a Question by Category Order");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify the searched question is displayed 
		swh.verifyUserIsAbleToViewAQuestionByCategoryOrder();

	}

	//41
	@Test(priority=41,groups="positive",description="SUR_TC41 Verify Whether User is able to view a Question by Search By Question Order")
	public void tc41_verifyUserIsAbleToViewAQuestionByQuestionOrder() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC41 Verify Whether User is able to view a Question by Search By Question Order");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify the searched question is displayed 
		swh.verifyUserIsAbleToViewAQuestionByQuestionOrder();

	}

	//42
	@Test(priority=42,groups="positive",description="SUR_TC42 Verify Whether User is able to view a Question by Type Order")
	public void tc42_verifyUserIsAbleToViewAQuestionByTypeOrder() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC42 Verify Whether User is able to view a Question by Type Order");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify User is able to view question by type order
		swh.verifyUserIsAbleToViewAQuestionByTypeOrder();

	}

	//43
	@Test(priority=43,groups="positive",description="SUR_TC43 Verify Whether User is able to view a Question by Language Order")
	public void tc43_verifyUserIsAbleToViewAQuestionByLanguageOrder() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC43 Verify Whether User is able to view a Question by Language Order");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify User is able to view question by Language order
		swh.verifyUserIsAbleToViewAQuestionByLanguageOrder();

	}

	//44
	@Test(priority=44,groups="positive",description="SUR_TC44 Verify Whether User is able to Enter a Results")
	public void tc44_verifyUserIsAbleToEnterAResults() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC44 Verify Whether User is able to Enter a Results");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify User is able to enter a result page
		swh.verifyUserIsAbleToEnterAResultsPage();
	}

	//45
	@Test(priority=45,groups="positive",description="SUR_TC45 Verify Whether User is able to search a Survey with Location in the Results")
	public void tc45_verifyUserIsAbleToSearchASurveyWithLocationInTheResults() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC45 Verify Whether User is able to search a Survey with Location in the Results");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify user is able to search a survey with location in the results
		swh.verifyUserIsAbleToSearchASurveyWithLocationInTheResults();

	}

	//46
	@Test(priority=46,groups="positive",description="SUR_TC46 Verify Whether User is able to search a Survey with Department in the Results")
	public void tc46_verifyUserIsAbleToSearchASurveyWithDepartmentInTheResults() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC46 Verify Whether User is able to search a Survey with Department in the Results");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify user is able to search a survey with Department in the results
		swh.verifyUserIsAbleToSearchASurveyWithDepartmentInTheResults();

	}

	//47
	@Test(priority=47,groups="positive",description="SUR_TC47 Verify Whether User is able to search a Survey with Month in the Results")
	public void tc47_verifyUserIsAbleToSearchASurveyWithMonthInTheResults() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC47 Verify Whether User is able to search a Survey with Month in the Results");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify user is able to search a survey with Month in the results
		swh.verifyUserIsAbleToSearchASurveyWithMonthInTheResults();

	}

	//48
	@Test(priority=48,groups="positive",description="SUR_TC48 Verify Whether User is able to search a Survey with Year in the Results")
	public void tc48_verifyUserIsAbleToSearchASurveyWithYearInTheResults() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC48 Verify Whether User is able to search a Survey with Year in the Results");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify user is able to search a survey with Year in the results
		swh.verifyUserIsAbleToSearchASurveyWithYearInTheResults();

	}

	//49
	@Test(priority=49,groups="positive",description="SUR_TC49 Verify Whether User is able to search a Survey with Section in the Results")
	public void tc49_verifyUserIsAbleToSearchASurveyWithSectionInTheResults() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC49 Verify Whether User is able to search a Survey with Section in the Results");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify user is able to search a survey with Section in the results
		swh.verifyUserIsAbleToSearchASurveyWithSectionInTheResults();

	}

	//50
	@Test(priority=50,groups="positive",description="SUR_TC50 Verify Whether User is able to search a Survey with Location,Department, Month, Year and Section in the Results")
	public void tc50_verifyUserIsAbleToSearchASurveyWithLocationDepartmentMonthYearAndSectionInTheResults() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC50 Verify Whether User is able to search a Survey with Location,Department, Month, Year and Section in the Results");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify user is able to search a survey in results
		swh.verifyUserIsAbleToSearchASurveyWithLocationDepartmentMonthYearAndSectionInTheResults();

	}

	//51
	@Test(priority=51,groups="positive",description="SUR_TC51 Verify Whether User is able to view a Survey by Survey Name")
	public void tc51_verifyUserIsAbleToViewASurveyBySurveyName() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC51 Verify Whether User is able to view a Survey by Survey Name");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify User is able to  view surveyName by Ascending and Descending order
		swh.verifyUserIsAbleToViewASurveyBySurveyName();

	}

	//52
	@Test(priority=52,groups="positive",description="SUR_TC52 Verify Whether User is able to view a Survey by Version")
	public void tc52_verifyWhetherUserIsAbleToViewASurveyByVersion() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC52 Verify Whether User is able to view a Survey by Version");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify User is able to view version by Ascending and Descending order
		swh.verifyWhetherUserIsAbleToViewASurveyByVersion();

	}


	//53
	@Test(priority=53,groups="positive",description="SUR_TC53 Verify Whether User is able to view a Survey by Version Create Date")
	public void tc53_verifyUserIsAbleToViewASurveyByVersionCreateDateOrder() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC53 Verify Whether User is able to view a Survey by Version Create Date");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify User is able to view version by Ascending and Descending order
		swh.verifyUserIsAbleToViewASurveyByVersionCreateDateOrder();

	}

	//54
	@Test(priority=54,groups="positive",description="SUR_TC54 Verify Whether User is able to view a Survey by Status")
	public void tc54_verifyUserIsAbleToViewASurveyByStatus() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC54 Verify Whether User is able to view a Survey by Status");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		swh.navigatetoHomePage();

		//Verify User is able to view version by Ascending and Descending order
		swh.verifyUserIsAbleToViewASurveyByStatus();

	}



	//55
	@Test(priority=55,groups="positive",description="SUR_TC55 Verify Whether User is able to enter a Send Survey")
	public void tc55_verifyUserIsAbleToEnterASendSurvey() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC55 Verify Whether User is able to enter a Send Survey");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the CCUser5 Home page
		swh.userLoginNavigateToHomePage();

		//Verify User is able to enter a send survey page
		swh.verifyUserIsAbleToEnterASendSurvey();

	}
	
	//56
	@Test(priority=56,groups="positive",description="SUR_TC56 Verify Whether User is able to Send a Survey")
	public void tc56_verifyUserIsAbleToSendASurvey() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC56 Verify Whether User is able to Send a Survey");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the CCUser5 Home page
		swh.userLoginNavigateToHomePage();

		//Verify User is able to send a survey
		swh.verifyUserIsAbleToSendASurvey();

	}

	//57
	@Test(priority=57,groups="positive",description="SUR_TC57 Verify Whether User is able to Send Survey to a valid email")
	public void tc57_verifyUserIsAbleToSendASurveyToEmail() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC57 Verify Whether User is able to Send Survey to a valid email");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the CCUser5 Home page
		swh.userLoginNavigateToHomePage();

		//Verify User is able to send a survey
		swh.verifyUserIsAbleToSendASurveyToEmail();

	}

	//58
		@Test(priority=58,groups="positive",description="SUR_TC58 Verify Whether User is able to Send a Survey to a valid phone number")
		public void tc58_verifyUserIsAbleToSendASurveyToPhoneNumber() throws IOException, InterruptedException

		{
			test=extent.createTest("SUR_TC58 Verify Whether User is able to Send a Survey to a valid phone number");
			
			//Initializing the POM Page
			SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

			//Navigating to the CCUser5 Home page
			swh.userLoginNavigateToHomePage();

			//Verify User is able to send a survey
			swh.verifyUserIsAbleToSendASurveyToPhoneNumber();

		}
	
	//59
	@Test(priority=59,groups="positive",description="SUR_TC59 Verify Whether User is able to Send Survey without filling a mandatory fields")
	public void tc59_verifyUserIsAbleToSendASurveyWithoutFillingAMandatoryFields() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC59 Verify Whether User is able to Send Survey without filling a mandatory fields");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the CCUser5 Home page
		swh.userLoginNavigateToHomePage();

		//Verify User is able to send a survey without 
		swh.verifyUserIsAbleToSendASurveyWithoutFillingAMandatoryFields();

	}

	//60
		@Test(priority=60,groups="positive",description="SUR_TC60 Verify Whether User is able to Send a Survey To a Invalid Email and Valid Phone Number")
		public void tc60_verifyUserIsAbleToSendASurveyWithInvalidEmailAndValidPhoneNumber() throws IOException, InterruptedException

		{
			test=extent.createTest("SUR_TC60 Verify Whether User is able to Send a Survey To a Invalid Email and Valid Phone Number");
			
			//Initializing the POM Page
			SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

			//Navigating to the CCUser5 Home page
			swh.userLoginNavigateToHomePage();

			//Verify User is able to send a survey without 
			swh.verifyUserIsAbleToSendASurveyWithInvalidEmailAndValidPhoneNumber();

		}
	
	//61
	@Test(priority=61,groups="positive",description="SUR_TC61 Verify Whether User is able to Send a Survey To a Valid Email and Invalid Phone Number")
	public void tc61_verifyUserIsAbleToSendASurveyToAValidEmailandInvalidPhoneNumber() throws IOException, InterruptedException

	{
		test=extent.createTest("SUR_TC61 Verify Whether User is able to Send a Survey To a Valid Email and Invalid Phone Number");
		
		//Initializing the POM Page
		SurveyPage_TestMethods swh = new SurveyPage_TestMethods(driver);

		//Navigating to the CCUser5 Home page
		swh.userLoginNavigateToHomePage();

		//Verify User is able to send a survey without 
		swh.verifyUserIsAbleToSendASurveyWithValidEmailandInvalidPhoneNumber();

	}

	//62
	@Test(priority=5,groups="Positive",description= "SUR_TC62 Verify Whether User is able to create a New Question and add into the Warehouse")
	public void tc62_verifyUserIsAbleToCreateANewQuestionAndAddIntoTheWareHouse() throws IOException, InterruptedException

	{

		test=extent.createTest("SUR_TC62 Verify Whether User is able to create a New Question and add into the Warehouse");
		
		//Initializing the POM Page
		SurveyPage_TestMethods sqb = new SurveyPage_TestMethods(driver);

		//Navigating to the Home page
		sqb.navigatetoHomePage();

		//Verify the New created question in the question bank is displayed in the warehouse
		sqb.verifyNewCreatedQuestionDisplayedInTheWareHouse();


	}

	@AfterMethod()
	public void webDriverClose(ITestResult result)throws InterruptedException

	//ScreenShot
	{
		if (ITestResult.FAILURE==result.getStatus()) {
			Screenshot.captureScreenshot(driver,result.getName());
			ExtendReport.extendReportCreation();

		}

		//Extent Report

		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
		}
		else if (result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}

		else if (result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, result.getName()); 
		}

		driver.close();
	}




}

