package base.steps.User;

import dto.responses.UserBodyRequest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

import static base.ApiBaseClass.baseUri;
import static base.ApiBaseClass.endpoint;

public class CreateSingleUserEndpoint {

    String username, firstname, lastname, email, password, phone;
    int id, status;


    @Given("I want to create a single new user")
    public void iWantToCreateASingleNewUser() {
        endpoint = "/user";
    }

    @And("with id as {int}")
    public void withIdAs(int id) {
        this.id = id;
    }

    @And("with username as {string}")
    public void withUsernameAs(String username) {
        this.username = username;
    }

    @And("with lastname as {string}")
    public void withLastnameAs(String lastname) {
        this.lastname = lastname;
    }

    @And("with email as {string}")
    public void withEmailAs(String email) {
        this.email = email;
    }

    @And("with password as {string}")
    public void withPasswordAs(String password) {
        this.password = password;
    }

    @And("with phone as {string}")
    public void withPhoneAs(String phone) {
        this.phone = phone;
    }

    @And("with user status as {int}")
    public void withUserStatusAs(int status) {
        this.status = status;
    }

    @And("with firstname as {string}")
    public void withFirstnameAs(String firstname) {
        this.firstname = firstname;
    }

    @And("with id as {string}")
    public void withIdAs(String stringId) {
        this.id = Integer.parseInt(stringId);
    }

    @And("with user status as {string}")
    public void withUserStatusAs(String status) {
        this.status = Integer.parseInt(status);
    }

    @When("I attempt to create a new single user with data")
    public void iAttemptToCreateANewSingleUserWithData() {
        SerenityRest
                .given()
                .contentType(ContentType.JSON)
                .body(UserBodyRequest.builder()
                        .id(this.id)
                        .username(this.username)
                        .firstName(this.firstname)
                        .lastName(this.lastname)
                        .email(this.email)
                        .password(this.password)
                        .phone(this.phone)
                        .userStatus(this.status)
                        .build())
                .baseUri(baseUri + endpoint)
                .when()
                .post();
    }

}
