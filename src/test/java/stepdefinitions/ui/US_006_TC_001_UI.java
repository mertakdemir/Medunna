package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.RegisterPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_006_TC_001_UI {

    HomePage homePage = new HomePage();

    RegisterPage registerPage = new RegisterPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    String ssn;
    @When("User registers to the Medunna page for having appointment")
    public void user_registers_to_the_medunna_page_for_having_appointment() {
        ssn = faker.idNumber().ssnValid();
        String registerPassword = faker.internet().password();
        homePage.userIcon.click();
        homePage.registerOption.click();
        registerPage.snnRegister.sendKeys(ssn);
        registerPage.firstNameRegister.sendKeys(faker.name().firstName());
        registerPage.lastNameRegister.sendKeys(faker.name().lastName());
        registerPage.usernameRegister.sendKeys(faker.name().username());
        registerPage.emailRegister.sendKeys(faker.internet().emailAddress());
        registerPage.newPasswordRegister.sendKeys(registerPassword);
        registerPage.confirmPasswordRegister.sendKeys(registerPassword);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        registerPage.registerButtonRegister.click();
    }
    @When("User scrolls all the way down to be able to get the appointment")
    public void user_scrolls_all_the_way_down_to_be_able_to_get_the_appointment() {
        JSUtils.moveToElementJS(homePage.firstNameInputForAppointment);
    }
    @When("User enters valid first name {string}")
    public void user_enters_valid_first_name(String firstName) {
        homePage.firstNameInputForAppointment.sendKeys(firstName);
    }
    @When("User enters valid last name {string}")
    public void user_enters_valid_last_name(String lastName) {
        homePage.lastNameInputForAppointment.sendKeys(lastName);
    }
    @When("User enters valid ssn")
    public void user_enters_valid_ssn() {
        homePage.ssnInputForAppointment.sendKeys(ssn);
    }
    @Then("Verify that ssn is matching with the user's real ssn")
    public void verify_that_ssn_is_matching_with_the_user_s_real_ssn() {
        ReusableMethods.waitFor(1);
        Assert.assertEquals(ssn, homePage.ssnInputForAppointment.getText());
    }
    @Then("User enters valid email {string}")
    public void user_enters_valid_email(String email) {
        homePage.emailInputForAppointment.sendKeys(email);
    }
    @Then("User enters valid phone number {string}")
    public void user_enters_valid_phone_number(String phoneNumber) {
        homePage.phoneNumberInputForAppointment.sendKeys(phoneNumber);
    }
    @Then("User enters valid date {string}")
    public void user_enters_valid_date(String date) {
        homePage.dateInputForAppointment.sendKeys(date);
    }
    @Then("User click on Send on Appointment Request button")
    public void user_click_on_send_on_appointment_request_button() {
        homePage.sendAnAppointmentRequestButton.click();
    }
    @Then("Verify the appointment has been created")
    public void verify_the_appointment_has_been_created() {
        ReusableMethods.waitFor(3);
    }

}
