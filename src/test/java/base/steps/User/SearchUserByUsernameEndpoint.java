package base.steps.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

import static base.ApiBaseClass.baseUri;
import static base.ApiBaseClass.endpoint;

public class SearchUserByUsernameEndpoint {
    @Given("I want to search a user by username")
    public void iWantToSearchAUserByUsername() {
        endpoint = "/user";
    }

    @When("I perform the search by username with {string}")
    public void iPerformTheSearchByUsername(String username) {
        SerenityRest
                .given()
                .baseUri(baseUri)
                .pathParam("username", username)
                .when()
                .get(endpoint);
    }
}
