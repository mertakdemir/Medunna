package stepdefinitions.ui;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import pages.RegisterPage;
import utilities.ReusableMethods;

public class US_001_TC_003_UI {

    RegisterPage registerPage = new RegisterPage();

    @Given("user enters ssn which have eight digits in ssn input")
    public void user_enters_ssn_which_have_eight_digits_in_ssn_input() {
        registerPage.snnRegister.sendKeys("12345678"+ Keys.ENTER);

    }
}
