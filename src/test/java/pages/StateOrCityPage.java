package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StateOrCityPage {

    public StateOrCityPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "jh-create-entity")
    public WebElement createANewCountryInput;

   @FindBy(xpath = "//table//tbody//td[2]")
    public WebElement stateCityNameColumn;

   @FindBy(xpath = "//table[@class='table']//td")
    public WebElement stateCityAllTable;


}
