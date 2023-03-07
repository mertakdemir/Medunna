package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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



}
