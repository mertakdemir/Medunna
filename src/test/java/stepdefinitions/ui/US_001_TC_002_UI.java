package stepdefinitions.ui;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage;
import utilities.ReusableMethods;

public class US_001_TC_002_UI {

    RegisterPage registerPage = new RegisterPage();

    @Given("user enters ssn which have no hyphen symbol in ssn input")
    public void user_enters_ssn_which_have_no_hyphen_symbol_in_ssn_input() {
        registerPage.snnRegister.sendKeys("123456789"+ Keys.ENTER);

    }
    @Given("verify ssn is invalid")
    public void verify_ssn_is_invalid() {
        Assert.assertTrue((registerPage.invalidSsnField.getText().contains("Your SSN is invalid")||(registerPage.invalidSsnField.getText().contains("Your SSN is required."))));


    }

}
