package RestATBPractice.Testng.Testngexample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng013 {

    // Data Driven Testing -
    // Test - with multiple inputs
    // loginTest - > 100 of users
    // rEGSTIERATION - DDT

    @DataProvider
    public Object[][] getData(){

        return new Object[][]{

                new Object[]{"admin", "password"},
                new Object[]{"admin", "password1"},
                new Object[]{"admin", "password2"},
        };

    }
    @Test(dataProvider = "getData")
    public void loginTest(String username,String password){

        System.out.println(username);
        System.out.println(password);


    }
}
