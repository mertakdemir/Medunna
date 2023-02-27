@US_24_Test

  Feature: US_24 Payment Invoice by Staff
    @US_24_TC01_UI
    Scenario: Navigating payment invoice by staff
      Given user is on the medunna page
      When user clicks on user icon button
      Then user clicks on Sign In Button icon
      And user enters username "melissu" in username input
      And user enters password "melissu90" in password input
      And user clicks on Remember me checkbox
      And user clicks on Sign In submit Button icon
      And staff clicks on My Pages Button icon
      And staff clicks on Search Patient option
      And staff enters the Patient ssn for search
      And staff clicks Show appointment button icon
      Then verify the patient have a status of completed or Cancelled
      Then click on Payment Invoice process
      Then verify all data is displayed
      Then create an invo


    #User (Staff) can navigate to Payment Invoice process
    #At this portal, The patient should have a status of completed or Cancelled to create an invoice
    #User can view all invoice like Exam fee, test item prices and can create a new invoice for the patient
    #User then can view the invoice sent to patient
