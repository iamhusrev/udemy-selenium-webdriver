package com.iamhusrev;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowActivities {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver.", "src/test/resources/driver/mac/chromedriver");
        WebDriver driver = new ChromeDriver();

        //driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.youtube.com");
        driver.navigate().back();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.close();

    }

}
