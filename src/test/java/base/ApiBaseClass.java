package base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

public class ApiBaseClass {
    public static String baseUri = "http://localhost:8080/api/v3";
    public static String endpoint;

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int statusCode) {
        Assert.assertEquals(statusCode, SerenityRest.lastResponse().statusCode());
    }

    @And("the body response should contain {string}")
    public void theResponseStatusCodeShouldBe(String keyword) {
        Assert.assertTrue(SerenityRest.lastResponse().body().prettyPrint().contains(keyword));
    }
}
