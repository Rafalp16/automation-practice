Feature: As a user I want to be able to contact customer service

  Scenario: Send empty form to receive an error
    Given User is on automation practice home page
    When I click on contact us link
    And I click on send button
    Then I see that an error is displayed
