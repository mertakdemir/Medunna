@US_008
  Feature:US_008 Patients should make appointment after logged in

    Background: Sign in Medunna
      Given user is on "medunna_url" page
      When click on user icon
      And click on Sign In option
      And enter "PatientJohn" in username input
      And enter "12345Pp9$*" in password input
      And click on Remember Me check box
      And click on Sign In submit button
      When click on MyPages
      And click on Make an Appointment


    @US_008_TC_001
    Scenario Outline: US_008_TC_001 When user click on Make an Appointment section First Name, Last Name, SSN, Email boxes should have been filled automatically.
      Then verify that "<First Name>", "<Last Name>", "<SSN>" , "<Email>" boxes are filled automatically
      Then close the application
      Examples:
      | First Name | Last Name |     SSN      | Email |
      | Patient    | John      | 456-58-9637  | patientjohn@gmail.com |


    @US_008_TC_002
    Scenario: US_008_TC_002 Appointment registration should be done successfully with the Default date in Appointment DateTime box.
      And enter a valid "444-444-4444" number in Phone box
      Then verify given default date in Appointment DateTime box is next day from the current date
      And click on Send an Appointment Request button
      Then verify appointment registration saved successfully
      Then close the application


    @US_008_TC_003
    Scenario: US_008_TC_003 User should be able to create an appointment successfully when provides a valid future date.
      And enter a valid "444-444-4444" number in Phone box
      And enter a random future date in Appointment DateTime box
      And click on Send an Appointment Request button
      Then verify appointment registration saved successfully
      Then close the application


    @US_008_TC_004
    Scenario: US_008_TC_004 User should not be able to create an appointment when provides current date.
      And enter a valid "444-444-4444" number in Phone box
      And enter current date in Appointment DateTime box
      And click on Send an Appointment Request button
      Then verify appointment registration is not saved successfully
      Then close the application


    @US_008_TC_005
    Scenario: US_008_TC_005 User should not be able to create an appointment when provides a past date.
      And enter a valid "444-444-4444" number in Phone box
      And enter a random past date in Appointment DateTime box
      And click on Send an Appointment Request button
      Then verify appointment registration is not saved successfully
      Then close the application


    @US_008_TC_006
    Scenario Outline: US_008_TC_006 Appointment DateTime box should not accept a non-numeric character.
      And enter a valid "<Phone>" number in Phone box
      And enter an "<Invalid Date>" in Appointment DateTime box
      Then verify providing "<Invalid Date>" cannot be entered in Appointment DateTime box
      Then close the application
      Examples:
        | Phone        |  Invalid Date |
        | 444-444-4444 |  hhhhAAbb     |
        | 444-444-4444 |  ****##&&     |


    @US_008_TC_007
    Scenario: US_008_TC_007 Phone number text box cannot be left blank.
      And enter a random future date in Appointment DateTime box
      And click on Send an Appointment Request button
      Then verify appointment cannot be saved successfully without providing a valid phone number.
      Then close the application


    @US_008_TC_008
    Scenario Outline: US_008_TC_008 The order of date should be in format yyyyMMdd.
     And enter a valid "<Phone>" number in Phone box
     And enter a "<Valid Date>" in Appointment DateTime box
     Then verify providing "<Valid Date>" format is in yearMMdd
     Then close the application
     Examples:
       | Phone        |  Valid Date |
       | 444-444-4444 |  2030/02/27 |











