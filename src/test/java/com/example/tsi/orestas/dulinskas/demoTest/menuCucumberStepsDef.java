package com.example.tsi.orestas.dulinskas.demoTest;

import com.example.tsi.orestas.dulinskas.demo.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import io.restassured.response.Response;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

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

    Response response;
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

    ////////////////////////////////////VIEW REVIEWS

    List<Review> reviews = new ArrayList<>();

    @Given("film has reviews")
    public void film_has_reviews() {
        Review review1 = new Review ("Test1", 1);
        Review review2 = new Review ("Test2", 2);
        reviews.add(review1);
        reviews.add(review2);

    }
    @When("I open the website")
    public void i_open_the_website() {
        when(sakilaDatabaseApplication.getAllReview()).thenReturn(reviews);
    }
    @Then("film reviews will be on display")
    public void film_reviews_will_be_on_display() {
        Assertions.assertEquals(reviews,sakilaDatabaseApplication.getAllReview(),"wrong");
    }

    ////////////////////////////////////ADDING REVIEW

    Review savedReview;

    @Given("I have supplied a review")
    public void i_have_supplied_a_review() {
        setup();
        savedReview = new Review("Test Review",1);
    }
    @When("I save a review")
    public void i_save_a_review() {
        actual = sakilaDatabaseApplication.addReviews(savedReview.getFilm_film_id(),savedReview.getCustomer_review());
        ArgumentCaptor<Review> reviewArgumentCaptor = ArgumentCaptor.forClass(Review.class);
        verify(reviewRepository).save(reviewArgumentCaptor.capture());
        reviewArgumentCaptor.getValue();
    }
    @Then("I receive a save confirmation")
    public void i_receive_a_save_confirmation() {
        String expected = "save";
        Assertions.assertEquals(expected,actual,"Save failed");
    }

    //////////////////////////////////////DELETING REVIEW

    int reviewID;

    @Given("I have supplied a review id")
    public void i_have_supplied_a_review_id() {
        setup();
        reviewID = 1;
    }
    @When("I delete a review")
    public void i_delete_a_review() {
        actual = sakilaDatabaseApplication.removeReviewByID(1);
        ArgumentCaptor<Integer> reviewArgumentCaptor = ArgumentCaptor.forClass(Integer.class);
        verify(reviewRepository).deleteById(reviewArgumentCaptor.capture());
        reviewArgumentCaptor.getValue();
    }
    @Then("I receive a delete confirmation")
    public void i_receive_a_delete_confirmation() {
        String expected = "The review has been deleted";
        Assertions.assertEquals(expected,actual,"Review failed to be deleted");
    }

    /////////////////////////////////////////UPDATING REVIEW
//
//    Review oldReview;
//    String amendedReview;
//    int reviewId;
//    Review updatedReview;
//
//    @Given("I have supplied a review id for update")
//    public void i_have_supplied_a_review_id_for_update() {
//        setup();
//        oldReview = new Review("Old Review", 1);
//        reviewId = 1;
//    }
//    @Given("I have supplied amended review")
//    public void i_have_supplied_amended_review() {
//        amendedReview = "Test Review";
//    }
//    @When("I save updated review")
//    public void i_save_updated_review() {
//        updatedReview = new Review(amendedReview,reviewID);
//        actual = sakilaDatabaseApplication.updateReview(0,
//                updatedReview.getCustomer_review());
//        ArgumentCaptor<Review> reviewArgumentCaptor = ArgumentCaptor.forClass(Review.class);
//        verify(reviewRepository).save(reviewArgumentCaptor.capture());
//        reviewArgumentCaptor.getValue();
//    }
//    @Then("I receive an update saved confirmation")
//    public void i_receive_an_update_saved_confirmation() {
//        String expected = "save";
//        Assertions.assertEquals(expected,actual,"Update failed");
//    }

}