package stepdefinitions.ui;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import utilities.ReusableMethods;

public class US_006_TC_004_UI {

    HomePage homePage = new HomePage();
    @When("User enters different ssn than the registered ssn {string}")
    public void user_enters_different_ssn_than_the_registered_ssn(String differentSSN) {
        homePage.ssnInputForAppointment.clear();
        homePage.ssnInputForAppointment.sendKeys(differentSSN);

    }
    @Then("Verify that warning message for the ssn input is displayed")
    public void verify_that_warning_message_for_the_ssn_input_is_displayed() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(homePage.SSNWarningMessage.isDisplayed());
    }
}
