package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.jsoup.Connection;
import org.testng.Assert;


public class Step_Given {

//    public static Response response;
//    public int StatusCode;
//
//    public RequestSpecification httpreqeuest;
//
//    public ResponseBody body;
//
//    @Given("I hit the URL of get product in api")
//    public void i_hit_the_url_of_get_product_in_api() {
//        RestAssured.baseURI="https://fakestoreapi.com/";
//
//    }
//    @When("I pass the URL in the request")
//    public void i_pass_the_url_in_the_request() {
//        httpreqeuest=RestAssured.given();
//        response=httpreqeuest.get("products");
//        System.out.println("********* "+response);
//
//    }
//    @Then("I get the response code as {int}")
//    public void i_get_the_response_code_as  (Integer int1) {
//        StatusCode = response.getStatusCode();
//        System.out.println("_____code__________" + StatusCode);
////        System.out.println(response.contentType());
//        Assert.assertEquals(StatusCode, int1.intValue());
//
//    }
//
//    @Then("I verify the rate of the first product is {}")
//    public void i_verify_the_rate_of_the_first_product_is(String category) {
//        body =response.getBody();
//
//        String responseBody=body.asString();
//
//        JsonPath JPath=response.jsonPath();
//
//        String s1=JPath.getJsonObject("category[0]").toString();
//
//        Assert.assertEquals(category,s1);
//    }



}
