package com.juaracoding.selenium.posttestempatbelas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SoalPertama {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Bootcamp\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com/buttons");
        System.out.println("Web Berhasil Dibuka");

        driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[1]")).click();
        System.out.println("Button Primary Clicked");
        delay(1);
        driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[2]")).click();
        System.out.println("Button Success Clicked");
        delay(1);
        driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[3]")).click();
        System.out.println("Button Info Clicked");
        delay(1);
        driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[4]")).click();
        System.out.println("Button Warning Clicked");
        delay(1);
        driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[5]")).click();
        System.out.println("Button Danger Clicked");
        delay(1);
        driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[6]")).click();
        System.out.println("Button Link Clicked");
        delay(1);
        driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[1]")).click();
        System.out.println("Button Left Clicked");
        delay(1);
        driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[2]")).click();
        System.out.println("Button Middle Clicked");
        delay(1);
        driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[3]")).click();
        System.out.println("Button Right Clicked");
        delay(1);
        driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/button[1]")).click();
        System.out.println("Button 1 Clicked");
        delay(1);
        driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/button[2]")).click();
        System.out.println("Button 2 Clicked");
        delay(1);

        driver.findElement(By.xpath("//*[@id=\"btnGroupDrop1\"]")).click();
        System.out.println("Button Dropdown Clicked");
        delay(1);
        driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/div/div/a[1]")).click();
        System.out.println("Dropdown Link 1 clicked");
        delay(1);
        driver.findElement(By.xpath("//*[@id=\"btnGroupDrop1\"]")).click();
        System.out.println("Button Dropdown Clicked");
        delay(1);
        driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/div/div/a[2]")).click();
        System.out.println("Dropdown Link 2 clicked");
        delay(1);


        delay(2);
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
