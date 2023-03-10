package Testngtutorial;

import org.testng.annotations.*;

public class Annotations2 {

        @BeforeClass
//before executoion of the test methods in a class it execute only once
        void beforeclass()
        {
            System.out.println("all the methods should execute before the class");
        }
        @AfterClass
//it execuyte only once after the execution of the whole class
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


        @Test(priority = 3)
                void test3()
        {
            System.out.println("test case 3");
        }
        @Test(priority = 4)
            void test4()
            {
                System.out.println("test case 4 shiulkd bec excuted");
            }
            @BeforeSuite
            void beforesuite()
            {
                System.out.println("before the testsuite");
            }
            @AfterSuite
    void aftersuite()
            {
                System.out.println("after the suite");
            }
        }




