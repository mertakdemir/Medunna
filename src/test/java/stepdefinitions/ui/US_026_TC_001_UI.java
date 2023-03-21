package stepdefinitions.ui;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import pages.PatientAppointmentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_026_TC_001_UI {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    PatientAppointmentPage patientAppointmentPage = new PatientAppointmentPage();



    @Given("Patient goes to home page {string}")
    public void patient_goes_to_home_page(String URL) {
        Driver.getDriver().get(ConfigReader.getProperty(URL));
    }
    @When("Patient clicks on user icon")
    public void patient_clicks_on_user_icon() {
       homePage.userIcon.click();
    }
    @When("Patient clicks on sign in option")
    public void patient_clicks_on_sign_in_option() {
     homePage.signInOption.click();
    }
    @When("Patient enters username {string}")
    public void patient_enters_username(String username) {
        loginPage.usernameInput.sendKeys(username);
    }
    @When("Patient enters password {string}")
    public void patient_enters_password(String password) {
        loginPage.passwordInput.sendKeys(password);
    }
    @When("Patient clicks on sign in button")
    public void patient_clicks_on_sign_in_button() {
        loginPage.signInSubmitButton.click();
    }
    @When("Patient clicks on My Pages option")
    public void patient_clicks_on_my_pages_option() {
        homePage.myPagesButtonPatient.click();
    }
    @When("Patient clicks on Make an Appointment link")
    public void patient_clicks_on_make_an_appointment_link() {
        homePage.makeAnAppointmentLinkPatient.click();
    }
    @When("Patient enters valid first name {string}")
    public void patient_enters_valid_first_name(String firstName) {
        patientAppointmentPage.firstNameInput.clear();
        patientAppointmentPage.firstNameInput.sendKeys(firstName);
        ReusableMethods.waitFor(1);
    }
    @When("Patient enters valid last name {string}")
    public void patient_enters_valid_last_name(String lastName) {
        patientAppointmentPage.lastNameInput.clear();
        patientAppointmentPage.lastNameInput.sendKeys(lastName);
        ReusableMethods.waitFor(1);
    }
    @When("Patient enters valid SSN {string}")
    public void patient_enters_valid_ssn(String SSN) {
        patientAppointmentPage.ssnInput.clear();
        patientAppointmentPage.ssnInput.sendKeys(SSN);
        ReusableMethods.waitFor(1);
    }
    @When("Patient enters valid email {string}")
    public void patient_enters_valid_email(String email) {
        patientAppointmentPage.emailInput.clear();
        patientAppointmentPage.emailInput.sendKeys(email);
        ReusableMethods.waitFor(1);
    }
    @When("Patient enters valid phone number {string}")
    public void patient_enters_valid_phone_number(String phoneNumber) {
        patientAppointmentPage.phoneNumberInput.clear();
        patientAppointmentPage.phoneNumberInput.sendKeys(phoneNumber);
        ReusableMethods.waitFor(1);
    }
    @When("Patient enters valid date {string}")
    public void patient_enters_valid_date(String date) {
        patientAppointmentPage.appointmentDateInput.clear();
        patientAppointmentPage.appointmentDateInput.sendKeys(date);
        ReusableMethods.waitFor(1);
    }
    @When("Patient clicks on Send an Appointment Request button")
    public void patient_clicks_on_send_an_appointment_request_button() {
        patientAppointmentPage.sendAnAppointmentRequestButton.click();
    }
    @When("Verify that appointment has been created via capturing screenshot")
    public void verify_that_appointment_has_been_created_via_capturing_screenshot() throws IOException {
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("Verification for appointment creation");
    }
}
