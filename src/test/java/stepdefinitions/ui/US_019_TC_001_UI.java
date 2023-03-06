package stepdefinitions.ui;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import pages.PhysicianPageAdmin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_019_TC_001_UI {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    PhysicianPageAdmin physicianPageAdmin = new PhysicianPageAdmin();

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
    @Given("Admin clicks on Edit button for editing the physician")
    public void admin_clicks_on_edit_button_for_editing_the_physician() {
        physicianPageAdmin.editButton.click();
    }
    @Given("Admin clicks on user search checkbox")
    public void admin_clicks_on_user_search_checkbox() {

    }
    @Given("Admin enters the registered SSN for searching the physician")
    public void admin_enters_the_registered_ssn_for_searching_the_physician() {

    }
    @Then("Verify that firs name and last name of physician is displayed")
    public void verify_that_firs_name_and_last_name_of_physician_is_displayed() {

    }
    @Then("Admin provides a specialty for physician")
    public void admin_provides_a_specialty_for_physician() {

    }
    @Then("Admin provides a profile picture for physician")
    public void admin_provides_a_profile_picture_for_physician() {

    }
    @Then("Admin provides an exam fee of the physician")
    public void admin_provides_an_exam_fee_of_the_physician() {

    }
    @Then("Admin is able to see all the physicians on the list")
    public void admin_is_able_to_see_all_the_physicians_on_the_list() {

    }
    @Then("Verify that Admin is able to delete a physician")
    public void verify_that_admin_is_able_to_delete_a_physician() {

    }
    @Then("Admin goes to User Management link from the physician page")
    public void admin_goes_to_user_management_link_from_the_physician_page() {

    }
    @Then("Verify that physician is enabled on list")
    public void verify_that_physician_is_enabled_on_list() {

    }
}
