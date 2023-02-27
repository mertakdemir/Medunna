package stepdefinitions.ui;

import io.cucumber.java.en.When;
import pages.HomePage;

public class US_006_TC_011_UI {

    HomePage homePage = new HomePage();

    @When("User does not enter {string} afters 3rd digit for phone number {string}")
    public void user_does_not_enter_afters_3rd_digit_for_phone_number(String symbol, String invalidPhoneNumber) {
        homePage.phoneNumberInputForAppointment.clear();
        homePage.phoneNumberInputForAppointment.sendKeys(invalidPhoneNumber);
    }
}
