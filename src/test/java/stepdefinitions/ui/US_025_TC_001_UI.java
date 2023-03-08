package stepdefinitions.ui;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import utilities.ReusableMethods;

public class US_025_TC_001_UI {

    LoginPage loginPage = new LoginPage();
    HomePage homePage;

    @Then("user\\(patient) enters valid username {string} in username input")
    public void user_patient_enters_valid_username_in_username_input(String username) {
        ReusableMethods.waitFor(3);
        loginPage.usernameInput.sendKeys(username);

    }


    @Then("user\\(patient) enters valid password {string} in password input")
    public void user_patirent_enters_valid_password_in_password_input(String password) {
        loginPage.passwordInput.sendKeys(password);
    }

    @Then("user clicks on My Pages\\(Patient)")
    public void user_clicks_on_my_pages_patient() {

        homePage = new HomePage();
        homePage.myPagesButtonPatient.click();


    }

}
