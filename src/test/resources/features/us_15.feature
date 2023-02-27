Feature: US-015 Doctor should be able to edit patient info  - View / Edit Impatients by Physician (Doctor)
  Background: Sign in Medunna

    Given user is on the home page :  "https://medunna.com"
    When user clicks on user icon
    Then user clicks on Sign In Button
    And user enters valid username "doctorJames" in username input
    And user enters valid password "James1234." in password input
    And user clicks on Remember Me checkbox
    And user clicks on Sign In submit Button
    And user clicks on My Pages


  @US_015_TC_001_UI
  Scenario: TC-001 Doctor can view all patient info on inpatients section
    When user clicks on My Inpatients
    When user clicks on patient edit button
    Then user verifies patient id is displayed
    Then user verifies patient start date is displayed
    Then user verifies patient end date is displayed
    Then user verifies patient description is displayed
    Then user verifies patient created date is displayed
    Then user verifies patient appointment id is displayed
    Then user verifies patient status is displayed
    Then user verifies patient room is displayed
    Then user verifies patient patient section is displayed

  @US_015_TC_002_UI
  Scenario: TC-002 Update patient status
    When doctor clicks on My Inpatients
    And doctor clicks on patient edit button
    And doctor clicks a patient's status needs to be updated
    And doctor updates the patient's status to UNAPPROVED
    Then user verifies the patient's status is updated to UNAPPROVED

  @US_015_TC_003_UI
  Scenario: TC-002 Update patient room
    When physician clicks on My Inpatients
    And physician clicks on patient edit button
    And physician clicks a patient's room needs to be updated
    And physician updates the patient's room to TWIN FULL
    Then physician verifies the patient's room is updated to TWIN FULL