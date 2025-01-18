package com.iamhusrev;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LocatorsFireFox {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver.", "src/test/resources/driver/geckodriver");
        WebDriver driver = new FirefoxDriver();


        String username = "rahul";
        String password;

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        password = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(username);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();

        Thread.sleep(2000);
        System.out.println((driver.findElement(By.tagName("p")).getText()));
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + username + ",");
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        driver.close();

    }

    public static String getPassword(WebDriver driver) throws InterruptedException {


        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);//
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
        //Please use temporary password 'rahulshettyacademy' to Login.
        String[] passwordArray = passwordText.split("'");
        // 1st index - rahulshettyacademy


        return passwordArray[1];

    }


}
