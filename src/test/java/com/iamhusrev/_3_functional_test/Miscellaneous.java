package com.iamhusrev._3_functional_test;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellaneous {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {

            driver.manage().deleteAllCookies();

            driver.get("http://google.com");

            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            String desktopPath = System.getProperty("user.home") + "/Desktop/";
            File dest = new File(desktopPath + "screenshot.png");
            FileUtils.copyFile(src, dest);

            System.out.println("Ekran görüntüsü kaydedildi: " + dest.getAbsolutePath());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            Thread.sleep(3000);
            driver.close();
        }
    }

}
