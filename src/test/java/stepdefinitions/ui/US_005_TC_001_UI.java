package stepdefinitions.ui;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.remote.ScreenshotException;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.io.IOException;

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

    @When("User check the Remember me box")
    public void user_check_the_remember_me_box() {
        loginPage.rememberMeCheckbox.click();
    }


   @When("User click the Signin Button")
    public void user_click_the_signin_button() {
        loginPage.signInSubmitButton.click();
         }

    @Then("Verify sigin as User")
    public void verify_sigin_as_user() {
        Assert.assertTrue(homePage.userIconName.isDisplayed());
    }

    @Then("User should see a success message")
    public void user_should_see_a_success_message() throws IOException {
        ReusableMethods.getScreenshot("No_Message_");
    }

    @When("User clicks the usericon")
    public void user_clicks_the_usericon() {
    homePage.userIconName.click();
    }


    @When("User sign out of the system")
    public void user_sign_out_of_the_system() {
    homePage.signOut.click();

    }



    @When("The username and password should come automatically to log in to the system again.")
    public void the_username_and_password_should_come_automatically_to_log_in_to_the_system_again() throws IOException {
        ReusableMethods.waitFor(10);
        ReusableMethods.getScreenshot("Automatically_Username_");

        Assert.assertFalse(loginPage.usernameInput.toString().isEmpty());
        Assert.assertFalse(loginPage.passwordInput.toString().isEmpty());

    }

    @When("User click the registration link")
    public void user_click_the_registration_link() {
    Assert.assertTrue(loginPage.registerANewAccountLink.isDisplayed());
    loginPage.registerANewAccountLink.click();
    }

    @Then("Verify should be redirected to the registration page")
    public void verify_should_be_redirected_to_the_registration_page() {
    registerPage= new RegisterPage();
    Assert.assertTrue(registerPage.firstNameRegister.isDisplayed());

    }

    @When("User click the cancel button")
    public void user_click_the_cancel_button() {
    loginPage.cancelButton.click();
    }

    @Then("Verify the User come to the home page")
    public void verify_the_user_come_to_the_home_page() {
        Assert.assertTrue(homePage.userIcon.isDisplayed());
    }
    /*
 */

}
