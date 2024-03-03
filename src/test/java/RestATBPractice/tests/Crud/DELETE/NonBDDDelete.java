package RestATBPractice.tests.Crud.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDDelete {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    String token = "bd345f544528794";


    @Test
    public void testDELETEREQUEST() {


        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking/891");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token", token);



        Response response = requestSpecification.when().delete();


        // Get Validatable response to perform validation
        validatableResponse = response.then().log().all();


        validatableResponse.statusCode(201);

    }
}