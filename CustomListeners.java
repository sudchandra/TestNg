package Testngtutorial;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class CustomListeners implements ITestListener {
    public void onStart(ITestContext arg)//execute before the exection of a test
    {
        System.out.println("starts test execution"+arg.getName());
    }
    public void onFinish(ITestContext arg)//it willl execute after
    {
        System.out.println("finsh test execution"+arg.getName());
    }
    public void onTestStart(ITestContext arg0)//willl exe before the main test starts
    {
        System.out.println("after the test starts"+arg0.getName());
    }
    public void onTestSkipped(ITestContext arg0)//exe when the test is skipped
    {
        System.out.println("the test case is skipped"+arg0.getName());
    }
    public void onTestSucces(ITestContext arg0)//willl execute when the test case is passed
    {
        System.out.println("the test case is pass"+ arg0.getName());
    }
    public void onTestFailure(ITestContext arg0)//willl execute when the test case is passed
    {
        System.out.println("the test case is fail"+ arg0.getName());
    }


    }


