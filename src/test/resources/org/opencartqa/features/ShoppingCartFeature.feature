Feature: Shopping Cart

  @Regression
  Scenario: Shipping is added to order
    Given user is on home page
    When user adds item to shopping cart
    And clicks on the shopping cart icon
    Then user is navigated to shopping cart page
    And the added item is there
    When user selects shipping destination
    And chooses a rate available for that regioni
    Then the shipping rate is added to the amount of the order