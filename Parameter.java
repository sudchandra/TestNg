package Testngtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Parameter {
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})

    void setup(String browser,String app)
    {
        System.setProperty("webdriver.chrome.driver", "/Users/sudarshanhs/Downloads/chromedriver_mac64 (4)/chromedriver");
        ChromeOptions ops = new ChromeOptions();


        ops.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(ops);
        driver.get(app);


    }
    @Test
    void logo()
    {
        WebElement logo=driver.findElement(By.xpath("//a[normalize-space()='redbus']"));
        Assert.assertTrue(logo.isDisplayed());
    }
    @Test
    void hometitle()
    {
        String title= driver.getTitle();
        Assert.assertEquals("Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India",title);
    }
    @AfterClass
    void teardown()
    {
        driver.quit();
    }
}
