Feature: Post a review
  AS A customer
  I WANT TO post a review
  SO THAT I can express my opinion about a film

  Scenario: Successfully add a Review
    Given I have supplied a review
    When  I save a review
    Then  I receive a save confirmation
