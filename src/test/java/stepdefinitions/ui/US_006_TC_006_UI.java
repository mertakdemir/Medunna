package stepdefinitions.ui;

import io.cucumber.java.en.*;
import pages.HomePage;

public class US_006_TC_006_UI {

    HomePage homePage = new HomePage();
    @When("User does not enter any character for the last name {string}")
    public void user_does_not_enter_any_character_for_the_last_name(String lastNameWithDigits) {
        homePage.lastNameInputForAppointment.clear();
        homePage.lastNameInputForAppointment.sendKeys(lastNameWithDigits);
    }
}
