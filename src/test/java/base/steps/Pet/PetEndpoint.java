package base.steps.Pet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

import static base.ApiBaseClass.baseUri;

public class PetEndpoint {

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
