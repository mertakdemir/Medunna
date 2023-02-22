package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement snnRegister;

    @FindBy(id = "firstName")
    public WebElement firstNameRegister;

    @FindBy(id = "lastName")
    public WebElement lastNameRegister;

    @FindBy(id = "username")
    public WebElement usernameRegister;

    @FindBy(id = "email")
    public WebElement emailRegister;

    @FindBy(id = "firstPassword")
    public WebElement newPasswordRegister;

    @FindBy(id = "secondPassword")
    public WebElement confirmPasswordRegister;

    @FindBy(id = "register-submit")
    public WebElement registerButtonRegister;

    @FindBy(xpath = "//div[@style='pointer-events: none;']")
    public WebElement registerDone;


    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement invalidSsnField;


    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement invalidNameField;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement invalidUsernameField;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement invalidEmailField;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement requiredEmailField;



}
