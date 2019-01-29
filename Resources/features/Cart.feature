Feature: As a user I want to be able to add products to a cart and manage them

  Scenario: Add an product to a cart and receive confirmation message
    Given User is on automation practice home page
    When I click on a product
    And I click on add to cart button
    Then I see an confirmation alert

  Scenario: Add an product then delete it and receive an alert about empty cart
    Given User is on automation practice home page
    When I click on a product
    And I click on add to cart button
    And I click on proceed to checkout button
    And I remove every product in a cart
    Then I see an alert about empty cart

