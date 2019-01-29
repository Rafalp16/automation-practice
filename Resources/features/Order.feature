Feature: As a user I want to be able to place an order

  Scenario: Add an product to a cart without signing in and place an order, use first method of payment
    Given User is on automation practice home page
    When I click on a product
    And I click on add to cart button
    And I click on proceed to checkout button
    And I click on proceed to checkout button on summary page
    And I input valid email address to sign in field
    And I input valid password to sign in field
    And I click on sign in button
    And I click on proceed to checkout button on summary address page
    And I accept shipping terms of service
    And I click on proceed to checkout button on shipping page
    And I pick pay by bank wire method
    And I click on I confirm my order button
    Then I see a message that my order is complete

  Scenario: Add an product to a cart without signing in and place an order, use second method of payment
    Given User is on automation practice home page
    When I click on a product
    And I click on add to cart button
    And I click on proceed to checkout button
    And I click on proceed to checkout button on summary page
    And I input valid email address to sign in field
    And I input valid password to sign in field
    And I click on sign in button
    And I click on proceed to checkout button on summary address page
    And I accept shipping terms of service
    And I click on proceed to checkout button on shipping page
    And I pick pay by cheque method
    And I click on I confirm my order button
    Then I see an alert that my order is complete

  Scenario: Add an product to a cart as a signed user and place an order, use first method of payment
    Given User is on automation practice home page
    When I click on a product
    And I click on add to cart button
    And I click on sign in link
    And I input valid email address to sign in field
    And I input valid password to sign in field
    And I click on sign in button
    And I click on cart field
    And I click on proceed to checkout button on summary page
    And I click on proceed to checkout button on summary address page
    And I accept shipping terms of service
    And I click on proceed to checkout button on shipping page
    And I pick pay by bank wire method
    And I click on I confirm my order button
    Then I see a message that my order is complete

  Scenario: Add an product to a cart as a signed user and place an order, use second method of payment
    Given User is on automation practice home page
    When I click on a product
    And I click on add to cart button
    And I click on sign in link
    And I input valid email address to sign in field
    And I input valid password to sign in field
    And I click on sign in button
    And I click on cart field
    And I click on proceed to checkout button on summary page
    And I click on proceed to checkout button on summary address page
    And I accept shipping terms of service
    And I click on proceed to checkout button on shipping page
    And I pick pay by cheque method
    And I click on I confirm my order button
    Then I see an alert that my order is complete

  Scenario: Add an product to a cart as a signed user and place an order without accepting terms
    Given User is on automation practice home page
    When I click on a product
    And I click on add to cart button
    And I click on sign in link
    And I input valid email address to sign in field
    And I input valid password to sign in field
    And I click on sign in button
    And I click on cart field
    And I click on proceed to checkout button on summary page
    And I click on proceed to checkout button on summary address page
    And I click on proceed to checkout button on shipping page
    Then I see that an error about accepting terms of service is visible
