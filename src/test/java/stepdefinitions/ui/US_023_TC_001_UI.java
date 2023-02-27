package stepdefinitions.ui;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.LoginPage;
import pages.StaffMyPage;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_023_TC_001_UI {

    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    StaffMyPage staffMyPage=new StaffMyPage();


    @Then("user clicks on Sign In Button icon")
    public void user_clicks_on_sign_in_button_icon() {
        homePage.signInOption.click();
        ReusableMethods.waitFor(3);
    }
    @Then("user enters username {string} in username input")
    public void user_enters_username_in_username_input(String username) {
        loginPage.usernameInput.sendKeys(username);
    }
    @Then("user enters password {string} in password input")
    public void user_enters_password_in_password_input(String password) {
        loginPage.passwordInput.sendKeys(password);
    }
    @Then("user clicks on Remember me checkbox")
    public void staff_clicks_on_remember_me_checkbox() {
        loginPage.rememberMeCheckbox.click();
    }
    @Then("user clicks on Sign In submit Button icon")
    public void staff_clicks_on_sign_in_submit_button_icon() {
        loginPage.signInSubmitButton.click();
        ReusableMethods.waitFor(3);
    }
    @Then("staff clicks on My Pages Button icon")
    public void staff_clicks_on_my_pages_button_icon() {
        staffMyPage.staffMyPages.click();
    }
    @Then("staff clicks on Search Patient option")
    public void staff_clicks_on_search_patient_option() {
        staffMyPage.staffSearchPatient.click();
    }
    @Then("staff enters the Patient SSN for search")
    public void staff_enters_the_patient_ssn_for_search() {
        staffMyPage.staffSearchSsn.sendKeys("123-32-5685");
    }
    @Then("staff clicks Show appointment button icon")
    public void staff_clicks_show_appointment_button_icon() {
        staffMyPage.staffShowAppointments.click();
    }
    @Then("staff clicks on Show Tests button icon")
    public void staff_clicks_on_show_tests_button_icon() {
        staffMyPage.staffShowTest.click();
    }
    @Then("staff clicks on View Results button icon")
    public void staff_clicks_on_view_results_button_icon() {
        staffMyPage.staffViewResults.click();
    }
    @Then("staff clicks Edit button for edit result")
    public void staff_clicks_edit_button_for_edit_result() {
        staffMyPage.staffEditTest.click();
    }
    @Then("staff enter results by number to results input")
    public void staff_enter_results_by_number_to_results_input() {
        staffMyPage.staffTestResult.clear();
        staffMyPage.staffTestResult.sendKeys("70");
    }
    @Then("staff enter description to description icon")
    public void staff_enter_description_to_description_icon() {
        staffMyPage.staffTestResult.clear();
        staffMyPage.staffTestDescription.sendKeys("important for patient");
    }
    @Then("staff clicks save button icon")
    public void staff_clicks_save_button_icon() {
        staffMyPage.staffTestResultSave.click();
    }
    @Then("staff clicks edit button again")
    public void staff_clicks_edit_button_again() {
        staffMyPage.staffEditTest.click();
    }
    @Then("staff enter result for update result")
    public void staff_enter_result_for_update_result() {
        staffMyPage.staffTestResult.clear();
        staffMyPage.staffTestResult.sendKeys("75");
    }
    @Then("staff enter Description for update description")
    public void staff_enter_description_for_update_description() {
        staffMyPage.staffTestDescription.clear();
       staffMyPage.staffTestDescription.sendKeys("normal value");
    }
    @Then("verify is displayed id date result description createdDate testItem test")
    public void verify_is_displayed_id_date_result_description_created_date_test_item_test() {
        Assert.assertTrue(staffMyPage.staffTestId.isDisplayed());
        Assert.assertTrue(staffMyPage.staffTestDate.isDisplayed());
        Assert.assertTrue(staffMyPage.staffTestCreatedDate.isDisplayed());
        Assert.assertTrue(staffMyPage.staffTestItem.isDisplayed());
        Assert.assertTrue(staffMyPage.staffTestInput.isDisplayed());
    }

}
