package stepdefinitions.ui;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_005_TC_001_UI {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage;

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
        ReusableMethods.waitFor(5);
    }
    @Then("Verify user should see a success message")
    public void verify_user_should_see_a_success_message() throws IOException {
        ReusableMethods.getScreenshot("No_Message_");

        Assert.assertTrue(homePage.userIconName.isDisplayed());
    }


    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }



        //-------------@US_005_TC_002--------------------

    @When("User checks on the Remember me box")
    public void user_checks_on_the_remember_me_box() {
        loginPage.rememberMeCheckbox.click();
    }

    //-------------@US_005_TC_003--------------------

    @Then("Verify user clicks Signin Button")
    public void verify_user_clicks_signin_button() {
        Assert.assertTrue(homePage.userIconName.isDisplayed());

    }

    @When("User clicks the usericon")
    public void user_clicks_the_usericon() {
        homePage.userIconName.click();
        ReusableMethods.waitFor(3);
    }


    @When("User clicks Signout Button")
    public void user_clicks_signout_button() {
        homePage.signOut.click();
        ReusableMethods.waitFor(3);

    }

    @When("User clicks on the signin again Button")
    public void user_clicks_on_the_signin_again_button() {
        loginPage.SigninAgain.click();
    }


    @Then("Username and password should come automatically in order to log in to the system again later.")
    public void username_and_password_should_come_automatically_in_order_to_log_in_to_the_system_again_later() throws IOException {
        ReusableMethods.waitFor(3);
        String againUsername = loginPage.usernameInput.getText();
        String againPassword = loginPage.passwordInput.getText();
        assertEquals(ConfigReader.getProperty("medunna_username_1"), againUsername);
        assertEquals(ConfigReader.getProperty("medunna_password_1"), againPassword);

        ReusableMethods.getScreenshot("Automatically_Username_");

        //Assert.assertFalse(loginPage.usernameInput.toString().isEmpty());
        //Assert.assertFalse(loginPage.passwordInput.toString().isEmpty());
    }

    //-------------@US_005_TC_004--------------------

    @When("User invalid Username and Password")
    public void user_invalid_username_and_password() {
        loginPage.usernameInput.sendKeys("Zeki");
        loginPage.passwordInput.sendKeys("Muren");
        ReusableMethods.waitFor(5);

    }

    @Then("Verify the user is not registered")
    public void verify_the_user_is_not_registered() {
        ReusableMethods.waitFor(3);
        assertTrue(loginPage.failedSigninMessage.isDisplayed());

    }


    @When("User clicks the registration link")
    public void user_click_the_registration_link() {
        Assert.assertTrue(loginPage.registerANewAccountLink.isDisplayed());
        loginPage.registerANewAccountLink.click();
    }

    @Then("Verify should be redirected to the registration page")
    public void verify_should_be_redirected_to_the_registration_page() {
        registerPage= new RegisterPage();
        Assert.assertTrue(registerPage.firstNameRegister.isDisplayed());

    }

//-------------@US_005_TC_005--------------------

    @When("User clicks the cancel button")
    public void user_clicks_the_cancel_button() {
        loginPage.cancelButton.click();
        ReusableMethods.waitFor(3);
    }

    @Then("Verify the User come to the home page")
    public void verify_the_user_come_to_the_home_page() {
        Assert.assertTrue(homePage.userIcon.isDisplayed());
    }


}
