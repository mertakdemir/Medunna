package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_002_TC_001_UI {

    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();
    Faker faker= new Faker();

    @Given("user is on the medunna page")
    public void user_is_on_the_medunna_page() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }




    @Given("user clicks on user icon button")
    public void user_clicks_on_user_icon_button() {
        homePage.userIcon.click();
    }

    @Given("user clicks on register option")
    public void user_clicks_on_register_option() {
        homePage.registerOption.click();

    }
    @Given("user enters ssn in ssn input")
    public void user_enters_ssn_in_ssn_input() {
        registerPage.snnRegister.sendKeys(faker.idNumber().ssnValid());

    }
    @Given("user enters first name in first name input")
    public void user_enters_first_name_in_first_name_input() {
        registerPage.firstNameRegister.sendKeys(faker.name().firstName());

    }
    @Given("user enters last name in last name input")
    public void user_enters_last_name_in_last_name_input() {
        registerPage.lastNameRegister.sendKeys(faker.name().lastName());

    }
    @Given("user enters username in the username input")
    public void user_enters_username_in_the_username_input() {
        registerPage.usernameRegister.sendKeys(faker.name().username());
    }
    @Given("user enters email in email input")
    public void user_enters_email_in_email_input() {
        registerPage.emailRegister.sendKeys(faker.internet().emailAddress());

    }
    @Given("user enters new password in the new password input")
    public void user_enters_new_password_in_the_new_password_input() {
        registerPage.newPasswordRegister.sendKeys("maryhappy1");

    }

    @Given("user enters new password configuration in the new password configuration")
    public void user_enters_new_password_configuration_in_the_new_password_configuration() {
        registerPage.confirmPasswordRegister.sendKeys("maryhappy1");

    }
    @Given("user clicks register button")
    public void user_clicks_register_button() {
        JSUtils.clickElementByJS(registerPage.registerButtonRegister);
    }

    @Given("verify the registration is done successfully")
    public void verify_the_registration_is_done_successfully() {
       Assert.assertTrue(registerPage.registerDone.getText().contains("Registration Saved"));
    }
}

