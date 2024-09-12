package base;

import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;

public class ApiBaseClass {

    public String baseUri = "http://localhost:8080/api/v3";

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int statusCode) {
        SerenityRest
                .then()
                .statusCode(statusCode);
    }
}
