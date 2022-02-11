Feature: Get the reviews for a film
  As a film enthusiast I want to read the reviews for a film
  Scenario: Film has reviews
    Given I want to view the reviews
    When  I open the film reviews
    Then  I should see the reviews