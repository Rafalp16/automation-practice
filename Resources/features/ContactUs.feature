Feature: As a user I want to be able to contact customer service

  Scenario: Send empty form and receive an error
    Given User is on automation practice home page
    When I click on contact us link
    And I click on send button
    Then I see that an error pop-up is displayed

  Scenario: Send empty form and check the error message
    Given User is on automation practice home page
    When I click on contact us link
    And I click on send button
    Then I see that an error message about invalid email is displayed

  Scenario: Send form with empty message field and check the error message
    Given User is on automation practice home page
    When I click on contact us link
    And I input valid email address
    And I click on send button
    Then I see that an error message about blank message is displayed

  Scenario: Send form with no subject and check the error message
    Given User is on automation practice home page
    When I click on contact us link
    And I input valid email address
    And I input valid message
    And I click on send button
    Then I see that an error message about no subject picked is displayed

  Scenario: Send valid form and receive an success alert with valid message
    Given User is on automation practice home page
    When I click on contact us link
    And I input valid email address
    And I input valid message
    And I choose valid subject
    And I click on send button
    Then I see that message was sent and receive an success alert
