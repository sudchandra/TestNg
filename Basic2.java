package Testngtutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Basic2 {

    @Test(priority = 1)
    void home()
    {
        System.out.println("welcome to nmamit");
    }
    @Test(priority = 2)
    void login()
    {
        System.out.println("please enter your detals");
        Assert.assertEquals(1,2);
    }
    @Test(priority = 3)
    void register()
    {
        System.out.println("register herre");
    }
    @Test(priority = 4)
    void close()
    {
        System.out.println("please close");
    }
}
