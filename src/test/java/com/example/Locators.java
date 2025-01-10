package com.example;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver.", "/Users/husrev/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.id("inputUsername")).sendKeys("husrev");
        driver.findElement(By.name("inputPassword")).sendKeys("husrev");

        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        driver.findElement(By.linkText("Forgot your password?")).click();


        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("husrev");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("husrev");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
        driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("05315035606");
        driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).sendKeys("05315035606");


        System.out.println(driver.findElement(By.xpath("//form/h2")).getText());




    }
}
