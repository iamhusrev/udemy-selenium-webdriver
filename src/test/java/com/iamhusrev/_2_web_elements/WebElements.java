package com.iamhusrev._2_web_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElements {

    public static void main(String[] args) throws InterruptedException {

        String url = "https://rahulshettyacademy.com/dropdownsPractise/#";
        System.setProperty("webdriver.chrome.driver.", "src/test/resources/driver/chromedriver");


        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);

        dropdown.selectByIndex(3);
        System.out.println("dropdown.getFirstSelectedOption().getText() = " + dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("AED");
        System.out.println("dropdown.getFirstSelectedOption().getText() = " + dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");
        System.out.println("dropdown.getFirstSelectedOption().getText() = " + dropdown.getFirstSelectedOption().getText());


        Thread.sleep(1000);
        driver.close();

    }
}
