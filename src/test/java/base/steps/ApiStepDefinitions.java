package base.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

public class ApiStepDefinitions {

    String controller;
    String baseUri = "http://localhost:8080/api/v3";

    @Given("I make a GET request to {string}")
    public void iMakeAGetRequestTo(String endpoint) {
        controller = endpoint;
    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int statusCode) {
        SerenityRest
                .then()
                .statusCode(statusCode);
    }

    @When("status is {string}")
    public void statusIs(String status) {
        SerenityRest
                .given()
                .baseUri(baseUri + controller)
                .when()
                .get("?status=" + status);
    }
}
