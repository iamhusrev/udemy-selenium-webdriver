package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver.", "/Users/husrev/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.batimkimya.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.close();
        driver.quit();


        System.setProperty("webdriver.gecko.driver.", "/Users/husrev/Documents/geckodriver");
        WebDriver firefoxDriver = new FirefoxDriver();

        firefoxDriver.get("https://www.google.com");
        System.out.println(firefoxDriver.getTitle());
        System.out.println(firefoxDriver.getCurrentUrl());

        firefoxDriver.close();
        firefoxDriver.quit();



    }
}
