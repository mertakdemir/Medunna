package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.JSUtils;
import utilities.ReusableMethods;



public class US_024_TC_001_UI {

    Faker faker = new Faker();
    String ssn= faker.idNumber().ssnValid();
    String firstName= faker.name().firstName();
    String lastName= faker.name().lastName();
    String email= faker.internet().emailAddress();

    Integer day=faker.number().numberBetween(1,28);
    Integer month=faker.number().numberBetween(1,12);
    Integer year=faker.number().numberBetween(2024,2099);

    String dateOfAppointmentFaker= day+"/"+month+"/"+year;

    TestItems testItems= new TestItems();
    StaffMyPage staffMyPage=new StaffMyPage();
    HomePage homePage = new HomePage();
    PatientMyAppointmentsPage patientMyAppointmentsPage=new PatientMyAppointmentsPage();
    PhysicianAppointmentPage physicianAppointmentPage=new PhysicianAppointmentPage();
    @When("click on Sign Out option")
    public void click_on_sign_out_option() {
        homePage.signOut.click();

    }


    @Then("enter first name for appointment on homepage")
    public void enter_first_name_for_appointment_on_homepage() {
        homePage.firstNameInputForAppointment.sendKeys(firstName);

    }
    @Then("enter last name for appointment on homepage")
    public void enter_last_name_for_appointment_on_homepage() {
        homePage.lastNameInputForAppointment.sendKeys(lastName);
    }
    @Then("enter ssn for appointment on homepage")
    public void enter_ssn_for_appointment_on_homepage() {
        homePage.ssnInputForAppointment.sendKeys(ssn);
    }
    @Then("enter email name for appointment on homepage")
    public void enter_email_name_for_appointment_on_homepage() {
        homePage.emailInputForAppointment.sendKeys(email);
    }
    @Then("enter phone name for appointment on homepage")
    public void enter_phone_name_for_appointment_on_homepage() {
        homePage.phoneNumberInputForAppointment.sendKeys("511-111-1111");
    }
    @Then("enter appointment datetime for appointment on homepage")
    public void enter_appointment_datetime_for_appointment_on_homepage() {
        homePage.dateInputForAppointment.sendKeys(dateOfAppointmentFaker);

    }


    @Then("click on make an Appointment button on homepage")
    public void click_on_make_an_appointment_button_on_homepage() {
        JSUtils.clickElementByJS(homePage.sendAnAppointmentRequestButton);
        ReusableMethods.waitFor(2);

    }
    @Then("staff enters the Patient faker SSN  for search")
    public void staff_enters_the_patient_faker_ssn_for_search() {
        staffMyPage.staffSearchSsn.sendKeys(ssn);
        ReusableMethods.waitFor(2);
    }
    @Then("click on edit button for appointment")
    public void click_on_edit_button_for_appointment() {
        staffMyPage.editAppointmentStaff.click();
        ReusableMethods.waitFor(2);
    }
    @Then("click status pending")
    public void click_status_pending() {
        new Select(staffMyPage.statusPendingStaff).selectByVisibleText("PENDING");
        ReusableMethods.waitFor(2);
    }
    @Then("click to choose physician Dr Erol")
    public void click_to_choose_physician_dr_erol() {
        new Select(staffMyPage.physicianChoose).selectByVisibleText("5215:Erol Bey:ALLERGY_IMMUNOLOGY");
        ReusableMethods.waitFor(2);
    }
    @Then("click to save button for appointment")
    public void click_to_save_button_for_appointment() {
        JSUtils.clickElementByJS(staffMyPage.saveAppointmentEditStaff);
        ReusableMethods.waitFor(2);
    }

    @And("physician clicks datefrom box")
    public void physicianClicksDatefromBox() {
        testItems.fromDateBoxPhysician.sendKeys(dateOfAppointmentFaker);
    }

    @And("physician clicks dateTo box")
    public void physicianClicksDateToBox() {
        testItems.toDateBoxPhysician.sendKeys(dateOfAppointmentFaker);
    }
    @Then("physician clicks insulin button")
    public void physician_clicks_insulin_button() {
        testItems.testInsulinButton.click();


    }
    @Then("physician clicks save button")
    public void physician_clicks_save_button() {

        JSUtils.clickElementByJS(testItems.saveTestPhysician);
        ReusableMethods.waitFor(2);
    }
    @Then("physician clicks status Completed")
    public void physician_clicks_status_completed() {
        new Select(physicianAppointmentPage.appointmentStatus).selectByVisibleText("COMPLETED");
        ReusableMethods.waitFor(2);
    }
    @Then("physician enters anamnesis")
    public void physician_enters_anamnesis() {
        physicianAppointmentPage.appointmentAnamnesis.sendKeys("Real Madrid");
    }
    @Then("physician enters Treatment")
    public void physician_enters_treatment() {
        physicianAppointmentPage.appointmentTreatment.sendKeys("Barcelona");
    }
    @Then("physician enters Diagnosis")
    public void physician_enters_diagnosis() {
        physicianAppointmentPage.appointmentDiagnosis.sendKeys("Juventus");
    }
    @Then("physician enters Prescription")
    public void physician_enters_prescription() {
        physicianAppointmentPage.appointmentPrescription.sendKeys("Mortingen");

    }
    @Then("physician enters Description")
    public void physician_enters_description() {
        physicianAppointmentPage.appointmentDescription.sendKeys("Life is Good");
    }

    @Then("verify status Completed or Canceled is displayed")
    public void verify_status_completed_or_canceled_is_displayed() {
        Assert.assertTrue(testItems.verifyStatusCompleted.getText().contains("COMPLETED"));

    }
    @Then("staff clicks Payment Invoice button icon")
    public void staff_clicks_payment_invoice_button_icon() {
        ReusableMethods.waitFor(5);

        testItems.paymentInvoiceProcessButton1.click();
        ReusableMethods.waitFor(7);
    }
    @Then("verify visibility of Exam fee and test item prices")
    public void verify_visibility_of_exam_fee_and_test_item_prices() {
        Assert.assertTrue(testItems.examFeeAppoVisibility.isDisplayed());
        Assert.assertTrue(testItems.examFeePriceBoxVisibility.isDisplayed());
        //  Assert.assertTrue(testItems.testItemFeeVisibility.isDisplayed());
        // Assert.assertTrue(testItems.testItemFeePriceBoxVisibility.isDisplayed());
        ReusableMethods.waitFor(2);

    }




    @And("clickss on Sign Out option")
    public void clickssOnSignOutOption() {
        JSUtils.clickElementByJS(homePage.signOut);
        ReusableMethods.waitFor(2);

    }

    @Then("clickss on user icon")
    public void clickssOnUserIcon() {
        JSUtils.clickElementByJS(homePage.userIcon);
    }

    @And("clickss on Sign In option")
    public void clickssOnSignInOption() {
        JSUtils.clickElementByJS(homePage.signInOption);
    }

    @And("user clickss on Request a test button")
    public void userClickssOnRequestATestButton() {
        JSUtils.clickElementByJS(testItems.requestTestButtonPhysician);
    }

    @Then("click on create invoice button")
    public void click_on_create_invoice_button() {
        ReusableMethods.waitFor(5);
        testItems.createInvoiceButton.click();
        ReusableMethods.waitFor(7);
    }


    @And("click on save button for create invoice")
    public void clickOnSaveButtonForCreateInvoice() {
        ReusableMethods.waitFor(5);
        JSUtils.clickElementByJS(testItems.saveCreatingInvoice);
        ReusableMethods.waitFor(5);
    }



    @Then("verify the invoice is displayed")
    public void verify_the_invoice_is_displayed() {

        Assert.assertTrue(testItems.paymentDetailVerify.toString().contains("PAYMENT DETAIL"));
    }



}