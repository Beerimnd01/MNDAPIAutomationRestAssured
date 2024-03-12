package RestATBPractice.Testng.Testngexample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityDemo {

    @Test(priority = 2)
    public void test01(){


        System.out.println("test01");

    }
    @Test(priority = 0)
    public void test02(){
        System.out.println("test02");

    }
    @BeforeMethod
    public void test03(){
        System.out.println("test03");

    }
    @AfterMethod

    public void test04(){
        System.out.println("test04");
    }
}
