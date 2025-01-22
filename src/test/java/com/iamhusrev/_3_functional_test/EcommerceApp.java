package com.iamhusrev._3_functional_test;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceApp {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        try {

            driver.manage().deleteAllCookies();

            String[] productNames = {"Cucumber", "Brocolli", "Beetroot"};
            driver.get("https://rahulshettyacademy.com/seleniumPractise/");

            List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

            List<String> productNamesList = new ArrayList<String>(List.of(productNames));

            for (int i = 0; i < products.size(); i++) {

                String name = products.get(i).getText().split(" ")[0];
                if (productNamesList.contains(name)) {
                    System.out.println(name);
                    driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                }

            }

        } finally {
            Thread.sleep(3000);
            driver.close();
        }

    }
}
