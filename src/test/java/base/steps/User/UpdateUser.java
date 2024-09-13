package base.steps.User;

import dto.responses.UserBodyRequest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

import static base.ApiBaseClass.endpoint;

public class UpdateUser {

    String username;

    @Given("I want to update a user with username {string}")
    public void iWantToUpdateAUser(String userName) {
        endpoint = "/user";
        username = userName;
    }

    @When("I attempt to modify a user with data")
    public void iAttemptToModifyAUserWithData() {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(UserBodyRequest.builder()
                        .id(1)
                        .username("theUser")
                        .firstName("firstName")
                        .lastName("lastName")
                        .email("email@mail.com")
                        .password("password")
                        .phone("99999")
                        .userStatus(2)
                        .build())
                .pathParam("username", username)
                .when()
                .put(endpoint + "/{username}");
    }
}
