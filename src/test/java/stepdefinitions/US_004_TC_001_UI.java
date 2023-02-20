package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_004_TC_001_UI {


    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    AdminAdministrationPage adminAdministrationPage = new AdminAdministrationPage();
    CreateAUserOrEditPage createAUserOrEditPage = new CreateAUserOrEditPage();

    @Given("User goes to the {string}")
    public void user_goes_to_the(String URL) {
        Driver.getDriver().get(ConfigReader.getProperty(URL));
    }
    @When("User registers to the Medunna page")
    public void user_registers_to_the_medunna_page() {
        homePage.userIcon.click();
        homePage.registerOption.click();
        registerPage.snnRegister.sendKeys("134-56-7777");
        registerPage.firstNameRegister.sendKeys("Leonardo");
        registerPage.lastNameRegister.sendKeys("DiCaprio");
        registerPage.usernameRegister.sendKeys("LeoCaprio");
        registerPage.emailRegister.sendKeys("leocaprio@gmail.com");
        registerPage.newPasswordRegister.sendKeys("LeonardoCaprio12345");
        registerPage.confirmPasswordRegister.sendKeys("LeonardoCaprio12345");
        registerPage.registerButtonRegister.click();
    }
    @And("Admin tries to log in with the {string} and {string}")
    public void adminTriesToLogInWithTheAnd(String username, String password) {
        ReusableMethods.waitFor(2);
        homePage.userIcon.click();
        homePage.signInOption.click();
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.rememberMeCheckbox.click();
        loginPage.signInSubmitButton.click();
    }
    @When("Admin clicks on Administration button")
    public void admin_clicks_on_administration_button() {
        homePage.administration.click();
    }
    @When("Admin goes to User Management link")
    public void admin_goes_to_user_management_link() {
        homePage.userManagementLink.click();
    }
    @And("Admin clicks on created date option on the table")
    public void adminClicksOnCreatedDateOptionOnTheTable() {
        adminAdministrationPage.createdDateOption.click();
    }
    @When("Admin activates the last registered user")
    public void admin_activates_the_last_registered_user() {
        ReusableMethods.waitFor(1);
        adminAdministrationPage.deActivateButton.click();
    }
    @When("Admin clicks on edit button")
    public void admin_clicks_on_edit_button() {
        adminAdministrationPage.editOption.click();
    }
    @When("Admin assigns a valid {string} for the user")
    public void admin_assigns_a_valid_for_the_user(String role) {
        Select roles = new Select(createAUserOrEditPage.assignRoleDropdown);
        roles.selectByVisibleText(role);
    }
    @Then("verify the {string} has been assigned")
    public void verify_the_has_been_assigned(String role) {
        ReusableMethods.waitFor(2);
        Assert.assertEquals(role, adminAdministrationPage.roleOfUser.getText());
    }

    @And("close the application")
    public void closeTheApplication() {
        Driver.closeDriver();
    }

}
