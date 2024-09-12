package base.steps;

import base.ApiBaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

public class PetEndpoint extends ApiBaseClass {

    String controller;

    @Given("I make a GET request to {string}")
    public void iMakeAGetRequestTo(String endpoint) {
        controller = endpoint;
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
