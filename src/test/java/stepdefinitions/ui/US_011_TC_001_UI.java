package stepdefinitions.ui;


import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.PhysicianAppointmentPage;
import utilities.ReusableMethods;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class US_011_TC_001_UI {
    LoginPage loginPage = new LoginPage();
    PhysicianAppointmentPage physicianAppointmentPage = new PhysicianAppointmentPage();


    @When("user\\(doctor) enters valid username {string} in username input")
    public void user_doctor_enters_valid_username_in_username_input(String username) {
            loginPage.usernameInput.sendKeys(username);
//        loginPage.usernameInput.sendKeys(username);
    }

    @And("user\\(doctor) enters valid password {string} in password input")
    public void user_doctor_enters_valid_password_in_password_input(String password) {
        loginPage.passwordInput.sendKeys(password);
    }



    @Then("Verify user \\(doctor) can see the appointment list in {string}")
    public void verify_user_doctor_can_see_the_appointment_list_in(String string) {
        ReusableMethods.waitFor(3);

        int allTable= physicianAppointmentPage.appointmentTable.size()-1;

       for(int i=0; i<allTable; i++){
        String items= physicianAppointmentPage.appointmentTable.get(i).getText();
           System.out.println( i+1  + ". items = " + items);
           assertTrue(physicianAppointmentPage.appointmentTable.get(i).isDisplayed());
       }

    }

    @Then("Verify user \\(doctor) can see time slots in {string}")
    public void verify_user_doctor_can_see_time_slots_in(String string) {
        ReusableMethods.waitFor(3);
        assertTrue(physicianAppointmentPage.fromText.isDisplayed());
        assertTrue(physicianAppointmentPage.toText.isDisplayed());
        assertTrue(physicianAppointmentPage.fromInput.isEnabled());
        assertTrue(physicianAppointmentPage.toInput.isEnabled());
        assertEquals("from", physicianAppointmentPage.fromText.getText());
        assertEquals("to", physicianAppointmentPage.toText.getText());


    }

}
