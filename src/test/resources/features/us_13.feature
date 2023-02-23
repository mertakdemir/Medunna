Feature: US-013 My Appointments / Edit / Request a test only by Physician (Doctor)
  Background: Sign in Medunna

    Given user is on the home page :  "https://medunna.com"
    When user clicks on user icon
    Then user clicks on Sign In Button
    And user enters valid username "doctorJames" in username input
    And user enters valid password "James1234." in password input
    And user clicks on Remember Me checkbox
    And user clicks on Sign In submit Button
    And user clicks on My Pages
    And user clicks on My Appointments

@US_013_TC_001_UI
  Scenario: TC-001 User (Physician) may request a test
  And user clicks on Edit button
  Then user clicks on Request a test button
  Then user verifies Glucose checkmark option is clickable
  Then user verifies Urea checkmark option is clickable
  Then user verifies Creatinine checkmark option is clickable
  Then user verifies Sodium checkmark option is clickable
  Then user verifies Potassium checkmark option is clickable
  Then user verifies Total protein checkmark option is clickable
  Then user verifies Albumin checkmark option is clickable
  Then user verifies Hemoglobin checkmark option is clickable
