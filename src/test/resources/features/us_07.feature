@US_007_Test
  Feature:

    Scenario:TC001_user_info_edit_positive
      Given user is on the medunna page
      When user clicks on  user icon
      And user clicks on  sign in option
      And user enters username
      And user enters password
      And user clicks  on sign in button
      And user clicks signed user icon
      And user clicks on setting option
      Then user verify  user settings info  is visibile
      And user update firstname
      And user update lastname
      And user clicks on save button to save update
      Then user verify  updated first and last name user icon is visible



