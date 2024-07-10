Feature: search functionality

Scenario: Verify search feature is available
Given User successfully logged in
When User click community hospital and search button
Then Verify user redirect into the search page

Scenario: Verify whether Search functionality is working correctly
Given Navigate to application Search page
When Select Location, Department, From and To and click Search button
Then Records should be displayed

Scenario: Verify whether Search is possible with 'Age' filter
Given Verify the user in the search page
When Select Location, Department, From and To, Age and click Search button
Then Records should be displayed based on the search filters

Scenario: Verify that user is able to search with gender filter
Given Verify whether user in the search page
When Select Location, Department, From and To, Gender and click Search button
Then Records should be displayed based on search filters