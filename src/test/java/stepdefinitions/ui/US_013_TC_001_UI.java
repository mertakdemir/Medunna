package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.PhysicianAppointmentPage;
import utilities.JSUtils;

public class US_013_TC_001_UI {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    PhysicianAppointmentPage physicianAppointmentPage = new PhysicianAppointmentPage();

    @And("user clicks on edit button")
    public void userClicksOnEditButton() {
        physicianAppointmentPage.editButton.click();
    }

    @Then("user clicks on Request a test button")
    public void userClicksOnRequestATestButton() {
        JSUtils.clickElementByJS(physicianAppointmentPage.requestATestButton);
    }

    @Then("user verifies Glucose checkmark option is clickable")
    public void userVerifiesGlucoseCheckmarkOptionIsClickable() {
        Assert.assertTrue(physicianAppointmentPage.glucoseCheckmark.isEnabled());
    }

    @Then("user verifies Urea checkmark option is clickable")
    public void userVerifiesUreaCheckmarkOptionIsClickable() {
        Assert.assertTrue(physicianAppointmentPage.ureaCheckmark.isEnabled());
    }

    @Then("user verifies Creatinine checkmark option is clickable")
    public void userVerifiesCreatinineCheckmarkOptionIsClickable() {
        Assert.assertTrue(physicianAppointmentPage.creatinineCheckmark.isEnabled());
    }

    @Then("user verifies Sodium checkmark option is clickable")
    public void userVerifiesSodiumCheckmarkOptionIsClickable() {
        Assert.assertTrue(physicianAppointmentPage.sodiumCheckmark.isEnabled());
    }

    @Then("user verifies Potassium checkmark option is clickable")
    public void userVerifiesPotassiumCheckmarkOptionIsClickable() {
        Assert.assertTrue(physicianAppointmentPage.potassiumCheckmark.isEnabled());
    }

    @Then("user verifies Total protein checkmark option is clickable")
    public void userVerifiesTotalProteinCheckmarkOptionIsClickable() {
        Assert.assertTrue(physicianAppointmentPage.totalProteinCheckmark.isEnabled());
    }

    @Then("user verifies Albumin checkmark option is clickable")
    public void userVerifiesAlbuminCheckmarkOptionIsClickable() {
        Assert.assertTrue(physicianAppointmentPage.albuminCheckmark.isEnabled());
    }

    @Then("user verifies Hemoglobin checkmark option is clickable")
    public void userVerifiesHemoglobinCheckmarkOptionIsClickable() {
        Assert.assertTrue(physicianAppointmentPage.hemoglobinCheckmark.isEnabled());
    }



}
