package pearl.SmartER.PageObjects;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;import org.testng.Assert;

import pearl.SmartER.Utils.SurveyDataDrivenExcel;

public class SurveyPage_Objects {


	//Question Bank WebElements

	//Login
	public  By username_field = By.xpath("//input[@formcontrolname='username']");
	public	By password_field = By.xpath("//input[@formcontrolname='password']");
	public	By login_button = By.xpath("//button[text()='Login']");
	//Survey
	public	By survey_button = By.xpath("//span[text()='Survey']");
	public	By question_bank = By.xpath("//a[text()=' Question Bank ']");
	public	By add_from_warehouse = By.xpath("//button[text()='Add From Warehouse']");
	public By add_new = By.xpath("//a[text()='Add New']");
	public By question_type = By.xpath("//select[@formcontrolname='questiontypeid']");
	public By objective = By.xpath("//option[text()='Objective']");
	public By language_qb = By.xpath("//select[@formcontrolname='language']");
	public By english = By.xpath("//option[text()='English']");
	public By compose_question = By.xpath("//div[@data-placeholder='Compose Question']");
	public By options = By.xpath("//input[@formcontrolname='option']");
	public By response = By.xpath("//input[@formcontrolname='response']");
	public By search_by_question_qb = By.xpath("//input[@name='searchQuestion']");
	public By save_qb = By.xpath("//button[text()='Save']");
	public By back_qb = By.xpath("//button[text()='Back']");
	public By delete_qb = By.xpath("(//a[@class='confirm-delete'])[1]");
	public By yes_delete_it_qb = By.xpath("//button[@class='swal2-confirm swal2-styled']");
	public By ok_qb = By.xpath("//button[@class='swal2-confirm swal2-styled']");
	public By add_to_ware_house = By.xpath("//span[text()='Add To Warehouse']");
	public By select_groups = By.xpath("//input[@placeholder='Add / Select Group']");
	public By category = By.xpath("//input[@formcontrolname='category']");
	public By verify_the_question_name = By.xpath("//td/div/p");

	//Current Survey WebElements

	public By current_surveys = By.xpath("//a[text()=' Current Surveys ']");
	public By create_survey = By.xpath("//button[text()=' Create Survey']");
	public By click_create_survey = By.xpath("//i[@class='fa fa-plus']");
	public By name = By.xpath("//input[@formcontrolname='name']");
	public By age_group = By.xpath("//select[@formcontrolname='agegroupid']");
	public By select_age = By.xpath("(//option[@value='1'])[1]");
	public By language = By.xpath("//select[@formcontrolname='languageid']");
	public By select_language_english = By.xpath("(//option[@value='1'])[2]");
	public By select_language_hindi = By.xpath("//option[text()=' hindi']");
	public By select_language_tamil = By.xpath("//option[text()=' tamil']");
	public By select_language_malayalam = By.xpath("//option[text()=' Malayalam']");
	public By select_language_kannada = By.xpath("//option[text()=' kannada']");
	public By select_language_telugu = By.xpath("//option[text()=' telugu']");
	public By select_language_urdu = By.xpath("//option[text()=' Urdu']");
	public By header = By.xpath("//input[@formcontrolname='surveyheader']");
	public By next1 = By.xpath("(//button[text()=' Next'])[1]");
	public By email_subject = By.xpath("//input[@formcontrolname='emailsubject']");
	public By email_message = By.xpath("//textarea[@formcontrolname='emailmessage']");
	public By text_message = By.xpath("//textarea[@formcontrolname='textmessage']");
	public By disclaimer = By.xpath("(//div[@class='ql-editor ql-blank'])[1]");
	public By close_thankyou = By.xpath("//div[@data-placeholder='Thank you Message']");
	public By thankyou_header = By.xpath("//div[@data-placeholder='Thank you header']");
	public By next2 = By.xpath("(//button[text()=' Next'])[2]");
	public By subject = By.xpath("//input[@formcontrolname='subject']");
	public By header_response_page = By.xpath("//input[@formcontrolname='header']");
	public By email_response_message = By.xpath("//textarea[@placeholder='Email Response Message']");
	public By sms_response_message = By.xpath("//textarea[@placeholder='SMS Response Message']");
	public By next3 = By.xpath("(//button[text()=' Next'])[3]");
	public By regular_email = By.xpath("(//textarea[@placeholder='Regular'])[1]");
	public By link_message_email = By.xpath("(//textarea[@placeholder='Link Message'])[1]");
	public By regular_sms = By.xpath("(//textarea[@placeholder='Regular'])[2]");
	public By link_message_sms = By.xpath("(//textarea[@placeholder='Link Message'])[2]");
	public By save = By.xpath("//button[text()='Save']");
	public By back = By.xpath("//button[text()='Back']");
	public By survey_already_exist_alert = By.xpath("//ngb-alert[@role='alert']");

	//form1 - Survey

	public By name_validation_message = By.xpath("//div[text()=' Name is required ']");
	public By agegroup_validation_message = By.xpath("//div[text()=' Agegroup is required ']");
	public By header_validation_message = By.xpath("//div[text()=' Header Required ']");

	//form2 - Survey Definition

	public By email_subject_validation_message = By.xpath("//div[text()=' Email Subject is required ']");
	public By email_message_validation_message = By.xpath("//div[text()=' Email Message is required ']");
	public By text_message_validation_message = By.xpath("//div[text()=' Text Message is required ']");
	public By disclaimer_validation_message = By.xpath("//div[text()=' Disclaimer is required ']");
	public By close_thankyou_validation_message = By.xpath("//div[text()=' Thankyou message is required ']");
	public By thankyou_header_validation_message = By.xpath("//div[text()=' Thank you header is required ']");

	//form3 - Response Definition

	public By subject_validation_message = By.xpath("//p[text()=' Subject is required ']");
	public By header_response_validation_message = By.xpath("//p[text()=' Header is required ']");
	public By email_response_message_validation_message = By.xpath("//div[text()=' Email Response Message is required ']");
	public By sms_response_message_validation_message = By.xpath("//div[text()=' SMS Response Message is required ']");

	//Search Survey 
	//Searched By Name
	public By search_by_name = By.xpath("//input[@placeholder='Search By Name']");
	public By verify_the_search_by_name = By.xpath("(//tr/td)[2]");
	//With location
	public By click_location = By.xpath("//select[@formcontrolname='hospitals']");
	public By select_location_kochi = By.xpath("//option[text()='Kochi']");
	public By verify_the_searched_location = By.xpath("(//tr/td)[3]");
	//Searched By Department
	public By click_department = By.xpath("//select[@formcontrolname='departments']");
	public By select_general_medicine_department = By.xpath("//select[@formcontrolname='departments']");
	public By verify_the_searched_department = By.xpath("(//tr/td)[4]");
	//Searched By Survey Type
	public By click_survey_type = By.xpath("//select[@formcontrolname='type']");
	public By click_regular_survey_type = By.xpath("//option[text()='Regular']");

	//Edit Survey
	public By click_edit_button = By.xpath("(//a[@title='Edit'])[1]");
	//Delete Survey
	public By click_delete_button = By.xpath("(//a[@title='Delete'])[1]");
	public By click_Yes_delete_it = By.xpath("//button[@class='swal2-confirm swal2-styled']");
	public By click_ok = By.xpath("//button[text()='OK']");

	//Settings
	public By click_setting = By.xpath("//a[@title='Settings']/i");
	//Click Question Bank inside in the settings
	public By click_question_bank = By.xpath("//button[text()='Question Bank']");
	//Edit Setting
	public By select_question = By.xpath("//input[@formcontrolname='seltquestion']");
	public By select_select_question = By.xpath("//li[@class='active']");
	public By click_first_question_chkbox = By.xpath("//input[@id='check1']");
	public By click_save_survey_setting = By.xpath("//button[text()='Save']");
	public By click_Back = By.xpath("//button[text()='Back']");


	//WareHouse WebElements
	//WareHouse
	public By ware_house = By.xpath("//a[text()=' Warehouse ']");
	public By ware_house_page = By.xpath("//li[text()=' Warehouse ']");

	//Search Question in Warehouse
	public By search_by_question = By.xpath("//input[@placeholder='Search By Question']");
	public By click_get_question_button = By.xpath("//button[text()=' Get Question']");
	public By verify_the_question = By.xpath("(//tr/td)[3]");

	//group
	public By group = By.xpath("//select[@formcontrolname='group']");
	public By select_asrt_in_group = By.xpath("//option[text()='ASRT']");
	public By select_cme_in_group = By.xpath("(//option[text()='CME'])[1]");
	public By verify_asrt_in_the_group = By.xpath("(//tr/td)[1]");

	//category
	public By category_wh = By.xpath("//select[@formcontrolname='category']");
	public By select_cme_in_category = By.xpath("(//option[text()='CME'])[2]");
	public By select_test2_in_category = By.xpath("//option[text()='test2']");
	public By verify_cme_in_the_category = By.xpath("(//tr/td)[2]");

	//language
	public By language_wh = By.xpath("//select[@formcontrolname='language']");
	public By select_english_in_language = By.xpath("(//option[@value='1'])[2]");
	public By verify_english_in_the_language = By.xpath("(//tr/td)[5]");

	//edit
	public By edit = By.xpath("(//i[@class='fa fa-edit text-navy'])[1]");
	public By question = By.xpath("//div[@class='ql-editor']");
	public By save_wh = By.xpath("//button[text()='Save']");
	public By question_successfully_updated = By.xpath("//ngb-alert[@role='alert']");

	//delete
	public By delete = By.xpath("//a[@class='confirm-delete']");
	public By yes_delete_it = By.xpath("//button[text()='Yes,delete it!']");
	public By ok = By.xpath("//button[text()='OK']");

	//ascending or descending
	public By group_order = By.xpath("//a[text()='Group']");
	public By category_order = By.xpath("//a[text()='Category']");
	public By question_order = By.xpath("//a[text()='Question']");
	public By type_order = By.xpath("//a[text()='Type']");
	public By language_order = By.xpath("//a[text()='Language']");

	//Result Page
	public By result_tab = By.xpath("//a[text()=' Results ']");
	public By verify_result_page = By.xpath("//strong[text()='Results']");

	//Location
	public By location_btn = By.xpath("//select[@formcontrolname='hospitalid']");
	public By select_kochi_in_location = By.xpath("//option[text()='Kochi']");

	//Run Report Button
	public By run_report_btn = By.xpath("//button[text()=' Run Report']");
	public By no_data_available_validation = By.xpath("//td[@align='center']");

	//Department
	public By department_btn = By.xpath("//select[@formcontrolname='departmentid']");
	public By select_general_medicine_in_department = By.xpath("//option[text()='General Medicine']");

	//Month
	public By month_btn = By.xpath("//select[@formcontrolname='month']");
	public By select_december_in_the_month = By.xpath("//option[text()='December']");
	public By select_july_in_the_month = By.xpath("//option[text()='July']");

	//Year
	public By year_btn = By.xpath("//select[@formcontrolname='year']");
	public By select_2022_in_the_year = By.xpath("//option[text()='2022']");

	//Section
	public By section_btn = By.xpath("//select[@formcontrolname='location']");
	public By select_all_in_section = By.xpath("(//option[text()='ALL'])[3]");


	//verifying the question which is created in the question bank is displayed in the warehouse
	public By veriy_the_question_name = By.xpath("//td/div/p");

	//Order By clicks(ascending or descending)
	public By survey_name_order = By.xpath("//a[text()='Survey Name']");
	public By version_order = By.xpath("//a[text()='Version']");
	public By version_create_date_order = By.xpath("Version Create Date");
	public By status_order = By.xpath("//a[text()='Status']");

	//Verify the order
	public By verify_the_survey_name_by_order = By.xpath("(//td/a)[1]");
	public By verify_the_version_by_order = By.xpath("(//td)[2]");
	public By verify_the_version_create_date_order = By.xpath("(//td)[3]");
	public By verify_the_status_order = By.xpath("(//td)[4]");

	//CCUSER

	//Send Survey
	public By send_survey_btn = By.xpath("//span[text()='Send Survey+']");
	public By verify_send_survey_page = By.xpath("//strong[text()='Send Survey+']");

	//Location
	public By send_survey_location_btn = By.xpath("//select[@formcontrolname='hospitalid']");
	public By send_survey_click_kochi_in_location = By.xpath("//option[text()='Kochi']");

	//Department
	public By send_survey_department_btn = By.xpath("//select[@formcontrolname='departmentid']");
	public By click_emergency_in_department = By.xpath("//option[text()='EMERGENCY']");
	public By click_cardiology_in_department = By.xpath("//option[text()='Cardiology']");
	
	//Survey definition(adult or child)
	public By send_survey_survey_definition_btn = By.xpath("//select[@formcontrolname='name']");
	public By click_english_adult_in_survey_definition = By.xpath("//option[text()='English Child']");
	public By click_english_child_in_survey_definition = By.xpath("//option[text()='English Child']");

	//Email
	public By send_survey_email_btn = By.xpath("//input[@formcontrolname='email']");

	//Phone Number
	public By send_survey_phone_number_btn = By.xpath("//input[@formcontrolname='phone_number']");

	//Click Send button
	public By send_btn = By.xpath("//button[text()='Send']");
	
	//Verifying the message
	public By verify_sms_failed_and_email_sent = By.xpath("//ngb-alert[@role='alert']");
	public By verify_email_sent = By.xpath("//ngb-alert[@role='alert']");
	public By verify_enter_valid_email = By.xpath("//div[@class='error']");
	public By verify_sms_sent = By.xpath("//ngb-alert[@role='alert']");
	public By verify_sms_and_phone_no_both_send = By.xpath("//ngb-alert[@role='alert']");
	public By verify_email_and_phone_no_both_can_not_be_blank = By.xpath("//div[text()='Both Email and Phone number cannot be blank ']");
	


	public static WebDriver driver;

	public SurveyPage_Objects(WebDriver driver)

	{
		this.driver = driver;
	}  




	//Methods 

	public void getUsername() throws IOException, InterruptedException

	{
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> Username=d.getdata("Username");
		driver.findElement(username_field).sendKeys(Username.get(5));
		Thread.sleep(2000);

	}

	public void getPassword() throws IOException, InterruptedException

	{
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> Pass=d.getdata("Password");
		driver.findElement(password_field).sendKeys(Pass.get(5));
		Thread.sleep(3000);
	}

	public void getUsername1() throws IOException, InterruptedException

	{
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> Username=d.getdata("Username");
		driver.findElement(username_field).sendKeys(Username.get(6));
		Thread.sleep(2000);

	}

	public void getPassword1() throws IOException, InterruptedException

	{
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> Pass=d.getdata("Password");
		driver.findElement(password_field).sendKeys(Pass.get(6));
		Thread.sleep(3000);
	}

	public void getLoginbutton() throws InterruptedException

	{
		driver.findElement(login_button).click();
		Thread.sleep(10000);
	}

	//Survey
	public void clickSurveyButton() throws InterruptedException

	{
		driver.findElement(survey_button).click();
		Thread.sleep(3000);
	}

	//Question Bank
	public void clickQuestionBank() throws InterruptedException

	{
		driver.findElement(question_bank).click();
		Thread.sleep(3000);
	}

	public void clickAddFromWarehouse() throws InterruptedException

	{

		driver.findElement(add_from_warehouse).click();
		Thread.sleep(3000);
	}

	//Add new
	public void clickAddNew() throws InterruptedException

	{
		driver.findElement(add_new).click();
		Thread.sleep(4000);
	}

	public void clickQuestionType() throws InterruptedException

	{
		driver.findElement(question_type).click();
		Thread.sleep(3000);
	}

	public void selectObjectiveInQuestionType() throws InterruptedException

	{
		driver.findElement(objective).click();
		Thread.sleep(3000);
	}

	public void clickLanguageQb() throws InterruptedException

	{
		driver.findElement(language_qb).click();
		Thread.sleep(3000);
	}

	public void selectEnglishInLanguage()

	{
		driver.findElement(english).click();
	}


	public void composeQuestion() throws IOException, InterruptedException

	{

		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> ComposeQuestion=d.getdata("AddNewQuestion");
		driver.findElement(compose_question).sendKeys(ComposeQuestion.get(1));
		Thread.sleep(2000);

	}

	public void options() throws IOException, InterruptedException

	{
		//options.get(2)


		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> option=d.getdata("AddNewQuestion");
		driver.findElement(options).sendKeys(option.get(2));
		Thread.sleep(2000);
	}

	public void response() throws IOException, InterruptedException

	{
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> Response=d.getdata("AddNewQuestion");
		driver.findElement(response).sendKeys(Response.get(3));
		Thread.sleep(2000);
	}



	public void clickSaveQb() throws InterruptedException

	{
		driver.findElement(save_qb).click();
		Thread.sleep(6000);
	}

	public void back() throws InterruptedException
	{
		driver.findElement(back_qb).click();
		Thread.sleep(2000);
	}

	public void typeQuestionNameInSearchByQuestion() throws IOException, InterruptedException
	{
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> question_name=d.getdata("AddNewQuestion");
		Thread.sleep(3000);
		driver.findElement(search_by_question_qb).sendKeys(question_name.get(1));
		Thread.sleep(5000);
	}

	public void clickAddToWareHouse() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(add_to_ware_house).click();
		Thread.sleep(3000);
	}

	public void selectGroups() throws IOException, InterruptedException

	{
		/*	SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
				ArrayList<String> select_the_groups=d.getdata("AddNewQuestion");
				Thread.sleep(3000);
				driver.findElement(select_groups).sendKeys(select_the_groups.get(4));
				System.out.println(select_the_groups.get(4));
				Thread.sleep(5000); */

		Thread.sleep(2000);
		driver.findElement(select_groups).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()=' CME ']")).click();
	}

	public void selectCategory() throws InterruptedException, IOException

	{

		/*	SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
				ArrayList<String> category_name=d.getdata("AddNewQuestion");
				Thread.sleep(3000);
				driver.findElement(category).sendKeys(category_name.get(5));
				System.out.println(category_name.get(5));
				Thread.sleep(5000); */
		Thread.sleep(2000);
		driver.findElement(category).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //li[text()=' test2 ']")).click();
		Thread.sleep(2000);

	}

	//Current Surveys

	public void clickCurrentSurveys() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(current_surveys).click();
		Thread.sleep(5000);
	}

	public void clickCreateSurvey() throws InterruptedException

	{
		Thread.sleep(6000);
		driver.findElement(click_create_survey).click();
		Thread.sleep(3000);
	}

	//Create a new Survey
	public void getNameTextInTheNameField() throws IOException, InterruptedException
	{
		//Type something in Compose Question in Question
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> name_text=d.getdata("newsurvey");
		driver.findElement(name).sendKeys(name_text.get(1));
		Thread.sleep(2000);
	}

	public void clickAgeGroup() throws InterruptedException

	{
		driver.findElement(age_group).click();
		Thread.sleep(2000);
	}

	public void selectAge() throws InterruptedException

	{
		driver.findElement(select_age).click();
		Thread.sleep(3000);
	}

	public void clickLanguage() throws InterruptedException

	{
		driver.findElement(language).click();
		Thread.sleep(2000);
	}

	public void selectLanguageEnglish() throws InterruptedException

	{
		driver.findElement(select_language_english).click();
		Thread.sleep(3000);
	}

	public void selectLanguageMalayalam() throws InterruptedException

	{
		driver.findElement(select_language_malayalam).click();
		Thread.sleep(3000);
	}

	public void selectLanguageHindi() throws InterruptedException

	{
		driver.findElement(select_language_hindi).click();
		Thread.sleep(3000);
	}

	public void selectLanguageTamil() throws InterruptedException

	{
		driver.findElement(select_language_tamil).click();
		Thread.sleep(3000);
	}

	public void selectLanguageKannada() throws InterruptedException

	{
		driver.findElement(select_language_kannada).click();
		Thread.sleep(3000);
	}
	public void selectLanguageTelugu() throws InterruptedException

	{
		driver.findElement(select_language_telugu).click();
		Thread.sleep(3000);
	}
	public void selectLanguageUrdu() throws InterruptedException

	{
		driver.findElement(select_language_urdu).click();
		Thread.sleep(3000);
	}

	public void getHeaderTextInTheHeaderField() throws InterruptedException, IOException

	{
		//Type something in Header in Survey Page
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> header_text=d.getdata("newsurvey");
		driver.findElement(header).sendKeys(header_text.get(2));
		Thread.sleep(3000);

	}

	public void clickNextInForm1() throws InterruptedException

	{
		driver.findElement(next1).click();
		Thread.sleep(3000);
	}

	public void getEmailSubject() throws IOException, InterruptedException

	{
		//Type something in Email Subject in Survey Definition 
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> email_subject_text=d.getdata("newsurvey");
		driver.findElement(email_subject).sendKeys(email_subject_text.get(3));
		Thread.sleep(3000);
	}

	public void getEmailMessage() throws IOException, InterruptedException

	{
		//Type something in Email Message in Survey Definition 
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> email_message_text=d.getdata("newsurvey");
		driver.findElement(email_message).sendKeys(email_message_text.get(4));
		Thread.sleep(3000);
	}

	public void getTextMessage() throws IOException, InterruptedException

	{
		//Type something in Email TextMessage in Survey Definition 
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> text_message_text=d.getdata("newsurvey");
		driver.findElement(text_message).sendKeys(text_message_text.get(5));
		Thread.sleep(3000);
	}

	public void getOpenDisclaimer() throws IOException, InterruptedException

	{
		//Type something in open Disclaimer in Survey Definition 
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> open_disclaimer_text=d.getdata("newsurvey");
		driver.findElement(disclaimer).sendKeys(open_disclaimer_text.get(6));
		Thread.sleep(5000);

	}

	public void getCloseThankyou() throws IOException, InterruptedException 

	{
		//Type something in open close/thankyou in Survey Definition 
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> close_thankyou_text=d.getdata("newsurvey");
		driver.findElement(close_thankyou).sendKeys(close_thankyou_text.get(7));
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);

	}

	public void thankYouHeader() throws InterruptedException, IOException

	{

		//Type something in open thank you header in Survey Definition 
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> thankyou_header_text=d.getdata("newsurvey");
		driver.findElement(thankyou_header).sendKeys(thankyou_header_text.get(8));
		Thread.sleep(3000);

	}

	public void clickNextInForm2() throws InterruptedException

	{
		driver.findElement(next2).click();
		Thread.sleep(5000);
	}

	public void getSubject() throws InterruptedException, IOException 

	{
		//Type something in open thank you header in Survey Definition 
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> subject_text=d.getdata("newsurvey");
		driver.findElement(subject).sendKeys(subject_text.get(9));
		Thread.sleep(3000);
	}

	public void getHeaderInResponse() throws IOException, InterruptedException

	{
		//Type something in open thank you header in Survey Definition 
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> header_text=d.getdata("newsurvey");
		driver.findElement(header_response_page).sendKeys(header_text.get(10));
		Thread.sleep(3000);
	}

	public void getEmailResponseMessage() throws InterruptedException, IOException

	{
		//Type something in open thank you header in Survey Definition 
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> email_response_text=d.getdata("newsurvey");
		driver.findElement(email_response_message).sendKeys(email_response_text.get(11));
		Thread.sleep(3000);
	}

	public void getSmsResponseMessage() throws IOException, InterruptedException

	{
		//Type something in open thank you header in Survey Definition 
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> sms_response_text=d.getdata("newsurvey");
		driver.findElement(sms_response_message).sendKeys(sms_response_text.get(12));
		Thread.sleep(3000);
	}

	public void clickNextInForm3() throws InterruptedException
	{
		driver.findElement(next3).click();
		Thread.sleep(3000);
	}

	public void getEmailRegular() throws InterruptedException, IOException

	{
		//Type something in open thank you header in Survey Definition 
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String>email_regular_text=d.getdata("newsurvey");
		driver.findElement(regular_email).sendKeys(email_regular_text.get(13));
		Thread.sleep(3000);
	}

	public void getLinkMessageEmail() throws InterruptedException, IOException

	{
		driver.findElement(link_message_email).clear();
		Thread.sleep(3000);

		//Type something in open thank you header in Survey Definition 

		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> link_message_text=d.getdata("newsurvey");
		driver.findElement(link_message_email).sendKeys(link_message_text.get(14));
		Thread.sleep(3000);
	}

	public void getSmsRegular() throws InterruptedException, IOException

	{
		//Type something in open thank you header in Survey Definition 
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> sms_regular_text=d.getdata("newsurvey");
		driver.findElement(regular_sms).sendKeys(sms_regular_text.get(15));
		Thread.sleep(3000);
	}

	public void getLinkMessageSms() throws InterruptedException, IOException 

	{
		driver.findElement(link_message_sms).clear();
		Thread.sleep(3000);

		//Type something in open thank you header in Survey Definition 
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> link_message_text=d.getdata("newsurvey");
		driver.findElement(link_message_sms).sendKeys(link_message_text.get(16));
		Thread.sleep(3000);
	}

	public void clickSave() throws InterruptedException

	{
		driver.findElement(save).click();
		Thread.sleep(1000);
	}

	public void clickBack() throws InterruptedException

	{
		driver.findElement(back).click();
		Thread.sleep(5000);
	}
	//Searching the survey

	public void getSearchByName() throws InterruptedException, IOException

	{

		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String>search_by_name_text=d.getdata("newsurvey");
		driver.findElement(search_by_name).sendKeys(search_by_name_text.get(1));
		Thread.sleep(1000);
		driver.findElement((search_by_name)).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

	}

	//Location
	public void clickLocation() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(click_location).click();
		Thread.sleep(1000);
	}

	public void selectKochiInTheLocation() throws InterruptedException

	{
		driver.findElement(select_location_kochi).click();
		Thread.sleep(2000);
	}

	//Department
	public void clickDepartment() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(click_department).click();
		Thread.sleep(1000);
	}

	public void selectGeneralMedicineInTheDepartment() throws InterruptedException

	{
		driver.findElement(select_general_medicine_department).click();
		Thread.sleep(2000);
	}

	public void clickSurveyType() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(click_survey_type).click();
		Thread.sleep(1000);
	}

	public void selectRegularInTheSurveyType() throws InterruptedException

	{
		driver.findElement(click_regular_survey_type).click();
		Thread.sleep(2000);
	}

	//Edit

	public void clickEditButton() throws InterruptedException

	{
		driver.findElement(click_edit_button).click();
		Thread.sleep(5000);
	}

	public void editSurvey() throws InterruptedException, IOException

	{
		Thread.sleep(3000);
		//Clearing the Name Field
		driver.findElement(name).clear();
		Thread.sleep(4000);
		//Editing the existing survey
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> name_text=d.getdata("EditSurvey");
		driver.findElement(name).sendKeys(name_text.get(1));
		Thread.sleep(2000);
	}

	public void getEditedSearchByName() throws InterruptedException, IOException

	{

		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String>search_by_name_text=d.getdata("Editsurvey");
		driver.findElement(search_by_name).sendKeys(search_by_name_text.get(1));
		Thread.sleep(1000);
		driver.findElement((search_by_name)).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

	}

	//Delete		
	public void clickDeleteButton() throws InterruptedException, IOException

	{
		Thread.sleep(2000);
		driver.findElement(click_delete_button).click();
		Thread.sleep(2000);
	}

	public void clickYesDeleteItButton() throws InterruptedException

	{
		Thread.sleep(1000);
		driver.findElement(click_Yes_delete_it).click();
		Thread.sleep(2000);

	}

	public void clickOkButton() throws InterruptedException

	{
		Thread.sleep(1000);
		driver.findElement(click_ok).click();
	}

	//Setting
	public void clickSetting() throws InterruptedException

	{
		Thread.sleep(4000);
		driver.findElement(click_setting).click();
		Thread.sleep(2000);
	}
	
	//Click Question Bank
	public void clickQuestionBankInSettings() throws InterruptedException, IOException

	{
		
		Thread.sleep(2000);
		driver.findElement(click_question_bank).click();
		Thread.sleep(3000);

	}

	public void getSelectQuestion() throws InterruptedException, IOException

	{
		driver.findElement(select_question).click();
		Thread.sleep(2000);
		driver.findElement(select_select_question).click();
		Thread.sleep(3000);

	}

	public void tickOneTimeQuestionChkbox() throws InterruptedException

	{
		Thread.sleep(3000);
		driver.findElement(click_first_question_chkbox).click();
		Thread.sleep(2000);
	}

	public void clickSaveSurveySetting() throws InterruptedException

	{
		driver.findElement(click_save_survey_setting).click();
		Thread.sleep(2000);
	}

	public void clickBackInSurveySetting() throws InterruptedException

	{
		driver.findElement(click_Back).click();
		Thread.sleep(4000);
	}

	public void navigateToPreviousPage() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(4000);
	}

	//WareHouse
	public void clickWareHouseButton() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(ware_house).click();
		Thread.sleep(3000);
	}

	//Search
	public void getSearchByQuestion() throws InterruptedException, IOException

	{

		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String>search_by_question_text=d.getdata("warehouse");
		driver.findElement(search_by_question).sendKeys(search_by_question_text.get(1));
		Thread.sleep(1000);
		driver.findElement(search_by_question).sendKeys(Keys.ENTER);
		Thread.sleep(3000);


	}

	public void clickGetQuestion() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(click_get_question_button).click();
		Thread.sleep(4000);
	}

	//Search By Groups
	public void clickGroups() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(group).click();
		Thread.sleep(2000);
	}

	public void selectAsrtInGroups() throws InterruptedException

	{
		driver.findElement(select_asrt_in_group).click();
		Thread.sleep(3000);
	}

	//Search By Category
	public void clickCategory() throws InterruptedException

	{
		//click Group
		Thread.sleep(2000);
		driver.findElement(group).click();
		Thread.sleep(2000);
		//select cme in the group
		driver.findElement(select_cme_in_group).click();
		Thread.sleep(3000);
		//click category
		Thread.sleep(2000);
		driver.findElement(category_wh).click();
		Thread.sleep(2000);
	}

	public void selectCmeInCategory() throws InterruptedException

	{
		driver.findElement(select_cme_in_category).click();
		Thread.sleep(3000);
	}

	public void selectTest1InCategory() throws InterruptedException

	{
		driver.findElement(select_test2_in_category).click();
		Thread.sleep(3000);
	}

	//Search By Language
	public void clickLanguageWh() throws InterruptedException

	{
		//click Language
		Thread.sleep(2000);
		driver.findElement(language_wh).click();
		Thread.sleep(2000);
	}

	public void selectEnglishInLanguageWh() throws InterruptedException

	{
		driver.findElement(select_english_in_language).click();
		Thread.sleep(3000);
	}

	//Edit

	public void clickEditButtonWh() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(edit).click();
		Thread.sleep(4000);
	}

	public void editQuestionInWareHouse() throws InterruptedException, IOException, AWTException

	{
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> question_edit=d.getdata("EditQuestion");
		driver.findElement(question).sendKeys(question_edit.get(1));
		Thread.sleep(2000);
	}

	public void clickSaveWh() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(save_wh).click();
		Thread.sleep(1000);
	}

	public void clickDelete() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(delete).click();
		Thread.sleep(3000);
	}

	public void clickYesDeleteIt() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(yes_delete_it).click();
		Thread.sleep(3000);
	}

	public void clickOk() throws InterruptedException

	{
		driver.findElement(ok).click();
		Thread.sleep(3000);
	}

	public void clickGroupOrder() throws InterruptedException

	{
		driver.findElement(group_order).click();
		Thread.sleep(3000);
	}

	public void clickCategoryOrder() throws InterruptedException

	{
		driver.findElement(category_order).click();
		Thread.sleep(3000);
	}

	public void clickQuestionOrder() throws InterruptedException

	{
		driver.findElement(question_order).click();
		Thread.sleep(3000);
	}

	public void clickTypeOrder() throws InterruptedException

	{
		driver.findElement(type_order).click();
		Thread.sleep(3000);
	}

	public void clickLanguageOrder() throws InterruptedException

	{
		driver.findElement(language_order).click();
		Thread.sleep(3000);
	}

	public void clickResultTab() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(result_tab).click();
		Thread.sleep(3000);
	}

	public void clickLocationBtn() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(location_btn).click();
		Thread.sleep(3000);
	}

	public void selectKochiInLocation() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(select_kochi_in_location).click();
		Thread.sleep(3000);
	}

	public void clickDepartmentBtn() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(department_btn).click();
		Thread.sleep(3000);
	}

	public void selectGeneralMedicineInDepartment() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(select_general_medicine_in_department).click();
		Thread.sleep(3000);
	}

	public void clickMonthBtn() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(month_btn).click();
		Thread.sleep(3000);
	}

	public void selectDecemberInMonth() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(select_december_in_the_month).click();
		Thread.sleep(3000);
	}

	public void selectJulyInMonth() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(select_july_in_the_month).click();
		Thread.sleep(3000);
	}

	public void clickYearBtn() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(year_btn).click();
		Thread.sleep(3000);
	}

	public void select2022InYear() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(select_2022_in_the_year).click();
		Thread.sleep(3000);
	}

	public void clickSectionBtn() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(section_btn).click();
		Thread.sleep(3000);
	}

	public void selectAllInSection() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(select_all_in_section).click();
		Thread.sleep(3000);
	}


	public void runReportButton() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(run_report_btn).click();
		Thread.sleep(3000);
	}

	//Click By Order(ascending or descending)

	public void clickSurveyNameOrder() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(survey_name_order).click();
		Thread.sleep(3000);
	}

	public void clickVersionOrder() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(version_order).click();
		Thread.sleep(3000);
	}

	public void clickVersionCreateDateOrder() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(version_create_date_order).click();
		Thread.sleep(3000);
	}

	public void clickStatusOrder() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(status_order).click();
		Thread.sleep(3000);
	}

	//Send Survey
	public void clickSendSurveyButton() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(send_survey_btn).click();
		Thread.sleep(3000);
	}


	public void clickLocationButton() throws InterruptedException

	{
		Thread.sleep(4000);
		driver.findElement(location_btn).click();
		Thread.sleep(3000);
	}

	public void selectKochiInLocationInSendSurvey() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(send_survey_click_kochi_in_location).click();
		Thread.sleep(3000);
	}

	public void clickDepartmentButton() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(send_survey_department_btn).click();
		Thread.sleep(3000);
	}

	public void selectEmergencyInDepartment() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(click_emergency_in_department).click();
		Thread.sleep(3000);
	}
	
	public void selectCardiologyInDepartment() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(click_cardiology_in_department).click();
		Thread.sleep(3000);
	}


	public void clickSurveyDefinition() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(send_survey_survey_definition_btn).click();
		Thread.sleep(3000);

	}
	
	public void selectEnglishAdultInSurveyDefinition() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(click_english_adult_in_survey_definition).click();
		Thread.sleep(3000);
	}

	public void selectEnglishChildInSurveyDefinition() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(click_english_child_in_survey_definition).click();
		Thread.sleep(3000);
	}
	

	public void getEmail() throws InterruptedException, IOException 

	{
		Thread.sleep(3000);
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> email_text=d.getdata("SendSurvey");
		driver.findElement(send_survey_email_btn).sendKeys(email_text.get(1));
		Thread.sleep(3000);
	}
	
	public void getInvalidEmail() throws InterruptedException, IOException 

	{
		Thread.sleep(3000);
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> email_text=d.getdata("SendSurvey");
		driver.findElement(send_survey_email_btn).sendKeys(email_text.get(3));
		Thread.sleep(3000);
	}

	public void getPhoneNumber() throws InterruptedException, IOException 

	{
		Thread.sleep(3000);
		SurveyDataDrivenExcel d=new SurveyDataDrivenExcel();
		ArrayList<String> phone_number_text=d.getdata("SendSurvey");
		driver.findElement(send_survey_phone_number_btn).sendKeys("+91"+phone_number_text.get(2));
		Thread.sleep(3000);
	}
	
	public void clickSendButton() throws InterruptedException

	{
		Thread.sleep(2000);
		driver.findElement(send_btn).click();
		Thread.sleep(3000);

	}
}
