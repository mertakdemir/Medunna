package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PhysicianAppointmentPage {

    public PhysicianAppointmentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[.='Edit'][1]")
    public WebElement editButton;
    @FindBy(xpath = "//span[.='Create or Edit an Appointment']")
    public WebElement createOrEditAnAppointmentText;

    @FindBy(id = "appointment-id")
    public WebElement appointmentId;

    @FindBy(id = "appointment-startDate")
    public WebElement appointmentStartDate;

    @FindBy(id = "appointment-endDate")
    public WebElement appointmentEndDate;

    @FindBy(id = "appointment-status")
    public WebElement appointmentStatus;

    @FindBy(id = "appointment-physician")
    public WebElement appointmentPhysician;

    @FindBy(id = "appointment-anamnesis")
    public WebElement appointmentAnamnesis;

    @FindBy(id = "appointment-treatment")
    public WebElement appointmentTreatment;

    @FindBy(id = "appointment-diagnosis")
    public WebElement appointmentDiagnosis;

    @FindBy(id = "appointment-prescription")
    public WebElement appointmentPrescription;

    @FindBy(id = "appointment-description")
    public WebElement appointmentDescription;

    @FindBy(id= "save-entity")
    public WebElement saveButton;

    @FindBy(xpath= "//div[.='This field is required.']")
    public WebElement thisFieldIsRequiredText;


    @FindBy(id = "appointment-heading")
    public WebElement appointmentHeading;


    //------------------------------for https://medunna.com/physician-appointment page---------------------------------------------------------------------


    @FindBy(xpath = "//table//tbody//tr//td[5]")
    public WebElement anamnesisText;

    @FindBy(xpath = "//table//tbody//tr//td[6]")
    public WebElement treatmentText;

    @FindBy(xpath = "//table//tbody//tr//td[7]")
    public WebElement diagnosisText;

    @FindBy(xpath = "//table//tbody//tr//td[4]")
    public WebElement statusText;

    @FindBy(xpath = "//a[@href='/physician_test/3616']")
    public WebElement requestATestButton;

    @FindBy(id = "1754")
    public WebElement glucoseCheckmark;

    @FindBy(xpath = "//input[@id='1755']")
    public WebElement ureaCheckmark;

    @FindBy(xpath = "//input[@id='1756']")
    public WebElement creatinineCheckmark;

    @FindBy(xpath = "//input[@id='1757']")
    public WebElement sodiumCheckmark;

    @FindBy(xpath = "//input[@id='1758']")
    public WebElement potassiumCheckmark;

    @FindBy(xpath = "//input[@id='1759']")
    public WebElement totalProteinCheckmark;

    @FindBy(xpath = "//input[@id='1760']")
    public WebElement albuminCheckmark;

    @FindBy(xpath = "//input[@id='1761']")
    public WebElement hemoglobinCheckmark;















    //------------------------------for https://medunna.com/physician-appointment page---------------------------------------------------------------------

    @FindBy(xpath = "(//span[.='Edit'])[7]")
    public WebElement editAppoToSeeTestResultsButton;

    @FindBy(linkText = "Show Test Results")
    public WebElement showTestResultsButton;

    @FindBy(xpath = "(//span[.='View Results'])[1]")
    public WebElement viewResultsButton;

    @FindBy(xpath = "//th")
    public List<WebElement> testResultHeadingList;

    @FindBy(xpath = "//button[text()='Request Inpatient']")
    public WebElement requestInpatientButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement inpatientRequestSuccessMessage;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement inpatientRequestFailureMessage;

}