@US_011_Testing
Feature:US_025

  @US_025_TC_001
  Scenario: My Appointments by Patient
    Given user is on the home page :  "https://medunna.com"
    When user clicks on user icon
    Then user clicks on Sign In Button
    And user(patient) enters valid username "candy" in username input
    And user(patient) enters valid password "User.123" in password input
    And user clicks on Remember Me checkbox
    And user clicks on Sign In submit Button
    And user clicks on My Pages(Patient)
    And user clicks on My Appointments
    Then verify see appointment text "Appointments" in My Appointment Page
    And verify see Show Tests Button
    When user(patient) clicks Show Test Button
    Then verify Tests page text "Tests" is displayed
    Given open new window
    When user clicks on user icon
    And user clicks on Sign In Button
    And user(physician) enters valid username "maria" in username input
    And user(physisian) enters valid password "User.123" in password input
    And user clicks on Remember Me checkbox
    And user clicks on Sign In submit Button
    And user clicks on My Pages(Physician)
    And user clicks on My Appointments
    And verify Tests page is displayed table items
    When user(patient) clicks View Result Button
    Then verify Test Results page is displayed
    And close the application

  @US_025_TC_002
  Scenario: Patient can view invoice (payment information)
    Given user is on the home page :  "https://medunna.com"
    When user clicks on user icon
    Then user clicks on Sign In Button
    And user(patient) enters valid username "candy" in username input
    And user(patient) enters valid password "User.123" in password input
    And user clicks on Remember Me checkbox
    And user clicks on Sign In submit Button
    And user clicks on My Pages(Patient)
    And user clicks on My Appointments
    Then verify see appointment text "Appointments" in My Appointment Page
    When user(patient) clicks Show Invoice Button
    Then verify the Invoice Page "INVOICE"
    And close the application
