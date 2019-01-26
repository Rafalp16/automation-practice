Feature: As a user I want to be able to create an account

  Scenario: Use invalid email address and receive an error
    Given User is on automation practice home page
    When I click on sign in link
    And I click on create an account button
    Then I see that an error is displayed

  Scenario: Use valid email address and credentials to create an account
    Given User is on automation practice home page
    When I click on sign in link
    And I input unused email address
    And I click on create an account button
    And I input valid first name
    And I input valid last name
    And I input valid password
    And I input valid address
    And I input valid city
    And I input valid country
    And I input valid state
    And I input valid postal code
    And I input valid mobile phone
    And I click on register button
    Then I am redirected to my account page

