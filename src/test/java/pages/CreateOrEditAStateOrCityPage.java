package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateOrEditAStateOrCityPage {
    public CreateOrEditAStateOrCityPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "c-state-name")
    public WebElement nameInput;

    @FindBy(id = "c-state-createdDate")
    public WebElement createdDateInput;


    @FindBy(name = "state.id")
    public WebElement stateOrCityDropdown;

   @FindBy(id = "save-entity")
    public WebElement saveButton;

   @FindBy(name = "cancel-save")
    public WebElement backLink;
//Field translation-not-found[hospitalmsappfrontendApp.CState.country] cannot be empty!


    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement failCreateCityPopupMessage;

}
