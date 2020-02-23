package com.testinium.ismailbilgin;

/**
 *
 * @author Ismail
 */
import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    @Test
    public void valid_UsernameAndPassword() throws InterruptedException {

        HomePage home = new HomePage(driver, wait);
        LoginPage login = new LoginPage(driver, wait);
        // Click on sign-in button in HomePage
        home.click(By.id(home.btnLogIn));
        // Login control

        assertEquals(
                login.UsernameAndPassword("YOUR EMAIL ADDRESS",
                        "YOUR Password"), true);
    }

    @Test
    public void invalid_UsernameAndPassword() throws InterruptedException {

        HomePage home = new HomePage(driver, wait);
        LoginPage login = new LoginPage(driver, wait);
        // Click on sign-in button in HomePage
        home.click(By.id(home.btnLogIn));
        // Login fail check

        assertEquals(
                login.UsernameAndPassword("YOUR EMAIL ADDRESS",
                        "00000000"), false);
    }

    @Test
    public void empty_UsernameAndPassword() throws InterruptedException {

        HomePage home = new HomePage(driver, wait);
        LoginPage login = new LoginPage(driver, wait);
        home.click(By.id(home.btnLogIn));
        // Empty value checks
        assertEquals(login.UsernameAndPassword("", ""),
                false);
    }
}
