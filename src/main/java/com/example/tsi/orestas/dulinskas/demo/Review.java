package com.example.tsi.orestas.dulinskas.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int review_id;
    private int film_film_id;
    private String customer_review;

//    @OneToMany
//    @JoinColumn(name ="review_id",insertable = false,updatable = false)
//    @JsonIgnore
//    private Set<Film> film;

    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name ="film_id", insertable = false, nullable = false, updatable = false)
    private Film film;

    public Review(){}

    public Review(String customer_review, int film_film_id){
        this.film_film_id =film_film_id;
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

    public String getCustomer_review() {
        return customer_review;
    }
    public void setCustomer_review(String customer_review) {
        this.customer_review = customer_review;
    }

}

