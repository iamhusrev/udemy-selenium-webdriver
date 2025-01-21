package com.iamhusrev._2_web_elements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ChechBoxExercise {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //URL in the browser


            WebElement option1 = driver.findElement(By.cssSelector("input[id='checkBoxOption1']"));
            Assert.assertFalse(option1.isSelected());
            System.out.println(option1.isSelected());
            option1.click();
            System.out.println(option1.isSelected());
            Assert.assertTrue(option1.isSelected());

            List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

            System.out.println(checkboxes.size());

            Thread.sleep(5000);

        } finally {

            driver.close();

        }


    }
}
