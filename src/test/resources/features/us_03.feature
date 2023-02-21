@US_003_TC_001_UI_Testing
Feature: US_003_TC_001

  Background: Register Medunna
    Given user goes to the "medunna_url"
    When user click on Register icon
    And user enter "SSN"
    And user enter "First Name"
    And user enter "Last Name"
    And user enter "Username"
    And user enter "Email"
    And user enter "New password"
    And user enter "New password confirmation"
    And user click on Register submit button
    Then verify the Password strength:
