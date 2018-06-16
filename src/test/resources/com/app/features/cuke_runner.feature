Feature: Translating words

  Scenario: Translate to Russian
    Given I'm on Google translate page
    When I type words
    Then I should see translated words
