package com.iamhusrev._2_web_elements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver.", "src/test/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser

            driver.findElement(By.id("autosuggest")).sendKeys("ind");
            Thread.sleep(3000);
            List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

            for (WebElement option : options) {
                System.out.println("option.getText() = " + option.getText());
                if (option.getText().equalsIgnoreCase("india")) {
                    option.click();
                    break;
                }
            }
        } finally {

            Thread.sleep(10000);
            driver.close();

        }


    }
}
