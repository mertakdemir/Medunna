package stepdefinitions.ui;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.PhysicianAppointmentPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class US_012_UI {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    PhysicianAppointmentPage appointmentPage = new PhysicianAppointmentPage();


    @Given("user is on the home page :  {string}")
    public void userIsOnTheHomePage(String url) {
        Driver.getDriver().get(url);
    }

    @When("user clicks on user icon")
    public void user_clicks_on_user_icon() {
        homePage.userIcon.click();
    }

    @Then("user clicks on Sign In Button")
    public void user_clicks_on_sign_in_button() {
        homePage.signInOption.click();
    }

    @Then("user enters valid username {string} in username input")
    public void user_enters_valid_username_in_username_input(String username) {
        loginPage.usernameInput.sendKeys(username);
    }
    @Then("user enters valid password {string} in password input")
    public void user_enters_valid_password_in_password_input(String password) {
        loginPage.passwordInput.sendKeys(password);
    }
    @Then("user clicks on Remember Me checkbox")
    public void user_clicks_on_remember_me_checkbox() {
        loginPage.rememberMeCheckbox.click();

    }

    @Then("user clicks on Sign In submit Button")
    public void user_clicks_on_sign_in_submit_button() {
        loginPage.signInSubmitButton.click();
    }
    @Then("user clicks on My Pages")
    public void user_clicks_on_my_pages() {
        homePage.myPagesButton.click();
    }
    @Then("user clicks on My Appointments")
    public void user_clicks_on_my_appointments() {
        homePage.myAppointmentsButton.click();
    }
    @Then("user clicks on Edit button")
    public void user_clicks_on_edit_button() {
        appointmentPage.editButton.click();
    }
    @Then("verify Create or Edit an Appointment text is visible")
    public void verify_create_or_edit_an_appointment_text_is_visible() {
        assertTrue(appointmentPage.createOrEditAnAppointmentText.isDisplayed());

    }

    @Then("verify patient id is visible")
    public void verifyPatientIdIsVisible() {
        assertTrue(appointmentPage.appointmentId.isDisplayed());
    }

    @Then("verify start date is visible")
    public void verifyStartDateIsVisible() {
        assertTrue(appointmentPage.appointmentStartDate.isDisplayed());
    }

    @Then("verify end date is visible")
    public void verifyEndDateIsVisible() {
        assertTrue(appointmentPage.appointmentEndDate.isDisplayed());
    }

    @Then("verify status is visible")
    public void verifyStatusIsVisible() {
        assertTrue(appointmentPage.appointmentStatus.isDisplayed());
    }

    @Then("verify physician is visible")
    public void verifyPhysicianIsVisible() {
        assertTrue(appointmentPage.appointmentPhysician.isDisplayed());
    }
//--------------------------------------------------------------------------------

    @And("user fills in Anamnesis field with {string}")
    public void userFillsInAnamnesisFieldWith(String text) {
        appointmentPage.appointmentAnamnesis.clear();
        appointmentPage.appointmentAnamnesis.sendKeys(text);
    }


    @And("user fills in Treatments field with {string}")
    public void userFillsInTreatmentsFieldWith(String text) {
        appointmentPage.appointmentTreatment.clear();
        appointmentPage.appointmentTreatment.sendKeys(text);
    }



    @And("user fills in Diagnosis field with {string}")
    public void userFillsInDiagnosisFieldWith(String text) {
        appointmentPage.appointmentDiagnosis.clear();
        appointmentPage.appointmentDiagnosis.sendKeys(text);
    }



    //-------------------------------------------------------------------------------------
    @And("user clicks on save button")
    public void userClicksOnSaveButton() {
        appointmentPage.saveButton.submit();
    }

    @And("verify Anamnesis text which is written by user is visible")
    public void verifyAnamnesisTextWhichIsWrittenByUserIsVisible() {
        assertTrue(appointmentPage.anamnesisText.isDisplayed());
    }

    @And("verify Treatments text which is written by user is visible")
    public void verifyTreatmentsTextWhichIsWrittenByUserIsVisible() {
        assertTrue(appointmentPage.treatmentText.isDisplayed());
    }

    @And("verify Diagnosis text which is written by user is visible")
    public void verifyDiagnosisTextWhichIsWrittenByUserIsVisible() {
        assertTrue(appointmentPage.diagnosisText.isDisplayed());
    }


    @Then("verify appointment is saved with Appointments text is visible.")
    public void verifyAppointmentIsSavedWithAppointmentsTextIsVisible() {
        assertTrue(appointmentPage.appointmentHeading.isDisplayed());
    }

    @And("user does not fill Diagnosis field")
    public void userDoesNotFillDiagnosisField() {
        appointmentPage.appointmentDiagnosis.clear();
    }

    @Then("verify {string} text is visible.")
    public void verifyTextIsVisible(String string) {
        assertTrue(appointmentPage.thisFieldIsRequiredText.isDisplayed());
    }


    @And("user fills Prescription field with {string}")
    public void userFillsPrescriptionFieldWith(String prescription) {
        appointmentPage.appointmentPrescription.sendKeys(prescription);
    }

    @And("user fills Description field with {string}")
    public void userFillsDescriptionFieldWith(String description) {
        appointmentPage.appointmentDescription.sendKeys(description);
    }


    @And("user does not fill Prescription field")
    public void userDoesNotFillPrescriptionField() {
        appointmentPage.appointmentPrescription.clear();
    }

    @And("user does not fill Description field")
    public void userDoesNotFillDescriptionField() {
        appointmentPage.appointmentDescription.clear();
    }


    @And("User selects status as {string}")
    public void userSelectsStatusAs(String status) {

        Select select = new Select(appointmentPage.appointmentStatus);
        select.selectByVisibleText(status);
    }

    @Then("verify status is {string}")
    public void verifyStatusIs(String status) {
        assertTrue(appointmentPage.statusText.getText().equals(status));
    }


}
