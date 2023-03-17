@US_018_UI
Feature: US_18_Test item creation
  Scenario: TC001_UI
    Given user is on the home page :  "https://medunna.com"
    When user clicks on user icon
    Then user clicks on Sign In Button
    And user enters valid username "AdminTeam01" in username input
    And user enters valid password "Team01+" in password input
    And user clicks on Remember Me checkbox
    And user clicks on Sign In submit Button
    And user clicks on Items&Titles
    And user clicks on test item option
    And user clicks on Create a new Test Item button
    Then user verifies name input is displayed
    Then user verifies Description input is displayed
    Then user verifies price input is displayed
    Then user verifies Default Min. Value input is displayed
    Then user verifies Default Max. Value input is displayed
    Then user verifies Created Date input is displayed as MM/DAY/YEAR
    And user enters "glucose" in name input
    And user enters "fructose" in description input
    And user enters "50" in price input
    And user enters "5" in Default Min. Value input
    And user enters "15" in Default Max. Value input
    And user click on Save button
    Then user verifies Test Items are visible
    And user click on Created Date
    And user clicks on Delete button
    And user confirm delete item

    @US_018_API
    Scenario: TC_002_API Test Item Creation
    Given user send post request to "https://medunna.com/api/c-test-items" to create test items
      Then user get test items data and validates



