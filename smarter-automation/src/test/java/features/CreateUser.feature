Feature: Create a New User

Scenario: User is able to navigate a Users List Page
Given User is successfully logged in 
When User click User and Click list in the user 
Then User's List Page should be displayed

 Scenario: Verify whether a new user can be created 
 Given Navigate to Users -> List Page
 When Click the button 'Create User' and Enter valid user data and click the Save button
 Then New user should be saved and displayed on the main page of User List
 
 Scenario: Verify whether duplicate Usernames are permitted
 Given Verify whether user in the Users -> List Page
 When click the button 'Create User' and Enter a duplicate Username and click the Save button
 Then Should not permit saving and validation message should be displayed for the duplicate User Name
 
 Scenario: Verify whether mandatory fields can be left blank
 Given Verify whether user in the Users -> List -> Create New User Page
 When Leave the mandatory fields blank and click Save button
 Then Should not permit saving and validation messages should be  displayed for all the mandatory fields