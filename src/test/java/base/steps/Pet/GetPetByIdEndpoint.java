package base.steps.Pet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

import static base.ApiBaseClass.baseUri;
import static base.ApiBaseClass.endpoint;

public class GetPetByIdEndpoint {
    @Given("I want to search a pet by id")
    public void iWantToSearchAPetById() {
        endpoint = "/pet";
    }

    @When("I perform a pet search by id with {string}")
    public void iPerformAPetSearchByIdWith(String arg0) {
        SerenityRest
                .given()
                .baseUri(baseUri)
                .pathParam("petId", arg0)
                .when()
                .get(endpoint);
    }
}
