package Testngtutorial;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class )

public class Listenersexample {
    @Test( )


    void test1()
    {
        System.out.println("helloo this is the frst case");
        Assert.assertEquals("a","a");
    }
    @Test
    void test2()
    {
        System.out.println("hello");
        Assert.assertEquals("a","b");
    }
    @Test
    void test3()
    {
        System.out.println("namstee");
        throw new SkipException("this is the skip exception");
    }

}
