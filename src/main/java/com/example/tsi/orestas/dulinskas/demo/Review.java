package com.example.tsi.orestas.dulinskas.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int review_id;
    private int film_id;
    private String review;

    public Review(){}

    public Review(String review, int film_id){
        this.film_id=film_id;
        this.review=review;}

    public int getReview_id() {
        return review_id;
    }

    public int getFilm_id() {
        return film_id;
    }

    public String getReview() {
        return review;
    }
    public void setReview(String review) {
        this.review = review;
    }
}

