package base.steps.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

import static base.ApiBaseClass.baseUri;
import static base.ApiBaseClass.endpoint;

public class UserLogoutEndpoint {

    @Given("I want to logout")
    public void iWantToLogout() {
        endpoint = "/user/logout";
    }

    @When("I try to logout")
    public void iTryToLogout() {
        SerenityRest
                .given()
                .baseUri(baseUri)
                .when()
                .get(endpoint);
    }
}
