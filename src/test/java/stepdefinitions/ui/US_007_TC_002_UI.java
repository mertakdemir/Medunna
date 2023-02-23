package stepdefinitions.ui;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.UserInfoPage;

public class US_007_TC_002_UI {
    UserInfoPage userInfoPage =new UserInfoPage();
    @Then("user verify  user settings info  is unvisible")
    public void user_verify_user_settings_info_is_unvisible() {
        Assert.assertTrue(userInfoPage.signedUserIcon.isDisplayed());
    }

}
