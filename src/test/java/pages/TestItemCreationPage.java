package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestItemCreationPage {
    public TestItemCreationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "jh-create-entity")
    public WebElement createNewTestItemButton;

    @FindBy(id = "nameLabel")
    public WebElement  nameLabel;

    @FindBy(id = "descriptionLabel")
    public WebElement descriptionLabel;

    @FindBy(id = "priceLabel")
    public WebElement priceLabel;

    @FindBy(xpath =" //*[ text() ='Default Min. Value']")
    public WebElement defaultMinValueLabel;

    @FindBy(id = "defaultValMaxLabel")
    public WebElement defaultMaxValueLabel;

    @FindBy(id = "createdDateLabel")
    public WebElement createdDateLabel;

    @FindBy(id ="c-test-item-name")
    public WebElement nameInput;

    @FindBy(id = "c-test-item-description")
    public WebElement descriptionInput;

    @FindBy(id = "c-test-item-price")
    public WebElement priceInput;

    @FindBy(id = "c-test-item-defaultValMin")
    public WebElement defaultMinValueInput;

    @FindBy(id="c-test-item-defaultValMax")
    public WebElement defaultMaxValueInput;

    @FindBy(id = "save-entity")
    public WebElement saveButton;
}
