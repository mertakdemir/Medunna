@US_029
Feature: US_029 Create new country

  @US_029_TC_001_UI
  Scenario:Admin can create a new country
    Given Admin goes to the "medunna_url"
    And Admin clicks on the user icon
    And Admin clicks on Sign In option
    And Admin enters username "medunna_username_1"
    And Admin enters password "medunna_password_1"
    And Admin clicks  on sign in button
    And Admin clicks on Items&Titles
    And Admin clicks on Country link
    And Admin click Create a new Country link
    And Admin enters new country name "Italy" on the name ınput
#   And Admin enters Created Date "14.03.2023" on the name ınput
    And Admin clicks on Save button
    Then verify created country success messaj

  @US_029_TC_002_UI
  Scenario: Admin should create related states or cities based on the country
    Given Admin goes to the "medunna_url"
    And Admin clicks on the user icon
    And Admin clicks on Sign In option
    And Admin enters username "medunna_username_1"
    And Admin enters password "medunna_password_1"
    And Admin clicks  on sign in button
    And Admin clicks on Items&Titles
    And Admin clicks on StateOrCity link
    And Admin click Create a new State or City link
    And Admin enters new city name "Roma" on the name ınput
    And Admin select the country name admin created
    And Admin clicks on Save button on the create a new StateCity page
    Then verify the city was created

  @US_029_TC_001_API
  Scenario:Admin verify can create a new country with API
    Given user sets the necessary path params to create a country
    And sends POST request and get the response to create a country
    Then verify HTTP status code is 201 of country post request
    Given user sets the necessary path params to update a country
    And sends PUT request and get the response to update update existing countries
    Then verify HTTP status code is 201 of country put request
    Given user sets the necessary path params to get a country
    Given user sends the GET request for created country data
    Then verify HTTP status code is 200 of country get request
    And sends DELETE request for created country data to the url
    Then verify HTTP status code is 204 of country delete request


   @US_029_TC_001_DB
   Scenario:Admin should validate them with DB
     Given user connects to the database
     And Admin gets the column "name" from "country" country table
     Then verify the name column  contains of the created "Italy" country
     And close the connection

  @US_029_TC_002_DB
  Scenario:Admin should validate them with DB
    Given user connects to the database
    And Admin gets the column "name" from "country" country table
    Then verify the name column  contains of the created "Italy" country
    And close the connection