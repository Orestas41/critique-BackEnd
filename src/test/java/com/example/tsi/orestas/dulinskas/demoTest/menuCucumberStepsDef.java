package com.example.tsi.orestas.dulinskas.demoTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

class viewReviews {
    static String viewReviews(String filmReviews){
        return "reviews".equals(filmReviews) ? "Yes" : "No";
    }
}

public class menuCucumberStepsDef {
    public String filmReviews;
    public String actualAnswer;

    @Given("I want to view the reviews")
    public void i_want_to_view_the_reviews() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I open the film reviews")
    public void i_open_the_film_reviews() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see the reviews")
    public void i_should_see_the_reviews() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
