Feature: As a user I want to be able to sign in to my account

  Scenario: Send empty login form and receive an error
    Given User is on automation practice home page
    When I click on sign in link
    And I click on sign in button
    Then I see that an error message about required email is displayed

  Scenario: Use valid email address and empty password field to receive an error
    Given User is on automation practice home page
    When I click on sign in link
    And I input valid email address
    And I click on sign in button
    Then I see that an error message about required password is displayed

  Scenario: Use invalid email address to receive an error
    Given User is on automation practice home page
    When I click on sign in link
    And I input invalid email address to sign in field
    And I click on sign in button
    Then I see that an error message about invalid email is displayed

  Scenario: Use valid email address and password to sign in
    Given User is on automation practice home page
    When I click on sign in link
    And I input valid email address to sign in field
    And I input valid password to sign in field
    And I click on sign in button
    Then I am redirected to my account page