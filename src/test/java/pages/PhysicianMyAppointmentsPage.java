package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhysicianMyAppointmentsPage {

    //---------------zeynep------------

    @FindBy(id = "fromDate")
    public WebElement timeSlots_from;

    @FindBy(id = "toDate")
    public WebElement timeSlots_to;

    @FindBy(xpath = "//*[@class='table']//tbody")
    public WebElement appointmentTable;

    @FindBy(xpath = "//*[@class='table']//tbody/tr")
    public WebElement tableSize;


//span[text()='from']


}
