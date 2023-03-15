package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Countries {


    public Countries(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "jh-create-entity")
    public WebElement createANewCountryInput;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement successCreateCountrPopup;



    @FindBy(id = "jh-create-entity")
    public WebElement deleteoption;

   @FindBy(id = "jh-create-entity")
    public WebElement editoption;

   @FindBy(id = "jh-create-entity")
    public WebElement viewoption;

 //  //table//tbody//td[2]
//  //div[@class='Toastify__toast-body']
}
