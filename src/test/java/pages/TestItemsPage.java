package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestItemsPage {
    public TestItemsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "c-test-item-heading")
    public WebElement TestItemsText;

    @FindBy(xpath = " //*[ text() ='Created Date']")
    public WebElement createdDateOption;

    @FindBy(xpath = "(//span[.='Delete'])[1]")
    public WebElement deleteButton;

    @FindBy(id = "jhi-confirm-delete-cTestItem")
    public  WebElement confirmDelete;


}
