 @US_001_Test
  Feature: US_001_TC_001

  @US001_TC001_UI
  Scenario: Registration should be available with required fileds  SSN and Firstname and Lastname
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

  @US001_TC002_UI
  Scenario: TC002_medunna_registration_ssn_negative01
    Given user is on the medunna page
    And user clicks on user icon button
    And user clicks on register option
    And user enters ssn which have no hyphen symbol in ssn input
    And verify ssn is invalid
    And close the application

    @US001_TC003_UI
    Scenario: TC003_medunna_registration_ssn_negative02
    Given user is on the medunna page
    And user clicks on user icon button
    And user clicks on register option
    And user enters ssn which have eight digits in ssn input
    And verify ssn is invalid
    And close the application


  @US001_TC004_UI
  Scenario: TC004_medunna_registration_ssn_negative03
    Given user is on the medunna page
    And user clicks on user icon button
    And user clicks on register option
    And user enters first name in first name input
    And user enters last name in last name input
    And user enters username in the username input
    And user enters email in email input
    And user enters new password in the new password input
    And user enters new password configuration in the new password configuration
    And user clicks register button
    And verify ssn is invalid
    And close the application

    @US001_TC001_API
    Scenario: TC001_medunna_registration_post_API
      Given user sends post request to the "https://medunna.com/api/account/"
      Then Http status code is 200
      Then verify all data

    @US001_TC001_DB
    Scenario: TC001_medunna_registration_snn_DataBase
      Given user connects to the database
      And user gets the column "*" from table "jhi_user"
      Then verify table "jhi_user" and column "ssn" contains data "567-34-4444"
      And close the connection