package com.example.tsi.orestas.dulinskas.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int review_id;
    private int film_film_id;
    private String customer_review;

    @ManyToOne
    @JoinColumn(name ="film_film_id", insertable = false, nullable = false, updatable = false)
    private Film film;

//    @OneToMany(mappedBy = "review")
//    private Set<Film> film = new HashSet<>();
//
//    public Set<Film> getFilm(){
//        return film;
//    }
//
//    public void setFilm(Set<Film> film) {
//        this.film = film;
//    }

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

