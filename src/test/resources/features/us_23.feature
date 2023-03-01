@US_023_Test
Feature: US_023_TC_001
  @US023_TC001_UI
  Scenario: TC001_medunna_patient_test_results_by_Staff
    Given user is on the medunna page
    When user clicks on user icon button
    Then user clicks on Sign In Button icon
    And user enters username "melissu" in username input
    And user enters password "melissu90" in password input
    And user clicks on Remember me checkbox
    And user clicks on Sign In submit Button icon
    And staff clicks on My Pages Button icon
    And staff clicks on Search Patient option
    And staff enters the Patient SSN for search
    And staff clicks Show appointment button icon
    And staff clicks on Show Tests button icon
    And staff clicks on View Results button icon
    And staff clicks Edit button for edit result
    And staff enter results by number to results input
    And staff enter description to description icon
    And staff clicks save button icon
    And staff clicks edit button again
    And staff enter result for update result
    And staff enter Description for update description
    Then verify is displayed id date result description createdDate testItem test
    Then close the application