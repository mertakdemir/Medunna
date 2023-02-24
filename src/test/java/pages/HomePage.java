package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement userIcon;

    @FindBy(id = "login-item")
    public WebElement signInOption;

    @FindBy(xpath = "//a[@href='/account/register']")
    public WebElement registerOption;

    @FindBy(id = "entity-menu")
    public WebElement itemsAndTitles;

    @FindBy(linkText = "Room")
    public WebElement roomOption;

    @FindBy(xpath = "//span[.='Administration']")
    public WebElement administration;

    @FindBy(xpath = "//span[.='User management']")
    public WebElement userManagementLink;



// -----------zeynep---------------
    @FindBy(xpath = "(//*[@data-icon='user'])[2]")
    public WebElement userIconName;

    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOut;


    @FindBy(xpath = "//*[.='MY PAGES']")
    public WebElement myPagesButton;

    @FindBy(xpath = "//*[.='My Appointments']")
    public WebElement myAppointmentsButton;



<<<<<<< HEAD
//----------Mert-----------------

    @FindBy(id = "firstName")
    public WebElement firstNameInputForAppointment;

    @FindBy(xpath = "//*[.='Your FirstName is required.']")
    public WebElement firstNameWarningMessage;

    @FindBy(id = "lastName")
    public WebElement lastNameInputForAppointment;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssnInputForAppointment;

    @FindBy(xpath = "//*[.='Your SSN is required.']")
    public WebElement SSNWarningMessage;

    @FindBy(id = "email")
    public WebElement emailInputForAppointment;

    @FindBy(id = "phone")
    public WebElement phoneNumberInputForAppointment;

    @FindBy(id = "appoDate")
    public WebElement dateInputForAppointment;

    @FindBy(id = "register-submit")
    public WebElement sendAnAppointmentRequestButton;

    @FindBy(xpath = "//*[.='MY PAGES(PATIENT)']")
    public WebElement myPagesButtonPatient;
=======


>>>>>>> 59fa40c903d2e5a558b8d60b6e278cefb03a3247



}