package stepdefinitions.ui;

import io.cucumber.java.en.When;
import pages.HomePage;

public class US_006_TC_010_UI {

    HomePage homePage = new HomePage();

    @When("User enters more than {int} digits for phone number {string}")
    public void user_enters_more_than_digits_for_phone_number(Integer int1, String invalidPhoneNumber) {

        homePage.phoneNumberInputForAppointment.clear();
        homePage.phoneNumberInputForAppointment.sendKeys(invalidPhoneNumber);
    }
}
