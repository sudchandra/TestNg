package Testngtutorial;

import org.testng.annotations.Test;

public class PriorityandDisable {
    @Test(priority = 1)
    void test1()
    {
        System.out.println("test case 1");
    }
    @Test(priority =2 )
            void test2()
    {
        System.out.println("test case 2");
    }
    @Test(priority = 3,enabled = false)
    void test3()
    {
        System.out.println("tsest case 3");
    }
}
