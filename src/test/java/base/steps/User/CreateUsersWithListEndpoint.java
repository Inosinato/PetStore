package base.steps.User;

import com.google.gson.Gson;
import dto.responses.UserBodyRequest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static base.ApiBaseClass.baseUri;

public class CreateUsersWithListEndpoint {

    String controller, json;

    @Given("I want to create a list of users")
    public void iWantToCreateAListOfUsers() {
        controller = "/user/createWithList";
    }

    @When("I enter details of new users:")
    public void iEnterDetailsOfNewUsers(DataTable userList) {
        Gson gson  = new Gson();
        List<UserBodyRequest> users = new ArrayList<>();
        for(Map<String, String> row : userList.asMaps()) {
            users.add
                    (UserBodyRequest.builder()
                            .id((new Random().nextInt()))
                            .username( row.get("username"))
                            .firstName(row.get("firstname"))
                            .lastName(row.get("lastname"))
                            .email(row.get("email"))
                            .password( row.get("password"))
                            .phone(row.get("phone"))
                            .userStatus(Integer.parseInt(row.get("status")))
                            .build());
        }

        json = gson.toJson(users);
    }

    @And("I attempt to create a list of new users")
    public void iAttemptToCreateAListOfNewUsers() {
        SerenityRest
                .given()
                .contentType(ContentType.JSON)
                .body(json)
                .baseUri(baseUri + controller)
                .when()
                .post();
    }
}
