@US_002_Test
Feature: US_002_TC_001

  @US002_TC001_UI
  Scenario: TC001_medunna_registration_positive01
    Given user is on the medunna page
    And user clicks on user icon button
    And user clicks on register option
    And user enters ssn in ssn input
    And user enters first name in first name input
    And user enters last name in last name input
    And user enters username in the username input
    And user enters email in email input
    And user enters new password in the new password input
    And user enters new password configuration in the new password configuration
    And user clicks register button
    And verify the registration is done successfully
    And close the application

  @US002_TC002_UI
  Scenario: TC002_medunna_registration_negative01
    Given user is on the medunna page
    And user clicks on user icon button
    And user clicks on register option
    And user enters username which have a blank between the word in username input
    And verify username is invalid
    And close the application

  @US002_TC003_UI
  Scenario: TC003_medunna_registration_negative02
    Given user is on the medunna page
    And user clicks on user icon button
    And user clicks on register option
    And user enters email without dot in password input
    And verify email is invalid
    And close the application

  @US002_TC004_UI
  Scenario: TC004_medunna_registration_negative03
    Given user is on the medunna page
    And user clicks on user icon button
    And user clicks on register option
    And user enters ssn in ssn input
    And user enters first name in first name input
    And user enters last name in last name input
    And user enters username in the username input
    And user enters new password in the new password input
    And user enters new password configuration in the new password configuration
    And user clicks register button
    And verify email is invalid
    And close the application

  @US002_TC001_API
  Scenario: TC001_medunna_registration_email_username_API
    Given user sends GET request to the "https://medunna.com/api/users/adminteam05"
    Then Http Status code is 200
    Then verify email and username api

  @US002_TC001_DB
  Scenario: TC001_medunna_registration_email_DataBase
    Given user connects to the database
    And user gets the column "*" from table "jhi_user"
    Then verify table "jhi_user" and column "email" contains data "mary@hotmail.com"
    And close the connection
