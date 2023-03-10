package Testngtutorial;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Dependency {
    @Test
    void startcar()
    {
        System.out.println("car has started");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"startcar"})
    void runcar()
    {
        System.out.println("driving a car");
    }
    @Test(dependsOnMethods = {"runcar","startcar"},alwaysRun = true)
    void parkcar()
    {
        System.out.println("car has parked");
    }
}
