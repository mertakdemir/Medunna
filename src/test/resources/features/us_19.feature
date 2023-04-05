@US_019_End_to_end
Feature: US_019

  @US_019_TC_001_UI
  Scenario: Admin checks every information about physician
    Given Admin goes to the "medunna_url"
    And Admin clicks on the user icon
    And Admin clicks on Sign In option
    And Admin enters username "medunna_username_1"
    And Admin enters password "medunna_password_1"
    And Admin clicks  on sign in button
    And Admin clicks on Items&Titles
    And Admin clicks on Physician link
    And Admin creates a new Physician
    And Admin clicks on Edit button for editing the physician
    And Admin clicks on user search checkbox
    And Admin enters the registered SSN for searching the physician
    Then Verify that first name and last name of physician is displayed
    And Admin provides a specialty for physician
    And Admin provides a profile picture for physician
    And Admin provides an exam fee of the physician
    And Admin is able to see all the physicians on the list
    Then Verify that Admin is able to delete a physician
    And close the application
    
    @US_019_TC_001_Api
    Scenario: Admin sends Get Request and verify the Physician is exist
      Given Admin adds necessary path params to the base url
      And Admin sends the Get request and get the response
      Then Admin verifies that the status code is 200

      @US_019_TC_001_DB
      Scenario: Validate all physicians from Database
        Given Admin connects to the database
        And Admin gets the column "*" from table "physician"
        And Admin verifies the all physicians


