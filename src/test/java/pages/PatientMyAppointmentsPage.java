package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PatientMyAppointmentsPage {

    public PatientMyAppointmentsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//table/tbody//td[2]//a")
    public WebElement nameInTable;

    @FindBy(id = "register-submit")
    public WebElement appointmentRequest;








    @FindBy(xpath = "(//span[.='Edit'])[2]")
    public WebElement editAppointment;

    @FindBy(id="appointment-status")
    public WebElement appointmentStatus;



    //-------------zeynep---------------

    @FindBy(id = "appointment-heading")
    public WebElement appointmentText;

    @FindBy(xpath = "(//*[text()='Show Tests'])[1]")
    public WebElement showTestButton1;

    @FindBy(xpath = "//*[text()='Show Tests']")
    public List<WebElement> showTestButtons;

    @FindBy(xpath = "(//*[text()='Show Invoice'])[1]")
    public WebElement showInvoiceButtons1;

    @FindBy(xpath = "//*[text()='Show Invoice']")
    public List<WebElement> showInvoiceButtons;

    @FindBy(xpath = "//*[text()='Tests']")
    public WebElement testPageText;

    @FindBy(xpath = "//table[@class='table']//th")
    public List<WebElement> testsTableHeaderItems;

    @FindBy(xpath = "//table[@class='table']//td")
    public List<WebElement> testsTableBodyItems;

    @FindBy(xpath = "//span[.='View Results']")
    public WebElement viewResultButton;

    @FindBy(xpath = " //span[.='Test Results']")
    public WebElement testResultsText;

    @FindBy(xpath = "//table[@class='table']//th")
    public List<WebElement> testResultsTableHeaderItems;

    @FindBy(xpath = "//table[@class='table']//td")
    public List<WebElement> testResultsTableBodyItems;

    @FindBy(xpath = "//table[@class='table']//td[1]")
    public List<WebElement> testResultsIDs;

    @FindBy(xpath = "//table[@class='table']//td[2]")
    public List<WebElement> testResultsNames;

    @FindBy(xpath = "//table[@class='table']//td[3]")
    public List<WebElement> testResultsResults;

    @FindBy(xpath = "//table[@class='table']//td[4]")
    public List<WebElement> testResultsDefaultMinValues;

    @FindBy(xpath = "//table[@class='table']//td[5]")
    public List<WebElement> testResultsDefaultMaxValues;

    @FindBy(xpath = "//table[@class='table']//td[6]")
    public List<WebElement> testResultsTests;

    @FindBy(xpath = "//table[@class='table']//td[7]")
    public List<WebElement> testResultsDescriptions;

    @FindBy(xpath = "//table[@class='table']//td[8]")
    public List<WebElement> testResultsDates;

    @FindBy(xpath = "//*[text()='INVOICE']")
    public WebElement invoiceText;

    @FindBy(xpath = "//table[@class='table']//tr")
    public List<WebElement> invoiceTableItems;












}







