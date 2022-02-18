package com.example.tsi.orestas.dulinskas.demoTest;

import com.example.tsi.orestas.dulinskas.demo.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class menuCucumberStepsDef {

    private SakilaDatabaseApplication sakilaDatabaseApplication;
    @Mock
            private ReviewRepository reviewRepository;
    @Mock
            private FilmRepository filmRepository;
    @Mock
            private CustomerRepository customerRepository;
    @Mock
            private ActorRepository actorRepository;

    String actual;
    void setup()
    {
        reviewRepository=mock(ReviewRepository.class);
        filmRepository=mock(FilmRepository.class);
        customerRepository=mock(CustomerRepository.class);
        actorRepository=mock(ActorRepository.class);
        sakilaDatabaseApplication=new SakilaDatabaseApplication(filmRepository,
                customerRepository,reviewRepository,actorRepository);
    }

    Review savedReview;

    @Given("We want to review a film")
    public void chooseFilmToReview()
    {
        setup();
        savedReview = new Review("Test Review",1,1);
    }

    @When("We review a film")
    public void addReview()
    {
        actual = sakilaDatabaseApplication.addReviews(savedReview.getFilm_film_id(),
                savedReview.getCustomer_customer_id(),savedReview.getCustomer_review());
    }
    @Then("Review should be added")
    public void checkReviewAdded()
    {
        String expected = "save";
        Assertions.assertEquals(expected,actual,"Save failed");

        ArgumentCaptor<Review> reviewArgumentCaptor = ArgumentCaptor.forClass(Review.class);
        verify(reviewRepository).save(reviewArgumentCaptor.capture());
        reviewArgumentCaptor.getValue();
    }

//    Review oldReview;
//    Review updatedReview;

//    @Given("We want to update review")
//    public void chooseToUpdateReview()
//    {
//        setup();
//        oldReview = new Review("Old Review", 1,1);
//        updatedReview = new Review("Test Review",2,2);
//    }
//    @When("We update a review")
//    public void updateReview()
//    {
//        actual = sakilaDatabaseApplication.updateReview(1,
//                updatedReview.getCustomer_review());
//    }
//    @Then("Review should be updated")
//    public void checkReviewIsUpdated() {
//        String expected = "save";
//        Assertions.assertEquals(expected,actual,"Update failed");
//
//        ArgumentCaptor<Review> reviewArgumentCaptor = ArgumentCaptor.forClass(Review.class);
//        verify(reviewRepository).save(reviewArgumentCaptor.capture());
//        reviewArgumentCaptor.getValue();
//    }

    int reviewID;

    @Given("We want to delete a review")
    public void chooeseToDeleteReview()
    {
        setup();
        reviewID = 1;
    }
    @When("We delete a review")
    public void DeleteReview()
    {
        actual = sakilaDatabaseApplication.removeReviewByID(1);
    }
    @Then("Review should be deleted")
    public void checkReviewDeleted()
    {
        String expected = "The review has been deleted";
        Assertions.assertEquals(expected,actual,"Review failed to be deleted");

        ArgumentCaptor<Integer> reviewArgumentCaptor = ArgumentCaptor.forClass(Integer.class);
        verify(reviewRepository).deleteById(reviewArgumentCaptor.capture());
        reviewArgumentCaptor.getValue();
    }

}
