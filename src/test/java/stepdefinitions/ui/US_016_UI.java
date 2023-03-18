package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LoginPage;
import pages.PatientsPage;
import pages.PhysicianAppointmentPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_016_UI {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    PatientsPage patientsPage= new PatientsPage();
    PhysicianAppointmentPage physicianAppointmentPage = new PhysicianAppointmentPage();
    Actions actions = new Actions(Driver.getDriver());
    ReusableMethods reusableMethods =new ReusableMethods();
    Faker faker =new Faker();


    @When("Admin clicks on Items&Titles option")
    public void adminClicksOnItemsTitlesOption() {
        homePage.itemsAndTitles.click();
    }

    @And("Admin chooses patient on Items&Titles")
    public void adminChoosesPatientOnItemsTitles() {
        homePage.patientOption.click();
    }
    @And("Admin clicks on Create new Patient button")
    public void adminClicksOnCreateNewPatientButton()  {
        JSUtils.clickElementByJS(patientsPage.createANewPatient);

    }

    @And("Admin enters First Name")
    public void adminEntersFirstName() {
        patientsPage.patientFirstNameInput.sendKeys(faker.name().firstName());
    }

    @And("Admin enters Last Name")
    public void adminEntersLastName() {
        patientsPage.patientLastNameInput.sendKeys(faker.name().lastName());
    }

    @And("Admin enters birthdate")
    public void adminEntersBirthdate() {
        patientsPage.patientBirthDate.sendKeys("11-14-2000");

    }

    @And("Admin enters email")
    public void adminEntersEmail() {
        patientsPage.emailInput.sendKeys(faker.internet().emailAddress());
    }

    @And("Admin enters phone number")
    public void adminEntersPhoneNumber() {
        patientsPage.patientPhoneInput.sendKeys("701-980-7655");
    }

    @And("Admin chooses a gender")
    public void adminChooseAGender() {
        new Select(patientsPage.patientGender).selectByVisibleText("FEMALE");
    }

    @And("Admin chooses a blood group")
    public void adminChooseABloodGroup() {
        new Select(patientsPage.patientBloodGroup).selectByVisibleText("A+");
    }

    @And("Admin enters an address")
    public void adminEntersAnAddress() {
        patientsPage.patientAddress.sendKeys("3 RUE");
    }

    @And("Admin enters a description")
    public void adminEntersADescription() {
        patientsPage.patientDescription.sendKeys("Covid");
    }

    @And("Admin chooses a country")
    public void adminChoosesACountry() {
        new Select(patientsPage.patientCountry).selectByVisibleText("USA");
    }

    @And("Admin chooses a state or city")
    public void adminChoosesAStateCity() {
        new Select(patientsPage.patientState).selectByVisibleText("NEWYORK");
    }

    @And("Admin clicks save button")
    public void adminClicksSaveButton() {
        JSUtils.clickElementByJS(patientsPage.saveButton);
    }

    @Then("Admin verifies that the patient is created")
    public void adminVerifiesThatThePatientIsCreated() {
        Assert.assertTrue(patientsPage.patientCreatedAlert.isDisplayed());
    }


    @And("user chooses patient on Items&Titles")
    public void userChoosesPatientOnItemsTitles()  {
        new Select(patientsPage.createANewPatient).selectByVisibleText("Patient");

    }

    @And("Admin leaves the state section empty")
    public void adminLeavesTheStateSectionEmpty() {

    }

    @Then("Admin verifies that the patient could not be created")
    public void adminVerifiesThatThePatientCouldNotBeCreated() {
    }

    @When("user clicks on Items&Titles option")
    public void userClicksOnItemsTitlesOption() {
        homePage.itemsAndTitles.click();
    }

    @And("user clicks patient on Items&Titles")
    public void userClicksPatientOnItemsTitles() {
        homePage.patientOption.click();
    }
    @And("user clicks on Create new Patient button")
    public void userClicksOnCreateNewPatientButton() {
        patientsPage.createANewPatient.click();

    }

    @And("user  enters First Name")
    public void userEntersFirstName() {
        patientsPage.patientFirstNameInput.sendKeys(faker.name().firstName());
    }

    @And("user enters Last Name")
    public void userEntersLastName() {
        patientsPage.patientLastNameInput.sendKeys(faker.name().lastName());
    }

    @And("user enters birthdate")
    public void userEntersBirthdate() {
        patientsPage.patientBirthDate.sendKeys("11-18-1984");
    }

    @And("user enters email")
    public void userEntersEmail() {
        patientsPage.emailInput.sendKeys(faker.internet().emailAddress());
    }

    @And("user enters phone number")
    public void userEntersPhoneNumber() {
        patientsPage.patientPhoneInput.sendKeys("701-980-7655");
    }

    @And("user chooses a gender")
    public void userChoosesAGender() {
        new Select(patientsPage.patientGender).selectByVisibleText("MALE");
    }

    @And("user chooses a blood group")
    public void userChoosesABloodGroup() {
        new Select(patientsPage.patientBloodGroup).selectByVisibleText("A+");
    }

    @And("user enters an address")
    public void userEntersAnAddress() {
        patientsPage.patientAddress.sendKeys(faker.address().streetAddress());
    }

    @And("user enters a description")
    public void userEntersADescription() {
        patientsPage.patientDescription.sendKeys("Flue");
    }

    @And("user chooses a country")
    public void userChoosesACountry() {
        new Select(patientsPage.patientCountry).selectByVisibleText("USA");
    }

    @And("user leaves the state section empty")
    public void userLeavesTheStateSectionEmpty() {
        new Select(patientsPage.patientState).selectByVisibleText("");
    }

    @And("user clicks save button")
    public void userClicksSaveButton() {
        JSUtils.clickElementByJS(patientsPage.saveButton);
    }

    @Then("user  verifies that the patient could not be created")
    public void userVerifiesThatThePatientCouldNotBeCreated() {
        Assert.assertFalse(patientsPage.patientCreatedAlert.isDisplayed());
    }

    @And("Admin clicks on a patient view button")
    public void adminClicksOnAPatientViewButton() {
        patientsPage.patientViewButton.click();
    }
    @Then("Admin verifies that patient id above is displayed")
    public void adminVerifiesThatPatientIdAboveIsDisplayed() {
        Assert.assertTrue(patientsPage.patientID.isDisplayed());
    }

    @And("Admin verifies that patient SSN is displayed")
    public void adminVerifiesThatPatientSSNIsDisplayed() {
        Assert.assertTrue(patientsPage.patientSSN.isDisplayed());
    }

    @And("Admin verifies that patient First Name is displayed")
    public void adminVerifiesThatPatientFirstNameIsDisplayed() {
        Assert.assertTrue(patientsPage.patientFirstName.isDisplayed());
    }

    @And("Admin verifies that patient Last Name is displayed")
    public void adminVerifiesThatPatientLastNameIsDisplayed() {
        Assert.assertTrue(patientsPage.patientLastName.isDisplayed());
    }

    @And("Admin verifies that patient Birth Date is displayed")
    public void adminVerifiesThatPatientBirthDateIsDisplayed() {
        Assert.assertTrue(patientsPage.birthDateOfPatient.isDisplayed());
    }

    @And("Admin verifies that patient phone is displayed")
    public void adminVerifiesThatPatientPhoneIsDisplayed() {
        Assert.assertTrue(patientsPage.patientPhone.isDisplayed());
    }

    @And("Admin verifies that patient Gender is displayed")
    public void adminVerifiesThatPatientGenderIsDisplayed() {
        Assert.assertTrue(patientsPage.genderOfPatient.isDisplayed());
    }

    @And("Admin verifies that patient Blood Group is displayed")
    public void adminVerifiesThatPatientBloodGroupIsDisplayed() {
        Assert.assertTrue(patientsPage.bloodGroupOfPatient.isDisplayed());
    }

    @And("Admin verifies that patient Address is displayed")
    public void adminVerifiesThatPatientAddressIsDisplayed() {
        Assert.assertTrue(patientsPage.addressOfPatient.isDisplayed());
    }

    @And("Admin verifies that patient Description is displayed")
    public void adminVerifiesThatPatientDescriptionIsDisplayed() {
        Assert.assertTrue(patientsPage.descriptionOfPatient.isDisplayed());
    }

    @And("Admin verifies that patient Created Date is displayed")
    public void adminVerifiesThatPatientCreatedDateIsDisplayed() {
        Assert.assertTrue(patientsPage.createdDateOfPatient.isDisplayed());
    }

    @And("Admin verifies that patient Country is displayed")
    public void adminVerifiesThatPatientCountryIsDisplayed() {
        Assert.assertTrue(patientsPage.countryOfPatient.isDisplayed());
    }

    @And("Admin verifies that patient State is displayed")
    public void adminVerifiesThatPatientStateCityIsDisplayed() {
        Assert.assertTrue(patientsPage.stateOfPatient.isDisplayed());
    }

    @When("Admin clicks on Items-Titles")
    public void adminClicksOnItemsTitles() {
        homePage.itemsAndTitles.click();
    }


    @And("Admin clicks on Appointment")
    public void adminClicksOnAppointment() {
        homePage.appointmentOption.click();

    }

    @And("Admin clicks an ID of A patient")
    public void adminClicksAnIDOfAPatient() {
        patientsPage.firstAppointment.click();
    }

    @And("Admin clicks edit button for patient")
    public void adminClicksEditButtonForPatient() {
        patientsPage.editOfAppointment.click();
    }

    @And("Admin choose a doctor on physician")
    public void adminChooseADoctorOnPhysician() {
        new Select(patientsPage.physicianOfAppointment).selectByVisibleText("1324:Mike Anderson");
    }

    @And("Admin choose a patient on patient")
    public void adminChooseAPatientOnPatient() {
        new Select(patientsPage.patientOfAppointment).selectByVisibleText("1206:Patient John");
    }

    @And("Admin clicks save button of appointment")
    public void adminClicksSaveButtonOfAppointment() {
        JSUtils.clickElementByJS(patientsPage.saveButtonOfAppointment);
    }

    @Then("Admin verify that the doctor assigned the patient")
    public void adminVerifyThatTheDoctorAssignedThePatient() {
        Assert.assertTrue(patientsPage.alertOfCreatedAppointment.isDisplayed());
    }
}


