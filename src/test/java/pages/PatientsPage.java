package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PatientsPage {

    public PatientsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id = "patient-firstName")
    public WebElement patientFirstNameInput;

    @FindBy(id = "patient-lastName")
    public WebElement patientLastNameInput;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "patient-phone")
    public WebElement patientPhoneInput;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

   //-----------US_16-------------------------------------

    @FindBy(id = "patient-birthDate")
    public WebElement patientBirthDate;

    @FindBy(id = "patient-gender")
    public WebElement patientGender;

    @FindBy(id = "patient-bloodGroup")
    public WebElement patientBloodGroup;

    @FindBy(id = "patient-adress")
    public WebElement patientAddress;


    @FindBy(id = "patient-description")
    public WebElement patientDescription;


    @FindBy(id = "patient-country")
    public WebElement patientCountry;


    @FindBy(id = "patient-cstate")
    public WebElement patientState;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement patientCreatedAlert;


    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement createANewPatient;

    @FindBy(xpath = "(//a[span='View'])[1]")
    public WebElement patientViewButton;

    @FindBy(xpath = "//div//div//div//h2")
    public WebElement patientID;

    @FindBy(xpath = "//span[@id='ssn']")
    public WebElement patientSSN;


    @FindBy(xpath = "//span[@id='firstName']")
    public WebElement patientFirstName;

    @FindBy(xpath = "//span[@id='lastName']")
    public WebElement patientLastName;

    @FindBy(xpath = "//span[@id='birthDate']")
    public WebElement birthDateOfPatient;

    @FindBy(xpath = "//span[@id='phone']")
    public WebElement patientPhone;

    @FindBy(xpath = "//span[@id='gender']")
    public WebElement genderOfPatient;

    @FindBy(xpath = "//span[@id='bloodGroup']")
    public WebElement bloodGroupOfPatient;

    @FindBy(xpath = "//span[@id='adress']")
    public WebElement addressOfPatient;

    @FindBy(xpath = "//span[@id='description']")
    public WebElement descriptionOfPatient;

    @FindBy(xpath = "//span[@id='createdDate']")
    public WebElement createdDateOfPatient;

    @FindBy(xpath = "//span[text()='User']")
    public WebElement userOfPatient;

    @FindBy(xpath = "(//span[text()='Country'])[2]")
    public WebElement countryOfPatient;

    @FindBy(xpath = "//span[text()=' State/City']")
    public WebElement stateOfPatient;

    @FindBy(xpath = "(//tbody//tr//td//a)[1]")
    public WebElement firstAppointment;


    @FindBy(linkText = "Edit")
    public WebElement editOfAppointment;


    @FindBy(id = "appointment-physician")
    public WebElement physicianOfAppointment;

    @FindBy(id = "appointment-patient")
    public WebElement patientOfAppointment;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButtonOfAppointment;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement alertOfCreatedAppointment;




























}
