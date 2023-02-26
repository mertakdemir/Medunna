@US_005_TC_001_UI_Testing

Feature:US_005_TC_001

  Background:
    Given User goes to the "medunna_url"

  Scenario: Login page should be accessible only with valid credentials
    Given User clicks on the user icon
    When User valid Username and Password "medunna_username_3" and "medunna_password_3"
    And User check the Remember me box
    And User click the Signin Button
    Then Verify sigin as User
    And User should see a success message

    When User clicks the usericon
    And User sign out of the system
    And User clicks on the user icon
    And The username and password should come automatically to log in to the system again.


    And User click the registration link
    Then Verify should be redirected to the registration page

    When User clicks on the user icon
    And  User click the cancel button
    Then Verify the User come to the home page
  #  And close the application









