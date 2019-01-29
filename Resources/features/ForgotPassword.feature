Feature: As a user I want to be able to retrieve lost account

  Scenario: Use forgot your password option with valid email address to retrieve new password
    Given User is on automation practice home page
    When I click on sign in link
    And I click on forgot your password link
    And I input valid email address to retrieve account
    And I click on retrieve password button
    Then I see a message that says that confirmation email was sent

  Scenario: Use forgot your password option with empty email address field and receive an error
    Given User is on automation practice home page
    When I click on sign in link
    And I click on forgot your password link
    And I click on retrieve password button
    Then I see that an error message about invalid email is displayed

  Scenario: Use forgot your password option with invalid email address and receive an error
    Given User is on automation practice home page
    When I click on sign in link
    And I click on forgot your password link
    And I input invalid email address to retrieve field
    And I click on retrieve password button
    Then I see that an error message about invalid email is displayed

  Scenario: Use forgot your password option with unused email address and receive an error
    Given User is on automation practice home page
    When I click on sign in link
    And I click on forgot your password link
    And I input unused email address to retrieve field
    And I click on retrieve password button
    Then I see that an error message about no account is displayed