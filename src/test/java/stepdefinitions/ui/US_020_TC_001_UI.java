package stepdefinitions.ui;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US_020_TC_001_UI {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminCreateOrEditAStaffPage createOrEditAStaffPage= new AdminCreateOrEditAStaffPage();
   AdminStaffPage adminStaffPage= new AdminStaffPage();

    RegisterPage registerPage = new RegisterPage();
    AdminAdministrationPage adminAdministrationPage = new AdminAdministrationPage();


//  @US_020_TC_001_UI
    @Given("Admin clicks on Staff link")
    public void admin_clicks_on_staff_link() {
        homePage.staffLink.click();
    }
    @Given("Admin click Create a new Staff link")
    public void admin_click_create_a_new_staff_link() {
      adminStaffPage.createANewStaff.click();
    }
    @Given("Admin clicks on Use Search checkbox for staff")
    public void admin_clicks_on_use_search_checkbox_for_staff() {
      createOrEditAStaffPage.useSearchChechbox.click();
    }

    @Given("Admin enters the user {string} SSN for searching the existing staff")
    public void admin_enters_the_user_ssn_for_searching_the_existing_staff(String ssn) {
         createOrEditAStaffPage.ssnInput.sendKeys(ssn);
    }

    @Given("Admin clicks on Search User button for staff")
    public void admin_clicks_on_search_user_button_for_staff() {
        createOrEditAStaffPage.searchUserButton.click();
    }
    @Then("Verify that admin can search for personnel with SNN")
    public void verify_that_admin_can_search_for_personnel_with_snn() {
        ReusableMethods.waitFor(2);
       assertTrue(createOrEditAStaffPage.validFeedbackForSearchSSN.isDisplayed());
    }


    String firstName ="Feride";
    String laststName ="Toprak";
    String birthDay ="01-01-1988";
//  @US_020_TC_002_UI
//"state/City" DROPDOWN I US haric baska ülkeleri secmeye izin vermedigi icin fail ediyor 2. test case
    @Given("Admin fills all the blanks")
    public void Admin_fills_all_the_blanks() {

      createOrEditAStaffPage.birthDateInput.sendKeys("01-01-1988");
      createOrEditAStaffPage.phoneInput.sendKeys("9954333345");
        Driver.selectByVisibleText(createOrEditAStaffPage.genderDropdown,"FEMALE");
        Driver.selectByVisibleText(createOrEditAStaffPage.bloodGroupDropdown,"B+");
       createOrEditAStaffPage.addressInput.sendKeys("Mutlu street 5/6");
       createOrEditAStaffPage.descriptionInput.sendKeys("technitian");
       createOrEditAStaffPage.createdDateInput.sendKeys("07-03-2023");
        Driver.selectByVisibleText(createOrEditAStaffPage.countryDropdown,"Spain");
        Driver.selectByVisibleText(createOrEditAStaffPage.stateOrCityDropdown,"Madrid");

    }
    /*
    @Then("Verify that all information has been filled")
    public void verify_that_all_information_has_been_filled() {
        ReusableMethods.waitFor(3);

       assertTrue(createOrEditAStaffPage.firstNameInput.isDisplayed());
       assertTrue(createOrEditAStaffPage.firstNameInput.isDisplayed());
       assertTrue(createOrEditAStaffPage.lastNameImput.getText().contains("Toprak"));
       assertTrue(createOrEditAStaffPage.birthDateInput.getText().contains("01-01-1988"));
       assertTrue(createOrEditAStaffPage.phoneInput.getText().contains("9954333345"));
       assertTrue(createOrEditAStaffPage.genderDropdown.getText().contains("FEMALE"));
       assertTrue(createOrEditAStaffPage.bloodGroupDropdown.getText().contains("B+"));
       assertTrue(createOrEditAStaffPage.addressInput.getText().contains("Mutlu street 5/6"));
       assertTrue(createOrEditAStaffPage.descriptionInput.getText().contains("technitian"));
       assertTrue(createOrEditAStaffPage.createdDateInput.getText().contains("07-03-2023"));
       assertTrue(createOrEditAStaffPage.countryDropdown.getText().contains("Spain"));
       assertTrue(createOrEditAStaffPage.stateOrCityDropdown.getText().contains("Madrid"));

    }


     */
//   @US_020_TC_003_UI
    @Given("Admin select user from the existing users on the staff table")
    public void admin_select_user_from_the_existing_users_on_the_staff_table() {
        adminStaffPage.staffTableIdRow.click();

    }


    Faker faker = new Faker();
    String fakeSsn;
    String fakeFirstName;
    String fakeLastName;
    String fakeUserName;
    String fakeEmail;
    String pwd = "Fe34?up";




    //    @US_020_TC_004_UI
@Given("User goes to the {string} page")
public void user_goes_to_the_page(String url) {
    Driver.getDriver().get(ConfigReader.getProperty(url));
}
    @When("User clicks on user icon")
    public void user_clicks_on_user_icon() {
        ReusableMethods.waitFor(1);
        homePage.userIcon.click();

    }
    @When("User clicks on Register option")
    public void user_clicks_on_register_option() {
        ReusableMethods.waitFor(1);
        homePage.registerOption.click();
    }
    @When("User enters valid ssn in ssn input")
    public void user_enters_valid_ssn_in_ssn_input() {
        ReusableMethods.waitFor(1);
        fakeSsn = faker.idNumber().ssnValid();
        registerPage.snnRegister.sendKeys(fakeSsn);
    }
    @When("User enters valid first name in first name input")
    public void user_enters_valid_first_name_in_first_name_input() {
        fakeFirstName = faker.name().firstName();
        registerPage.firstNameRegister.sendKeys(fakeFirstName);
    }
    @When("User enters valid last name in last name input")
    public void user_enters_valid_last_name_in_last_name_input() {
        fakeLastName = faker.name().lastName();
        registerPage.lastNameRegister.sendKeys(fakeLastName);
    }
    @When("User enters valid username in username input")
    public void user_enters_valid_username_in_username_input() {
        fakeUserName = faker.name().username();
        registerPage.usernameRegister.sendKeys(fakeUserName);
    }
    @When("User enters valid email in email input")
    public void user_enters_valid_email_in_email_input() {
        fakeEmail = faker.internet().emailAddress();
        registerPage.emailRegister.sendKeys(fakeEmail);
    }
    @When("User enters new password in new password input")
    public void user_enters_new_password_in_new_password_input() {
        ReusableMethods.waitFor(1);
        registerPage.newPasswordRegister.sendKeys(pwd);
    }
    @When("User enters password again in new password confirmation")
    public void user_enters_password_again_in_new_password_confirmation() {
        ReusableMethods.waitFor(1);
        registerPage.confirmPasswordRegister.sendKeys(pwd);

    }
    @When("User clicks register button")
    public void user_clicks_register_button() {
        ReusableMethods.waitFor(1);
        JSUtils.clickElementByJS(registerPage.registerButtonRegister);

    }
    @Then("verify new user registered  user successfully")
    public void verify_new_user_registered_user_successfully() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.registerSuccessMessage.isDisplayed());

    }
    @Then("User clicks user icon and Sign in option to login as admin")
    public void user_clicks_user_icon_and_sign_in_option_to_login_as_admin() {
        ReusableMethods.waitFor(1);
        homePage.userIcon.click();
        ReusableMethods.waitFor(1);
        homePage.signInOption.click();
    }

//    000

    @When("Admin clicks on Administration option")
    public void admin_clicks_on_administration_option() {
        ReusableMethods.waitFor(1);
        adminAdministrationPage.administrationIcon.click();
    }
    @When("Admin clicks on User management option")
    public void admin_clicks_on_user_management_option() {
        adminAdministrationPage.userManagementIcon.click();
    }



    /*
    @When("Admin clicks on Created date column to sort users")
    public void admin_clicks_on_created_date_column_to_sort_users() {
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(adminAdministrationPage.createdDateButton);
    }
 */

    @When("Admin clicks on last registered page button of created user")
    public void admin_clicks_on_last_registered_page_button_of_created_user() {
        adminAdministrationPage.lastRegisteredPage.click();
    }




    @When("Admin clicks on Edit button of created user")
    public void admin_clicks_on_edit_button_of_created_user() {
        JSUtils.clickElementByJS(adminAdministrationPage.lastRegisteredPageLastRowEditButton);
    }
    @When("Admin clicks on activate check box")
    public void admin_clicks_on_activate_check_box() {
        if (!adminAdministrationPage.activatedCheckBox.isSelected()){
            adminAdministrationPage.activatedCheckBox.click();
        }

    }
    @When("Admin select profiels for staff role option")
    public void admin_select_profiels_for_staff_role_option() {
      Driver.selectByValue(adminAdministrationPage.profilesRolesDropdown,"ROLE_STAFF");
    }
    @When("Admin clicks on save button for activate user")
    public void admin_clicks_on_save_button_for_activate_user() {
      JSUtils.clickElementByJS(adminAdministrationPage.saveButtonAktivatedAndProfiles);
    }
    @Then("verify user has been activated staff")
    public void verify_user_has_been_activated_staff() {
        ReusableMethods.waitFor(3);
   assertTrue(adminAdministrationPage.activatedSuccessMessage.isDisplayed());
    }

    @Then("Admin click on Created date option on the staff table")
    public void admin_click_on_created_date_option_on_the_staff_table() {
     adminStaffPage.CreatedDateTableHead.click();
    }


    @Given("Admin clicks on Edit button for editing the staff")
    public void admin_clicks_on_edit_button_for_editing_the_staff() {

        ReusableMethods.waitFor(1);
        Driver.getDriver().navigate().refresh();
         adminStaffPage.editButton.click();
    }
    @Then("Verify that Admin is able to edit a staff")
    public void verify_that_admin_is_able_to_edit_a_staff() {
        ReusableMethods.waitFor(3);
       assertTrue(createOrEditAStaffPage.createOrEditAStaffHead.isEnabled());
    }


//   @US_020_TC_005_UI

    @Given("Admin clicks on Delete button for editing the staff")
    public void admin_clicks_on_delete_button_for_editing_the_staff() {
    adminStaffPage.deleteButton.click();
    ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(adminStaffPage.confirmDeleteOption);
        ReusableMethods.waitFor(2);
    }
    @Then("Verify that Admin is able to delete a staff")
    public void verify_that_admin_is_able_to_delete_a_staff() {
        ReusableMethods.waitFor(3);
     assertTrue(adminStaffPage.deleteSuccessMessage.isDisplayed());
    }



}
