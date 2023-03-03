@US_24_Test

Feature: US_24 Payment Invoice by Staff
 @US_24_TC01_UI
 Scenario: Navigating payment invoice by staff
  Given user is on "medunna_url" page
  Then enter first name for appointment on homepage
  And enter last name for appointment on homepage
  And enter ssn for appointment on homepage
  And enter email name for appointment on homepage
  And enter phone name for appointment on homepage
  And enter appointment datetime for appointment on homepage
  And click on make an Appointment button on homepage
  Then click on user icon
  And click on Sign In option
  And enter "melissu" in username input
  And enter "melissu90" in password input
  And user clicks on Sign In submit Button icon
  And staff clicks on My Pages Button icon
  And staff clicks on Search Patient option
  And staff enters the Patient faker SSN  for search
  And staff clicks Show appointment button icon
  Then click on edit button for appointment
  And click status pending
  And click to choose physician Dr Erol
  And click to save button for appointment
  And clickss on Sign Out option
  Then clickss on user icon
  And clickss on Sign In option
  And enter "dr-erolbey" in username input
  And enter "erol123" in password input
  And user clicks on Sign In submit Button icon
  And user-physician click on MyPages
  And user-physician click on My Appointments
  And physician clicks datefrom box
  And physician clicks dateTo box
  And physician clicks on patient edit button
  And user clickss on Request a test button
  And physician clicks insulin button
  And physician clicks save button
  Then physician clicks status Completed
  And physician enters anamnesis
  And physician enters Treatment
  And physician enters Diagnosis
  And physician enters Prescription
  And physician enters Description
  And physician clicks save button
  And click on user icon
  And clickss on Sign Out option
  Then click on user icon
  And click on Sign In option
  And enter "melissu" in username input
  And enter "melissu90" in password input
  And user clicks on Sign In submit Button icon
  And staff clicks on My Pages Button icon
  And staff clicks on Search Patient option
  And staff enters the Patient faker SSN  for search
  And staff clicks Show appointment button icon
  And verify status Completed or Canceled is displayed
  And staff clicks Payment Invoice button icon
  And verify visibility of Exam fee and test item prices
  Then verify the invoice is displayed
  And click on create invoice button
  And click on save button for create invoice
  And close the application



