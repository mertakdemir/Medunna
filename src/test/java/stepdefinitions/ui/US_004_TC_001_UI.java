package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_004_TC_001_UI {


    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    AdminAdministrationPage adminAdministrationPage = new AdminAdministrationPage();
    CreateAUserOrEditPage createAUserOrEditPage = new CreateAUserOrEditPage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    @Given("User goes to the {string}")
    public void user_goes_to_the(String URL) {
        Driver.getDriver().get(ConfigReader.getProperty(URL));
    }
    @When("User registers to the Medunna page")
    public void user_registers_to_the_medunna_page() {
        String registerPassword = faker.internet().password();
        homePage.userIcon.click();
        homePage.registerOption.click();
        registerPage.snnRegister.sendKeys(faker.idNumber().ssnValid());
        registerPage.firstNameRegister.sendKeys(faker.name().firstName());
        registerPage.lastNameRegister.sendKeys(faker.name().lastName());
        registerPage.usernameRegister.sendKeys(faker.name().username());
        registerPage.emailRegister.sendKeys(faker.internet().emailAddress());
        registerPage.newPasswordRegister.sendKeys(registerPassword);
        registerPage.confirmPasswordRegister.sendKeys(registerPassword);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        registerPage.registerButtonRegister.click();
    }
    @And("Admin tries to log in with the {string} and {string}")
    public void adminTriesToLogInWithTheAnd(String username, String password) {
        ReusableMethods.waitFor(2);
        homePage.userIcon.click();
        homePage.signInOption.click();
        loginPage.usernameInput.sendKeys(ConfigReader.getProperty(username));
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty(password));
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
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        Select roles = new Select(createAUserOrEditPage.assignRoleDropdown);
        roles.selectByVisibleText(role);
        ReusableMethods.waitFor(1);
        createAUserOrEditPage.saveButtonForEditPage.click();
    }
    @Then("verify the {string} has been assigned")
    public void verify_the_has_been_assigned(String role) {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(adminAdministrationPage.createdDateOption);
        ReusableMethods.waitFor(5);
        Assert.assertEquals(role, adminAdministrationPage.roleOfUser.getText());

    }


}
