package pages;

import io.cucumber.java.bs.I;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PhysicianPageAdmin {

    public PhysicianPageAdmin(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "jh-create-entity")
    public WebElement createPhysicianButton;

    @FindBy(xpath = "//table//tr[1]//td[18]//span[.='Edit']")
    public WebElement editButton;

    @FindBy(xpath = "//table//td[3]")
    public List<WebElement> tableOfPhysicians;

    @FindBy(xpath = "//table//th[13]//*[.='Created Date']")
    public WebElement createdDateOption;

    @FindBy(xpath = "(//*[@data-icon='trash'])[1]")
    public WebElement deleteButton;

    @FindBy(id = "jhi-confirm-delete-physician")
    public WebElement deleteConfirmationButton;

}
