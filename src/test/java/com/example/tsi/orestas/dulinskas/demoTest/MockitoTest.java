package com.example.tsi.orestas.dulinskas.demoTest;

import com.example.tsi.orestas.dulinskas.demo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)//inhereting
class MockitoTest {
    private SakilaDatabaseApplication sakilaDatabaseApplication;
    @Mock
    private FilmRepository filmRepository;
    @Mock
    private CustomerRepository customerRepository;
    @Mock
    private ReviewRepository reviewRepository;
    @Mock
    private ActorRepository actorRepository;

    @BeforeEach
    void Setup(){
        sakilaDatabaseApplication= new SakilaDatabaseApplication(
                filmRepository, customerRepository, reviewRepository, actorRepository);
    }

    @Test
    void testAddReview(){
        Review savedReview = new Review("Test Review", 1,1);
        String expected = "save";
        String actual = sakilaDatabaseApplication.addReviews(savedReview.getFilm_film_id(),
                savedReview.getCustomer_customer_id(),savedReview.getCustomer_review());
        ArgumentCaptor<Review>reviewArgumentCaptor = ArgumentCaptor.forClass(Review.class);
        verify(reviewRepository).save(reviewArgumentCaptor.capture());
        reviewArgumentCaptor.getValue();
        Assertions.assertEquals(expected,actual,"wrong");
    }

    @Test
    void testGetReviews(){
            Review review1 = new Review ("Test1", 1, 1);
            Review review2 = new Review ("Test2", 2, 2);
            List<Review> reviews = new ArrayList<>();
            reviews.add(review1);
            reviews.add(review2);
            when(sakilaDatabaseApplication.getAllReview()).thenReturn(reviews);
            Assertions.assertEquals(reviews,sakilaDatabaseApplication.getAllReview(),"wrong");
        }

    @Test
    void testGetFilms(){
        Film film1 = new Film ("Test1", "Test1", 1);
        Film film2 = new Film ("Test2", "Test2", 2);
        List<Film> films = new ArrayList<>();
        films.add(film1);
        films.add(film2);
        when(sakilaDatabaseApplication.getAllFilms()).thenReturn(films);
        Assertions.assertEquals(films,sakilaDatabaseApplication.getAllFilms(),"wrong");
    }

    @Test
    void testGetCustomers(){
        Customer customer1 = new Customer ("Test1", "Test1");
        Customer customer2 = new Customer ("Test2", "Test2");
        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        when(sakilaDatabaseApplication.getAllCustomers()).thenReturn(customers);
        Assertions.assertEquals(customers,sakilaDatabaseApplication.getAllCustomers(),"wrong");
    }

    @Test
    void testGetActors(){
        Actor actor1 = new Actor ("Test1", "Test1");
        Actor actor2 = new Actor ("Test2", "Test2");
        List<Actor> actors = new ArrayList<>();
        actors.add(actor1);
        actors.add(actor2);
        when(sakilaDatabaseApplication.getAllActor()).thenReturn(actors);
        Assertions.assertEquals(actors,sakilaDatabaseApplication.getAllActor(),"wrong");
    }


    //////////////////////DELETE TEST
    @Test
    void testDeleteReview(){
        String actual = sakilaDatabaseApplication.removeReviewByID(1);
        String expected = "The review has been deleted";
        verify(reviewRepository).deleteById(1);
        Assertions.assertEquals(expected,actual,"wrong");
    }

    //////////////////////GET FILM BY ID TEST
    @Test
    void testGetFilmById(){
        Optional<Film> actual = sakilaDatabaseApplication.getFilmById(1);
        Assertions.assertEquals(sakilaDatabaseApplication.getFilmById(1), actual,"wrong");
    }
}

