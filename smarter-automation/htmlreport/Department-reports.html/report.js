$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Department.feature");
formatter.feature({
  "line": 1,
  "name": "Creating,editing and deleting the Department",
  "description": "",
  "id": "creating,editing-and-deleting-the-department",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify whether a new department can be created",
  "description": "",
  "id": "creating,editing-and-deleting-the-department;verify-whether-a-new-department-can-be-created",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Navigate to Departments Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click the button \u0027Create Department\u0027 and Enter valid user data and click the Finish button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "New Department should be saved and displayed on the main page of Department\u0027s List",
  "keyword": "Then "
});
formatter.match({
  "location": "DepartmentStepDef.navigate_to_departments_page()"
});
formatter.result({
  "duration": 38540556100,
  "status": "passed"
});
formatter.match({
  "location": "DepartmentStepDef.click_the_button_create_department_and_enter_valid_user_data_and_click_the_Finish_button()"
});
formatter.result({
  "duration": 8111575000,
  "status": "passed"
});
formatter.match({
  "location": "DepartmentStepDef.new_department_should_be_saved_and_displayed_on_the_main_page_of_departments_list()"
});
formatter.result({
  "duration": 20861291500,
  "status": "passed"
});
});