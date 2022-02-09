package com.example.tsi.orestas.dulinskas.demoTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsItLithuanian {
    static String IsItLithuanian(String filmLanguage){
        return "Lithuanian".equals(filmLanguage) ? "Yes" : "No";
    }
}

public class menuCucumberStepsDef {
    public String filmLanguage;
    public String actualAnswer;

    @Given("I have chosen an {string} film")
    public void i_have_chosen_a_film() {
      filmLanguage = "English";
        throw new io.cucumber.java.PendingException();
    }
    @When("Is the film {string}")
    public void is_the_film(String string) {
        actualAnswer = IsItLithuanian.IsItLithuanian(filmLanguage);
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(string, actualAnswer);
        throw new io.cucumber.java.PendingException();
    }

}
