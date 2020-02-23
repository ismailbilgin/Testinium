package com.testinium.ismailbilgin;

/**
 *
 * @author Ismail
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class HomeTest extends BaseTest{
      @Test
      public void   valid_checkMenuLinks() throws   InterruptedException{
          
          HomePage home = new HomePage(driver,wait);
          //Second value control via first parameter
          assertEquals(home.checkMenuLinks(home.btnAnaSayfa),
                                   "https://www.n11.com/");
           
       }
@Test
       public void   invalid_checkMenuLinks() throws   InterruptedException {
          
          HomePage home = new HomePage(driver,wait);
          //Differences between first parameter and second value
          assertNotEquals(home.checkMenuLinks(home.btnAnaSayfa),
                                   "https://www.google.com/");
          assertNotEquals(home.checkMenuLinks(home.btnLogIn),
                                               "https://www.youtube.com/");
          
        }
}
