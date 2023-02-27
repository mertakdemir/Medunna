@US_005_TC_001_UI_Testing

Feature:US_005_TC_001

  Background:
    Given User goes to the "medunna_url"

  @US_005_TC_001
  Scenario: Login page should be accessible only with valid credentials
    Given User clicks on the user icon
    When User valid Username and Password "medunna_username_1" and "medunna_password_1"
    And User clicks on the Signin Button
    Then Verify user should see a success message
    And close the application


  @US_005_TC_002
  Scenario: Login page should be accessible only with valid credentials and clicks remember me checkbox
    Given User clicks on the user icon
    When User valid Username and Password "medunna_username_1" and "medunna_password_1"
    And User checks on the Remember me box
    And User clicks on the Signin Button
    Then Verify user should see a success message
    And close the application



  @US_005_TC_003
  Scenario:Automatically to log in to the system again.
    Given User clicks on the user icon
    When User valid Username and Password "medunna_username_1" and "medunna_password_1"
    And User checks on the Remember me box
    And User clicks on the Signin Button
    Then Verify user clicks Signin Button
    When User clicks the usericon
    And User clicks Signout Button
    And User clicks on the signin again Button
    Then Username and password should come automatically in order to log in to the system again later.
    And close the application


  @US_005_TC_004
  Scenario:There should be an option to navigate to registration page if not registered yet
    When User clicks on the user icon
    And User invalid Username and Password
    And User checks on the Remember me box
    And User clicks on the Signin Button
    Then Verify the user is not registered
    When User clicks the registration link
    Then Verify should be redirected to the registration page
   # And close the application


  @US_005_TC_005
  Scenario: There should be an option to cancel login
    When User clicks on the user icon
    And  User clicks the cancel button
    Then Verify the User come to the home page
    And close the application














