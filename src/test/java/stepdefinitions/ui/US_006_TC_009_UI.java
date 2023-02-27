package stepdefinitions.ui;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import utilities.ReusableMethods;

public class US_006_TC_009_UI {

    HomePage homePage = new HomePage();

    @When("User enters less than {int} digits for phone number {string}")
    public void user_enters_less_than_digits_for_phone_number(Integer int1, String invalidPhoneNumber) {

        homePage.phoneNumberInputForAppointment.clear();
        homePage.phoneNumberInputForAppointment.sendKeys(invalidPhoneNumber);
    }

    @Then("Verify that invalid phone number message for phone number input is displayed")
    public void verifyThatInvalidPhoneNumberMessageForPhoneNumberInputIsDisplayed() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(homePage.phoneNumberInvalidMessage.isDisplayed());
    }
}
