@US_006_TC_001_UI
  Feature: US_006_TC_001_UI
    Scenario Outline: New patients should make appointment to be processed in hospital
      Given User goes to the "medunna_url"
      When User registers to the Medunna page for having appointment
      And User scrolls all the way down to be able to get the appointment
      And User enters valid first name "<first name>"
      And User enters valid last name "<last name>"
      And User enters valid ssn
      Then Verify that ssn is matching with the user's real ssn
      And User enters valid email "<email>"
      And User enters valid phone number "<phone number>"
      And User enters valid date "<date>"
      And User click on Send on Appointment Request button
      Then Verify the appointment has been created
      And close the application

      Examples:
        | first name | last name | email | phone number | date |
        | Mert | Akdemir | mertsefa@gmail.com | 223-434-7777 | 2023-02-26 |
        | Sefa | Akdemir | sefaakdemir@gmail.com | 334-768-6511 | 2023-02-27 |
