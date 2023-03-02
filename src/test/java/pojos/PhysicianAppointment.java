package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PhysicianAppointment {
    private String createdBy;
    private String createdDate;
    private int id;
    private String startDate;
    private String endDate;
    private String status;
    private String anamnesis;
    private String treatment;
    private String diagnosis;
    private Object prescription;
    private Object description;
    private PhysicianPojo physician;
    private Patient patient;
    private Object ctests;

    public PhysicianAppointment() {
    }

    public PhysicianAppointment(String createdBy, String createdDate, int id, String startDate, String endDate, String status, String anamnesis, String treatment, String diagnosis, Object prescription, Object description, PhysicianPojo physician, Patient patient, Object ctests) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.anamnesis = anamnesis;
        this.treatment = treatment;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.description = description;
        this.physician = physician;
        this.patient = patient;
        this.ctests = ctests;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Object getPrescription() {
        return prescription;
    }

    public void setPrescription(Object prescription) {
        this.prescription = prescription;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public PhysicianPojo getPhysician() {
        return physician;
    }

    public void setPhysician(PhysicianPojo physician) {
        this.physician = physician;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Object getCtests() {
        return ctests;
    }

    public void setCtests(Object ctests) {
        this.ctests = ctests;
    }

    @Override
    public String toString() {
        return "PhysicianAppointment{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status='" + status + '\'' +
                ", anamnesis='" + anamnesis + '\'' +
                ", treatment='" + treatment + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", prescription=" + prescription +
                ", description=" + description +
                ", physician=" + physician +
                ", patient=" + patient +
                ", ctests=" + ctests +
                '}';
    }
}
