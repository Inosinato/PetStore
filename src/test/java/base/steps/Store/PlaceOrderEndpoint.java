package base.steps.Store;

import dto.responses.OrderBodyRequest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

import java.time.LocalDate;

import static base.ApiBaseClass.baseUri;
import static base.ApiBaseClass.endpoint;

public class PlaceOrderEndpoint {
    String orderId, petId, quantity;

    @Given("I want to place an order")
    public void iWantToPlaceAnOrder() {
        endpoint = "/store/order";
    }

    @And("with orderId as {string}")
    public void withOrderIdAs(String arg0) {
        this.orderId = arg0;
    }

    @And("with petId as {string}")
    public void withPetIdAs(String arg0) {
        this.petId = arg0;
    }

    @And("with quantity as {string}")
    public void withQuantityAs(String arg0) {
        this.quantity = arg0;
    }

    @When("I attempt to place an order")
    public void iAttemptToPlaceAnOrder() {
        SerenityRest
                .given()
                .contentType(ContentType.JSON)
                .body(OrderBodyRequest.builder()
                        .id(Integer.parseInt(this.orderId))
                        .petId(Integer.parseInt(this.petId))
                        .quantity(Integer.parseInt(this.quantity))
                        .shipDate(LocalDate.now())
                        .status("approved")
                        .complete(true)
                        .build())
                .baseUri(baseUri + endpoint)
                .when()
                .post();
    }
}
