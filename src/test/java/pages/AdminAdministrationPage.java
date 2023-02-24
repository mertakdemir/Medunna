package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminAdministrationPage {

    public AdminAdministrationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//table//th[8]")
    public WebElement createdDateOption;

    @FindBy(xpath = "//table//tr[4]//td[2]")
    public WebElement lastRegisteredUserName;

    @FindBy(xpath = "//table//tr[4]//td[5]")
    public WebElement deActivateButton;

    @FindBy(xpath = "//table//tr[4]//td[11]//span[.='Edit']")
    public WebElement editOption;

    @FindBy(xpath = "//table//tr[4]//td[7]//span")
    public WebElement roleOfUser;

    @FindBy(xpath = "//span[.='Administration']")
    public WebElement administrationIcon;

    @FindBy(xpath = "//*[.='Create a new user']")
    public WebElement createNewUser;

    //Create or edit a user

    @FindBy(id = "login")
    public WebElement loginUserName;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(xpath = "//*[.='ROLE_PATIENT']")
    public WebElement rolePatient;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;












}
