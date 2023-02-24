package stepdefinitions.ui;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_006_TC_002_UI {

    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());
    @When("User does not enter first name {string}")
    public void user_does_not_enter_first_name(String emptyFirstName) {
        homePage.firstNameInputForAppointment.clear();
        homePage.firstNameInputForAppointment.sendKeys(emptyFirstName);
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
    }
    @Then("Verify that warning message for first name input is displayed")
    public void verify_that_warning_message_for_first_name_input_is_displayed() {
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).perform();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(homePage.firstNameWarningMessage.isDisplayed());
    }
}
