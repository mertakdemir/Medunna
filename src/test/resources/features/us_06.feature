@US_006_TC_001_UI
  Feature: US_006_TC_001_UI
    Scenario Outline: New patients should make appointment to be processed in hospital
      Given User goes to the "medunna_url"
      When User tries to log in
      And User scrolls all the way down
      And User enters valid first name "<firstName>"
      And User enters valid last name "<lastName>"
      And User enters valid ssn "<ssn>"
      Then verify that ssn "<ssn>" is matching with user's
      And User enters valid email "<email>"
      And User enters valid phone number "<phoneNumber>"
      And User enters valid date "<date>"
      And User clicks on Send an Appointment Request button
      Then Verify that the appointment has been created
      And close the application
      Examples:
        | firstName | lastName | ssn | email | phoneNumber | date |
        | Leonardo | DiCaprio | 345-66-7123 | leonardadicaprio@gmail.com | 644-231-5879 | 2023-02-26 |


      @US_006_TC_002_UI
      Scenario Outline: New patients should not be able to make appointment without entering first name
        Given User goes to the "medunna_url"
        When User tries to log in
        And User scrolls all the way down
        And User does not enter first name "<firstName>"
        And User enters valid last name "<lastName>"
        And User enters valid ssn "<ssn>"
        And User enters valid email "<email>"
        And User enters valid phone number "<phoneNumber>"
        And User enters valid date "<date>"
        And User clicks on Send an Appointment Request button
        Then Verify that warning message for first name input is displayed
        And close the application

        Examples:
          | firstName | lastName | ssn | email | phoneNumber | date |
          |  | Gul | 455-76-8122 | yavuzgull@gmail.com | 954-433-7751 | 2023-03-01 |

    @US_006_TC_003_UI
    Scenario Outline: New patients should not be able to make appointment with providing digits for the first name
      Given User goes to the "medunna_url"
      When User tries to log in
      And User scrolls all the way down
      And User does not enter any character for the first name "<firstName>"
      And User enters valid last name "<lastName>"
      And User enters valid ssn "<ssn>"
      And User enters valid email "<email>"
      And User enters valid phone number "<phoneNumber>"
      And User enters valid date "<date>"
      And User clicks on Send an Appointment Request button
      Then Verify that warning message for first name input is displayed
      And close the application

      Examples:
        | firstName | lastName | ssn | email | phoneNumber | date |
        | 12313 | Gul | 455-76-8222 | yavuzzgull@gmail.com | 953-433-7751 | 2023-03-01 |

      @US_006_TC_001_Api
      Scenario: User should be able to send a Post Request
        Given Send the Post Request to the Appointment Post Request URL "https://medunna.com/api/appointments/request"
        Then Verify the Status Code is 201
        Then Verify that Appointment Post Request's actual data is matching with expected data




