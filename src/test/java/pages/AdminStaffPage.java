package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminStaffPage {

    public AdminStaffPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Create a new Staff']")
    public WebElement createANewStaff;

    @FindBy(xpath = "//table//tr")
    public WebElement staffTableRows;

    @FindBy(xpath = "//table//tr[1]//td[1]")
    public WebElement staffTableIdRow;


//first row "edit" buton:
    @FindBy(xpath = "//table//tr[1]//td[15]//span[text()='Edit']")
    public WebElement editButton;

    //first row "delete" buton:
    @FindBy(xpath = "//table//tr[1]//td[15]//span[text()='Delete']")
    public WebElement deleteButton;

    @FindBy(id= "jhi-confirm-delete-staff")
    public WebElement confirmDeleteOption;

    @FindBy(id= "hospitalmsappfrontendApp.staff.delete.question")
    public WebElement confirmDeleteQuestion;

   @FindBy(xpath= "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement deleteSuccessMessage;


    @FindBy(id= "//*[.='Cancel']")
    public WebElement confirmCancelOption;

   @FindBy(xpath = "//table//tr//th[11]//span[text()='Created Date']")
    public WebElement CreatedDateTableHead;
////*[text()='Created Date']
}
