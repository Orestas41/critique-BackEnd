package com.example.tsi.orestas.dulinskas.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Film {

    @Id
    @GeneratedValue
    private int film_id;
    private String title;
    private String description;
    private int release_year;

    public Film(String title){
        this.title=title;
    }

    public Film(){
    }

    public int getFilm_id() {
        return film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRelease_year() {
        return release_year;
    }
}