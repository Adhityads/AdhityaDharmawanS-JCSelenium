package com.juaracoding.selenium.posttest13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SoalSatu {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Bootcamp\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://lms.juaracoding.com/");
        driver.quit();
    }
}
