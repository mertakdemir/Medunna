@US_004_TC_001_UI_Testing
Feature:US_004_TC_001

  Scenario Outline:An admin must activate the registered user otherwise user should not be able to login.
    Given User goes to the "medunna_url"
    When User registers to the Medunna page
    And Admin tries to log in with the "medunna_username_1" and "medunna_password_1"
    And Admin clicks on Administration button
    And Admin goes to User Management link
    And Admin clicks on created date option on the table
    And Admin activates the last registered user
    And Admin clicks on edit button
    And Admin assigns a valid "<role>" for the user
    Then verify the "<role>" has been assigned
    And close the application
    Examples:
      | role |
      | ROLE_ADMIN |
      | ROLE_PATIENT |
      | ROLE_STAFF |
      | ROLE_PHYSICIAN |









