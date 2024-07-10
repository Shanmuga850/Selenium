Feature: Login into Application

Scenario: Verify whether login is possible with invalid username and invalid password
Given Go to the specified url of the application
When Enter invalid Username and invalid Password and click 'Login'
Then Validation message should be displayed for Invalid Credentials

Scenario: Verify whether login is possible with blank Username and Password
Given Verify whether User in specified url of the application
When Leave the fields, Username and Password blank and click Login
Then Validation message should be displayed that mandatory fields cannot be left blank

Scenario: Verify whether login is possible  with Invalid Password
Given Verify whether User in the specified url of the application
When Enter valid Username and invalid Password and click 'Login'
Then Validation message should be displayed for Invalid Password

Scenario: Verify whether login is possible with invalid Username
Given Verify User in the Specified URL
When Enter invalid Username and valid Password and click login
Then Validation message should be displayed for Invalid Username

Scenario: Verify whether login is possible with valid username and valid password
Given Verify whether user in the given URL
When Enter valid Username and Password and click 'Login'
Then Application Home Page should be displayed on successful login








