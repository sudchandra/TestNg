package Testngtutorial;

import org.testng.annotations.Test;

public class GroupingTests {
    @Test(groups = {"sanity"})
    void test1()
    {
        System.out.println("this is the test1");
    }
    @Test(groups = {"sanity","regression"})
    void test2()
    {
        System.out.println("this is the test2");
    }
    @Test(groups = {"unit"})
    void test3()
    {
        System.out.println("this is the test3");
    }
    @Test(groups = {"integration"})
    void test4()
    {
        System.out.println("this is the test4");
    }
}
