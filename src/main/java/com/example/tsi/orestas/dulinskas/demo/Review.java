package com.example.tsi.orestas.dulinskas.demo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "review")
public class Review implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int review_id;
    private int film_film_id;
    private int customer_customer_id;
    private String customer_review;

    @ManyToOne(optional = false)
    @JoinColumn(name ="film_film_id", insertable = false, nullable = false, updatable = false)
    private Film film;

    @ManyToOne(optional = false)
    @JoinColumn(name ="customer_customer_id", insertable = false, nullable = false, updatable = false)
    private Customer customer;

    public Review(){}

    public Review(String customer_review, int film_film_id, int customer_customer_id){
        this.film_film_id =film_film_id;
        this.customer_customer_id=customer_customer_id;
        this.customer_review = customer_review;}

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

    public String getCustomer_review() {
        return customer_review;
    }
    public void setCustomer_review(String customer_review) {
        this.customer_review = customer_review;
    }

}

