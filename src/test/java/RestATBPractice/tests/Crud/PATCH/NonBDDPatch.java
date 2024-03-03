package RestATBPractice.tests.Crud.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class NonBDDPatch {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    String token = "bd345f544528794";


    @Test
    public void testPatchREQUEST() {


        // url
        // auth - token , da829f2541bfd38 , headers - json
        // id - 3548
        // payload



        String payloadPATCH = "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";


        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("booking/2956");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token", token);


        // Patch Request
        requestSpecification.body(payloadPATCH).log().all();




        Response response = requestSpecification.when().patch();


        // Get Validatable response to perform validation
        validatableResponse = response.then().log().all();


        validatableResponse.statusCode(200);
        validatableResponse.body("firstname", Matchers.equalTo("Pramod"));
        validatableResponse.body("lastname", Matchers.equalTo("Brown"));

    }
}
