@US_006_End_to_end
Feature: US_006
  @US_006_TC_001_UI
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
      | Leo | Caprio | 345-66-7346 | leocaprioo@gmail.com | 953-433-7751 | 26-02-2023 |


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
      |  | Gul | 345-66-7346 | yavuzgull@gmail.com | 954-433-7751 | 26-02-2023 |

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
      | 12313 | Gul | 345-66-7346 | yavuzzgull@gmail.com | 953-433-7751 | 26-02-2023 |

  @US_006_TC_004_UI
  Scenario Outline: New patients should not be able to make appointment with different SSN
    Given User goes to the "medunna_url"
    When User tries to log in
    And User scrolls all the way down
    And User enters valid first name "<firstName>"
    And User enters valid last name "<lastName>"
    And User enters different ssn than the registered ssn "<ssn>"
    And User enters valid email "<email>"
    And User enters valid phone number "<phoneNumber>"
    And User enters valid date "<date>"
    And User clicks on Send an Appointment Request button
    Then Verify that warning message for the ssn input is displayed
    And close the application
    Examples:
      | firstName | lastName | ssn | email | phoneNumber | date |
      | Yavuz | Gul | 345-66-1111 | yavuzzgull@gmail.com | 953-433-7751 | 26-02-2023 |

  @US_006_TC_005_UI
  Scenario Outline: New patients should not be able to make appointment without entering last name
    Given User goes to the "medunna_url"
    When User tries to log in
    And User scrolls all the way down
    And User enters valid first name "<firstName>"
    And User does not enter last name "<lastName>"
    And User enters valid ssn "<ssn>"
    And User enters valid email "<email>"
    And User enters valid phone number "<phoneNumber>"
    And User enters valid date "<date>"
    And User clicks on Send an Appointment Request button
    Then Verify that warning message for last name input is displayed
    And close the application

    Examples:
      | firstName | lastName | ssn | email | phoneNumber | date |
      | Yavuz || 345-66-7346 | yavuzgull@gmail.com | 954-433-7751 | 26-02-2023 |


  @US_006_TC_006_UI
  Scenario Outline: New patients should not be able to make appointment with providing digits for the last name
    Given User goes to the "medunna_url"
    When User tries to log in
    And User scrolls all the way down
    And User enters valid first name "<firstName>"
    And User does not enter any character for the last name "<lastName>"
    And User enters valid ssn "<ssn>"
    And User enters valid email "<email>"
    And User enters valid phone number "<phoneNumber>"
    And User enters valid date "<date>"
    And User clicks on Send an Appointment Request button
    Then Verify that warning message for last name input is displayed
    And close the application

    Examples:
      | firstName | lastName | ssn | email | phoneNumber | date |
      | Yavuz | 123123 | 345-66-7346 | yavuzzgull@gmail.com | 953-433-7751 | 26-02-2023 |


  @US_006_TC_007_UI
  Scenario Outline: New patients should not be able to make appointment without providing email
    Given User goes to the "medunna_url"
    When User tries to log in
    And User scrolls all the way down
    And User enters valid first name "<firstName>"
    And User enters valid last name "<lastName>"
    And User enters valid ssn "<ssn>"
    And User does not enter email "<email>"
    And User enters valid phone number "<phoneNumber>"
    And User enters valid date "<date>"
    And User clicks on Send an Appointment Request button
    Then Verify that warning message for email input is displayed
    And close the application
    Examples:
      | firstName | lastName | ssn | email | phoneNumber | date |
      | Leo | Caprio | 345-66-7346 || 953-433-7751 | 26-02-2023 |


  @US_006_TC_008_UI
  Scenario Outline: New patients should not be able to make appointment without providing phone number
    Given User goes to the "medunna_url"
    When User tries to log in
    And User scrolls all the way down
    And User enters valid first name "<firstName>"
    And User enters valid last name "<lastName>"
    And User enters valid ssn "<ssn>"
    And User enters valid email "<email>"
    And User does not enter phone number "<phoneNumber>"
    And User enters valid date "<date>"
    And User clicks on Send an Appointment Request button
    Then Verify that warning message for phone number input is displayed
    And close the application
    Examples:
      | firstName | lastName | ssn | email | phoneNumber | date |
      | Leo | Caprio | 345-66-7346 | yavuzzgull@gmail.com || 26-02-2023 |


  @US_006_TC_009_UI
  Scenario Outline: New patients should not be able to make appointment with providing less than 10 digits
    Given User goes to the "medunna_url"
    When User tries to log in
    And User scrolls all the way down
    And User enters valid first name "<firstName>"
    And User enters valid last name "<lastName>"
    And User enters valid ssn "<ssn>"
    And User enters valid email "<email>"
    And User enters less than 10 digits for phone number "<phoneNumber>"
    And User enters valid date "<date>"
    And User clicks on Send an Appointment Request button
    Then Verify that invalid phone number message for phone number input is displayed
    And close the application
    Examples:
      | firstName | lastName | ssn | email | phoneNumber | date |
      | Leo | Caprio | 345-66-7346 | yavuzzgull@gmail.com | 953-433-775 | 26-02-2023 |


  @US_006_TC_010_UI
  Scenario Outline: New patients should not be able to make appointment with providing more than 10 digits
    Given User goes to the "medunna_url"
    When User tries to log in
    And User scrolls all the way down
    And User enters valid first name "<firstName>"
    And User enters valid last name "<lastName>"
    And User enters valid ssn "<ssn>"
    And User enters valid email "<email>"
    And User enters more than 10 digits for phone number "<phoneNumber>"
    And User enters valid date "<date>"
    And User clicks on Send an Appointment Request button
    Then Verify that invalid phone number message for phone number input is displayed
    And close the application
    Examples:
      | firstName | lastName | ssn | email | phoneNumber | date |
      | Leo | Caprio | 345-66-7346 | yavuzzgull@gmail.com | 953-433-77555 | 26-02-2023 |


  @US_006_TC_011_UI
  Scenario Outline: New patients should not be able to make appointment without providing "-" after 3rd digit
    Given User goes to the "medunna_url"
    When User tries to log in
    And User scrolls all the way down
    And User enters valid first name "<firstName>"
    And User enters valid last name "<lastName>"
    And User enters valid ssn "<ssn>"
    And User enters valid email "<email>"
    And User does not enter "-" afters 3rd digit for phone number "<phoneNumber>"
    And User enters valid date "<date>"
    And User clicks on Send an Appointment Request button
    Then Verify that invalid phone number message for phone number input is displayed
    And close the application
    Examples:
      | firstName | lastName | ssn | email | phoneNumber | date |
      | Leo | Caprio | 345-66-7346 | yavuzzgull@gmail.com | 953433-7755 | 26-02-2023 |


  @US_006_TC_012_UI
  Scenario Outline: New patients should not be able to make appointment without providing "-" after 6th digit
    Given User goes to the "medunna_url"
    When User tries to log in
    And User scrolls all the way down
    And User enters valid first name "<firstName>"
    And User enters valid last name "<lastName>"
    And User enters valid ssn "<ssn>"
    And User enters valid email "<email>"
    And User does not enter "-" afters 6th digit for phone number "<phoneNumber>"
    And User enters valid date "<date>"
    And User clicks on Send an Appointment Request button
    Then Verify that invalid phone number message for phone number input is displayed
    And close the application
    Examples:
      | firstName | lastName | ssn | email | phoneNumber | date |
      | Leo | Caprio | 345-66-7346 | yavuzzgull@gmail.com | 953-4337755 | 26-02-2023 |


  @US_006_TC_001_Api
  Scenario: User should be able to send a Post Request
    Given Set the necessary path params to create an Appointment
    And Set the expected data with valid credentials "Patiennt", "Johhn", "426-58-9637", "patientjohn@gmail.com", "424-444-4444", "2024-02-21T00:00:00Z", "string", "2023-02-21T16:34:31.108Z", "male", "string"
    And Send the Post Request and get the response
    Then Verify the Status Code is 201
    Then Verify actual data's are matching with expected data's

