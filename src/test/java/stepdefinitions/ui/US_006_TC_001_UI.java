package stepdefinitions.ui;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.PatientMyAppointmentsPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_006_TC_001_UI {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    PatientMyAppointmentsPage patientMyAppointmentsPage = new PatientMyAppointmentsPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("User tries to log in")
    public void user_tries_to_log_in() {
        homePage.userIcon.click();
        homePage.signInOption.click();
        loginPage.usernameInput.sendKeys("leocaprioo");
        loginPage.passwordInput.sendKeys("leocaprioo123!");
        loginPage.rememberMeCheckbox.click();
        loginPage.signInSubmitButton.click();

    }
    @When("User scrolls all the way down")
    public void user_scrolls_all_the_way_down() {
        ReusableMethods.waitFor(2);
        JSUtils.moveToElementJS(homePage.sendAnAppointmentRequestButton);

    }
    @When("User enters valid first name {string}")
    public void user_enters_valid_first_name(String firstName) {
        homePage.firstNameInputForAppointment.clear();
        homePage.firstNameInputForAppointment.sendKeys(firstName);
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);

    }
    @When("User enters valid last name {string}")
    public void user_enters_valid_last_name(String lastName) {
        homePage.lastNameInputForAppointment.clear();
        homePage.lastNameInputForAppointment.sendKeys(lastName);
    }
    @When("User enters valid ssn {string}")
    public void user_enters_valid_ssn(String SSN) {
        homePage.ssnInputForAppointment.clear();
        homePage.ssnInputForAppointment.sendKeys(SSN);
    }
    @Then("verify that ssn {string} is matching with user's")
    public void verify_that_ssn_is_matching_with_user_s(String SSN) {
        ReusableMethods.waitFor(3);
        Assert.assertEquals("345-66-7346", SSN);
        ReusableMethods.waitFor(2);
    }
    @Then("User enters valid email {string}")
    public void user_enters_valid_email(String email) {
        homePage.emailInputForAppointment.clear();
        homePage.emailInputForAppointment.sendKeys(email);
    }
    @Then("User enters valid phone number {string}")
    public void user_enters_valid_phone_number(String phoneNumber) {
        homePage.phoneNumberInputForAppointment.clear();
        homePage.phoneNumberInputForAppointment.sendKeys(phoneNumber);
    }
    @Then("User enters valid date {string}")
    public void user_enters_valid_date(String date) {
        homePage.dateInputForAppointment.clear();
        homePage.dateInputForAppointment.sendKeys(date);
    }
    @Then("User clicks on Send an Appointment Request button")
    public void user_clicks_on_send_an_appointment_request_button() {
        homePage.sendAnAppointmentRequestButton.click();
    }
    @Then("Verify that the appointment has been created")
    public void verify_that_the_appointment_has_been_created() {
        homePage.myPagesButtonPatient.click();
        homePage.myAppointmentsButton.click();
        ReusableMethods.waitFor(5);
        Assert.assertTrue(patientMyAppointmentsPage.nameInTable.getText().contains("Leo"));
    }


}