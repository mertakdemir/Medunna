package stepdefinitions.ui;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import utilities.ReusableMethods;

public class US_006_TC_007_UI {

    HomePage homePage = new HomePage();

    @When("User does not enter email {string}")
    public void user_does_not_enter_email(String emptyEmail) {
        homePage.emailInputForAppointment.clear();
        homePage.emailInputForAppointment.sendKeys(emptyEmail);
    }
    @Then("Verify that warning message for email input is displayed")
    public void verify_that_warning_message_for_email_input_is_displayed() {

        ReusableMethods.waitFor(2);
        Assert.assertTrue(homePage.emailWarningMessage.isDisplayed());
    }
}
