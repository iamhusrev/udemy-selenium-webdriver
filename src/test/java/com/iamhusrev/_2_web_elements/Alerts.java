package com.iamhusrev._2_web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        try {
            String text = "husrev";

            driver.get("https://rahulshettyacademy.com/AutomationPractice/");
            driver.findElement(By.id("name")).sendKeys(text);
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("[id='alertbtn']")).click();

            String alertText = driver.switchTo().alert().getText();
            System.out.println("alertText = " + alertText);
            driver.switchTo().alert().accept();


            driver.findElement(By.id("name")).sendKeys(text);
            Thread.sleep(3000);
            driver.findElement(By.id("confirmbtn")).click();
            alertText = driver.switchTo().alert().getText();
            System.out.println("alertText = " + alertText);
            driver.switchTo().alert().accept();


        }
        finally {
            Thread.sleep(5000L);
            driver.close();
        }

    }
}
