package RestATBPractice.Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg000 {
    @Test
    public void testcase001(){
        Assert.assertEquals(true, true);
    }
    @Test
    public void testcase002(){
        Assert.assertEquals(false, true);
    }


}
