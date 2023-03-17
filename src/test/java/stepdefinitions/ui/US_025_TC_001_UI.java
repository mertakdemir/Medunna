package stepdefinitions.ui;

import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.PatientMyAppointmentsPage;
import pages.PhysicianAppointmentPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_025_TC_001_UI {

    LoginPage loginPage = new LoginPage();
    HomePage homePage;
    PatientMyAppointmentsPage patientMyAppointmentsPage;
    PhysicianAppointmentPage physicianAppointmentPage;

    Set<String> windowHandles =  Driver.getDriver().getWindowHandles();
//    String windowsPatient;
//    String windowsPhysician;

    List<String> expectedData;
    List<String> actualData;

    List<String> expectedTestResult;
    List<String> actualTestResult;

    @Then("user\\(patient) enters valid username {string} in username input")
    public void user_patient_enters_valid_username_in_username_input(String username) {
        ReusableMethods.waitFor(1);
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

    @And("user\\(Patient) clicks on My Appointments")
    public void userPatientClicksOnMyAppointments() {
        homePage.myAppointmentsButton.click();
        patientMyAppointmentsPage = new PatientMyAppointmentsPage();
        selectPatientAppointmentTime();
        ReusableMethods.waitFor(3);
    }

    @Then("verify see appointment text {string} in My Appointment Page")
    public void verifySeeAppointmentTextInMyAppointmentPage(String text) {
        assertTrue(patientMyAppointmentsPage.appointmentText.getText().contains(text));
        patientMyAppointmentsPage.appointmentText.isDisplayed();
    }


    @Then("verify see Show Tests Button")
    public void verify_see_show_tests_button() {
        for (WebElement w : patientMyAppointmentsPage.showTestButtons) {
            w.isDisplayed();
        }
        ReusableMethods.waitFor(5);

    }

    @When("user\\(patient) clicks Show Test Button")
    public void user_patient_clicks_show_test_button() {
        for (int i = 0; i < patientMyAppointmentsPage.showTestButtons.size(); i++) {
            patientMyAppointmentsPage.showTestButtons.get(i).click();
            ReusableMethods.waitFor(2);
            Driver.getDriver().navigate().back();
            selectPatientAppointmentTime();
            ReusableMethods.waitFor(3);
        }
    }

    @And("verify Tests page text {string} is displayed")
    public void verifyTestsPageTextIsDisplayed(String text) {
        ReusableMethods.waitFor(5);
        patientMyAppointmentsPage.showTestButton1.click();
        assertTrue(patientMyAppointmentsPage.testPageText.getText().contains(text));
        assertTrue(patientMyAppointmentsPage.testPageText.isDisplayed());
        ReusableMethods.waitFor(2);

        actualData = new ArrayList<>(); //Patient'in tum table body'sini actualData'ya atadik.
        for(int i=0; i<patientMyAppointmentsPage.testsTableBodyItems.size()-1; i++){
            actualData.add(patientMyAppointmentsPage.testsTableBodyItems.get(i).getText());
        }
        System.out.println("Actual Data = " + actualData);

    }

    @Given("open new window")
    public void openNewWindow() {
        //new window
        String windowsPatient = Driver.getDriver().getWindowHandle();

        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('https://www.medunna.com', '_blank');");

        String windowsPhysician = Driver.getDriver().getWindowHandle();

        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(windowsPatient)) {
                Driver.getDriver().switchTo().window(windowHandle);
            }
        }
        ReusableMethods.waitFor(3);
    }


    @Given("user\\(physician) enters valid username {string} in username input")
    public void user_physician_enters_valid_username_in_username_input(String userName) {
        loginPage.usernameInput.sendKeys(userName);
    }
    @Given("user\\(physisian) enters valid password {string} in password input")
    public void user_physisian_enters_valid_password_in_password_input(String password) {
        loginPage.passwordInput.sendKeys(password);
    }




    @And("user clicks on My Pages\\(Physician)")
    public void userClicksOnMyPagesPhysician() {
        homePage.myPagesButton.click();
        ReusableMethods.waitFor(1);

    }


    @And("user\\(physisian) clicks on My Appointments")
    public void userPhysisianClicksOnMyAppointments() {
        homePage.myAppointmentsButton.click();
        physicianAppointmentPage = new PhysicianAppointmentPage();
    }

    @And("user selects appointment time")
    public void userSelectsAppointmentTime() {
        ReusableMethods.waitFor(3);
        selectPhysicianAppointmentTime();
        ReusableMethods.waitFor(3);
   }

    @And("verify Tests page is displayed table items")
    public void verifyTestsPageIsDisplayedTableItems() {
        ReusableMethods.waitFor(3);
        physicianAppointmentPage.editButtons.get(0).click();
        ReusableMethods.waitFor(2);
        physicianAppointmentPage.showTestResultsButton.click();
        ReusableMethods.waitFor(2);

        expectedData = new ArrayList<>();//Physician'in tum table body'sini expectedData'ya atadik.
        for(int i=0; i<physicianAppointmentPage.testsTableBodyItems.size()-1; i++){
            expectedData.add(physicianAppointmentPage.testsTableBodyItems.get(i).getText());
        }
        System.out.println("Expected Data = " + expectedData);


    // verify Test table iceriklerini karsilastirdik
        for(int i=0; i< expectedData.size()-1; i++){
        assertEquals(expectedData.get(i), actualData.get(i));
        }

    }


    @When("user\\(patient) clicks View Result Button")
    public void userPatientClicksViewResultButton() {
        physicianAppointmentPage.viewResultsButton.click();
        assertTrue(physicianAppointmentPage.testResultsText.isDisplayed());

        expectedTestResult = new ArrayList<>();
        for(int i=0; i<physicianAppointmentPage.testsTableBodyItems.size()-1; i++){
            expectedTestResult.add(physicianAppointmentPage.testResultsTableBodyItems.get(i).getText());
        }
        System.out.println("Expected Test Result = " + expectedTestResult);

        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().window(windowHandles.stream().toList().get(0));
        patientMyAppointmentsPage.viewResultButton.click();
        assertTrue(patientMyAppointmentsPage.testResultsText.isDisplayed());

        actualTestResult = new ArrayList<>();
        for(int i=0; i<patientMyAppointmentsPage.testResultsTableBodyItems.size()-1; i++){
            actualTestResult.add(patientMyAppointmentsPage.testResultsTableBodyItems.get(i).getText());
        }
        System.out.println("Actual Test Result = " + actualTestResult);

        ReusableMethods.waitFor(2);

    // verfy
        for (int i=0; i<expectedTestResult.size(); i++) {
            assertEquals(expectedTestResult.get(i), actualTestResult.get(i));
        }

    // veryfy with test-ID in Tests Results Table--->>> farkili testlerin ayni test_id'sine ait oldugunu dogrulama
        assertEquals(patientMyAppointmentsPage.testResultsTests.get(0).getText(),
                     patientMyAppointmentsPage.testResultsTests.get(1).getText());

    }

    //invoice
    @When("user\\(patient) clicks Show Invoice Button")
    public void userPatientClicksShowInvoiceButton() {
        for (int i=0; i<patientMyAppointmentsPage.showInvoiceButtons.size(); i++) {
            patientMyAppointmentsPage.showInvoiceButtons.get(i).click();
            ReusableMethods.waitFor(2);
            Driver.getDriver().navigate().back();
        }

    }

    //invoice
    @Then("verify the Invoice Page {string}")
    public void verifyTheInvoicePage(String text) {
        for (int i=0; i<patientMyAppointmentsPage.showInvoiceButtons.size(); i++) {
            patientMyAppointmentsPage.showInvoiceButtons.get(i).click();
            assertTrue(patientMyAppointmentsPage.invoiceText.getText().contains(text));

            System.out.println("patientMyAppointmentsPage = " + patientMyAppointmentsPage.invoiceTableItems.size());
            assertEquals("Date", patientMyAppointmentsPage.invoiceTableItems.get(2).getText().substring(0,4));
            assertEquals("SSN", patientMyAppointmentsPage.invoiceTableItems.get(3).getText().substring(0,3));
            assertEquals("Name", patientMyAppointmentsPage.invoiceTableItems.get(4).getText().substring(0,4));
            assertEquals("Payment", patientMyAppointmentsPage.invoiceTableItems.get(5).getText().substring(0,7));
            assertEquals("Total Cost", patientMyAppointmentsPage.invoiceTableItems.get(6).getText().substring(0,10));

            assertTrue(patientMyAppointmentsPage.invoiceTableItems.get(3).getText().contains("SSN"));
            ReusableMethods.waitFor(2);
            Driver.getDriver().navigate().back();
        }
    }




    //methods
    public void selectPatientAppointmentTime(){
        patientMyAppointmentsPage.appointmentFromInput.clear();
        patientMyAppointmentsPage.appointmentFromInput.sendKeys("01.03.2023");
        patientMyAppointmentsPage.appointmentToInput.clear();
        patientMyAppointmentsPage.appointmentToInput.sendKeys("15.03.2023");

    }

    public void selectPhysicianAppointmentTime(){
        ReusableMethods.waitFor(3);
        physicianAppointmentPage.fromInput.clear();
        physicianAppointmentPage.fromInput.sendKeys("01.03.2023");
        physicianAppointmentPage.toInput.clear();
        physicianAppointmentPage.toInput.sendKeys("15.03.2023");
    }


}




