package com.juaracoding.selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args) throws InterruptedException {
        //system property untuk chrome driver
//        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "D:\\Bootcamp\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //instatiate a ChromeDriver class
        driver.manage().window().maximize();

        String url = "https://demoqa.com/text-box";

        driver.get(url);

        String titleName = driver.getTitle();
        System.out.println(titleName);

        driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("Juara Coding");
//        userName.sendKeys("Juara Coding");

        JavascriptExecutor js = (JavascriptExecutor) driver;

//        driver.findElement(By.id("userName")).sendKeys("JuaraCoding");
        System.out.println("Input Username");
        driver.findElement(By.id("userEmail")).sendKeys("Info@juaracoding.com");
        System.out.println("Input Email");
        driver.findElement(By.id("currentAddress")).sendKeys("Jakarta");
        System.out.println("Input Current Address");
        driver.findElement(By.id("permanentAddress")).sendKeys("Bekasi");
        System.out.println("Input Permanent Adrress");

        driver.findElement(By.id("submit")).click();
        System.out.println("Button Submit Clicked");

        //scrol vertikal 5000px
        js.executeScript("window.scrollBy(0,500)");
        System.out.println("Scroll Commited");

        //delay harus pakai exception
        Thread.sleep(15000);


        driver.quit();
    }
}