$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/search.feature");
formatter.feature({
  "line": 1,
  "name": "search functionality",
  "description": "",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify search feature is available",
  "description": "",
  "id": "search-functionality;verify-search-feature-is-available",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User successfully logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click community hospital and search button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Verify user redirect into the search page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDef.user_successfully_logged_in()"
});
formatter.result({
  "duration": 14875864900,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDef.User_click_community_hospital_and_search_button()"
});
formatter.result({
  "duration": 10889637600,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDef.Verify_user_redirect_into_the_search_page()"
});
formatter.result({
  "duration": 1195062500,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify whether Search functionality is working correctly",
  "description": "",
  "id": "search-functionality;verify-whether-search-functionality-is-working-correctly",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Navigate to application Search page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Select Location, Department, From and To and click Search button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Records should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDef.Verify_user_in_the_search_page()"
});
formatter.result({
  "duration": 18234100,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDef.User_selects_the_Location_Department_From_To_and_click_search()"
});
formatter.result({
  "duration": 22305938700,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDef.verify_proposed_searching_data_should_be_displayed()"
});
formatter.result({
  "duration": 1305783800,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify whether Search is possible with \u0027Age\u0027 filter",
  "description": "",
  "id": "search-functionality;verify-whether-search-is-possible-with-\u0027age\u0027-filter",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "Verify the user in the search page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Select Location, Department, From and To, Age and click Search button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Records should be displayed based on the search filters",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDef.verify_the_user_in_the_search_page()"
});
formatter.result({
  "duration": 2368144300,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDef.Select_Location_Department_From_and_To_Age_and_click_Search_button()"
});
formatter.result({
  "duration": 28611577000,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDef.verify_Proposed_age_group_data_should_be_displayed()"
});
formatter.result({
  "duration": 1320213200,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verify that user is able to search with gender filter",
  "description": "",
  "id": "search-functionality;verify-that-user-is-able-to-search-with-gender-filter",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "Verify whether user in the search page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Select Location, Department, From and To, Gender and click Search button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Records should be displayed based on search filters",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDef.check_the_user_in_the_search_page()"
});
formatter.result({
  "duration": 2137035500,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDef.user_Selects_the_Location_Department_From_To_gender_filter_and_click_search()"
});
formatter.result({
  "duration": 25586314500,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDef.verify_Proposed_gender_data_should_be_displayed()"
});
formatter.result({
  "duration": 1750601200,
  "status": "passed"
});
});