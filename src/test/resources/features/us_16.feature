Feature: US_16 Medunna Patient Creation By Admin

  Background: Sign in Medunna
    Given user is on the home page :  "https://medunna.com"
    When user clicks on user icon
    Then user clicks on Sign In Button
    And user enters valid username "AdminTeam01" in username input
    And user enters valid password "Team01+" in password input
    And user clicks on Remember Me checkbox
    And user clicks on Sign In submit Button
    And user clicks on Items&Titles option
    And user clicks patient on Items&Titles

    @US_16_TC_001
    Scenario: Admin can create a new patient
      And Admin clicks on Create new Patient button
      And  Admin enters First Name
      And Admin enters Last Name
      And Admin enters birthdate
      And Admin enters email
      And Admin enters phone number
      And Admin chooses a gender
      And Admin chooses a blood group
      And Admin enters an address
      And Admin enters a description
      And Admin chooses a country
      And Admin chooses a state or city
      And Admin clicks save button
      Then Admin verifies that the patient is created

  @US_16_TC_002_Negative
  Scenario: Admin should not save the patient info with empty US State
    And user clicks on Create new Patient button
    And user  enters First Name
    And user enters Last Name
    And user enters birthdate
    And user enters email
    And user enters phone number
    And user chooses a gender
    And user chooses a blood group
    And user enters an address
    And user enters a description
    And user chooses a country
    And user leaves the state section empty
    And user clicks save button
    Then user  verifies that the patient could not be created

      @US_016_TC_003
      Scenario: Admin can view all patient information
    And Admin clicks on a patient view button
    Then Admin verifies that patient id above is displayed
    And  Admin verifies that patient SSN is displayed
    And  Admin verifies that patient First Name is displayed
    And  Admin verifies that patient Last Name is displayed
    And  Admin verifies that patient Birth Date is displayed
    And  Admin verifies that patient phone is displayed
    And  Admin verifies that patient Gender is displayed
    And  Admin verifies that patient Blood Group is displayed
    And  Admin verifies that patient Address is displayed
    And  Admin verifies that patient Description is displayed
    And  Admin verifies that patient Created Date is displayed
    And  Admin verifies that patient Country is displayed
    And  Admin verifies that patient State is displayed

  @US_016_TC_004
        Scenario: Admin can assign patient their doctor
      When Admin clicks on Items-Titles
      And  Admin clicks on Appointment
      And  Admin clicks an ID of A patient
      And  Admin clicks edit button for patient
      And  Admin choose a doctor on physician
      And  Admin choose a patient on patient
      And  Admin clicks save button of appointment
      Then  Admin verify that the doctor assigned the patient