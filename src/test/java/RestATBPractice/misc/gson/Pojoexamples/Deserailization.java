package RestATBPractice.misc.gson.Pojoexamples;

import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Deserailization {

    @Test
    public void DeSerializationTest(){

        String jsonString = "{\r\n" + "  \"firstName\" : \"Beera\",\r\n" + "  \"lastName\" : \"Mand\",\r\n"
                + "  \"gender\" : \"M\",\r\n" + "  \"age\" : 31,\r\n" + "  \"salary\" : 3422.33,\r\n"
                + "  \"married\" : false\r\n" + "}";

        Gson gson = new Gson();
        Employee employeeObject = gson.fromJson(jsonString,Employee.class);


        String firstName = employeeObject.getFirstName();
        System.out.println(firstName);
        String lastName = employeeObject.getLastName();
        System.out.println(lastName);

        Assert.assertEquals(firstName,"Beera");







    }


}
