package pages;

import io.cucumber.java.bs.I;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateOrEditPhysicianPage {

    public CreateOrEditPhysicianPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "useSSNSearch")
    public WebElement useSearchChechbox;

    @FindBy(id = "searchSSN")
    public WebElement ssnInput;

    @FindBy(xpath = "//button[.='Search User']")
    public WebElement searcUserButton;

    @FindBy(id = "physician-firstName")
    public WebElement firstNameInput;

    @FindBy(id = "physician-lastName")
    public WebElement lastNameInput;

    @FindBy(id = "physician1-birthDate")
    public WebElement birthDateInput;

    @FindBy(id = "physician-phone")
    public WebElement phoneInput;

    @FindBy(id = "physician-speciality")
    public WebElement specialityDropdown;

    @FindBy(id = "file_image")
    public WebElement fileImageInput;

    @FindBy(id = "physician-examFee")
    public WebElement examFeeInput;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "(//span[.='Back'])[1]")
    public WebElement backButton;

}
