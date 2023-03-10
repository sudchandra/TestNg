package Testngtutorial;

import org.testng.annotations.Test;

public class Basic {

   @Test(priority = 2)
   void login()
    {
        System.out.println("loggging in");

    }
    @Test(priority = 1)
    void close()
    {
        System.out.println("closeddd");
    }

}
