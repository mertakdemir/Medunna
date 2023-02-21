package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.RegisterPage;

public class US_002_TC_002_UI {

    RegisterPage registerPage = new RegisterPage();

    @Given("user enters username which have a blank between the word in username input")
    public void user_enters_username_which_have_a_blank_between_the_word_in_username_input() {
       registerPage.usernameRegister.sendKeys("mary kl"+ Keys.ENTER);
    }
    @Given("verify username is invalid")
    public void verify_username_is_invalid() {
        Assert.assertTrue(registerPage.invalidUsernameField.getText().contains("Your username is invalid."));
    }

}
