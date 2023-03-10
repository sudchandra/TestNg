package Testngtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Parallel {
  WebDriver driver;


      @Test
      void logo () throws InterruptedException {
          System.setProperty("webdriver.chrome.driver", "/Users/sudarshanhs/Downloads/chromedriver_mac64 (4)/chromedriver");
          ChromeOptions ops = new ChromeOptions();


          ops.addArguments("--remote-allow-origins=*");
          driver = new ChromeDriver(ops);

          driver.get("https://www.orangehrm.com/");

          WebElement logoele = driver.findElement(By.xpath("//img[@src='/_resources/themes/orangehrm/dist/images/OrangeHRM_Logo.svg']"));
          Assert.assertTrue(logoele.isDisplayed());
          Thread.sleep(3000);

      }
      @Test
      void title () throws InterruptedException {

          System.setProperty("webdriver.chrome.driver", "/Users/sudarshanhs/Downloads/chromedriver_mac64 (4)/chromedriver");
          ChromeOptions ops = new ChromeOptions();


          ops.addArguments("--remote-allow-origins=*");
          driver = new ChromeDriver(ops);

          driver.get("https://www.orangehrm.com/");
          String title = driver.getTitle();
          Assert.assertEquals(title, "OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM");
          Thread.sleep(3000);
      }

      @AfterMethod
      void teardown ()
      {
          driver.quit();
      }
  }

