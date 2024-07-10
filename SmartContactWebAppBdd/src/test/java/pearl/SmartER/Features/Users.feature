Feature: Users

  @Test1
  Scenario: Verify user can be created without credentials
    Given Invoking the browser
    When Navigate to Home page
    Then Verify user can be created without credentials

  @Test2
  Scenario: Verify whether a new user can be created after providing all data
    Given Invoking browser
    When Navigate to the Home page
    Then Verify user can be created after providing all data

  @Test3
  Scenario: Verify if a duplicate user can be created
    Given Invoking webbrowser
    When Navigate to homepage
    Then Verify if a duplicate user can be created

  @Test4
  Scenario: Verify whether new user can be created without giving the username
    Given Opening the browser
    When Navigating to home page
    Then Verify whether new user can be created without giving the username

  @Test5
  Scenario: Verify whether new user can be created without giving the name
    Given Opening the web browser
    When Navigating to homepage
    Then Verify whether new user can be created without giving the name

  @Test6
  Scenario: Verify whether new user can be created without giving the title
    Given Opening the webbrowser
    When Navigating to the homepage
    Then Verify whether new user can be created without giving the title

  @Test7
  Scenario: Verify whether new user can be created without giving the email
    Given Open the webbrowser
    When Navigating to the home page
    Then Verify whether new user can be created without giving the email

  @Test8
  Scenario: Verify whether new user can be created without giving the phone number
    Given Load the browser
    When Go to home page
    Then Verify whether new user can be created without giving the phone number

  @Test9
  Scenario: Verify whether new user can be created without giving the role
    Given Load browser
    When Go to homepage
    Then Verify whether new user can be created without giving the role

  @Test10
  Scenario: Verify whether new user can be created without giving the level
    Given Load the web browser
    When Go to the home page
    Then Verify whether new user can be created without giving the level

  @Test11
  Scenario: Verify Users button is enabled
    Given Load web browser
    When Load the home page
    Then Verify whether Users button is enabled

  @Test12
  Scenario: Verify whether an existing user data can be edited
    Given Load the webbrowser
    When Navigate to home page
    Then Verify whether an existing user data can be edited

  @Test13
  Scenario: Verify whether an edited entry is saved successfully
    Given Loads the browser
    When Navigate to the home page
    Then Verify whether an edited entry is saved successfully

  @Test14
  Scenario: Verify whether a confirmation window comes upon clicking the delete button
    Given Loads the web browser
    When Navigate to the homepage
    Then Verify whether a confirmation window comes upon clicking the delete button

  @Test15
  Scenario: Verify whether an entry can be deleted
    Given Loads the webbrowser
    When Navigates to homepage
    Then Verify whether an entry can be deleted

  @Test16
  Scenario: Verify if a deleted entry is still available
    Given Loads webbrowser
    When Navigates to the homepage
    Then Verify if a deleted entry is still available

  @Test17
  Scenario: Verify whether the uploaded image can be previewed
    Given Open web browser
    When Navigates to the home page
    Then Verify whether the uploaded image can be previewed

  @Test18
  Scenario: Verify whether the email format is valid
    Given Opens web browser
    When Navigates to users list page
    Then Verify whether the email format is valid

  @Test19
  Scenario: Verify whether uploaded image format is invalid
    Given User loads the web browser
    When Navigates to the users list screen
    Then Verify whether uploaded image format is invalid

  @Test20
  Scenario: Verify whether level is deselected when role is removed
    Given User loads web browser
    When Navigates to users list page
    Then Verify whether level is deselected when role is removed

  @Test21
  Scenario: Verify whether the Location dropdown is active and a location can be selected
    Given User loads the browser
    When Navigates to edit user page
    Then Verify whether the Location dropdown is active and a location can be selected

  @Test22
  Scenario: Verify whether the department dropdown is active and a department can be selected
    Given Invoke the web browser
    When Navigates to the edit user page
    Then Verify whether the department dropdown is active and a department can be selected

  @Test23
  Scenario: Verify whether the Status dropdown is active and a status can be selected
    Given Invoke the webbrowser
    When User navigates to the edit user page
    Then Verify whether the Status dropdown is active and a status can be selected

  @Test24
  Scenario: Verify whether create user button is enabled
    Given Invoke web browser
    When User navigates to the users page
    Then Verify whether create user button is enabled

  @Test25
  Scenario: Verify whether status dropdown is working and a status can be selected
    Given User invokes webbrowser
    When The user navigates to the user list page
    Then Verify whether status dropdown is working and a status can be selected

  @Test26
  Scenario: Verify whether location dropdown is working and a location can be selected
    Given User invokes web browser
    When The user navigates to users list page
    Then Verify whether location dropdown is working and a location can be selected

  @Test27
  Scenario: Verify whether department dropdown is working and a department can be selected
    Given The user invokes web browser
    When The user navigates to the users list page
    Then Verify whether department dropdown is working and a department can be selected

  @Test28
  Scenario: Verify whether role dropdown is working and a role can be selected
    Given The user invokes webbrowser
    When The user navigates to the users list screen
    Then Verify whether role dropdown is working and a role can be selected

  @Test29
  Scenario: Verify whether level dropdown is working and a level can be selected
    Given Web browser is loaded
    When The users logs in to the users list page
    Then Verify whether level dropdown is working and a level can be selected

  @Test30
  Scenario: Verify whether language dropdown is working and a language can be selected
    Given Web browser is loaded by the user
    When The user logs into the users list page
    Then Verify whether language dropdown is working and a language can be selected
