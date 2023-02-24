package stepdefinitions.ui;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import utilities.ReusableMethods;

public class US_006_TC_008_UI {

    HomePage homePage = new HomePage();
    @When("User does not enter phone number {string}")
    public void user_does_not_enter_phone_number(String emptyPhoneNumber) {

        homePage.phoneNumberInputForAppointment.clear();
        homePage.phoneNumberInputForAppointment.sendKeys(emptyPhoneNumber);
    }
    @Then("Verify that warning message for phone number input is displayed")
    public void verify_that_warning_message_for_phone_number_input_is_displayed() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(homePage.phoneNumberWarningMessage.isDisplayed());
    }
}
