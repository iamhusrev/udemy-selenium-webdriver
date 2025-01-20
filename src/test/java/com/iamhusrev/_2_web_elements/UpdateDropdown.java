package com.iamhusrev._2_web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropdown {


    public static void main(String[] args) throws InterruptedException {
        String url = "https://rahulshettyacademy.com/dropdownsPractise/";

        WebDriver driver = new ChromeDriver();
        driver.get(url);


        try {

            driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

            for (int i = 0; i < 4; i++) {
                driver.findElement(By.id("hrefIncAdt")).click();
            }

            driver.findElement(By.id("btnclosepaxoption")).click();
            Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
            System.out.println(driver.findElement(By.id("divpaxinfo")).getText());


            Thread.sleep(5000);

        } catch (Exception ignored) {

        } finally {
            driver.close();
        }


    }
}
