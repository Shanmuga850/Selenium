package pearl.SmartER.TestMethods;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pearl.SmartER.PageObjects.SurveyPage_Objects;
import pearl.SmartER.Utils.SurveyDataDrivenExcel;



public class SurveyPage_TestMethods extends BaseClassMain{


	//Survey Methods

	//Question Bank Methods

	public SurveyPage_TestMethods(WebDriver driver)

	{
		this.driver = driver;
	}  

	//public static WebDriver driver;

	//temporary login
	public void navigatetoHomePage() throws IOException, InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		spo.getUsername();
		spo.getPassword();
		spo.getLoginbutton();


	}

	//temporary login2
	public void userLoginNavigateToHomePage() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		spo.getUsername1();
		spo.getPassword1();
		spo.getLoginbutton();	

	}

	//TC_1
	public void verifySurveyButtonIsVisible() throws IOException, InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//spo.navigatetoHomePage();

		String actual_text=driver.findElement(By.xpath("//span[text()='Survey']")).getText();		
		String expected_text = "Survey";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println("Text Verified");
		System.out.println(" Text : "+ actual_text);
	}


	//TC_2
	public void verifyUserintheQuestionBankPage() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//spo.navigatetoHomePage();

		//Click survey Button
		spo.clickSurveyButton();

		//Click question bank
		spo.clickQuestionBank();

		//Verify User in the Question Bank Page
		String actual_url=driver.getCurrentUrl();
		String expected_url = "https://beta.s-er.co/question";
		Assert.assertEquals(expected_url,actual_url);
		System.out.println("URL Verified");
		System.out.println(" URL : "+ actual_url);

	}

	//TC_3
	public void verifyUserInTheWarehouse() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click question bank
		spo.clickQuestionBank();

		//Click Add From Warehouse in the Question Bank Page
		spo.clickAddFromWarehouse();


		String actual_url=driver.getCurrentUrl();
		String expected_url = "https://beta.s-er.co/warehouse/addquestion/id";
		Assert.assertEquals(expected_url,actual_url);
		System.out.println("URL Verified");
		System.out.println(" URL : "+ actual_url);
	}

	//TC_4
	public void verifyCreatedQuestionDisplayedInTheQuestionBank() throws IOException, InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click question bank
		spo.clickQuestionBank();

		//Click add new
		spo.clickAddNew();

		//Click Question Type
		spo.clickQuestionType();

		//Select Objective in the Question Type
		spo.selectObjectiveInQuestionType();

		//Click Language
		spo.clickLanguageQb();

		//Select English in Language
		spo.selectEnglishInLanguage();

		//Type a question in Compose Question
		spo.composeQuestion();

		//Type data in the options
		spo.options();

		//Type Data in the response
		spo.response();

		//Click Save
		spo.clickSaveQb();

		//Search a Recently created Question Name
		spo.typeQuestionNameInSearchByQuestion();

		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> question_name=d.getdata("AddNewQuestion");
		Thread.sleep(5000);
		String actual_text=driver.findElement(By.xpath("(//a[@style='color:#676a6c'])[1]")).getText();
		String expected_text = question_name.get(1);
		Assert.assertEquals(expected_text,actual_text);
		System.out.println("Text Verified");
		System.out.println(" Text : "+ actual_text);
		Thread.sleep(3000);
	}

	//TC_5(1/2)
	public void verifyQuestionRequireValidationMessageIsDisplayed() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click question bank
		spo.clickQuestionBank();

		//Click add new
		spo.clickAddNew();

		//Click Save
		spo.clickSaveQb();

		String actual_text=driver.findElement(By.xpath("//div[@class='error']")).getText();		
		String expected_text = "Question is required.";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println("Text Verified");
		System.out.println(" Text : "+ actual_text);
		Thread.sleep(3000);
	}

	//TC_5(2/2)
	public void verifyOptionRequireValidationMessageIsDisplayed() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Type something in Compose Question in Question
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> ComposeQuestion=d.getdata("AddNewQuestion");
		driver.findElement(spo.compose_question).sendKeys(ComposeQuestion.get(1));
		Thread.sleep(2000);

		//Click Save
		spo.clickSaveQb();

		// Check the assertion of options are required
		String actual_text=driver.findElement(By.xpath("//div[@class='error']")).getText();

		String expected_text = "Options are required.";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println("Text Verified");
		System.out.println(" Text : "+ actual_text);

	}

	//TC_6
	public void verifyUserReturnCreateNewQuestionPageIntoQuestionBankPage() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click question bank
		spo.clickQuestionBank();

		//Click add new
		spo.clickAddNew();

		//Click Back
		spo.back();

		//Verify User in the Question Bank Page
		String actual_url=driver.getCurrentUrl();
		String expected_url = "https://beta.s-er.co/question";
		Assert.assertEquals(expected_url,actual_url);
		System.out.println("URL Verified");
		System.out.println(" URL : "+ actual_url);

	}

	//TC_7 & 8(1/2)
	public void verifySearchedQuestionDisplayedInTheQuestionBank() throws IOException, InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click question bank
		spo.clickQuestionBank();

		//Search a Recently created Question Name
		spo.typeQuestionNameInSearchByQuestion();

		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> question_name=d.getdata("AddNewQuestion");

		Thread.sleep(2000);
		String actual_text=driver.findElement(By.xpath("(//a[@style='color:#676a6c'])[1]")).getText();
		String expected_text = question_name.get(1);
		Assert.assertEquals(expected_text,actual_text);
		System.out.println("Text Verified");
		System.out.println(" Text : "+ actual_text);

	}

	//TC_8(2/2)
	public void deleteTheSpecifiedQuestion() throws IOException, InterruptedException

	{

		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		driver.findElement(spo.delete_qb).click();
		Thread.sleep(2000);
		driver.findElement(spo.yes_delete_it_qb).click();
		Thread.sleep(3000);
		driver.findElement(spo.ok_qb).click();

	}

	//Current Survey Methods

	//TC_9
	public void verifyUserInTheCurrentSurveyPage() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		String actual_url=driver.getCurrentUrl();
		String expected_url = "https://beta.s-er.co/survey";
		Assert.assertEquals(expected_url,actual_url);
		System.out.println(" URL Verified");
		System.out.println(" URL : "+ actual_url);
	}

	//TC_10
	public void verifyCreateSurveyButtonIsVisible() throws InterruptedException
	{

		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		String actual_text=driver.findElement(spo.create_survey).getText();		
		String expected_text = "Create Survey";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_12
	public void VerifySurveyAlreadyExistValidation() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//click Create Survey Button
		spo.clickCreateSurvey();

		//Form1 -- Survey

		//Enter the name_text in the create new survey form
		spo.getNameTextInTheNameField();

		//Click Age Group
		spo.clickAgeGroup();

		//Select a Age in Age Group
		spo.selectAge();

		//Click Language
		spo.clickLanguage();

		//Select a specified Language in Languages
		spo.selectLanguageEnglish();

		//Enter the header text in the create new survey form
		spo.getHeaderTextInTheHeaderField();

		//Click Next in the Form
		spo.clickNextInForm1();

		//Form2 -- Survey Definition

		//Enter the Email Subject text in the Survey Definition form
		spo.getEmailSubject();

		//Enter the Email Message text in the Survey Definition form
		spo.getEmailMessage();

		//Enter the Text Message text in the Survey Definition form
		spo.getTextMessage();

		//Enter the Open Disclaimer text in the Survey Definition form
		spo.getOpenDisclaimer();

		//Enter the Close Thank you text in the Survey Definition form
		spo.getCloseThankyou();

		//Enter the Thank you header text in the Survey Definition form
		spo.thankYouHeader();

		//Click Next in the Survey Definition form
		spo.clickNextInForm2();

		//Form3 -- Response Definition

		//Enter the Subject text in the subject field from Response Definition form
		spo.getSubject();

		//Enter the Header text in the header field from Response Definition form
		spo.getHeaderInResponse();

		//Enter the Email Response Message text in the Email Response Message field from Response Definition form
		spo.getEmailResponseMessage();

		//Enter the SMS Response Message text in the SMS Response Message field from Response Definition form
		spo.getSmsResponseMessage();

		//Click Next from Response Definition form
		spo.clickNextInForm3();

		//Form4 - Alert Definition Page

		//Enter the Regular text in the email from Alert Definition
		spo.getEmailRegular();

		//Enter the Link Message in the email from Alert Definition
		spo.getLinkMessageEmail();

		//Enter the Regular text in the SMS from Alert Definition
		spo.getSmsRegular();

		//Enter the Link Message in the SMS from Alert Definition
		spo.getLinkMessageSms();

		//Click Save
		spo.clickSave();

		//Verify Survey already exist validation message
		String actual_text=driver.findElement(spo.survey_already_exist_alert).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_11
	public void verifySurveySuccessfullyCreatedValidation() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//click Create Survey Button
		spo.clickCreateSurvey();

		//Form1 -- Survey

		//Enter the name_text in the create new survey form
		spo.getNameTextInTheNameField();

		//Click Age Group
		spo.clickAgeGroup();

		//Select a Age in Age Group
		spo.selectAge();

		//Click Language
		spo.clickLanguage();

		//Select a specified Language in Languages
		spo.selectLanguageHindi();

		//Enter the header text in the create new survey form
		spo.getHeaderTextInTheHeaderField();

		//Click Next in the Form
		spo.clickNextInForm1();

		//Form2 -- Survey Definition

		//Enter the Email Subject text in the Survey Definition form
		spo.getEmailSubject();

		//Enter the Email Message text in the Survey Definition form
		spo.getEmailMessage();

		//Enter the Text Message text in the Survey Definition form
		spo.getTextMessage();

		//Enter the Open Disclaimer text in the Survey Definition form
		spo.getOpenDisclaimer();

		//Enter the Close Thank you text in the Survey Definition form
		spo.getCloseThankyou();

		//Enter the Thank you header text in the Survey Definition form
		spo.thankYouHeader();

		//Click Next in the Survey Definition form
		spo.clickNextInForm2();

		//Form3 -- Response Definition

		//Enter the Subject text in the subject field from Response Definition form
		spo.getSubject();

		//Enter the Header text in the header field from Response Definition form
		spo.getHeaderInResponse();

		//Enter the Email Response Message text in the Email Response Message field from Response Definition form
		spo.getEmailResponseMessage();

		//Enter the SMS Response Message text in the SMS Response Message field from Response Definition form
		spo.getSmsResponseMessage();

		//Click Next from Response Definition form
		spo.clickNextInForm3();

		//Form4 - Alert Definition

		//Enter the Regular text in the email from Alert Definition
		spo.getEmailRegular();

		//Enter the Link Message in the email from Alert Definition
		spo.getLinkMessageEmail();

		//Enter the Regular text in the SMS from Alert Definition
		spo.getSmsRegular();

		//Enter the Link Message in the SMS from Alert Definition
		spo.getLinkMessageSms();

		//Click Save
		spo.clickSave();


		//Verify survey successfully created
		String actual_text=driver.findElement(spo.survey_already_exist_alert).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_13
	public void verifyUserInTheSurveyDefinitionPage() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//click Create Survey Button
		spo.clickCreateSurvey();
		//Form1 -- Survey

		//Enter the name_text in the create new survey form
		spo.getNameTextInTheNameField();

		//Click Age Group
		spo.clickAgeGroup();

		//Select a Age in Age Group
		spo.selectAge();

		//Click Language
		spo.clickLanguage();

		//Select a specified Language in Languages
		spo.selectLanguageEnglish();

		//Enter the header text in the create new survey form
		spo.getHeaderTextInTheHeaderField();

		//Click Next in the Form
		spo.clickNextInForm1();

		Thread.sleep(2000);
		String actual_text=driver.findElement(By.xpath("//h3[text()='Survey Definition ']")).getText();		
		String expected_text="Survey Definition";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_14(1/3)
	public void verifyNameValidationMessage() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//click Create Survey Button
		spo.clickCreateSurvey();
		//Form1 -- Survey

		//Click Next in the Form
		spo.clickNextInForm1();

		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.name_validation_message).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_14(2/3)
	public void verifyAgeGroupValidationMessage() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.agegroup_validation_message).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_14(3/3)
	public void verifyHeaderValidationMessage() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.header_validation_message).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_15
	public void verifyUserInTheResponseDefinitionPage() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//click Create Survey Button
		spo.clickCreateSurvey();

		//Form1 -- Survey

		//Enter the name_text in the create new survey form
		spo.getNameTextInTheNameField();

		//Click Age Group
		spo.clickAgeGroup();

		//Select a Age in Age Group
		spo.selectAge();

		//Click Language
		spo.clickLanguage();

		//Select a specified Language in Languages
		spo.selectLanguageEnglish();

		//Enter the header text in the create new survey form
		spo.getHeaderTextInTheHeaderField();

		//Click Next in the Form
		spo.clickNextInForm1();

		//Form2 -- Survey Definition

		//Enter the Email Subject text in the Survey Definition form
		spo.getEmailSubject();

		//Enter the Email Message text in the Survey Definition form
		spo.getEmailMessage();

		//Enter the Text Message text in the Survey Definition form
		spo.getTextMessage();

		//Enter the Open Disclaimer text in the Survey Definition form
		spo.getOpenDisclaimer();

		//Enter the Close Thank you text in the Survey Definition form
		spo.getCloseThankyou();

		//Enter the Thank you header text in the Survey Definition form
		spo.thankYouHeader();

		//Click Next in the Survey Definition form
		spo.clickNextInForm2();


		Thread.sleep(2000);
		String actual_text=driver.findElement(By.xpath("//h3[text()='Response Definition']")).getText();		
		String expected_text="Response Definition";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_16(1/6)
	public void verifyEmailSubjectValidationMessage() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//click Create Survey Button
		spo.clickCreateSurvey();

		//Form1 -- Survey

		//Enter the name_text in the create new survey form
		spo.getNameTextInTheNameField();

		//Click Age Group
		spo.clickAgeGroup();

		//Select a Age in Age Group
		spo.selectAge();

		//Click Language
		spo.clickLanguage();

		//Select a specified Language in Languages
		spo.selectLanguageEnglish();

		//Enter the header text in the create new survey form
		spo.getHeaderTextInTheHeaderField();

		//Click Next in the Form
		spo.clickNextInForm1();

		//Form2 -- Survey Definition

		//Click Next in the Survey Definition form
		spo.clickNextInForm2();


		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.email_subject_validation_message).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_16(2/6)
	public void verifyEmailMessageValidationMessage() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.email_message_validation_message).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_16(3/6)
	public void verifyTextMessageValidationMessage() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.text_message_validation_message).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_16(4/6)
	public void verifyDisclaimerValidationMessage() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.disclaimer_validation_message).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_16(5/6)
	public void verifyCloseThankYouValidationMessage() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.close_thankyou_validation_message).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_16(6/6)
	public void verifyThankYouHeaderValidationMessage() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.thankyou_header_validation_message).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_17
	public void verifyUserInTheAlertDefinitionPage() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//click Create Survey Button
		spo.clickCreateSurvey();

		//Form1 -- Survey

		//Enter the name_text in the create new survey form
		spo.getNameTextInTheNameField();

		//Click Age Group
		spo.clickAgeGroup();

		//Select a Age in Age Group
		spo.selectAge();

		//Click Language
		spo.clickLanguage();

		//Select a specified Language in Languages
		spo.selectLanguageHindi();

		//Enter the header text in the create new survey form
		spo.getHeaderTextInTheHeaderField();

		//Click Next in the Form
		spo.clickNextInForm1();

		//Form2 -- Survey Definition

		//Enter the Email Subject text in the Survey Definition form
		spo.getEmailSubject();

		//Enter the Email Message text in the Survey Definition form
		spo.getEmailMessage();

		//Enter the Text Message text in the Survey Definition form
		spo.getTextMessage();

		//Enter the Open Disclaimer text in the Survey Definition form
		spo.getOpenDisclaimer();

		//Enter the Close Thank you text in the Survey Definition form
		spo.getCloseThankyou();

		//Enter the Thank you header text in the Survey Definition form
		spo.thankYouHeader();

		//Click Next in the Survey Definition form
		spo.clickNextInForm2();

		//Form3 -- Response Definition

		//Enter the Subject text in the subject field from Response Definition form
		spo.getSubject();

		//Enter the Header text in the header field from Response Definition form
		spo.getHeaderInResponse();

		//Enter the Email Response Message text in the Email Response Message field from Response Definition form
		spo.getEmailResponseMessage();

		//Enter the SMS Response Message text in the SMS Response Message field from Response Definition form
		spo.getSmsResponseMessage();

		//Click Next from Response Definition form
		spo.clickNextInForm3();

		//Verify User in the Alert Definition Page

		Thread.sleep(2000);
		String actual_text=driver.findElement(By.xpath("//h3[text()='Alert Definition']")).getText();		
		String expected_text="Alert Definition";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_18(1/4)
	public void verifySubjectValidationMessage() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//click Create Survey Button
		spo.clickCreateSurvey();

		//Form1 -- Survey

		//Enter the name_text in the create new survey form
		spo.getNameTextInTheNameField();

		//Click Age Group
		spo.clickAgeGroup();

		//Select a Age in Age Group
		spo.selectAge();

		//Click Language
		spo.clickLanguage();

		//Select a specified Language in Languages
		spo.selectLanguageHindi();

		//Enter the header text in the create new survey form
		spo.getHeaderTextInTheHeaderField();

		//Click Next in the Form
		spo.clickNextInForm1();

		//Form2 -- Survey Definition

		//Enter the Email Subject text in the Survey Definition form
		spo.getEmailSubject();

		//Enter the Email Message text in the Survey Definition form
		spo.getEmailMessage();

		//Enter the Text Message text in the Survey Definition form
		spo.getTextMessage();

		//Enter the Open Disclaimer text in the Survey Definition form
		spo.getOpenDisclaimer();

		//Enter the Close Thank you text in the Survey Definition form
		spo.getCloseThankyou();

		//Enter the Thank you header text in the Survey Definition form
		spo.thankYouHeader();

		//Click Next in the Survey Definition form
		spo.clickNextInForm2();

		//Form3 -- Response Definition

		//Click Next from Response Definition form
		spo.clickNextInForm3();

		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.subject_validation_message).getText();		
		String expected_text="Subject is required";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_18(2/4)
	public void verifyHeaderResponseValidationMessage() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.header_response_validation_message).getText();		
		String expected_text="Header is required";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_18(3/4)
	public void verifyEmailResponseMessageValidationMessage() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.email_response_message_validation_message).getText();		
		String expected_text="Email Response Message is required";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_18(4/4)
	public void verifySmsResponseMessageValidationMessage() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.sms_response_message_validation_message).getText();		
		String expected_text="SMS Response Message is required";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_19
	public void verifyAlertDefinitionPageRequireValidation() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//click Create Survey Button
		spo.clickCreateSurvey();

		//Form1 -- Survey

		//Enter the name_text in the create new survey form
		spo.getNameTextInTheNameField();

		//Click Age Group
		spo.clickAgeGroup();

		//Select a Age in Age Group
		spo.selectAge();

		//Click Language
		spo.clickLanguage();

		//Select a specified Language in Languages
		spo.selectLanguageHindi();

		//Enter the header text in the create new survey form
		spo.getHeaderTextInTheHeaderField();

		//Click Next in the Form
		spo.clickNextInForm1();

		//Form2 -- Survey Definition

		//Enter the Email Subject text in the Survey Definition form
		spo.getEmailSubject();

		//Enter the Email Message text in the Survey Definition form
		spo.getEmailMessage();

		//Enter the Text Message text in the Survey Definition form
		spo.getTextMessage();

		//Enter the Open Disclaimer text in the Survey Definition form
		spo.getOpenDisclaimer();

		//Enter the Close Thank you text in the Survey Definition form
		spo.getCloseThankyou();

		//Enter the Thank you header text in the Survey Definition form
		spo.thankYouHeader();

		//Click Next in the Survey Definition form
		spo.clickNextInForm2();

		//Form3 -- Response Definition

		//Enter the Subject text in the subject field from Response Definition form
		spo.getSubject();

		//Enter the Header text in the header field from Response Definition form
		spo.getHeaderInResponse();

		//Enter the Email Response Message text in the Email Response Message field from Response Definition form
		spo.getEmailResponseMessage();

		//Enter the SMS Response Message text in the SMS Response Message field from Response Definition form
		spo.getSmsResponseMessage();

		//Click Next from Response Definition form
		spo.clickNextInForm3();

		//Form4 - Alert Definition Page

		//Click Save
		spo.clickSave();

		String actual_text=driver.findElement(spo.survey_already_exist_alert).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_20
	public void verifyUserReturnToTheCurrentSurveyPage() throws InterruptedException, IOException

	{

		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//click Create Survey Button
		spo.clickCreateSurvey();

		//Form1 -- Survey

		//Enter the name_text in the create new survey form
		spo.getNameTextInTheNameField();

		//Click Age Group
		spo.clickAgeGroup();

		//Select a Age in Age Group
		spo.selectAge();

		//Click Language
		spo.clickLanguage();

		//Select a specified Language in Languages
		spo.selectLanguageHindi();

		//Enter the header text in the create new survey form
		spo.getHeaderTextInTheHeaderField();

		//Click Next in the Form
		spo.clickNextInForm1();

		//Form2 -- Survey Definition

		//Enter the Email Subject text in the Survey Definition form
		spo.getEmailSubject();

		//Enter the Email Message text in the Survey Definition form
		spo.getEmailMessage();

		//Enter the Text Message text in the Survey Definition form
		spo.getTextMessage();

		//Enter the Open Disclaimer text in the Survey Definition form
		spo.getOpenDisclaimer();

		//Enter the Close Thank you text in the Survey Definition form
		spo.getCloseThankyou();

		//Enter the Thank you header text in the Survey Definition form
		spo.thankYouHeader();

		//Click Next in the Survey Definition form
		spo.clickNextInForm2();

		//Form3 -- Response Definition

		//Enter the Subject text in the subject field from Response Definition form
		spo.getSubject();

		//Enter the Header text in the header field from Response Definition form
		spo.getHeaderInResponse();

		//Enter the Email Response Message text in the Email Response Message field from Response Definition form
		spo.getEmailResponseMessage();

		//Enter the SMS Response Message text in the SMS Response Message field from Response Definition form
		spo.getSmsResponseMessage();

		//Click Next from Response Definition form
		spo.clickNextInForm3();

		//Form4 - Alert Definition Page

		//Click Back
		spo.clickBack();


		String actual_text=driver.findElement(spo.create_survey).getText();		
		String expected_text = "Create Survey";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);

	}

	//TC_21
	public void verifySearchedNameIsDisplayed() throws IOException, InterruptedException

	{

		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//Type a Already Created Survey name 
		spo.getSearchByName();

		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_the_search_by_name).getText();		
		String expected_text = actual_text;
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String>expected_name=d.getdata("newsurvey");
		String expectd_text = expected_name.get(1);
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_22
	public void verifySearchedLocationIsDisplayed() throws IOException, InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//click Location
		spo.clickLocation();

		//Select Kochi In the Location
		spo.selectKochiInTheLocation();

		Thread.sleep(4000);
		String actual_text=driver.findElement(spo.verify_the_searched_location).getText();		
		String expected_text ="Kochi";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_23
	public void verifySearchedDepartmentIsDisplayed() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//click Department
		spo.clickDepartment();

		//Select General Medicine in the Department
		spo.selectGeneralMedicineInTheDepartment();

		Thread.sleep(4000);
		String actual_text=driver.findElement(spo.verify_the_searched_department).getText();		
		String expected_text ="General Medicine";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_24
	public void verifyUserIsAbleToSearchASurveyWithSurveyType() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//click Survey Type
		spo.clickSurveyType();

		//Select Regular in the Survey Type
		spo.selectRegularInTheSurveyType();
	}

	//TC_25
	public void verifyUserIsAbleToSearchASurveyWithLocationDepartmentAndSurveyType() throws InterruptedException

	{

		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//click Location
		spo.clickLocation();

		//Select Kochi In the Location
		spo.selectKochiInTheLocation();

		//click Department
		spo.clickDepartment();

		//Select General Medicine in the Department
		spo.selectGeneralMedicineInTheDepartment();

		//click Survey Type
		spo.clickSurveyType();

		//Select Regular in the Survey Type
		spo.selectRegularInTheSurveyType();

		//Verify Searched Department is Displayed 
		Thread.sleep(4000);
		String actual_text=driver.findElement(spo.verify_the_searched_department).getText();		
		String expected_text ="General Medicine";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);

		//Verify Searched Location is Displayed
		Thread.sleep(4000);
		String actual_text1=driver.findElement(spo.verify_the_searched_location).getText();		
		String expected_text1 ="Kochi";
		Assert.assertEquals(expected_text1,actual_text1);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text1);

	}

	//TC_26
	public void verifyEditedSurveyIsDisplayed() throws InterruptedException, IOException

	{

		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//Type a Already Created Survey name 
		spo.getSearchByName();

		//Click Edit Button
		spo.clickEditButton();

		//Edit the Survey Name 
		spo.editSurvey();

		//Click Next in the form - Survey
		spo.clickNextInForm1();

		//Click Next in the form - Survey Definition
		spo.clickNextInForm2();

		//Click Next in the form - Response Definition
		spo.clickNextInForm3();

		//Click Save
		spo.clickSave();

		//Type a Edited Survey Name in the Search By Name Field
		spo.getEditedSearchByName();


		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_the_search_by_name).getText();		
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String>expected_name=d.getdata("EditSurvey");
		String expected_text = expected_name.get(1);
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_27
	public void verifyUserIsAbleToDeleteASurvey() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//Type a Edited Survey Name in the Search By Name Field
		spo.getEditedSearchByName();

		//Click Delete Button
		spo.clickDeleteButton();

		//Click Yes Delete It Button
		spo.clickYesDeleteItButton();

		//Click Ok Button
		spo.clickOkButton();

	}

	//TC_28
	public void verifyUserInTheSettingPage() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//Type a Already Created Survey name 
		spo.getEditedSearchByName();

		//Click Setting
		spo.clickSetting();

		String actual_url=driver.findElement(By.xpath("//a[text()='Settings']")).getText();
		String expected_url = "Settings";
		Assert.assertEquals(expected_url,actual_url);
		System.out.println(" URL Verified");
		System.out.println(" URL : "+ actual_url);
	}

	//TC_29
	public void verifySettingSuccessfullyAdded() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//Type a Already Created Survey name 
		//scs.getSearchByName();

		//Click Setting
		spo.clickSetting();

		//Navigate to the Previous Page
		spo.navigateToPreviousPage();

		//Click Setting
		spo.clickSetting();

		//Typing the question name in the select question 
		spo.getSelectQuestion();

		//Click Question Bank in Settings
		spo.clickQuestionBankInSettings();

		//Click the One time Question Check Box
		spo.tickOneTimeQuestionChkbox();

		//Click Save in the Survey Setting
		spo.clickSaveSurveySetting();

		String actual_text=driver.findElement(spo.survey_already_exist_alert).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC30
	public void verifyUserIsAbleToReturnASurveyPage() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//click Current Survey Button
		spo.clickCurrentSurveys();

		//Type a Already Created Survey name 
		spo.getEditedSearchByName();

		//Click Setting
		spo.clickSetting();

		//Click Back 
		spo.clickBackInSurveySetting();

		String actual_text=driver.findElement(spo.create_survey).getText();		
		String expected_text = "Create Survey";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);

	}

	//Warehouse Methods

	//TC_31(1/2)
	public void verifyWareHouseButtonIsVisible() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Verify Ware house Button is Visible
		String actual_text=driver.findElement(spo.ware_house).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);

		//Click Ware house button
		spo.clickWareHouseButton();
	}

	//TC_31(2/2)
	public void verifyUserInTheWareHousePage() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Verify User in the WareHouse Page
		String actual_text=driver.findElement(spo.ware_house_page).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_32
	public void verifySearchedQuestionIsDisplayed() throws IOException, InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Ware house button
		spo.clickWareHouseButton();

		//Click Get Question Button
		spo.clickGetQuestion();

		//Type a Already Created Question Name 
		spo.getSearchByQuestion();

		//Verifying the searched question is displayed
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_the_question).getText();		
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String>expected_name=d.getdata("warehouse");
		String expected_text = actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_33
	public void verifySelectedGroupIsDisplayed() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Ware house button
		spo.clickWareHouseButton();

		//Click Groups
		spo.clickGroups();

		//Select ASRT in the Groups
		spo.selectAsrtInGroups();

		//Click Get Question Button
		spo.clickGetQuestion();

		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_asrt_in_the_group).getText();		
		String expected_text = actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);

	}

	//TC_34
	public void verifySelectedCategoryIsDisplayed() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Ware house button
		spo.clickWareHouseButton();

		//Click Groups
		spo.clickCategory();

		//Select ASRT in the Groups
		spo.selectCmeInCategory();

		//Click Get Question Button
		spo.clickGetQuestion();

		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_cme_in_the_category).getText();		
		String expected_text = actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_35
	public void verifySelectedLanguageIsDisplayed() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Ware house button
		spo.clickWareHouseButton();

		//Click Language
		spo.clickLanguageWh();;

		//Select English in Language
		spo.selectEnglishInLanguageWh();

		//Click Get Question Button
		spo.clickGetQuestion();

		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_english_in_the_language).getText();		
		String expected_text = actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);

	}

	//TC_36
	public void verifyUserIsAbleToSearchAQuestionWithGroupsAndCategoryAndLanguage() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Ware house button
		spo.clickWareHouseButton();

		//Select Group and Category as same
		spo.clickCategory();

		//Select CME in the Category
		spo.selectCmeInCategory();

		//Click Language
		spo.clickLanguageWh();;

		//Select English in Language
		spo.selectEnglishInLanguageWh();

		//Click Get Question Button
		spo.clickGetQuestion();

		//Verify CME text is displayed
		Thread.sleep(2000);
		String actual_text1=driver.findElement(spo.verify_cme_in_the_category).getText();		
		String expected_text1 = actual_text1;
		Assert.assertEquals(expected_text1,actual_text1);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text1);

		//Verify English Language is Displayed
		Thread.sleep(2000);
		String actual_text2=driver.findElement(spo.verify_english_in_the_language).getText();		
		String expected_text2 = actual_text2;
		Assert.assertEquals(expected_text2,actual_text2);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text2);


	}

	//edit

	//TC_37
	public void VerifyQuestionSuccessfullyUpdated() throws InterruptedException, IOException, AWTException

	{

		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Ware house button
		spo.clickWareHouseButton();

		//Select Group and Category as same
		spo.clickCategory();

		//Select Test1 in the Category
		spo.selectTest1InCategory();

		//Click Language
		spo.clickLanguageWh();;

		//Select English in Language
		spo.selectEnglishInLanguageWh();

		//Click Get Question Button
		spo.clickGetQuestion();

		//Click Edit Button
		spo.clickEditButtonWh();

		//Edit Question in the Warehouse
		spo.editQuestionInWareHouse();

		//Click Save
		spo.clickSaveWh();

		String actual_text=driver.findElement(spo.question_successfully_updated).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_38
	public void verifyUserIsAbleToDeleteAQuestion() throws InterruptedException

	{

		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Ware house button
		spo.clickWareHouseButton();

		//Select Group and Category as same
		spo.clickCategory();

		//Select Test1 in the Category
		spo.selectTest1InCategory();

		//Click Language
		spo.clickLanguageWh();;

		//Select English in Language
		spo.selectEnglishInLanguageWh();

		//Click Get Question Button
		spo.clickGetQuestion();

		//Click Delete Icon
		spo.clickDelete();

		//Click Yes, Delete inside the delete icon
		spo.clickYesDeleteIt();

		//Click Ok
		spo.clickOk();
	}

	//TC_39
	public void verifyUserIsAbleToViewAQuestionByGroupOrder() throws InterruptedException

	{

		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Ware house button
		spo.clickWareHouseButton();

		//Click Groups
		spo.clickGroups();

		//Select ASRT in the Groups
		spo.selectAsrtInGroups();

		//Click Get Question Button
		spo.clickGetQuestion();

		//Click the Group 
		spo.clickGroupOrder();

		//Verify Selected Group is displayed
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_asrt_in_the_group).getText();		
		String expected_text = actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);

	}

	//TC_40
	public void verifyUserIsAbleToViewAQuestionByCategoryOrder() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Ware house button
		spo.clickWareHouseButton();

		//Click Groups
		spo.clickCategory();

		//Select cme in the Category
		spo.selectCmeInCategory();

		//Click Get Question Button
		spo.clickGetQuestion();

		//Verify CME text is displayed
		Thread.sleep(2000);
		String actual_text1=driver.findElement(spo.verify_cme_in_the_category).getText();		
		String expected_text1 = actual_text1;
		Assert.assertEquals(expected_text1,actual_text1);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text1);

	}

	//TC_41
	public void verifyUserIsAbleToViewAQuestionByQuestionOrder() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Ware house button
		spo.clickWareHouseButton();

		//Click Get Question Button
		spo.clickGetQuestion();

		//Type a Already Created Question Name 
		spo.getSearchByQuestion();

		//Verifying the searched question is displayed
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_the_question).getText();		
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String>expected_name=d.getdata("warehouse");
		String expected_text = actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_42
	public void verifyUserIsAbleToViewAQuestionByTypeOrder() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Ware house button
		spo.clickWareHouseButton();

		//Click Get Question Button
		spo.clickGetQuestion();

		//Type a Already Created Question Name 
		spo.getSearchByQuestion();

		//Click Type 
		spo.clickTypeOrder();

		//Verifying the searched question is displayed
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_the_question).getText();		
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String>expected_name=d.getdata("warehouse");
		String expected_text = actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_43
	public void verifyUserIsAbleToViewAQuestionByLanguageOrder() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Ware house button
		spo.clickWareHouseButton();

		//Click Get Question Button
		spo.clickGetQuestion();

		//Type a Already Created Question Name 
		spo.getSearchByQuestion();

		//Click Type 
		spo.clickLanguageOrder();

		//Verifying the searched question is displayed
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_the_question).getText();		
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String>expected_name=d.getdata("warehouse");
		String expected_text = actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_44
	public void verifyUserIsAbleToEnterAResultsPage() throws InterruptedException

	{

		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Result
		spo.clickResultTab();

		//Verify User in the Result Page
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_result_page).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);

	}

	//TC_45
	public void verifyUserIsAbleToSearchASurveyWithLocationInTheResults() throws InterruptedException

	{

		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Result
		spo.clickResultTab();

		//Click Location Button
		spo.clickLocationBtn();

		//Select kochi in the Location
		spo.selectKochiInLocation();

		//Click Run Report Button
		spo.runReportButton();

		//Verify data available or not
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.no_data_available_validation).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);

	}

	//TC_46
	public void verifyUserIsAbleToSearchASurveyWithDepartmentInTheResults() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Result
		spo.clickResultTab();

		//Click Location Button
		spo.clickDepartmentBtn();

		//Select General Medicine In Department
		spo.selectGeneralMedicineInDepartment();

		//Click Run Report Button
		spo.runReportButton();

		//Verify data available or not
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.no_data_available_validation).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_47
	public void verifyUserIsAbleToSearchASurveyWithMonthInTheResults() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Result
		spo.clickResultTab();

		//Click Month
		spo.clickMonthBtn();

		//Select December in Month
		spo.selectDecemberInMonth();

		//Click Run Report Button
		spo.runReportButton();

		//Verify data available or not
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.no_data_available_validation).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_48
	public void verifyUserIsAbleToSearchASurveyWithYearInTheResults() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Result
		spo.clickResultTab();

		//Click Year Button
		spo.clickYearBtn();

		//select 2022 in the Year
		spo.select2022InYear();

		//Click Run Report Button
		spo.runReportButton();

		//Verify data available or not
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.no_data_available_validation).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_49
	public void verifyUserIsAbleToSearchASurveyWithSectionInTheResults() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Result
		spo.clickResultTab();

		//Click Section Button
		spo.clickSectionBtn();

		//Select All in the Section
		spo.selectAllInSection();

		//Click Run Report Button
		spo.runReportButton();

		//Verify data available or not
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.no_data_available_validation).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC_50
	public void verifyUserIsAbleToSearchASurveyWithLocationDepartmentMonthYearAndSectionInTheResults() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Result
		spo.clickResultTab();

		//Click Location Button
		spo.clickLocationBtn();

		//Select kochi in the Location
		spo.selectKochiInLocation();

		//Click Location Button
		spo.clickDepartmentBtn();

		//Select General Medicine In Department
		spo.selectGeneralMedicineInDepartment();

		//Click Month
		spo.clickMonthBtn();

		//Select December in Month
		spo.selectDecemberInMonth();

		//Click Year Button
		spo.clickYearBtn();

		//select 2022 in the Year
		spo.select2022InYear();

		//Click Section Button
		spo.clickSectionBtn();

		//Select All in the Section
		spo.selectAllInSection();

		//Click Run Report Button
		spo.runReportButton();

		//Verify data available or not
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.no_data_available_validation).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC51
	public void verifyUserIsAbleToViewASurveyBySurveyName() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Result
		spo.clickResultTab();

		//Click Location Button
		spo.clickLocationBtn();

		//Select kochi in the Location
		spo.selectKochiInLocation();

		//Click Location Button
		spo.clickDepartmentBtn();

		//Select General Medicine In Department
		spo.selectGeneralMedicineInDepartment();

		//Click Month
		spo.clickMonthBtn();

		//Select December in Month
		spo.selectJulyInMonth();

		//Click Year Button
		spo.clickYearBtn();

		//select 2022 in the Year
		spo.select2022InYear();

		//Click Section Button
		spo.clickSectionBtn();

		//Select All in the Section
		spo.selectAllInSection();

		//Click Run Report Button
		spo.runReportButton();

		spo.clickSurveyNameOrder();

		//Verify data available or not
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_the_survey_name_by_order).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC52
	public void verifyWhetherUserIsAbleToViewASurveyByVersion() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Result
		spo.clickResultTab();

		//Click Location Button
		spo.clickLocationBtn();

		//Select kochi in the Location
		spo.selectKochiInLocation();

		//Click Location Button
		spo.clickDepartmentBtn();

		//Select General Medicine In Department
		spo.selectGeneralMedicineInDepartment();

		//Click Month
		spo.clickMonthBtn();

		//Select December in Month
		spo.selectJulyInMonth();

		//Click Year Button
		spo.clickYearBtn();

		//select 2022 in the Year
		spo.select2022InYear();

		//Click Section Button
		spo.clickSectionBtn();

		//Select All in the Section
		spo.selectAllInSection();

		//Click Run Report Button
		spo.runReportButton();

		spo.clickSurveyNameOrder();

		//Verify data available or not
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_the_version_by_order).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC53
	public void verifyUserIsAbleToViewASurveyByVersionCreateDateOrder() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Result
		spo.clickResultTab();

		//Click Location Button
		spo.clickLocationBtn();

		//Select kochi in the Location
		spo.selectKochiInLocation();

		//Click Location Button
		spo.clickDepartmentBtn();

		//Select General Medicine In Department
		spo.selectGeneralMedicineInDepartment();

		//Click Month
		spo.clickMonthBtn();

		//Select December in Month
		spo.selectJulyInMonth();

		//Click Year Button
		spo.clickYearBtn();

		//select 2022 in the Year
		spo.select2022InYear();

		//Click Section Button
		spo.clickSectionBtn();

		//Select All in the Section
		spo.selectAllInSection();

		//Click Run Report Button
		spo.runReportButton();

		spo.clickSurveyNameOrder();

		//Verify data available or not
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_the_version_create_date_order).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}

	//TC54
	public void verifyUserIsAbleToViewASurveyByStatus() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click Result
		spo.clickResultTab();

		//Click Location Button
		spo.clickLocationBtn();

		//Select kochi in the Location
		spo.selectKochiInLocation();

		//Click Location Button
		spo.clickDepartmentBtn();

		//Select General Medicine In Department
		spo.selectGeneralMedicineInDepartment();

		//Click Month
		spo.clickMonthBtn();

		//Select December in Month
		spo.selectJulyInMonth();

		//Click Year Button
		spo.clickYearBtn();

		//select 2022 in the Year
		spo.select2022InYear();

		//Click Section Button
		spo.clickSectionBtn();

		//Select All in the Section
		spo.selectAllInSection();

		//Click Run Report Button
		spo.runReportButton();

		spo.clickSurveyNameOrder();

		//Verify data available or not
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_the_status_order).getText();		
		String expected_text=actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);
	}


	//TC_55
	public void verifyUserIsAbleToEnterASendSurvey() throws InterruptedException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click Send Survey Button+
		spo.clickSendSurveyButton();

		//Verify User in the Send Survey Page
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_send_survey_page).getText();		
		String expected_text="Send Survey+";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println(" Text Verified");
		System.out.println(" Text : "+ actual_text);

	}

	//TC_56
	public void verifyUserIsAbleToSendASurvey() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click Send Survey Button+
		spo.clickSendSurveyButton();

		//Click Location Button
		spo.clickLocationButton();

		//Select Kochi in Location 
		spo.selectKochiInLocationInSendSurvey();

		//Click Department Button
		spo.clickDepartmentButton();

		//Select Cardiology in Department
		spo.selectCardiologyInDepartment();

		//Click Survey 
		spo.clickSurveyDefinition();

		//Select English Adult In survey
		spo.selectEnglishAdultInSurveyDefinition();

		//Type a email_text in the Email Text Field
		spo.getEmail();

		//Type a Phone No in the Phone No Text Field
		spo.getPhoneNumber();

		//Click Send Button
		spo.clickSendButton();

		//Verify the email sent validation message
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_sms_and_phone_no_both_send).getText();
		String expected_text = actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println("Text Verified");
		System.out.println(" Text : "+ actual_text);

	}

	//TC_57
	public void verifyUserIsAbleToSendASurveyToEmail() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click Send Survey Button+
		spo.clickSendSurveyButton();

		//Click Location Button
		spo.clickLocationButton();

		//Select Kochi in Location 
		spo.selectKochiInLocationInSendSurvey();

		//Click Department Button
		spo.clickDepartmentButton();

		//Select Cardiology in Department
		spo.selectCardiologyInDepartment();

		//Click Survey 
		spo.clickSurveyDefinition();

		//Select English Adult In survey
		spo.selectEnglishAdultInSurveyDefinition();

		//Type a email_text in the Email Text Field
		spo.getEmail();

		//	spo.getPhoneNumber();

		//Click Send Button
		spo.clickSendButton();

		//Verify the email sent validation message
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_email_sent).getText();
		String expected_text = actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println("Text Verified");
		System.out.println(" Text : "+ actual_text);

	}

	//TC_58
	public void verifyUserIsAbleToSendASurveyToPhoneNumber() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click Send Survey Button+
		spo.clickSendSurveyButton();

		//Click Location Button
		spo.clickLocationButton();

		//Select Kochi in Location 
		spo.selectKochiInLocationInSendSurvey();

		//Click Department Button
		spo.clickDepartmentButton();

		//Select Cardiology in Department
		spo.selectCardiologyInDepartment();

		//Click Survey 
		spo.clickSurveyDefinition();

		//Select English Adult In survey
		spo.selectEnglishAdultInSurveyDefinition();

		//Type a Phone No in the Phone No Text Field
		spo.getPhoneNumber();

		//Click Send Button
		spo.clickSendButton();

		//Verify the email sent validation message
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_sms_sent).getText();
		String expected_text = actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println("Text Verified");
		System.out.println(" Text : "+ actual_text);

	}

	//TC_59
	public void verifyUserIsAbleToSendASurveyWithoutFillingAMandatoryFields() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click Send Survey Button+
		spo.clickSendSurveyButton();

		//Click Location Button
		spo.clickLocationButton();

		//Select Kochi in Location 
		spo.selectKochiInLocationInSendSurvey();

		//Click Department Button
		spo.clickDepartmentButton();

		//Select Cardiology in Department
		spo.selectCardiologyInDepartment();

		//Click Survey 
		spo.clickSurveyDefinition();

		//Select English Adult In survey
		spo.selectEnglishAdultInSurveyDefinition();

		/*	//Type a Invalid Email Format in the Email Field
		spo.getInvalidEmail();

		//Type a Phone No in the Phone No Text Field
		spo.getPhoneNumber();
		 */
		//Click Send Button
		spo.clickSendButton();

		//Verify the email sent validation message
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_email_and_phone_no_both_can_not_be_blank).getText();
		String expected_text = actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println("Text Verified");
		System.out.println(" Text : "+ actual_text);

	}

	//TC_60
	public void verifyUserIsAbleToSendASurveyWithInvalidEmailAndValidPhoneNumber() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click Send Survey Button+
		spo.clickSendSurveyButton();

		//Click Location Button
		spo.clickLocationButton();

		//Select Kochi in Location 
		spo.selectKochiInLocationInSendSurvey();

		//Click Department Button
		spo.clickDepartmentButton();

		//Select Cardiology in Department
		spo.selectCardiologyInDepartment();

		//Click Survey 
		spo.clickSurveyDefinition();

		//Select English Adult In survey
		spo.selectEnglishAdultInSurveyDefinition();

		//Type a Invalid Email Format in the Email Field
		spo.getInvalidEmail();

		//Type a Phone No in the Phone No Text Field
		spo.getPhoneNumber();

		//Click Send Button
		spo.clickSendButton();

		//Verify the email sent validation message
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_enter_valid_email).getText();
		String expected_text ="Please enter a valid email address";
		Assert.assertEquals(expected_text,actual_text);
		System.out.println("Text Verified");
		System.out.println(" Text : "+ actual_text);

	}

	//TC_61
	public void verifyUserIsAbleToSendASurveyWithValidEmailandInvalidPhoneNumber() throws InterruptedException, IOException

	{
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click Send Survey Button+
		spo.clickSendSurveyButton();

		//Click Location Button
		spo.clickLocationButton();

		//Select Kochi in Location 
		spo.selectKochiInLocationInSendSurvey();

		//Click Department Button
		spo.clickDepartmentButton();

		//Select Cardiology in Department
		spo.selectCardiologyInDepartment();

		//Click Survey 
		spo.clickSurveyDefinition();

		//Select English Adult In survey
		spo.selectEnglishAdultInSurveyDefinition();

		//Type a email_text in the Email Text Field
		spo.getEmail();

		//Invalid Mobile Number
		spo.getPhoneNumber();

		//Click Send Button
		spo.clickSendButton();

		//Verify the email sent validation message
		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_sms_failed_and_email_sent).getText();
		String expected_text = actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println("Text Verified");
		System.out.println(" Text : "+ actual_text);

	}

	//TC_62
	public void verifyNewCreatedQuestionDisplayedInTheWareHouse() throws InterruptedException, IOException

	{		
		//Initializing the POM Page
		SurveyPage_Objects spo = new SurveyPage_Objects(driver);

		//Click survey Button
		spo.clickSurveyButton();

		//Click question bank
		spo.clickQuestionBank();

		//Click add new
		spo.clickAddNew();

		//Click Question Type
		spo.clickQuestionType();

		//Select Objective in the Question Type
		spo.selectObjectiveInQuestionType();

		//Click Language
		spo.clickLanguageQb();

		//Select English in Language
		spo.selectEnglishInLanguage();

		//Type Valid Data in the category
		spo.selectCategory();

		//Type a question in Compose Question
		spo.composeQuestion();

		//Type data in the options
		spo.options();

		//Type Valid Data in the response
		spo.response();

		//click Add to Ware house Button in the Question Bank 
		spo.clickAddToWareHouse();

		//type a group name
		spo.selectGroups();

		//Click Save
		spo.clickSaveQb();

		//Click Ware house button
		spo.clickWareHouseButton();

		//Select Cme in the Groups and Click Category
		spo.clickCategory();

		//Select test2 In the Category
		spo.selectTest1InCategory();

		//Click Language
		spo.clickLanguageWh();;

		//Select English in Language
		spo.selectEnglishInLanguageWh();

		//Click Get Question Button
		spo.clickGetQuestion();

		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> question_name=d.getdata("AddNewQuestion");

		Thread.sleep(2000);
		String actual_text=driver.findElement(spo.verify_the_question).getText();
		String expected_text = actual_text;
		Assert.assertEquals(expected_text,actual_text);
		System.out.println("Text Verified");
		System.out.println(" Text : "+ actual_text);

	}
}



