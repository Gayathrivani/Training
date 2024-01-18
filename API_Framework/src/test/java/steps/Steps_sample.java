package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class Steps_sample {
    public static Response response;
    public int StatusCode;

    public String requestBody,updateBody;
    private static final String BASE_URI = "https://reqres.in";

    @Given("I hit the URL of get product in api")
    public void i_hit_the_url_of_get_product_in_api() {
        RestAssured.baseURI=BASE_URI;

    }

    @When("I pass the URL in the request")
    public void i_pass_the_url_in_the_request() {
        response = given()
                .when()
                .get("/api/users/2");
    }

    @Then("I get the response code as {int}")
    public void i_get_the_response_code_as  (Integer int1) {
        // Validate the response status code
        StatusCode = response.getStatusCode();
        assertEquals(StatusCode, 200, "Unexpected status code");
        System.out.println("When we get Status code is------- "+StatusCode);

    }

    @Given("I try to create a body")
    public void i_try_to_create_a_body() {
        RestAssured.baseURI = BASE_URI;
        // Define the request body for creating a new post
        requestBody = "{\n" +
                "  \"title\": \"New Post\",\n" +
                "  \"body\": \"This is a new post.\",\n" +
                "  \"userId\": 1\n" +
                "}";
    }
    @When("I hit the URL and post the body")
    public void i_hit_the_url_and_post_the_body() {
        // Make a POST request to create a new post
        response = given()
                .contentType("application/json")
                .body(requestBody)
                .when()
                .post("api/users");

    }
    @Then("Verify the response body")
    public void verify_the_response_body() {
        // Validate the response status code
        StatusCode = response.getStatusCode();
        assertEquals(StatusCode, 201, "Unexpected status code");

//         Validate specific details in the response body
        String title = response.jsonPath().getString("title");
        assertEquals(title, "New Post", "Incorrect post title");

        System.out.println("Status code after creating a post is -----"+StatusCode);
        System.out.println("--------------- "+ title + " created successfully--------" );

    }

    @Given("I try to update the post using put method")
    public void iTryToUpdateThePostUsingPutMethod() {
        RestAssured.baseURI = BASE_URI;
        updateBody = "{\n" +
                "  \"title\": \"Updated Post\",\n" +
                "  \"body\": \"This is a updated post.\",\n" +
                "  \"userId\": 2\n" +
                "}";

    }

    @When("I hit the URL and Update the body")
    public void iHitTheURLAndUpdateTheBody() {
        response = given()
                .contentType("application/json")
                .body(updateBody)
                .when()
                .put("/api/users/2");

    }

    @And("Verify the updated body")
    public void verifyTheUpdatedBody() {
        StatusCode = response.getStatusCode();
        assertEquals(StatusCode, 200, "Unexpected status code");
//         Validate specific details in the response body
        String title = response.jsonPath().getString("title");
        assertEquals(title, "Updated Post", "Incorrect post title");

        System.out.println("Status code after updating a post is -----"+StatusCode);
        System.out.println("--------------- "+ title + " successfully--------" );


    }

    @Then("I delete the post and verify the status code")
    public void iDeleteThePostAndVerifyTheStatusCode() {
        response = given()
                .contentType("application/json")
                .body(updateBody)
                .when()
                .delete("/api/users/2");

        StatusCode = response.getStatusCode();
        assertEquals(StatusCode, 204, "Unexpected status code");

        System.out.println("Status code after deleting a post is -----"+StatusCode);
        String type=response.header("content type");

        System.out.println("--------------Deleted successfully--------");
        System.out.println("Type - "+type+ " - there is no content");

    }
}
