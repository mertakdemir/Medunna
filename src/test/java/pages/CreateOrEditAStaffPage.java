package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateOrEditAStaffPage {

    public CreateOrEditAStaffPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "useSSNSearch")
    public WebElement useSearchChechbox;

    @FindBy(id = "searchSSN")
    public WebElement ssnInput;

    @FindBy(xpath = "//button[text()='Search User']")
    public WebElement searchUserButton;


    @FindBy(name = "firstName")
    public WebElement firstNameInput;


    @FindBy(name = "lastName")
    public WebElement lastNameImput;


    @FindBy(id = "staff-birthDate")
    public WebElement birthDateInput;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneInput;


    @FindBy(xpath = "//*[text()='Phone number is required.']")
    public WebElement phoneNumberIsRequired;

    @FindBy(id = "staff-gender")
    public WebElement genderDropdown;


    @FindBy(id = "staff-bloodGroup")
    public WebElement bloodGroupDropdown;


    @FindBy(id = "staff-adress")
    public WebElement addressInput;


    @FindBy(id = "staff-description")
    public WebElement descriptionInput;


    @FindBy(name = "createdDate")
    public WebElement createdDateInput;

    @FindBy(name = "user.id")
    public WebElement userInput;

    @FindBy(id = "staff-country")
    public WebElement countryDropdown;

    @FindBy(id = "staff-cstate")
    public WebElement stateOrCityDropdown;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(id = "cancel-save")
    public WebElement backButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement invalidFeedbackForStaffCreated;
//*[text()='Field User cannot be empty!']

    @FindBy(xpath = "//*[text()='This field is required.']")
    public WebElement validFeedbackForStaffCreated;

    @FindBy(xpath = "//*[text()='User found with search SSN']")
    public WebElement validFeedbackForSearchSSN;

//  @FindBy(xpath = "//*[text()='A new Staff is created with identifier 4364']") //ve bu baska sayfada
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement validFeedbackForSearchSSNAndCreated;

    @FindBy(id= "hospitalmsappfrontendApp.staff.home.createOrEditLabel")
    public WebElement createOrEditAStaffHead;



}
