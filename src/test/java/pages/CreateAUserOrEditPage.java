package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateAUserOrEditPage {

    public CreateAUserOrEditPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "authorities")
    public WebElement assignRoleDropdown;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveButtonForEditPage;


}
