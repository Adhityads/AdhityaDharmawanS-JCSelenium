package com.juaracoding.selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeDriverSatu {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Bootcamp\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tokopedia.com");
        //memperbesar tampilan

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //mencari element untuk input, lalu mengisi data
        WebElement test = driver.findElement(By.xpath("//input[@class='css-1wc186l e110g5pc0']"));
        test.sendKeys("sepatu");
        String value = test.getAttribute("value");
        if(value.isEmpty()){
            //mencari element untuk button lalu tekan tombol button
            System.out.println("belum diisi");
            driver.close();
        } else {
            System.out.println("Sudah diisi");
            driver.findElement(By.xpath("//button[@class='css-1czin5k e1v32nag1']")).click();
            js.executeScript("window.scrollBy(0, 10000)");
            Thread.sleep(3000);
            driver.close();
        }
        //mencari element untuk button, lalu tekan tombol button
//        driver.findElement(By.xpath("//button[@class='css-1czin5k e1v32nag1']")).click();

//        Thread.sleep(5000);
//        //untuk close windows
//        driver.close();
    }
}
