package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateOrEditACountryPage {
  public CreateOrEditACountryPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "country-name")
    public WebElement nameInput;

    @FindBy(id = "country-createdDate")
    public WebElement createdDateInput;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(id = "cancel-save")
    public WebElement backLink;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement popup;

  @FindBy(id = "jhi-confirm-delete-country")
  public WebElement confirmDeleteOperation;

}
