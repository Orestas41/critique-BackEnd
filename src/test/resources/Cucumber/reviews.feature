Feature: View reviews
  AS A customer
  I WANT TO see the film reviews
  SO THAT I see the views on the film from other customers

  Scenario: View film reviews
    Given film has reviews
    When  I open the website
    Then  film reviews will be on display