package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PhysicianAppointmentPage {

    public PhysicianAppointmentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Edit']")
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




}