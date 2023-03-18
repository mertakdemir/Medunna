package stepdefinitions.ui;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.CreateOrEditPhysicianPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PhysicianPageAdmin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_019_TC_001_UI {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    PhysicianPageAdmin physicianPageAdmin = new PhysicianPageAdmin();

    CreateOrEditPhysicianPage createOrEditPhysicianPage = new CreateOrEditPhysicianPage();

    Actions actions = new Actions(Driver.getDriver());

    @Given("Admin goes to the {string}")
    public void admin_goes_to_the(String URL) {
        Driver.getDriver().get(ConfigReader.getProperty(URL));
    }
    @Given("Admin clicks on the user icon")
    public void admin_clicks_on_the_user_icon() {
        homePage.userIcon.click();
    }
    @Given("Admin clicks on Sign In option")
    public void admin_clicks_on_sign_in_option() {
        homePage.signInOption.click();
    }
    @Given("Admin enters username {string}")
    public void admin_enters_username(String username) {
        loginPage.usernameInput.sendKeys(ConfigReader.getProperty(username));
    }
    @Given("Admin enters password {string}")
    public void admin_enters_password(String password) {
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty(password));
    }
    @Given("Admin clicks  on sign in button")
    public void admin_clicks_on_sign_in_button() {
        loginPage.signInSubmitButton.click();
    }
    @Given("Admin clicks on Items&Titles")
    public void admin_clicks_on_items_titles() {
        homePage.itemsAndTitles.click();
    }
    @Given("Admin clicks on Physician link")
    public void admin_clicks_on_physician_link() {
        homePage.physicianLink.click();
    }
    @And("Admin creates a new Physician")
    public void adminCreatesANewPhysician() {
        physicianPageAdmin.createPhysicianButton.click();
        createOrEditPhysicianPage.useSearchChechbox.click();
        createOrEditPhysicianPage.ssnInput.sendKeys("656-97-1234");
        createOrEditPhysicianPage.searcUserButton.click();
        createOrEditPhysicianPage.birthDateInput.sendKeys("01-01-1999");
        createOrEditPhysicianPage.phoneInput.sendKeys("999-111-9191");
        String userHOME = System.getProperty("user.home");
        String pathOfFile = userHOME + "\\OneDrive\\Desktop\\doktor.jpg";
        createOrEditPhysicianPage.fileImageInput.sendKeys(pathOfFile);
        ReusableMethods.waitFor(3);
        createOrEditPhysicianPage.examFeeInput.sendKeys("155");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        createOrEditPhysicianPage.saveButton.click();

    }
    @Given("Admin clicks on Edit button for editing the physician")
    public void admin_clicks_on_edit_button_for_editing_the_physician() {
        ReusableMethods.waitFor(4);
        JSUtils.clickElementByJS(physicianPageAdmin.createdDateOption);
        ReusableMethods.waitFor(3);
        physicianPageAdmin.editButton.click();
    }
    @Given("Admin clicks on user search checkbox")
    public void admin_clicks_on_user_search_checkbox() {
        createOrEditPhysicianPage.useSearchChechbox.click();
    }
    @Given("Admin enters the registered SSN for searching the physician")
    public void admin_enters_the_registered_ssn_for_searching_the_physician() {
        createOrEditPhysicianPage.ssnInput.sendKeys("656-97-1234");
        createOrEditPhysicianPage.searcUserButton.click();
    }
    @Then("Verify that first name and last name of physician is displayed")
    public void verify_that_first_name_and_last_name_of_physician_is_displayed() {
        Assert.assertTrue(createOrEditPhysicianPage.firstNameInput.isDisplayed());
        Assert.assertTrue(createOrEditPhysicianPage.lastNameInput.isDisplayed());
    }
    @Then("Admin provides a specialty for physician")
    public void admin_provides_a_specialty_for_physician() {
        Select speciality = new Select(createOrEditPhysicianPage.specialityDropdown);
        speciality.selectByIndex(2);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(createOrEditPhysicianPage.specialityDropdown.getText().contains("Dermatology"));
    }
    @Then("Admin provides a profile picture for physician")
    public void admin_provides_a_profile_picture_for_physician() {
        String userHOME = System.getProperty("user.home");
        String pathOfFile = userHOME + "\\OneDrive\\Desktop\\doktor.jpg";
        createOrEditPhysicianPage.fileImageInput.sendKeys(pathOfFile);
        ReusableMethods.waitFor(3);

    }
    @Then("Admin provides an exam fee of the physician")
    public void admin_provides_an_exam_fee_of_the_physician() {
        createOrEditPhysicianPage.examFeeInput.clear();
        createOrEditPhysicianPage.examFeeInput.sendKeys("1666");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
    }
    @Then("Admin is able to see all the physicians on the list")
    public void admin_is_able_to_see_all_the_physicians_on_the_list() {
        createOrEditPhysicianPage.saveButton.click();
        ReusableMethods.waitFor(4);
        Assert.assertTrue(physicianPageAdmin.tableOfPhysicians.get(1).isDisplayed());
        Assert.assertEquals(physicianPageAdmin.tableOfPhysicians.size(), 20);
    }
    @Then("Verify that Admin is able to delete a physician")
    public void verify_that_admin_is_able_to_delete_a_physician() {
        ReusableMethods.waitFor(5);
        physicianPageAdmin.deleteButton.click();
        ReusableMethods.waitFor(3);
        physicianPageAdmin.deleteConfirmationButton.click();
    }

}
