package com.iamhusrev._4_syncronization;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        // Wait globally 5 seconds before each find element operation
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        try {
            driver.manage().deleteAllCookies();
            String[] productNames = {"Cucumber", "Brocolli", "Beetroot"};
            addItems(driver, productNames);
            driver.findElement(By.cssSelector("img[alt='Cart']")).click();
            driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
            driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
            driver.findElement(By.cssSelector("button.promoBtn")).click();
            System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
        } finally {
            Thread.sleep(3000);
            driver.close();
        }
    }

    private static void addItems(WebDriver driver, String[] productNames) {
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        List<String> productNamesList = new ArrayList<>(List.of(productNames));
        for (int i = 0; i < products.size(); i++) {
            String name = products.get(i).getText().split(" ")[0].trim();
            if (productNamesList.contains(name)) {
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
            }
        }
    }
}
