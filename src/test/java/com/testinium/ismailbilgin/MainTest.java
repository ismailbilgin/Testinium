package com.testinium.ismailbilgin;
//import groovyjarjarantlr.collections.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Ismail
 */
public class MainTest extends BaseTest {
    public static void main(String[]   args) {
        
      Setup();
      
      driver.get("https://www.n11.com/");   
     
      WebElement btnClick = driver.findElement(By.className("btnSignIn"));
      btnClick.click();
      
      // Read email address in the given csv file
      WebElement MailClick = driver.findElement(By.id("email"));
      MailClick.click();

      //Please Enter Valid Credentials HERE
      MailClick.sendKeys("YOUR EMAIL ADDRESS");
      
      // Read password address in the given csv file
      WebElement password = driver.findElement(By.id("password"));
      password.click();
      password.sendKeys("YOUR PASSWORD");
      
      // Click on Loginbtn
      WebElement loginbtn = driver.findElement(By.id("loginButton"));
      loginbtn.click();
      
       // // Write "bilgisayar" in search box
      WebElement txtSearch = driver.findElement(By.id("searchData"));
      txtSearch.click();
      txtSearch.sendKeys("bilgisayar");

      // Clcik on Search
      WebElement btnSearch = driver.findElement(By.className("searchBtn"));
      btnSearch.click();
      
      // muhtemelen yanlış mantık ama ilerleyebilmek için...
      driver.get("https://www.n11.com/bilgisayar?q=bilgisayar&pg=2");
      
        // Second page check
       boolean contains = driver.getCurrentUrl().contains("https://www.n11.com/bilgisayar?q=bilgisayar&pg=2");
       if(contains != true){
           Stop();
       }
       
       // Select pc
      WebElement ListItem = driver.findElement(By.xpath(".//*[@id='view']/ul/li[2]"));
      WebElement clickItem = ListItem.findElement(By.className("productName"));
      clickItem.click();
      
      // Add basket
      WebElement SepetAtClick = driver.findElement(By.cssSelector(".btn.btnGrey.btnAddBasket"));
      SepetAtClick.click();

      
      // Go basket
      WebElement clickOnBasket = driver.findElement(By.className("myBasket"));
      clickOnBasket.click();
      
      // increase the product count
      WebElement clickOnIncrease = driver.findElement(By.cssSelector(".spinnerUp.spinnerArrow"));
      clickOnIncrease.click();
      
      // Delete the products
      WebElement deleteProduct = driver.findElement(By.cssSelector(".removeProd.svgIcon.svgIcon_trash"));
      deleteProduct.click();
      
      
      
      // Get request via RestAssured
      Rest_Assured request = new Rest_Assured();
      request.n11_RestAssured();
      
      Stop();
    }
}
