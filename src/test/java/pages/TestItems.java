package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestItems {
    public TestItems () {PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(id = "1753")
    public WebElement testInsulinButton;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveTestPhysician;

    @FindBy(xpath = "//span[.='COMPLETED']")
    public WebElement verifyStatusCompleted;

    @FindBy(xpath = "//span[.='Payment / Invoice Process']")
    public WebElement paymentInvoiceProcessButton;

    @FindBy(xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement paymentInvoiceProcessButton1;

//////////////////////////////// Appointement invoice

    @FindBy(xpath = "//th[.='Exam Fee:']")
    public WebElement examFeeAppoVisibility;

    @FindBy(xpath = "//th[.='570']")
    public WebElement examFeePriceBoxVisibility;

    /* @FindBy(xpath = "(//table//thead//tr//td[2])[1]")
     public WebElement testItemFeeVisibility;

    @FindBy(xpath = "(//table//thead//tr//td[2])[2]")
     public WebElement testItemFeePriceBoxVisibility;
 */
    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement createInvoiceButton;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveCreatingInvoice;

    @FindBy(xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement requestTestButtonPhysician;

    //// physician datebox
    @FindBy(id= "fromDate")
    public WebElement fromDateBoxPhysician;

    @FindBy(id= "toDate")
    public WebElement toDateBoxPhysician;

    @FindBy(xpath= "//th[.='PAYMENT DETAIL']")
    public WebElement paymentDetailVerify;




}