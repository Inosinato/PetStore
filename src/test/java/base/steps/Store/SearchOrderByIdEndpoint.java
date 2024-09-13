package base.steps.Store;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.serenitybdd.rest.SerenityRest;

import static base.ApiBaseClass.baseUri;
import static base.ApiBaseClass.endpoint;

public class SearchOrderByIdEndpoint {
    @Given("I want to search an order by id")
    public void iWantToSearchAnOrderById() {
        endpoint = "/order";
    }

    @And("I perform order search by id with {string}")
    public void iPerformOrderSearchByIdWith(String orderId) {
        SerenityRest
                .given()
                .baseUri(baseUri)
                .pathParam("orderId", orderId)
                .when()
                .get(endpoint);
    }
}
