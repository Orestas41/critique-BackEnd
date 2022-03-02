Feature: Delete a review
  AS A customer
  I WANT TO delete a review
  SO THAT I can moderate the reviews

  Scenario: Delete a Review
    Given I have supplied a review id
    When  I delete a review
    Then  I receive a delete confirmation
