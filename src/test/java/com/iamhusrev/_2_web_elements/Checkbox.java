package com.iamhusrev._2_web_elements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser

            //driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
            System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
            driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
            System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
            Thread.sleep(3000);

            List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

            System.out.println(checkboxes.size());

        } finally {

            Thread.sleep(10000);
            driver.close();

        }


    }
}
