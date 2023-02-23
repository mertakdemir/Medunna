package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserInfoPage {
    public UserInfoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id ="account-menu")
    public WebElement signedUserIcon;
    @FindBy(partialLinkText = "Settings")
    public WebElement settingsOption;
    @FindBy(id ="settings-title")
    public WebElement settingsTitle;
    @FindBy(id = "firstName")
    public WebElement firstnameInput;
    @FindBy(id = "lastName")
    public WebElement lastnameInput;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

}
