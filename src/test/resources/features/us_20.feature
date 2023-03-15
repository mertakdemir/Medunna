@US_020
Feature: US_020 Create new staff




  @US_020_TC_001_UI
  Scenario:Admin can search new Staff among registered people using their SSN
    Given Admin goes to the "medunna_url"
    And Admin clicks on the user icon
    And Admin clicks on Sign In option
    And Admin enters username "medunna_username_1"
    And Admin enters password "medunna_password_1"
    And Admin clicks  on sign in button
    And Admin clicks on Items&Titles
    And Admin clicks on Staff link
    And Admin click Create a new Staff link
    And Admin clicks on Use Search checkbox for staff
    And Admin enters the user "581-01-0306" SSN for searching the existing staff
    And Admin clicks on Search User button for staff
    Then Verify that admin can search for personnel with SNN
    Then close the application


  @US_020_TC_002_UI
  Scenario:All their information should be populated
    Given Admin goes to the "medunna_url"
    And Admin clicks on the user icon
    And Admin clicks on Sign In option
    And Admin enters username "medunna_username_1"
    And Admin enters password "medunna_password_1"
    And Admin clicks  on sign in button
    And Admin clicks on Items&Titles
    And Admin clicks on Staff link
    And Admin click Create a new Staff link
    And Admin clicks on Use Search checkbox for staff
    And Admin enters the user "581-01-0306" SSN for searching the existing staff
    And Admin clicks on Search User button for staff
    And Admin fills all the blanks
 #   Then Verify that all information has been filled
    Then close the application

  @US_020_TC_003_UI
  Scenario: User (Admin) can select a user from the existing users (registered people)
    Given Admin goes to the "medunna_url"
    And Admin clicks on the user icon
    And Admin clicks on Sign In option
    And Admin enters username "medunna_username_1"
    And Admin enters password "medunna_password_1"
    And Admin clicks  on sign in button
    And Admin clicks on Items&Titles
    And Admin clicks on Staff link
    And Admin select user from the existing users on the staff table
    Then close the application

  @US_020_TC_004_UI
  Scenario:User create staff and admin can edit their info
    Given User goes to the "medunna_url" page
    When User clicks on user icon
    And User clicks on Register option
    And User enters valid ssn in ssn input
    And User enters valid first name in first name input
    And User enters valid last name in last name input
    And User enters valid username in username input
    And User enters valid email in email input
    And User enters new password in new password input
    And User enters password again in new password confirmation
    And User clicks register button
    Then verify new user registered  user successfully
    And User clicks user icon and Sign in option to login as admin
    And Admin enters username "medunna_username_1"
    And Admin enters password "medunna_password_1"
    And Admin clicks  on sign in button
    When Admin clicks on Administration option
    And Admin clicks on User management option
#    Then verify users heading is visible on the page
#    And Admin clicks on Created date column to sort users
#    And Admin clicks on last registered page button of created user
    And Admin clicks on Edit button of created user
    When Admin clicks on activate check box
    And  Admin select profiels for staff role option
    And Admin clicks on save button for activate user
    Then verify user has been activated staff
    And Admin clicks on Items&Titles
    And Admin clicks on Staff link
    And Admin click on Created date option on the staff table
    And Admin clicks on Edit button for editing the staff
    Then Verify that Admin is able to edit a staff
    Then close the application




  @US_020_TC_005_UI
  Scenario:User can delete their info
    Given User goes to the "medunna_url" page
    When User clicks on user icon
    And User clicks on Register option
    And User enters valid ssn in ssn input
    And User enters valid first name in first name input
    And User enters valid last name in last name input
    And User enters valid username in username input
    And User enters valid email in email input
    And User enters new password in new password input
    And User enters password again in new password confirmation
    And User clicks register button
    Then verify new user registered  user successfully
    And User clicks user icon and Sign in option to login as admin
    And Admin enters username "medunna_username_1"
    And Admin enters password "medunna_password_1"
    And Admin clicks  on sign in button
    When Admin clicks on Administration option
    And Admin clicks on User management option
    And Admin clicks on Edit button of created user
    When Admin clicks on activate check box
    And  Admin select profiels for staff role option
    And Admin clicks on save button for activate user
    Then verify user has been activated staff
    And Admin clicks on Items&Titles
    And Admin clicks on Staff link
    And Admin click on Created date option on the staff table
    And Admin clicks on Delete button for editing the staff
    Then Verify that Admin is able to delete a staff
    Then close the application


  @US_020_TC_001_API
  Scenario: Get Request and Delete Request for staff
    Given user sends the GET request for created sataff data to the url
    Then verify HTTP status code is 200 of staff get request
    And sends DELETE request for created sataff data to the url
    Then verify HTTP status code is 200 of staff delete request


  @US_020_TC_001_DB
  Scenario:Validate all staff with DB
    Given user connects to the database
    And Admin gets the column "last_modified_by" from "staff" staff table
    Then verify staff created_by list contains "adminteam01"
    And close the connection

  @US_020_TC_002_DB
  Scenario:Validate all staff with DB
    Given user connects to the database
    And Admin gets the column id "id" from "staff" staff table
    Then verify staff created_by list contains existing user id 22115
    And close the connection