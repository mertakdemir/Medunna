package stepdefinitions.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AdminMessagePage;
import pages.HomePage;
import pages.StaffMyPage;
import utilities.ReusableMethods;

public class US_028_TC_001_UI {

    HomePage homePage=new HomePage();
    AdminMessagePage adminMessagePage=new AdminMessagePage();

    @Then("user clicks on itemsAndTitles button icon")
    public void user_clicks_on_items_and_titles_button_icon() {
        homePage.itemsAndTitles.click();
    }
    @Then("user clicks on Messages option from itemsAndTitles")
    public void user_clicks_on_messages_option_from_items_and_titles() {
        adminMessagePage.itemsAndTitlesMessage.click();
    }
    @Then("user clicks create a new message")
    public void user_clicks_create_a_new_message() {
        adminMessagePage.createNewMessage.click();
    }
    @Then("user enters name to create message")
    public void user_enters_name_to_create_message() {
       adminMessagePage.createMessageName.sendKeys("dilara");
    }
    @Then("user enters email to create message")
    public void user_enters_email_to_create_message() {
        adminMessagePage.createMessageEmail.sendKeys("melis@hotmail.com");
    }
    @Then("user enters subject to create message")
    public void user_enters_subject_to_create_message() {
        adminMessagePage.createMessageSubject.sendKeys("past invoice");
    }
    @Then("user enters message to create message")
    public void user_enters_message_to_create_message() {
        adminMessagePage.createMessageMessage.sendKeys("payment on 06/02/2023");
    }
    @Then("user clicks on save button to create or edit message")
    public void user_clicks_on_save_button_to_create_or_edit_message() {
        adminMessagePage.saveCreatingMessage.click();
    }
    @And("user clicks view button to see message")
    public void userClicksViewButtonToSeeMessage() {
        adminMessagePage.viewMessage.click();
        ReusableMethods.waitFor(3);
    }
       @Then("user clicks edit button for update")
    public void user_clicks_edit_button_for_update() {
        adminMessagePage.viewMessageAndEdit.click();
    }
    @Then("user enters new data for update")
    public void user_enters_new_data_for_update() {
        adminMessagePage.createMessageName.clear();
        adminMessagePage.createMessageName.sendKeys("aras");
        adminMessagePage.createMessageEmail.clear();
        adminMessagePage.createMessageEmail.sendKeys("melis@hotmail.com");
        adminMessagePage.createMessageSubject.clear();
        adminMessagePage.createMessageSubject.sendKeys("invoice update");
        adminMessagePage.createMessageMessage.clear();
        adminMessagePage.createMessageMessage.sendKeys("completed payment on 09/02/2023");
    }
    @Then("user clicks save button icon to update")
    public void user_clicks_save_button_icon_to_update() {
        adminMessagePage.saveCreatingMessage.click();
    }
    @Then("user clicks delete button icon")
    public void user_clicks_delete_button_icon() {
        adminMessagePage.deleteMessage.click();
    }


}
