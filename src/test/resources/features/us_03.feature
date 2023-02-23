@US_003_TC_001
Feature: US_003 Registration page

  Background: Register Medunna
    Given user is on the medunna page
    And user clicks on user icon button
    And user clicks on register option
    And user enters ssn in ssn input
    And user enters first name in first name input
    And user enters last name in last name input
    And user enters username in the username input
    And user enters email in email input
    And user clicks register button



    @US03_TC01
    Scenario: User's passport box;  When user enters at least 1 uppurcase,at least lowercase, at least 1 number, at least 1 special character and 7 characters in total, user gets a stronger passport.
      And user enters stronger password "Ws2!dmt" in the new password input
      Then verify that the user sees the password strength level is five.




   @US03_TC02
   Scenario: User's passport box;When user enters at least 1 number,at least 1 lowercase, at least 1 special character and 7 characters in total, user gets a strong passport.
     And user eters strong password "ws2!dmt"
     Then verify that the user sees that the password strength level is four.


  @US03_TC03
  Scenario: User's passport box;When user enters at least 1 number,at least 1 uppercase, at least 1 special character and 7 characters in total, user gets a strong passport.
    And user enters "WS2!DMT" with uppercase,numbers and special character in new password input
    Then verify that the user sees that the password strength level is four..

  @US03_TC04
  Scenario: User's passport box;When user enters at least 1 number,at least 1 lowercase,at least 1 uppercase and 7 characters in total, user gets a strong passport.
    And user enters "WS2aDMT" uppercase and lowercase letters and numbers in the new password input
    Then verify the Password strength level

  @US03_TC05
  Scenario: User's passport box;When user enters at least 1 number,at least 1 lowercase,at least 1 uppercase, at least 1 special characterand, 4 characters in total, user gets a weak passport.
    And  user enters is strong and using four characters in total "Ws2!" enters new password.
    Then verify that the user sees that the password strength level is one.

  @US03_TC06
  Scenario: User's passport box;When user enters at only number, 7 characters in total, user gets a least passport.
    And user just enters digit "2222234" in new password input
    Then verify the Password strength level first

  @US03_TC07
  Scenario: User's passport box;When user enters at least 1 number,at least 1 lowercase,at least 1 uppercase, 3 characters in total, user gets a too short passport.
    And user enters "Ws3" in the new password input
    Then verify "Your password is required to be at least 4 characters." text is visibles.


  @US03_TC08
  Scenario: User's passport box;When user enters 5 lowercase ,at least 1 special character,at least 1 space, 7 characters in total, user gets a weak passport.
    And user enters space "ws ?dmt" as character in new password input
    Then verify that the user sees that the password strength level is two.


  @US03_TC09
  Scenario: User's passport box;When user enters 1 lowercase and 6 digits, 7 characters in total, user gets a weak passport.
    And the user enters yedi characters "w345678" consisting of a letter and numbers in the new password input
    Then verify the Password strength level


