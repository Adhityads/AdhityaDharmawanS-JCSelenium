package com.juaracoding.selenium.posttestempatbelas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SoalKedua {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Bootcamp\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com/form");
        System.out.println("Web Berhasil Dibuka");

        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Adhitya Dharmawan");
        delay(1);
        System.out.println("First name Filled");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Santosa");
        delay(1);
        System.out.println("Last name Filled");
        driver.findElement(By.xpath("//*[@id=\"job-title\"]")).sendKeys("IT");
        delay(1);
        System.out.println("Job title Filled");
        driver.findElement(By.xpath("//*[@id=\"radio-button-2\"]")).click();
        delay(1);
        System.out.println("Education Selected");
        driver.findElement(By.xpath("//*[@id=\"checkbox-1\"]")).click();
        delay(1);
        System.out.println("Sex Selected");

        WebElement elementSelect = driver.findElement(By.xpath("//*[@id=\"select-menu\"]"));
        Select experience = new Select(elementSelect);
        experience.selectByIndex(1);
        delay(1);
        System.out.println("Experience Selected");
        driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("10/14/2022");
        delay(1);
        System.out.println("Date Filled");
        delay(3);
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
        delay(1);
        System.out.println("Button Submit Clicked");
        delay(3);
        driver.close();

    }
    static void delay(int detik ) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
