package base.steps.Store;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;

import static base.ApiBaseClass.baseUri;
import static base.ApiBaseClass.endpoint;

public class GetInventoryEndpoint {
    @Given("I want to check store inventory")
    public void iWantToCheckStoreInventory() {
        endpoint = "/store/inventory";
    }

    @When("I attempt to fetch inventory")
    public void iAttemptToFetchInventory() {
        SerenityRest
                .given()
                .baseUri(baseUri)
                .when()
                .get(endpoint);
    }
}
