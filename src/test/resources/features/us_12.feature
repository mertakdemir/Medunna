

Feature: US_012 My Appointments Edit portal by Physician(Doctor)

  Background: Sign in Medunna

    Given user is on the home page :  "https://medunna.com"
    When user clicks on user icon
    Then user clicks on Sign In Button
    And user enters valid username "doctorJames" in username input
    And user enters valid password "James1234." in password input
    And user clicks on Remember Me checkbox
    And user clicks on Sign In submit Button
    And user clicks on My Pages
    And user clicks on My Appointments
    And user clicks on Edit button


  @US012_TC01
  Scenario: TC_001 User (doctor) should be able to populate info in 'Create or edit an appointment'
    Then verify Create or Edit an Appointment text is visible


  @US012_TC02
  Scenario: TC_002 If you are updating an appointment, then user (doctor) should see patient's info such as
  id, start and end date, Status, physician
    Then verify patient id is visible
    Then verify start date is visible
    Then verify end date is visible
    Then verify status is visible
    Then verify physician is visible



  @US012_TC03
  Scenario: TC_003 doctor should type in Anamnesis, Treatment, and Diagnosis as required fields

    And user fills in Anamnesis field with "Anamnesistext"
    And user fills in Treatments field with "Treatmentstext"
    And user fills in Diagnosis field with "Diagnosistext"
    And user clicks on save button
    And verify Anamnesis text which is written by user is visible
    And verify Treatments text which is written by user is visible
    And verify Diagnosis text which is written by user is visible
    Then verify appointment is saved with Appointments text is visible.


  @US012_TC04
  Scenario: TC_004 doctor should type in Anamnesis, Treatment, and Diagnosis as required fields

    And user fills in Anamnesis field with "Anamnesistext"
    And user fills in Treatments field with "Treatmentstext"
    And user does not fill Diagnosis field
    And user clicks on save button
    Then verify "This field is required." text is visible.


  @US012_TC05
  Scenario: TC_005 prescription and description can be optional

    And user fills in Anamnesis field with "Anamnesistext"
    And user fills in Treatments field with "Treatmentstext"
    And user fills in Diagnosis field with "Diagnosistext"
    And user fills Prescription field with "Prescriptiontext"
    And user fills Description field with "Descriptiontext"
    And user clicks on save button
    Then verify appointment is saved with Appointments text is visible.


  @US012_TC06
  Scenario: TC_006 prescription and description can be optional

    And user fills in Anamnesis field with "Anamnesistext"
    And user fills in Treatments field with "Treatmentstext"
    And user fills in Diagnosis field with "Diagnosistext"
    And user does not fill Prescription field
    And user does not fill Description field
    And user clicks on save button
    Then verify appointment is saved with Appointments text is visible.



  @US012_TC07
  Scenario: TC_007 Status can be only selected as PENDING, COMPLETED or CANCELLED by Doctor

    And User selects status as "COMPLETED"
    And user fills in Anamnesis field with "Anamnesistext"
    And user fills in Treatments field with "Treatmentstext"
    And user fills in Diagnosis field with "Diagnosistext"
    And user fills Prescription field with "Prescriptiontext"
    And user fills Description field with "Descriptiontext"
    And user clicks on save button
    Then verify status is "COMPLETED"



  @US012_TC08
  Scenario: TC_008 Status can be only selected as PENDING, COMPLETED or CANCELLED by Doctor

    And User selects status as "PENDING"
    And user fills in Anamnesis field with "Anamnesistext"
    And user fills in Treatments field with "Treatmentstext"
    And user fills in Diagnosis field with "Diagnosistext"
    And user fills Prescription field with "Prescriptiontext"
    And user fills Description field with "Descriptiontext"
    And user clicks on save button
    Then verify status is "PENDING"



  @US012_TC09
  Scenario: TC_009 Status can be only selected as PENDING, COMPLETED or CANCELLED by Doctor

    And User selects status as "CANCELLED"
    And user fills in Anamnesis field with "Anamnesistext"
    And user fills in Treatments field with "Treatmentstext"
    And user fills in Diagnosis field with "Diagnosistext"
    And user fills Prescription field with "Prescriptiontext"
    And user fills Description field with "Descriptiontext"
    And user clicks on save button
    Then verify status is "CANCELLED"