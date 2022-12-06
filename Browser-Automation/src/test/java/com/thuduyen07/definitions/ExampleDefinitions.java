package com.thuduyen07.definitions;

import com.thuduyen07.steps.ExampleSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleDefinitions {

    ExampleSteps exampleSteps = new ExampleSteps();
    @Given("I am on the Google search page")
    public void iAmOnTheGoogleSearchPage() {
        exampleSteps.navigateTo("https://www.google.com");
    }

    @When("I search for {string}")
    public void iSearchFor(String keyword) {
        exampleSteps.searchFor(keyword);
    }

    @Then("the page title should start with {string}")
    public void thePageTitleShouldStartWith(String keyword) {
        exampleSteps.waitForPageLoad(keyword);
    }
}
