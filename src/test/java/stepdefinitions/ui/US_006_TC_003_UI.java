package stepdefinitions.ui;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_006_TC_003_UI {

    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());
    @When("User does not enter any character for the first name {string}")
    public void user_does_not_enter_any_character_for_the_first_name(String firstNameWithDigits) {
        homePage.firstNameInputForAppointment.clear();
        homePage.firstNameInputForAppointment.sendKeys(firstNameWithDigits);
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);

    }
}
