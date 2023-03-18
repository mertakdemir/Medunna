package stepdefinitions.ui;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.TestItemCreationPage;
import pages.TestItemsPage;

public class US_018_TC_001_UI {
    HomePage homePage = new HomePage();
    TestItemCreationPage testItemPage =new TestItemCreationPage();
    TestItemsPage testItemsPage= new TestItemsPage();
    @Then("user clicks on test item option")
    public void user_clicks_on_test_item_option() {
        homePage.testItems.click();
    }
    @Then("user clicks on Create a new Test Item button")
    public void user_clicks_on_create_a_new_test_item_button() {
        testItemPage.createNewTestItemButton.click();
    }
    @Then("user verifies name input is displayed")
    public void user_verifies_name_input_is_displayed() {
     Assert.assertTrue(testItemPage.nameLabel.isDisplayed());
    }
    @Then("user verifies Description input is displayed")
    public void user_verifies_description_input_is_displayed() {
        Assert.assertTrue(testItemPage.descriptionLabel.isDisplayed());
    }
    @Then("user verifies price input is displayed")
    public void user_verifies_price_input_is_displayed() {
        Assert.assertTrue(testItemPage.priceLabel.isDisplayed());
    }
    @Then("user verifies Default Min. Value input is displayed")
    public void user_verifies_default_min_value_input_is_displayed() {
        Assert.assertTrue(testItemPage.defaultMinValueLabel.isDisplayed());
    }
    @Then("user verifies Default Max. Value input is displayed")
    public void user_verifies_default_max_value_input_is_displayed() {
        Assert.assertTrue(testItemPage.defaultMaxValueLabel.isDisplayed());
    }

    @Then("user enters {string} in name input")
    public void user_enters_in_name_input(String string) {
     testItemPage.nameInput.sendKeys("glucose");
    }
    @Then("user enters {string} in description input")
    public void user_enters_in_description_input(String string) {
        testItemPage.descriptionInput.sendKeys("fructose");
    }
    @Then("user enters {string} in price input")
    public void user_enters_in_price_input(String string) {
        testItemPage.priceInput.sendKeys("50");
    }
    @Then("user enters {string} in Default Min. Value input")
    public void user_enters_in_default_min_value_input(String string) {
        testItemPage.defaultMinValueInput.sendKeys("5");
    }
    @Then("user enters {string} in Default Max. Value input")
    public void user_enters_in_default_max_value_input(String string) {
      testItemPage.defaultMaxValueInput.sendKeys("15");
    }
    @Then("user click on Save button")
    public void user_click_on_save_button() {
      testItemPage.saveButton.click();
    }
    @Then("user verifies Test Items are visible")
    public void user_verifies_test_items_are_visible() {
     Assert.assertTrue(testItemsPage.TestItemsText.isDisplayed());
    }
    @Then("user click on Created Date")
    public void user_click_on_created_date()  {
        testItemsPage.createdDateOption.click();


    }
    @Then("user clicks on Delete button")
    public void user_clicks_on_delete_button()  {
      //  testItemsPage.deleteButton.click();

    }
    @Then("user confirm delete item")
    public void user_confirm_delete_item() {
     testItemsPage.confirmDelete.click();
    }


    @Then("user verifies Created Date input is displayed as MM\\/DAY\\/YEAR")
    public void userVerifiesCreatedDateInputIsDisplayedAsMMDAYYEAR() {
        Assert.assertTrue(testItemPage.createdDateLabel.isDisplayed());
    }
}
