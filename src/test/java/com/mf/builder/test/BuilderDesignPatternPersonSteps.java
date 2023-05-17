package com.mf.builder.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.runner.RunWith;

import com.mf.builder.Person;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "builder-design-pattern-person.feature")
public class BuilderDesignPatternPersonSteps {
    private Person.Builder personBuilder;
    private Person person;

    @Given("^a person builder$")
    public void aPersonBuilder() {
        personBuilder = new Person.Builder();
    }

    @When("^I set the first name as \"([^\"]*)\"$")
    public void iSetTheFirstNameAs(String firstName) {
        personBuilder.firstName(firstName);
    }

    @When("^I set the last name as \"([^\"]*)\"$")
    public void iSetTheLastNameAs(String lastName) {
        personBuilder.lastName(lastName);
    }

    @Then("^the person should have the first name \"([^\"]*)\"$")
    public void thePersonShouldHaveTheFirstName(String expectedFirstName) {
        person = personBuilder.build();
        assertEquals(expectedFirstName, person.getFirstName());
    }

    @Then("^the person should have the last name \"([^\"]*)\"$")
    public void thePersonShouldHaveTheLastName(String expectedLastName) {
        person = personBuilder.build();
        assertEquals(expectedLastName, person.getLastName());
    }
}
