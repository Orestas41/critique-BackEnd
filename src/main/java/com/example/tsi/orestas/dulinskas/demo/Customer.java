package com.example.tsi.orestas.dulinskas.demo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;
    private String first_name;
    private String last_name;

    @OneToMany(mappedBy = "customer")
    private Set<Review> reviews = new HashSet<>();

    public Customer(){}

    public Customer(String first_name, String last_name){
        this.first_name=first_name;
        this.last_name=last_name;
    }
    //TEST--
    public Set<Review> getReviews(){return reviews;}
    //TEST--
    public void setReview(Set<Review> reviews) {this.reviews = reviews;}

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

}
