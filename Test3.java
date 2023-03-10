package Testngtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Test3 {
    WebDriver driver;

    void setup()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/sudarshanhs/Downloads/chromedriver_mac64 (2)/chromedriver");
        driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
    }
}
