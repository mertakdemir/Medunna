@US_005_TC_001_UI_Testing

Feature:US_005_TC_001

  Background:
    Given User goes to the "medunna_url"

  @US_005_TC_001
  Scenario: Login page should be accessible only with valid credentials
    Given User clicks on the user icon
    When User valid Username and Password "medunna_username_5" and "medunna_password_5"
    And User clicks on the Signin Button
    Then Verify user clicks Signin Button

  @US_005_TC_002
  Scenario: Login page should be accessible only with valid credentials and clicks remember me checkbox
    Given User clicks on the user icon
    When User valid Username and Password "medunna_username_5" and "medunna_password_5"
    And User checks on the Remember me box
    And User clicks on the Signin Button
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
    And close the application

  @Given("User clicks on the user icon")
  public void user_clicks_on_the_user_icon() {
  homePage.userIcon.click();
  homePage.signInOption.click();
  ReusableMethods.waitFor(3);

  }

  @When("User valid Username and Password {string} and {string}")
  public void user_valid_username_and_password_and(String username, String password) {
  loginPage.usernameInput.sendKeys(ConfigReader.getProperty(username));
  loginPage.passwordInput.sendKeys(ConfigReader.getProperty(password));
  }

  @When("User clicks on the Signin Button")
  public void user_click_on_the_signin_button() {
  loginPage.signInSubmitButton.click();
  }


  @Then("Verify user clicks Signin Button")
  public void verify_user_clicks_signin_button() {
  Assert.assertTrue(homePage.userIconName.isDisplayed());
  }

  //-------------@US_005_TC_002--------------------

  @When("User checks on the Remember me box")
  public void user_checks_on_the_remember_me_box() {
  loginPage.rememberMeCheckbox.click();
  }


