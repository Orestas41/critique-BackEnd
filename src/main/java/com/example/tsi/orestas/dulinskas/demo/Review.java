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
    private int film_film_id;
    private int customer_customer_id;
    private String review;

    public Review(){}

    public Review(String review, int film_film_id, int customer_customer_id){
        this.film_film_id=film_film_id;
        this.customer_customer_id=customer_customer_id;
        this.review=review;}

    public int getReview_id() {
        return review_id;
    }

    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public int getFilm_film_id() {
        return film_film_id;
    }

    public void setFilm_film_id(int film_film_id) {
        this.film_film_id = film_film_id;
    }

    public int getCustomer_customer_id() {
        return customer_customer_id;
    }

    public void setCustomer_customer_id(int customer_customer_id) {
        this.customer_customer_id = customer_customer_id;
    }

    public String getReview() {
        return review;
    }
    public void setReview(String review) {
        this.review = review;
    }
}

