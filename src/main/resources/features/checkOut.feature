@smoke
  Feature: user could checkout successfully
    Scenario: user checkout
      Given user go to product page
      When user add a product to cart
      And user go to cart page
      Then user click on checkout
