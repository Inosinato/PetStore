package base.steps.Store;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

import static base.ApiBaseClass.baseUri;
import static base.ApiBaseClass.endpoint;

public class DeleteOrderEndpoint {
    @Given("I want to delete an order")
    public void iWantToDeleteAnOrder() {
    }

    @When("I attempt to delete the order {string}")
    public void iAttemptToDeleteTheOrder(String orderId) {
        SerenityRest
                .given()
                .contentType(ContentType.JSON)
                .baseUri(baseUri)
                .pathParam("orderId", orderId)
                .when()
                .delete(endpoint + "/{orderId}");
    }
}
