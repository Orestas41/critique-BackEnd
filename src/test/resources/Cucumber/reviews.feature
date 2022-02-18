Feature: Test Review features

  Scenario: Add Review
    Given We want to review a film
    When  We review a film
    Then  Review should be added

#  Scenario: Update Review
#    Given We want to update review
#    When  We update a review
#    Then  Review should be updated

  Scenario: Delete Review
    Given We want to delete a review
    When  We delete a review
    Then  Review should be deleted