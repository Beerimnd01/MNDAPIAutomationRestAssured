package RestATBPractice.tests.Crud.GET;

import io.restassured.RestAssured;

public class BDDstyleGet {
    public static void main(String[] args) {

        //Get request
        //URL
        //Header
        //GetMethod
        //base url-https://www.zippopotam.us
        //basepath-/IN/509206
        //Payload
        //auth- no


        //status code
        //Response code
        //Time Headers, Coockies


        //Gerkin -->given, when, then
        //BDD- is framework
        RestAssured
                .given().baseUri("https://www.zippopotam.us")
                .basePath("/IN/560037")
                .when().log().all().get().
                then().log().all().statusCode(200);
    }
}
