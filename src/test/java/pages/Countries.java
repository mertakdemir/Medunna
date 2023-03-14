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

}
