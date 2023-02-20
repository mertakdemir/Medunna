@U@US_002_Test
  Feature: US_002_TC_001

    @US002_TC001
    Scenario: TC001_medunna_registration_positive01
      Given user is on the medunna page
      And user clicks on user icon
      And user clicks on register option
      And user enter ssn in ssn input
      And user enter first name in first name input
      And user enter last name in last name input
      And user enter username in the username input
      And user enter email in email input
      And user enter new password in the new password input
      And user enter new password configuration in the new password configuration
      And user clicks register button
      And verify the registration is done successfully
      And close the application

    @US002_TC002
    Scenario: TC001_medunna_registration_negative01
      Given user is on the medunna page
      When user registers to the medunna page
      And user clicks on user icon
      And user clicks on register option
      And user enter ssn in ssn input
      And user enter first name in first name input
      And user enter last name in last name input
      And user enter username which have blank in the username input
      And user enter email in email input
      And user enter new password in the new password input
      And user enter new password configuration in the new password configuration
      And user clicks register button
      And verify the registration can not done successfully
      And close the application

    @US002_TC003
    Scenario: TC001_medunna_registration_negative02
      Given user is on the medunna page
      When user registers to the medunna page
      And user clicks on user icon
      And user clicks on register option
      And user enter ssn in ssn input
      And user enter first name in first name input
      And user enter last name in last name input
      And user enter username in the username input
      And user enter email which have not dot in email input
      And user enter new password in the new password input
      And user enter new password configuration in the new password configuration
      And user clicks register button
      And verify the registration can not done successfully
      And close the application