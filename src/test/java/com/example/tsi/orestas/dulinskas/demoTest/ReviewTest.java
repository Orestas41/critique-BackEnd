package com.example.tsi.orestas.dulinskas.demoTest;

import com.example.tsi.orestas.dulinskas.demo.Review;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewTest {

    @Test
    public void test_review_id(){
        Review test_reviewId = new Review();
        int expectedReviewId = 1;
        test_reviewId.setReview_id(1);
        int actualReviewId = test_reviewId.getReview_id();
        assertEquals(expectedReviewId, actualReviewId, "wrong");
    }

    @Test
    public void test_film_film_id(){
        Review test_filmId = new Review();
        int expectedFilmId = 1;
        test_filmId.setFilm_film_id(1);
        int actualFilmId = test_filmId.getFilm_film_id();
        assertEquals(expectedFilmId, actualFilmId, "wrong");
    }

    @Test
    public void test_customer_customer_id(){
        Review test_customerId = new Review();
        int expectedCustomerId = 1;
        test_customerId.setCustomer_customer_id(1);
        int actualCustomerId = test_customerId.getCustomer_customer_id();
        assertEquals(expectedCustomerId, actualCustomerId, "wrong");
    }

    @Test
    public void test_customer_review(){
        Review test_customerReview = new Review();
        String expectedCustomerReview = "Test";
        test_customerReview.setCustomer_review("Test");
        String actualCustomerReview = test_customerReview.getCustomer_review();
        assertEquals(expectedCustomerReview, actualCustomerReview, "wrong");
    }

}
