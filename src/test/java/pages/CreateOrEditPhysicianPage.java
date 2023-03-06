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


}
