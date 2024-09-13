package base.steps.User;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

import static base.ApiBaseClass.baseUri;
import static base.ApiBaseClass.endpoint;

public class UserLoginEndpoint {

    String username, password;

    @Given("I want to login to system")
    public void iWantToLoginToSystem() {
        endpoint = "/user/login";
    }

    @And("the username is {string}")
    public void theUsernameIs(String username) {
        this.username = username;
    }

    @And("the password is {string}")
    public void thePasswordIs(String password) {
        this.password = password;
    }

    @When("I try to login")
    public void iTryToLogin() {
        SerenityRest
                .given()
                .baseUri(baseUri)
                .queryParam("username", username)
                .queryParam( "password", password)
                .when()
                .get(endpoint);
    }
}
