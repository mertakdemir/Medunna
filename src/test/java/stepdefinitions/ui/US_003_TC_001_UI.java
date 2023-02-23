package stepdefinitions.ui;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.RegisterPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US_003_TC_001_UI {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();


//"Ws2!dmt" - @US03_TC01


    @Given("user enters stronger password {string} in the new password input")
    public void user_enters_stronger_password_in_the_new_password_input(String psw1) {
        ReusableMethods.waitFor(4);
        registerPage.newPasswordRegister.sendKeys(psw1);
        registerPage.confirmPasswordRegister.sendKeys(psw1);
    }

    @Then("verify that the user sees the password strength level is five.")
    public void verify_that_the_user_sees_the_password_strength_level_is_five() {
        ReusableMethods.waitFor(4);
        assertTrue(registerPage.passwordStrengthLevel5.isDisplayed());
    }




//"ws2!dmt" - @US03_TC02

    @Given("user eters strong password {string}")
    public void user_eters_strong_password(String psw2) {
        ReusableMethods.waitFor(4);
        registerPage.newPasswordRegister.sendKeys(psw2);
        registerPage.confirmPasswordRegister.sendKeys(psw2);

    }

    @Then("verify that the user sees that the password strength level is four.")
    public void verify_that_the_user_sees_that_the_password_strength_level_is_four() {
        ReusableMethods.waitFor(4);
        assertTrue(registerPage.passwordStrengthLevel4.isDisplayed());
    }

    //"WS2!DMT" - @US03_TC03

    @Given("user enters {string} with uppercase,numbers and special character in new password input")
    public void user_enters_with_uppercase_numbers_and_special_character_in_new_password_input(String psw3) {
        ReusableMethods.waitFor(4);
       registerPage.newPasswordRegister.sendKeys(psw3);
        registerPage.confirmPasswordRegister.sendKeys(psw3);
    }

    @Then("verify that the user sees that the password strength level is four..")
    public void verify_that_the_user_sees_that_the_password2_strength_level_is_four() {
        ReusableMethods.waitFor(4);
        assertTrue(registerPage.passwordStrengthLevel4.isDisplayed());
    }

//"WS2aDMT" - @US03_TC04

    @Given("user enters {string} uppercase and lowercase letters and numbers in the new password input")
    public void user_enters_uppercase_and_lowercase_letters_and_numbers_in_the_new_password_input(String psw4) {
        ReusableMethods.waitFor(4);
        registerPage.newPasswordRegister.sendKeys(psw4);
        registerPage.confirmPasswordRegister.sendKeys(psw4);
}



// "Ws2!" -@US03_TC05

    @Given("user enters is strong and using four characters in total {string} enters new password.")
    public void user_enters_is_strong_and_using_four_characters_in_total_enters_new_password(String psw5) {
        ReusableMethods.waitFor(4);
        registerPage.newPasswordRegister.sendKeys(psw5);
        registerPage.confirmPasswordRegister.sendKeys(psw5);
    }

    @Then("verify that the user sees that the password strength level is one.")
    public void verify_that_the_user_sees_that_the_password_strength_level_is_one() {
        ReusableMethods.waitFor(4);
        assertTrue(registerPage.passwordStrengthLevel1.isDisplayed());
    }



//"2222234" -  @US03_TC06
    @Given("user just enters digit {string} in new password input")
    public void user_just_enters_digit_in_new_password_input(String psw6) {
        ReusableMethods.waitFor(4);
        registerPage.newPasswordRegister.sendKeys(psw6);
        registerPage.confirmPasswordRegister.sendKeys(psw6);
}
    @Then("verify the Password strength level first")
    public void verify_the_password_strength_level_first() {
        ReusableMethods.waitFor(4);
        assertTrue(registerPage.passwordStrengthLevel1.isDisplayed());
    }


//  "Ws3" - @US03_TC07

    @Given("user enters {string} in the new password input")
    public void user_enters_in_the_new_password_input(String psw7) {
        ReusableMethods.waitFor(4);
        registerPage.newPasswordRegister.sendKeys(psw7);
        registerPage.confirmPasswordRegister.sendKeys(psw7);
    }
    @Then("verify {string} text is visibles.")
    public void verify_text_is_visibles(String psw9) {
        ReusableMethods.waitFor(4);
      registerPage.invalidFeedbackPassword.getText().contains(psw9);
    }


//"ws ?dmt" -@US03_TC08

    @Given("user enters space {string} as character in new password input")
    public void user_enters_space_as_character_in_new_password_input(String psw8) {
        ReusableMethods.waitFor(4);
        registerPage.newPasswordRegister.sendKeys(psw8);
        registerPage.confirmPasswordRegister.sendKeys(psw8);
    }
    @Then("verify that the user sees that the password strength level is two.")
    public void verify_that_the_user_sees_that_the_password_strength_level_is_two() {
        ReusableMethods.waitFor(4);
        assertTrue(registerPage.passwordStrengthLevel2.isDisplayed());
    }


// "w345678"

    @Given("the user enters yedi characters {string} consisting of a letter and numbers in the new password input")
    public void the_user_enters_yedi_characters_consisting_of_a_letter_and_numbers_in_the_new_password_input(String psw9) {
        ReusableMethods.waitFor(4);
        registerPage.newPasswordRegister.sendKeys(psw9);
        registerPage.confirmPasswordRegister.sendKeys(psw9);
    }

    @Then("verify the Password strength level")
    public void verify_the_password_strength_level() {
        ReusableMethods.waitFor(4);
        assertTrue(registerPage.passwordStrengthLevel2.isDisplayed());
    }



}
