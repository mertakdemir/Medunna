@US_011_Testing
Feature:US_011
  Background: Sign in Medunna
    Given user is on the home page :  "https://medunna.com"
    When user clicks on user icon
    Then user clicks on Sign In Button
    And user(doctor) enters valid username "minikserce" in username input
    And user(doctor) enters valid password "User.123" in password input
    And user clicks on Remember Me checkbox
    And user clicks on Sign In submit Button
    And user clicks on My Pages
    And user clicks on My Appointments



  @US_005_TC_001
  Scenario: Doctor views their appointments
    Then Verify user (doctor) can see the appointment list in "My Appointments"

  @US_005_TC_002
  Scenario: Doctor views their appointments
    Then Verify user (doctor) can see time slots in "My Appointments"


