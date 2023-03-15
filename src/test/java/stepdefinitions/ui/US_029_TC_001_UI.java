package stepdefinitions.ui;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.*;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_029_TC_001_UI {


    HomePage homePage = new HomePage();
    Countries countries = new Countries();
    CreateOrEditACountryPage createOrEditACountryPage = new CreateOrEditACountryPage();
    StateOrCityPage stateOrCityPage = new StateOrCityPage();
    CreateOrEditAStateOrCityPage createOrEditAStateOrCityPage = new CreateOrEditAStateOrCityPage();

    // @US_029_TC_001_UI
    @Given("Admin clicks on Country link")
    public void admin_clicks_on_country_link() {
      homePage.countryLink.click();
    }
    @Given("Admin click Create a new Country link")
    public void admin_click_create_a_new_country_link() {
      countries.createANewCountryInput.click();
    }
    @Given("Admin enters new country name {string} on the name ınput")
    public void admin_enters_new_country_name_on_the_name_ınput(String countryName) {
      createOrEditACountryPage.nameInput.sendKeys(countryName);
    }
    @Given("Admin clicks on Save button")
    public void admin_clicks_on_save_button() {
     createOrEditACountryPage.saveButton.click();
    }

    @And("Admin enters Created Date {string} on the name ınput")
    public void adminEntersCreatedDateOnTheNameInput(String createDate) {
        createOrEditACountryPage.createdDateInput.sendKeys(createDate);

    }

    @Then("verify created country success messaj")
    public void verifyCreatedCountrySuccessMessaj() {
        ReusableMethods.waitFor(2);
        assertTrue(countries.successCreateCountrPopup.isDisplayed());
    }

    //   @US_029_TC_002_UI
    @And("Admin clicks on StateOrCity link")
    public void adminClicksOnStateOrCityLink() {
        homePage.stateOrCityLink.click();
    }

    @And("Admin click Create a new State or City link")
    public void adminClickCreateANewStateOrCityLink() {
        stateOrCityPage.createANewCountryInput.click();
    }

    @And("Admin enters new city name {string} on the name ınput")
    public void adminEntersNewCityNameOnTheNameInput(String cityName) {
       createOrEditAStateOrCityPage.nameInput.sendKeys(cityName);
    }

    @And("Admin select the country name admin created")
    public void adminSelectCountryNameAdminCreated() {
        Driver.selectByVisibleText(createOrEditAStateOrCityPage.stateOrCityDropdown,"Italy");
    }



    @And("Admin clicks on Save button on the create a new StateCity page")
    public void adminClicksOnSaveButtonOnTheCreateANewStateCityPage() {
        createOrEditAStateOrCityPage.saveButton.click();
    }

    @Then("verify the city was created")
    public void verifyTheCityWasCreated() {
//       ReusableMethods.getElementsText((List<WebElement>) stateOrCityPage.stateCityNameColumn);


/*
createOrEditAStateOrCityPage.backLink.click();
ReusableMethods.waitFor(2);
        String entireTable = Driver.getDriver().findElements(By.xpath("//table[@class='table']")).toString();
        System.out.println(entireTable);



        List<WebElement> allTableElements = Driver.getDriver().findElements(By.xpath("//table[@class='table']//td"));
        for (WebElement eachElement : allTableElements){
            System.out.println(eachElement.getText());

        }

 */
    }

    }




