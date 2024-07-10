$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/EditUser.feature");
formatter.feature({
  "line": 1,
  "name": "Edit User",
  "description": "",
  "id": "edit-user",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify whether editing is possible for exising records",
  "description": "",
  "id": "edit-user;verify-whether-editing-is-possible-for-exising-records",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Navigate to User\u0027s List Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Select the specify user and Edit the required fields and click the Save button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Should save the user with the edited details",
  "keyword": "Then "
});
formatter.match({
  "location": "EditUserStepDef.navigate_to_user_s_list_page()"
});
formatter.result({
  "duration": 24651918600,
  "status": "passed"
});
formatter.match({
  "location": "EditUserStepDef.select_the_specify_user_and_edit_the_required_fields_and_click_the_save_button()"
});
formatter.result({
  "duration": 16622287000,
  "status": "passed"
});
formatter.match({
  "location": "EditUserStepDef.should_save_the_user_with_the_edited_details()"
});
formatter.result({
  "duration": 3355853500,
  "status": "passed"
});
});