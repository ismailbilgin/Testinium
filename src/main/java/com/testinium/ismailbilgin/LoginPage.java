package com.testinium.ismailbilgin;

/**
 *
 * @author Ismail
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    // Constructor

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    
    public String Mail = "email"; //   mail
    public String Password = "password"; //   password
    public String btnNext = "loginButton"; //   login button

    public boolean UsernameAndPassword(String mail, String password) throws InterruptedException {
        // writing email
        writeText(By.id(Mail), mail);
        // Password
        writeText(By.id(Password), password);
        // tık.
        click(By.className(btnNext));

        // URL check
        if (driver.getCurrentUrl().contains("https://n11.com/")) {
            return driver.getCurrentUrl().contains("https://n11.com/");
        }
        else {
            return false;
        }
    }
}
