package com.example.tsi.orestas.dulinskas.demoTest;

import com.example.tsi.orestas.dulinskas.demo.*;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SakilaDatabaseApplicationTest {

    private Film film = new Film();
    private Customer customer = new Customer();
    private Actor actor = new Actor();
    private Review review = new Review();

    private Set<Actor> testActorSet = new HashSet<>();
    private Set<Review> testReviewSet = new HashSet<>();

    @Test
    void test_film_id(){
        film.setFilm_id(1);
        assertEquals(1, film.getFilm_id(), "wrong");
    }

    @Test
    void test_release_year(){
        film.setRelease_year(1);
        assertEquals(1, film.getRelease_year(), "wrong");
    }

    @Test
     void test_title(){
        film.setTitle("Test");
        assertEquals("Test", film.getTitle(), "wrong");
    }

    @Test
     void test_description(){
        film.setDescription("Test");
        assertEquals("Test", film.getDescription(), "wrong");
    }

    @Test
     void test_customer_id(){
        customer.setCustomer_id(1);
        assertEquals(1, customer.getCustomer_id(), "wrong");
    }

    @Test
     void test_customer_first_name(){
        customer.setFirst_name("Test");
        assertEquals("Test", customer.getFirst_name(), "wrong");
    }

    @Test
     void test_customer_last_name(){
        customer.setLast_name("Test");
        assertEquals("Test", customer.getLast_name(), "wrong");
    }

    @Test
     void test_actor_id(){
        actor.setActor_id(1);
        assertEquals(1, actor.getActor_id(), "wrong");
    }

    @Test
     void test_actor_first_name(){
        actor.setFirst_name("Test");
        assertEquals("Test", actor.getFirst_name(), "wrong");
    }

    @Test
     void test_actor_last_name(){
        actor.setLast_name("Test");
        assertEquals("Test", actor.getLast_name(), "wrong");
    }

    @Test
     void test_review_id(){
        review.setReview_id(1);
        assertEquals(1, review.getReview_id(), "wrong");
    }

    @Test
     void test_film_film_id(){
        review.setFilm_film_id(1);
        assertEquals(1, review.getFilm_film_id(), "wrong");
    }

    @Test
     void test_customer_review(){
        review.setCustomer_review("Test");
        assertEquals("Test", review.getCustomer_review(), "wrong");
    }

    @Test
    void test_getReviewsForFilms(){
        testReviewSet.add(new Review("Test",1));
        film.setReview(testReviewSet);
        assertEquals(testReviewSet,film.getReviews(),"failed");
    }

    @Test
    void test_getActorForFilms(){
        testActorSet.add(new Actor("Rocco","Rain"));
        film.setActor(testActorSet);
        assertEquals(testActorSet,film.getActor(),"wrong");
    }

}
