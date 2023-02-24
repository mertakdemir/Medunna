package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)

public class AppointmentPostRequestPojo {

    private String appoSpeciality;
    private String birthDate;
    private String appointmentEmail;
    private String firstName;
    private String gender;
    private String lastName;
    private String phone;
    private String snumber;
    private String appointmentSsn;
    private String startDate;

    public AppointmentPostRequestPojo(String appoSpeciality, String birthDate, String appointmentEmail, String firstName, String gender, String lastName, String phone, String snumber, String appointmentSsn, String startDate) {
        this.appoSpeciality = appoSpeciality;
        this.birthDate = birthDate;
        this.appointmentEmail = appointmentEmail;
        this.firstName = firstName;
        this.gender = gender;
        this.lastName = lastName;
        this.phone = phone;
        this.snumber = snumber;
        this.appointmentSsn = appointmentSsn;
        this.startDate = startDate;
    }

    public AppointmentPostRequestPojo() {
    }

    public String getAppoSpeciality() {
        return appoSpeciality;
    }

    public void setAppoSpeciality(String appoSpeciality) {
        this.appoSpeciality = appoSpeciality;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAppointmentEmail() {
        return appointmentEmail;
    }

    public void setAppointmentEmail(String appointmentEmail) {
        this.appointmentEmail = appointmentEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }

    public String getAppointmentSsn() {
        return appointmentSsn;
    }

    public void setAppointmentSsn(String appointmentSsn) {
        this.appointmentSsn = appointmentSsn;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "AppointmentPostRequestPojo{" +
                "appoSpeciality='" + appoSpeciality + '\'' +
                ", birthDate=" + birthDate +
                ", appointmentEmail='" + appointmentEmail + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", snumber='" + snumber + '\'' +
                ", appointmentSsn='" + appointmentSsn + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
