package RestATBPractice.misc.gson.Pojoexamples;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.testng.annotations.Test;


public class SimpleSeralization {
    //    {
//            "firstName" : "Pramod",
//                "lastName" : "Dutta",
//                "gender" : "M",
//                "age" : 31,
//                "salary" : 500.00,
//                "married" : false
//        }
    @Test
            public void test1(){
        Employee employeeObject= new Employee();
       employeeObject.setFirstName("Beera");
       employeeObject.setLastName("mandadi");
        employeeObject.setAge(31);
        employeeObject.setSalary(500.00);
        employeeObject.setMarried(false);
        employeeObject.setGender("M");
        //Creat Gson Object to Serialized

        Gson gson= new Gson();
        String gsonemployee= gson.toJson(employeeObject);
        System.out.println(gsonemployee);

        //convert to Pretty JSON String fromat
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        String employeeJsonSringUsingJsonBuilder = gsonBuilder.toJson(employeeObject);
        System.out.println("Pretty JSON String :- ");
        System.out.println(employeeJsonSringUsingJsonBuilder);





    }


}
