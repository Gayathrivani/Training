package steps;


import io.restassured.response.ResponseBody;
import org.json.simple.JSONObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Step_When {

//    public static Response response;
////    public int StatusCode;
//
//    public JSONObject reqParameter;
//
//    public RequestSpecification httpreqeuest;
//
//
//    @Given("I hit URL of post product in api")
//    public void i_hit_url_of_post_product_in_api()  {
//        RestAssured.baseURI="https://fakestoreapi.com/";
//        httpreqeuest = RestAssured.given();
//        reqParameter= new JSONObject();
//
//        reqParameter.put("SampleTitle","Shoes");
//        reqParameter.put("SamplePrice","13.5");
//        reqParameter.put("SampleDesc","lorem ipsum set");
//        reqParameter.put("SampleImg","https://i.pravatar.c");
//        reqParameter.put("SampleCategory","electronic");
//
//        httpreqeuest.body(reqParameter.toJSONString());
//        response = httpreqeuest.put("products");
//        ResponseBody body=response.getBody();
//        System.out.println("status line ----- "+response.getStatusLine());
//        System.out.println(body.asString());
//
//
//    }
//
//    @And("I pass the request body of product title {}")
//    public void iPassTheRequestBodyOfProductTitleProductTitle(String title) {
//
//
//
//    }
}
