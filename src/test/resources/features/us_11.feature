@US_011_Testing
Feature:US_011

 @US_011_TC_001
  Scenario: Doctor views their appointments
    Given user is on the home page :  "https://medunna.com"
    When user clicks on user icon
    Then user clicks on Sign In Button
    And user(doctor) enters valid username "minikserce" in username input
    And user(doctor) enters valid password "User.123" in password input
    And user clicks on Remember Me checkbox
    And user clicks on Sign In submit Button
    And user clicks on My Pages
    And user clicks on My Appointments
    Then Verify user (doctor) can see the appointment list in "My Appointments"
    And close the application

  @US_011_TC_002
  Scenario: Doctor views their appointments
    Given user is on the home page :  "https://medunna.com"
    When user clicks on user icon
    Then user clicks on Sign In Button
    And user(doctor) enters valid username "minikserce" in username input
    And user(doctor) enters valid password "User.123" in password input
    And user clicks on Remember Me checkbox
    And user clicks on Sign In submit Button
    And user clicks on My Pages
    And user clicks on My Appointments
    Then Verify user (doctor) can see time slots in "My Appointments"
    And close the application


  @US_011_TC_003_API
  Scenario: Doctor views their appointments with API
    Given Set the url
    When Set the expected data with pojo
    And Send the request and get the response
    And Get the actual data
    Then Do assertion how many appointments does the physician have

  @US_011_TC_004_API
  Scenario: Doctor views their appointments with API
    Given Set the url
    When Set the expected data with pojo
    And Send the request and get the response
    And Get the actual data
    Then Do assertion patient id, start date, end date, status etc.


  @US_011_TC_005_API
  Scenario: Doctor views their appointments with API
    Given Set the url
    When Set the expected data with pojo
    And Send the request and get the response
    And Get the actual data
    Then Do assertion patients' physician are the same

  @US_011_TC_006_DB
  Scenario: Doctor views their appointments with DB
    Given user(doctor) connects to the database
    And crate a statement
    And user (doctor) gets the column "*" from table "public.appointment.physician_id"
    Then Verify the "Physician" column contains the expected data "Sezen"
    And close the database connection