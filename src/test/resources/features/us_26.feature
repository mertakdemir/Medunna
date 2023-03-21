Feature: US_026
  @US_026_TC_001_UI
  Scenario: Patient is able to create an appointment
    Given Patient goes to home page "medunna_url"
    When Patient clicks on user icon
    And Patient clicks on sign in option
    And Patient enters username "leocaprioo"
    And Patient enters password "leocaprioo123!"
    And Patient clicks on sign in button
    And Patient clicks on My Pages option
    And Patient clicks on Make an Appointment link
    And Patient enters valid first name "Leonardo"
    And Patient enters valid last name "Caprio"
    And Patient enters valid SSN "345-66-7346"
    And Patient enters valid email "leocaprioo@gmail.com"
    And Patient enters valid phone number "333-123-5555"
    And Patient enters valid date "12-31-2024"
    And Patient clicks on Send an Appointment Request button
    And Verify that appointment has been created via capturing screenshot
    And close the application