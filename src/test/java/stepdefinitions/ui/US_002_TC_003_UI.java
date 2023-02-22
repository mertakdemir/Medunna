package stepdefinitions.ui;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.RegisterPage;

public class US_002_TC_003_UI {

    RegisterPage registerPage = new RegisterPage();

    @Given("user enters email without dot in password input")
    public void user_enters_email_without_dot_in_password_input() {
        registerPage.emailRegister.sendKeys("maryhotmailcom"+ Keys.ENTER);
    }
    @Given("verify email is invalid")
    public void verify_email_is_invalid() {
        Assert.assertTrue((registerPage.requiredEmailField.getText().contains("Your email is required."))||(registerPage.invalidEmailField.getText().contains("This field is invalid")));

    }



}
