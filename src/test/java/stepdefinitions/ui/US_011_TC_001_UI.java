package stepdefinitions.ui;


import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.PhysicianMyAppointmentsPage;
import utilities.ReusableMethods;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class US_011_TC_001_UI {
    LoginPage loginPage = new LoginPage();
    PhysicianMyAppointmentsPage physicianMyAppointmentsPage= new PhysicianMyAppointmentsPage();


    @When("user\\(doctor) enters valid username {string} in username input")
    public void user_doctor_enters_valid_username_in_username_input(String username) {
        loginPage.usernameInput.sendKeys(username);
    }

    @And("user\\(doctor) enters valid password {string} in password input")
    public void user_doctor_enters_valid_password_in_password_input(String password) {
        loginPage.passwordInput.sendKeys(password);
    }



    @Then("Verify user \\(doctor) can see the appointment list in {string}")
    public void verify_user_doctor_can_see_the_appointment_list_in(String string) {
        ReusableMethods.waitFor(3);
//        String fromText= physicianMyAppointmentsPage.timeSlots_from.getText();
//        String toText = physicianMyAppointmentsPage.timeSlots_to.getText();
//        System.out.println("Texts = " + fromText + toText);
//
//        assertTrue(physicianMyAppointmentsPage.timeSlots_from.isDisplayed());
//        assertTrue(physicianMyAppointmentsPage.timeSlots_to.isDisplayed());

    }

    @Then("Verify user \\(doctor) can see time slots in {string}")
    public void verify_user_doctor_can_see_time_slots_in(String string) {
        ReusableMethods.waitFor(3);
//        assertTrue(physicianMyAppointmentsPage.appointmentTable.isDisplayed());
        List<WebElement> allList  = (List) physicianMyAppointmentsPage.tableSize;

        System.out.println("Table Size = " + allList.size());
    }

}
