package com.juaracoding.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTwo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Bootcamp\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://demoqa.com/checkbox";
        driver.get(url);

        WebElement titleMenu =  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div"));
        System.out.println(titleMenu.getText());
        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[3]")).click();
        System.out.println("Home Checklist");
        delay(1);
        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
        System.out.println("Toggle Home Clicked");
        delay(1);
        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[3]")).click();
        System.out.println("Desktop UnChecklist");
        delay(1);
        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[3]")).click();
        System.out.println("Document UnChecklist");
        delay(1);
        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[3]")).click();
        System.out.println("Downloads UnChecklist");
        delay(1);
        driver.findElement(By.id("item-2")).click();
        System.out.println("Radio Button Clicked");

//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]")).click();
//        System.out.println("Yes Clicked");
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]")).click();
//        System.out.println("Impressive clicked");

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement yesRadio = driver.findElement(By.id("yesRadio"));
//        WebElement impressiveRadio = driver.findElement(By.id("impressiveRadio"));
//        js.executeScript("arguments[0].click();", yesRadio);
//        System.out.println("Yes Radio Clicked use JavascriptExecutor");
//        js.executeScript("arguments[0].click();", impressiveRadio);
//        System.out.println("Impressive Radio Clicked use JavascriptExecutor");

        delay(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement yesRadio = driver.findElement(By.id("yesRadio"));
        WebElement Impressive = driver.findElement(By.id("impressiveRadio"));
        js.executeScript("arguments[0].click();", yesRadio);
        System.out.println("Yes Radio Clicked use javascript");
        delay(1);
        js.executeScript("arguments[0].click();", Impressive);
        System.out.println("Immpresive radio clicked use javascript");
        delay(1);

        driver.get("https://google.com");
        System.out.println("Google");
        delay(1);
        WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        search.sendKeys("juara coding");
        search.sendKeys(Keys.ENTER);
        System.out.println("Searching Juara Coding");
        delay(1);
        driver.navigate().back();
        System.out.println("Navigate Back");

        delay(3);

        //menu widget select menu
        driver.get("https://demoqa.com/select-menu");
        System.out.println("Select Menu");
        js.executeScript("window.scrollBy(0,500)");
        delay(1);
        WebElement elementSelect = driver.findElement(By.id("oldSelectMenu"));
        Select oldSelectMenu = new Select(elementSelect);
        oldSelectMenu.selectByIndex(1);
        delay(1);
        oldSelectMenu.selectByValue("10");
        delay(1);
        oldSelectMenu.selectByVisibleText("Magenta");

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

