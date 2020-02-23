package com.testinium.ismailbilgin;
/**
 *
 * @author Ismail
 */
import java.io.File;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseTest {
      protected static String ChromePath = "C:\\Chrome Web Driver\\chromedriver.exe";
      
      protected static ChromeDriverService service;
      
      protected static WebDriver driver;
      
      protected static WebDriverWait wait;
      // Main 
      public void BaseTest(){
          
          
      }
      @BeforeClass
      public static void Setup(){
          //  Starting
          service = new ChromeDriverService.Builder().
                 usingDriverExecutable(new File(ChromePath)).
                 usingAnyFreePort().
                 build();
          try {
             service.start();
          } catch (Exception e) {
             e.printStackTrace();
          }
          System.setProperty("webdriver.chrome.driver", ChromePath);
          
          driver = new  RemoteWebDriver(service.getUrl(),DesiredCapabilities.chrome());
          // Window Maxmize
          driver.manage().window().maximize();
       }
      
      
@AfterClass
       public static void Stop(){
          
           driver.quit();
           service.stop();
       }    
}
