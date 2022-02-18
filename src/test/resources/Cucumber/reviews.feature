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

  Scenario: View film details and its reviews by film id
    Given The id for a film we are interested in is 1
    When  We enter film id
    Then  film details and its reviews will be shown