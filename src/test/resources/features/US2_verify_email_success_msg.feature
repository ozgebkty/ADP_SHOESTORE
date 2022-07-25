Feature: US_01 As a user of the Shoe Store I want to be able to submit my email address



  @US2
 Scenario: Verify user  able to enter email
    Given user on the main page
    When user enters valid email "bektayozge@gmail.com" to email area
    And user click the submit button
    Then verify the user should be able to see information massage

