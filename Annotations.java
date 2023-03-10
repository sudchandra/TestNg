package Testngtutorial;

import org.testng.annotations.*;

public class Annotations {
    @BeforeClass//before executoion of the test methods in a class it execute only once
    void beforeclass()
    {
        System.out.println("all the methods should execute before the class");
    }
@AfterClass//it execuyte only once after the execution of the whole class
    void after()
{
    System.out.println("after class method should be executed");
}

    @BeforeMethod
    void beforemethod()
    {
        System.out.println("before the method executes");
    }
    @AfterMethod
    void aftermethod()
    {
        System.out.println("after the method it will execute");
    }

    @Test(priority = 1)
    void Test1()
    {
        System.out.println("this is the first method");
    }
    @Test(priority = 2)
    void test2(){
        System.out.println("tset2 is passsssed");


    }
    @BeforeTest
    void beforetest()//execute before all the methods
    {
        System.out.println("before the test");
    }
    @AfterTest
    void aftrtest()
    {
        System.out.println("after the test");
    }

}
