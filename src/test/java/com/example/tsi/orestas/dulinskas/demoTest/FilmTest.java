package com.example.tsi.orestas.dulinskas.demoTest;

import com.example.tsi.orestas.dulinskas.demo.Film;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmTest {

    @Test
    public void test_film_id(){
        Film test_filmId = new Film();
        int expectedFilmId = 1;
        test_filmId.setFilm_id(1);
        int actualFilmId = test_filmId.getFilm_id();
        assertEquals(expectedFilmId, actualFilmId, "wrong");
    }

    @Test
    public void test_release_year(){
        Film test_releaseYear = new Film();
        int expectedReleaseYear = 1;
        test_releaseYear.setRelease_year(1);
        int actualReleaseYear = test_releaseYear.getRelease_year();
        assertEquals(expectedReleaseYear, actualReleaseYear, "wrong");
    }

    @Test
    public void test_title(){
        Film test_title = new Film();
        String expectedTitle = "Test";
        test_title.setTitle("Test");
        String actualTitle = test_title.getTitle();
        assertEquals(expectedTitle, actualTitle, "wrong");
    }

    @Test
    public void test_description(){
        Film test_description = new Film();
        String expectedDescription = "Test";
        test_description.setDescription("Test");
        String actualDescription = test_description.getDescription();
        assertEquals(expectedDescription, actualDescription, "wrong");
    }


}
