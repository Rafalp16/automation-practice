Feature: As a user I want to be able to create an account

  Scenario: Use invalid email address and receive an error
    Given User is on automation practice home page
    When I click on sign in link
    And I input invalid email address
    And I click on create an account button
    Then I see that an error message about invalid email is displayed

  Scenario: Send empty email address form and receive an error
    Given User is on automation practice home page
    When I click on sign in link
    And I click on create an account button
    Then I see that an error message about invalid email is displayed

  Scenario: Use used email address and receive an error
    Given User is on automation practice home page
    When I click on sign in link
    And I input used email address
    And I click on create an account button
    Then I see that an error message about existing account is displayed

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
    And I choose valid country
    And I choose valid state
    And I input valid postal code
    And I input valid mobile phone
    And I click on register button
    Then I am redirected to my account page

  Scenario: Use invalid first name to create an account and check the error message
    Given User is on automation practice home page
    When I click on sign in link
    And I input unused email address
    And I click on create an account button
    And I input valid last name
    And I input valid password
    And I input valid address
    And I input valid city
    And I choose valid country
    And I choose valid state
    And I input valid postal code
    And I input valid mobile phone
    And I click on register button
    And I see that an error is displayed
    Then I check if the error message says that firstname is required

  Scenario: Use invalid last name to create an account and check the error message
    Given User is on automation practice home page
    When I click on sign in link
    And I input unused email address
    And I click on create an account button
    And I input valid first name
    And I input valid password
    And I input valid address
    And I input valid city
    And I choose valid country
    And I choose valid state
    And I input valid postal code
    And I input valid mobile phone
    And I click on register button
    And I see that an error is displayed
    Then I check if the error message says that lastname is required

  Scenario: Use invalid password to create an account and check the error message
    Given User is on automation practice home page
    When I click on sign in link
    And I input unused email address
    And I click on create an account button
    And I input valid first name
    And I input valid last name
    And I input valid address
    And I input valid city
    And I choose valid country
    And I choose valid state
    And I input valid postal code
    And I input valid mobile phone
    And I click on register button
    And I see that an error is displayed
    Then I check if the error message says that password is required

  Scenario: Use invalid address to create an account and check the error message
    Given User is on automation practice home page
    When I click on sign in link
    And I input unused email address
    And I click on create an account button
    And I input valid first name
    And I input valid last name
    And I input valid password
    And I input valid city
    And I choose valid country
    And I choose valid state
    And I input valid postal code
    And I input valid mobile phone
    And I click on register button
    And I see that an error is displayed
    Then I check if the error message says that address is required

  Scenario: Use invalid city to create an account and check the error message
    Given User is on automation practice home page
    When I click on sign in link
    And I input unused email address
    And I click on create an account button
    And I input valid first name
    And I input valid last name
    And I input valid password
    And I input valid address
    And I choose valid country
    And I choose valid state
    And I input valid postal code
    And I input valid mobile phone
    And I click on register button
    And I see that an error is displayed
    Then I check if the error message says that city is required

  Scenario: Use invalid country to create an account and check the error message
    Given User is on automation practice home page
    When I click on sign in link
    And I input unused email address
    And I click on create an account button
    And I input valid first name
    And I input valid last name
    And I input valid password
    And I input valid address
    And I input valid city
    And I choose invalid country
    And I input valid mobile phone
    And I click on register button
    And I see that an error is displayed
    Then I check if the error message says that country is required

  Scenario: Use invalid state to create an account and check the error message
    Given User is on automation practice home page
    When I click on sign in link
    And I input unused email address
    And I click on create an account button
    And I input valid first name
    And I input valid last name
    And I input valid password
    And I input valid address
    And I input valid city
    And I choose valid country
    And I input valid postal code
    And I input valid mobile phone
    And I click on register button
    And I see that an error is displayed
    Then I check if the error message says that state is required

  Scenario: Use invalid postal code to create an account and check the error message
    Given User is on automation practice home page
    When I click on sign in link
    And I input unused email address
    And I click on create an account button
    And I input valid first name
    And I input valid last name
    And I input valid password
    And I input valid address
    And I input valid city
    And I choose valid country
    And I choose valid state
    And I input valid mobile phone
    And I click on register button
    And I see that an error is displayed
    Then I check if the error message says that postal code must follow specific format

  Scenario: Use invalid phone number to create an account and check the error message
    Given User is on automation practice home page
    When I click on sign in link
    And I input unused email address
    And I click on create an account button
    And I input valid first name
    And I input valid last name
    And I input valid password
    And I input valid address
    And I input valid city
    And I choose valid country
    And I choose valid state
    And I input valid postal code
    And I click on register button
    And I see that an error is displayed
    Then I check if the error message says that at least one phone number is required

  Scenario: Use valid email address and empty credentials form and check the error message
    Given User is on automation practice home page
    When I click on sign in link
    And I input unused email address
    And I click on create an account button
    And I click on register button
    Then I check if the error message displays all errors
