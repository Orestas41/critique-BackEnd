Feature: Is the film Lithuanian?
  I want to know if the film is Lithuanian
  Scenario: Film is not Lithuanian
    Given I have chosen an "English" film
    When  Is the film "Lithuanian"
    Then  I should be told "No"