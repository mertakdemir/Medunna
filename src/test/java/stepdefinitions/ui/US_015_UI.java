package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LoginPage;
import pages.PhysicianAppointmentPage;
import utilities.Driver;
import utilities.JSUtils;

public class US_015_UI {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    PhysicianAppointmentPage physicianAppointmentPage = new PhysicianAppointmentPage();
    Actions actions = new Actions(Driver.getDriver());


    @When("user clicks on My Inpatients")
    public void userClicksOnMyInpatients() {
        physicianAppointmentPage.myInpatientButton.click();
    }
    @And("user clicks on patient edit button")
    public void userClicksEditOnEditButtonForPatient() {
        physicianAppointmentPage.patientEditButtonInpatient.click();
    }

    @Then("user verifies patient id is displayed")
    public void userVerifiesPatientIdIsDisplayed() {
        Assert.assertTrue(physicianAppointmentPage.inpatientId.isDisplayed());
    }

    @Then("user verifies patient start date is displayed")
    public void userVerifiesPatientStartDateIsDisplayed() {
        Assert.assertTrue(physicianAppointmentPage.inpatientStartDate.isDisplayed());

    }

    @Then("user verifies patient end date is displayed")
    public void userVerifiesPatientEndDateIsDisplayed() {
        Assert.assertTrue(physicianAppointmentPage.inpatientEndDate.isDisplayed());
    }

    @Then("user verifies patient description is displayed")
    public void userVerifiesPatientDescriptionIsDisplayed() {
        Assert.assertTrue(physicianAppointmentPage.inpatientDescription.isDisplayed());
    }

    @Then("user verifies patient created date is displayed")
    public void userVerifiesPatientCreatedDateIsDisplayed() {
        Assert.assertTrue(physicianAppointmentPage.inpatientCreatedDate.isDisplayed());
    }

    @Then("user verifies patient appointment id is displayed")
    public void userVerifiesPatientAppointmentIdIsDisplayed() {
        Assert.assertTrue(physicianAppointmentPage.inpatientAppointment.isDisplayed());
    }

    @Then("user verifies patient status is displayed")
    public void userVerifiesPatientStatusIsDisplayed() {
        Assert.assertTrue(physicianAppointmentPage.inpatientStatus.isDisplayed());
    }

    @Then("user verifies patient room is displayed")
    public void userVerifiesPatientRoomIsDisplayed() {
        Assert.assertTrue(physicianAppointmentPage.inpatientRoom.isDisplayed());
    }

    @Then("user verifies patient patient section is displayed")
    public void userVerifiesPatientPatientSectionIsDisplayed() {
        Assert.assertTrue(physicianAppointmentPage.inpatientPatient.isDisplayed());

    }

    @When("doctor clicks a patient's status needs to be updated")
    public void doctorClicksAPatientSStatusNeedsToBeUpdated() {
        physicianAppointmentPage.inpatientStatus2.click();
    }

    @And("doctor updates the patient's status to UNAPPROVED")
    public void updatesThePatientSStatusToUNAPPROVED() {
        Select select = new Select(physicianAppointmentPage.inpatientStatus2);
        select.selectByVisibleText("UNAPPROVED");
    }

    @Then("user verifies the patient's status is updated to UNAPPROVED")
    public void thePatientSStatusIsUpdatedToUNAPPROVED() {
        Assert.assertTrue(physicianAppointmentPage.inpatientStatusUnapproved.isDisplayed());
    }

    @When("doctor clicks on My Inpatients")
    public void doctorClicksOnMyInpatients() {
        physicianAppointmentPage.myInpatientButton.click();
    }

    @And("doctor clicks on patient edit button")
    public void doctorClicksOnPatientEditButton() {
        physicianAppointmentPage.patientEditButtonInpatient.click();
    }


    @When("physician clicks on My Inpatients")
    public void physicianClicksOnMyInpatients() {
        physicianAppointmentPage.myInpatientButton.click();
    }

    @And("physician clicks on patient edit button")
    public void physicianClicksOnPatientEditButton() {
        physicianAppointmentPage.patientEditButtonInpatient.click();
    }

    @And("physician clicks a patient's room needs to be updated")
    public void physicianClicksAPatientSRoomNeedsToBeUpdated() {
        physicianAppointmentPage.inpatientRoomUpdate.click();

    }

    @And("physician updates the patient's room to TWIN FULL")
    public void physicianUpdatesThePatientSRoomToTWINFULL() {
        Select select = new Select(physicianAppointmentPage.inpatientRoomUpdate);
        select.selectByVisibleText("22761011:TWIN FULL-UNAVAILABLE");
    }

    @Then("physician verifies the patient's room is updated to TWIN FULL")
    public void physicianVerifiesThePatientSRoomIsUpdatedToTWINFULL() {
        Assert.assertTrue(physicianAppointmentPage.inpatientRoomTwinFull.isDisplayed());
    }
}
