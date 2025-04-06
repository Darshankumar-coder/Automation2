package org.example.vwotestcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.lang.InterruptedException;

public class Testvwologin {
    @Test
    public void test_selenium_01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        WebElement emailbox = driver.findElement(By.id("login-username"));
        emailbox.sendKeys("admin@admin.com");
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("admin");
        WebElement btnsubmit = driver.findElement(By.id("js-login-btn"));
        btnsubmit.click();
        Thread.sleep(5000);
        WebElement errormessage = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(errormessage.getText(),"Your email, password, IP address or location did not match");
    }
}
