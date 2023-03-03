@US_028_Test
Feature: US_028_TC_001
  @US028_TC001_UI
  Scenario: TC001_medunna_admin_messages
    Given user is on the medunna page
    When user clicks on user icon button
    Then user clicks on Sign In Button icon
    And user enters username "melina" in username input
    And user enters password "melina90" in password input
    And user clicks on Remember me checkbox
    And user clicks on Sign In submit Button icon
    And user clicks on itemsAndTitles button icon
    And user clicks on Messages option from itemsAndTitles
    And user clicks create a new message
    And user enters name to create message
    And user enters email to create message
    And user enters subject to create message
    And user enters message to create message
    And user clicks on save button to create or edit message
    And user clicks view button to see message
    And user clicks edit button for update
    And user enters new data for update
    And user clicks save button icon to update
    And user clicks delete button icon
    Then close the application

  @US028_TC001_API
  Scenario: TC001_medunna_user_creating_and_reading_messages_using_API
    Given user sends post request "https://medunna.com/api/c-messages/" to create message
    Then user gets the message data to read

  @US028_TC001_DB
  Scenario: TC001_medunna_validate_messages_with_DB
    Given user connects to the database
    And user gets the column "*" from table "cmessage"
    Then verify table "cmessage" and column "email" contains data "arasataman@gmailcom"
    Then verify table "cmessage" and column "name" contains data "aras"
    Then verify table "cmessage" and column "subject" contains data "appointment"
    Then verify table "cmessage" and column "message" contains data "new appointment on 23/03/2023"
    And close the connection




