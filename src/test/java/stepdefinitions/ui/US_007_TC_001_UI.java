package stepdefinitions.ui;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.*;

public class US_007_TC_001_UI {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    AdminAdministrationPage adminAdministrationPage = new AdminAdministrationPage();
    CreateAUserOrEditPage createAUserOrEditPage = new CreateAUserOrEditPage();
    UserInfoPage userInfoPage =new UserInfoPage();

    @When("user clicks on  user icon")
    public void user_clicks_on_user_icon() {
    homePage.userIcon.click();
    }
    @When("user clicks on  sign in option")
    public void user_clicks_on_sign_in_option() {

        homePage.signInOption.click();
    }
    @When("user enters username")
    public void user_enters_username() {
    loginPage.usernameInput.sendKeys("TomHanks");

    }
    @When("user enters password")
    public void user_enters_password() {
    loginPage.passwordInput.sendKeys("Tomhanks12345");
    }
    @When("user clicks  on sign in button")
    public void user_clicks_on_sign_in_button() {
    loginPage.signInSubmitButton.click();
    }
    @When("user clicks signed user icon")
    public void user_clicks_signed_user_icon() {
    userInfoPage.signedUserIcon.click();
    }
    @When("user clicks on setting option")
    public void user_clicks_on_setting_option() {
    userInfoPage.settingsOption.click();

    }
    @Then("user verify  user settings info  is visibile")
    public void user_verify_user_settings_info_is_visibile() {
        Assert.assertTrue(userInfoPage.settingsTitle.isDisplayed());
    }
    @Then("user update firstname")
    public void user_update_firstname() {
    userInfoPage.firstnameInput.sendKeys("s");
    }
    @Then("user update lastname")
    public void user_update_lastname() {
    userInfoPage.lastnameInput.sendKeys("ss");
    }
    @Then("user clicks on save button to save update")
    public void user_clicks_on_save_button_to_save_update() {
    userInfoPage.saveButton.click();
    }
    @Then("user verify  updated first and last name user icon is visible")
    public void user_verify_updated_first_and_last_name_user_icon_is_visible() {
     Assert.assertTrue(userInfoPage.signedUserIcon.isDisplayed());
    }
}
