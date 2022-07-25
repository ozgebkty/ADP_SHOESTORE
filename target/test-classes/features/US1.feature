@US1
Feature:As a user of the Shoe store I want to be able to visit a link for each month and see the shoes being released

  Background:
    Given User on the main page
    Then  Verify header title


  Scenario: Verify user able to visit a link for each month and see the shoes being released
     Then  Verify User clicks month icon





  Scenario: Verify user can see each shoe should have a suggested price pricing
    And   the user clicks All Shoes icon
    And   the user sees All shoes tittle
    Then  verify   prices are displayed



  Scenario: Verify user can see each brand names under All Shoes title
    Given User Click AllShoes
    Then  Verify   following brands is displayed

   @A
  Scenario: Verify user can see each brand names under each month

    Then  Verify  User Click month and  brands will displayed under each month

