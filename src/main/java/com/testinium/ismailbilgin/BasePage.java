package com.testinium.ismailbilgin;
/**
 *
 * @author Ismail
 */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
    // Methods
public abstract class BasePage {
     public WebDriver driver;
     public WebDriverWait wait;
     public static WebElement element = null;
     //Constructor
     public BasePage (WebDriver driver, WebDriverWait wait){
         this.driver = driver;
         this.wait = wait;
     }
     //Click Metod
     public void click (By elementLocation) {
         driver.findElement(elementLocation).click();
     }
     //Text writing
     public void writeText (By elementLocation, String text) {
         driver.findElement(elementLocation).clear();
         driver.findElement(elementLocation).sendKeys(text);
     }
     //Text reading
     public String readText (By elementLocation) {
         return driver.findElement(elementLocation).getText();
     }
     //Element list
     public List<WebElement> getElements(By elementLocation){
         return driver.findElements(elementLocation);
     }  
     //Element pull
     public WebElement getElement(By elementLocation){
         return driver.findElement(elementLocation);
     }
}
