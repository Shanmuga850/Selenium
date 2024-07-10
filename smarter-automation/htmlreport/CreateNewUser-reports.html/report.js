$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/CreateUser.feature");
formatter.feature({
  "line": 1,
  "name": "Create a New User",
  "description": "",
  "id": "create-a-new-user",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User is able to navigate a Users List Page",
  "description": "",
  "id": "create-a-new-user;user-is-able-to-navigate-a-users-list-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is successfully logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click User and Click list in the user",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User\u0027s List Page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateNewUserStepDef.user_is_successfully_logged_in()"
});
formatter.result({
  "duration": 18252754700,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewUserStepDef.user_click_user_and_click_list_in_the_user()"
});
formatter.result({
  "duration": 6979754300,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewUserStepDef.users_list_page_should_be_displayed()"
});
formatter.result({
  "duration": 5045339900,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify whether a new user can be created",
  "description": "",
  "id": "create-a-new-user;verify-whether-a-new-user-can-be-created",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Navigate to Users -\u003e List Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Click the button \u0027Create User\u0027 and Enter valid user data and click the Save button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "New user should be saved and displayed on the main page of User List",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateNewUserStepDef.verify_that_user_in_the_users_list_page()"
});
formatter.result({
  "duration": 5034517700,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewUserStepDef.user_click_create_user_and_enter_valid_data_and_click_save()"
});
formatter.result({
  "duration": 13418483200,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewUserStepDef.Verify_that_newly_created_user_displayed_in_the_Users_List()"
});
formatter.result({
  "duration": 5343250300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify whether duplicate Usernames are permitted",
  "description": "",
  "id": "create-a-new-user;verify-whether-duplicate-usernames-are-permitted",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "Verify whether user in the Users -\u003e List Page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "click the button \u0027Create User\u0027 and Enter a duplicate Username and click the Save button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Should not permit saving and validation message should be displayed for the duplicate User Name",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateNewUserStepDef.verify_that_user_in_the_create_new_user_page()"
});
formatter.result({
  "duration": 12019857000,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewUserStepDef.user_enter_existing_user_details_and_click_save()"
});
formatter.result({
  "duration": 10890191800,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewUserStepDef.username_already_exist_validation_message_should_gets_displayed()"
});
formatter.result({
  "duration": 322537000,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verify whether mandatory fields can be left blank",
  "description": "",
  "id": "create-a-new-user;verify-whether-mandatory-fields-can-be-left-blank",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "Verify whether user in the Users -\u003e List -\u003e Create New User Page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Leave the mandatory fields blank and click Save button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Should not permit saving and validation messages should be  displayed for all the mandatory fields",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateNewUserStepDef.verify_that_user_in_the_create_a_newuser_page()"
});
formatter.result({
  "duration": 6169505100,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewUserStepDef.user_click_save()"
});
formatter.result({
  "duration": 15154842800,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewUserStepDef.validation_messages_of_the_mandatory_fields_should_gets_displayed()"
});
formatter.result({
  "duration": 346544600,
  "status": "passed"
});
});