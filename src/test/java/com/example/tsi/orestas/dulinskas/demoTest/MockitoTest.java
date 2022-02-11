package com.example.tsi.orestas.dulinskas.demoTest;

import com.example.tsi.orestas.dulinskas.demo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)//inhereting
public class MockitoTest {
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
    public void testAddReview(){
        Review savedReview = new Review("Test Review", 1,1);
        String expected = "save";
        String actual = sakilaDatabaseApplication.addReviews(savedReview.getFilm_film_id(),
                savedReview.getCustomer_customer_id(),savedReview.getCustomer_review());
        ArgumentCaptor<Review>reviewArgumentCaptor = ArgumentCaptor.forClass(Review.class);
        verify(reviewRepository).save(reviewArgumentCaptor.capture());
        reviewArgumentCaptor.getValue();
        Assertions.assertEquals(expected,actual,"wrong");
    }

//    @Test
//    public void testGetLanguage(){
//            Review review1 = new Review ("Test1");
//            Review review2 = new Review ("Test2");
//            List<Review> reviews = new ArrayList<>();
//            reviews.add(review1);
//            reviews.add(review2);
//            when(sakilaDatabaseApplication.getAllFilms()).thenReturn(reviews);
//            Assertions.assertEquals(reviews,sakilaDatabaseApplication.getAllFilms(),"wrong");
//        }
}
