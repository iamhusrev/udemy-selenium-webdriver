package com.iamhusrev._2_web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyingUiElementsEnabledDisabled {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            String url = "https://rahulshettyacademy.com/dropdownsPractise/#";
            System.setProperty("webdriver.chrome.driver.", "src/test/resources/driver/chromedriver");

            driver.get(url);

            WebElement element1 = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
            WebElement element2 = driver.findElement(By.name("ctl00$mainContent$view_date2"));
            WebElement div1 = driver.findElement(By.id("Div1"));

            element1.click();

            if (div1.getDomAttribute("style").contains("1")) {
                System.out.println("its enabled");
                Assert.assertTrue(true);
            } else {
                Assert.fail();
            }


            Thread.sleep(5000);
        } finally {

            driver.close();

        }


    }
}
