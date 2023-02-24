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








}