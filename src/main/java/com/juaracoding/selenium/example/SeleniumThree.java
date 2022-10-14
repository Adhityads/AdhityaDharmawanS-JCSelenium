package com.juaracoding.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumThree {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Bootcamp\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        // Find elements using tag name
        List<WebElement> allInputElements = driver.findElements(By.tagName("input"));

        if(allInputElements.size() != 0)
        {
            System.out.println(allInputElements.size() + " Elements found by TagName as input \n");

            for(WebElement inputElement : allInputElements)
            {
                System.out.println(inputElement.getAttribute("placeholder"));
            }
            //Mengisi element yang ada di List
            allInputElements.get(0).sendKeys("Ads");
            System.out.println("Input Filled");
            allInputElements.get(1).sendKeys("S");
            System.out.println("Input Filled");

            System.out.println();
        }
        List<WebElement> allTextAreaElement = driver.findElements(By.tagName("textarea"));
        if(allTextAreaElement.size() != 0)
        {
            System.out.println(allTextAreaElement.size() + " Elements found by TagName as textarea \n");

            for(WebElement textAreaElement : allTextAreaElement)
            {
                System.out.println(textAreaElement.getAttribute("id"));
            }
            System.out.println();
        }
        //find element using xpath
        List<WebElement> allMenuElement = driver.findElements(By.xpath("//*[contains(@id, 'item')]"));
        for(WebElement menuElement : allMenuElement)
            {
                System.out.println(menuElement.getText());
            }
            //click RadioButton
            allMenuElement.get(2).click();
            System.out.println("Menu Radio Button Clicked");

            System.out.println();
        delay(3);
        driver.quit();

    }
    static void delay(int detik ) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
