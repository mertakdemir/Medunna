package pojos;

public class CTestPojo {
    private String createdBy;
    private String createdDate;
    private int id;
    private String name;
    private Object description;
    private String date;
    private PhysicianAppointment appointment;
    private Object ctestResults;

    public CTestPojo() {
    }

    public CTestPojo(String createdBy, String createdDate, int id, String name, Object description, String date, PhysicianAppointment appointment, Object ctestResults) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.appointment = appointment;
        this.ctestResults = ctestResults;
    }


    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public PhysicianAppointment getAppointment() {
        return appointment;
    }

    public void setAppointment(PhysicianAppointment appointment) {
        this.appointment = appointment;
    }

    public Object getCtestResults() {
        return ctestResults;
    }

    public void setCtestResults(Object ctestResults) {
        this.ctestResults = ctestResults;
    }


    @Override
    public String toString() {
        return "CTestPojo{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", description=" + description +
                ", date='" + date + '\'' +
                ", appointment=" + appointment +
                ", ctestResults=" + ctestResults +
                '}';
    }
}
