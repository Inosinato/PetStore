package base.steps.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

import static base.ApiBaseClass.baseUri;
import static base.ApiBaseClass.endpoint;

public class DeleteUserEndpoint {

    @Given("I want to delete a user")
    public void iWantToDeleteAUser() {
        endpoint = "/user";
    }

    @When("I attempt to delete the user {string}")
    public void iAttemptToDeleteTheUser(String username) {
        SerenityRest
                .given()
                .contentType(ContentType.JSON)
                .baseUri(baseUri)
                .pathParam("username", username)
                .when()
                .delete(endpoint + "/{username}");
    }
}
