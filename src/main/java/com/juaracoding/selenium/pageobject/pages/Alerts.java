package com.juaracoding.selenium.pageobject.pages;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alerts {
    private WebDriver driver;

    public Alerts(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "alertButton")
    WebElement btnAlertOne;

    @FindBy(id = "timerAlertButton")
    WebElement btnAlertTwo;

    @FindBy(id = "confirmButton")
    WebElement btnAlertThree;

    @FindBy(id = "promtButton")
    WebElement btnAlertFour;

    public void alertButton() {
        btnAlertOne.click();
        delay(1);
        driver.switchTo().alert().accept();
        System.out.println("Button OK Clicked");
        delay(1);
    }
     public void timerAlertButton() {
         btnAlertTwo.click();
         System.out.println("Button Timer Clicked");
         delay(6);
         driver.switchTo().alert().accept();
     }
     public void confirmButton() {
         btnAlertThree.click();
         delay(1);
         driver.switchTo().alert().accept();
         System.out.println("Button Confirm CLicked");
         delay(1);
         btnAlertThree.click();
         delay(1);
         driver.switchTo().alert().dismiss();
         System.out.println("Button Cancel Clicked");
         delay(1);
     }
     public void promtButton() {
         btnAlertFour.click();
         delay(1);
         driver.switchTo().alert().dismiss();
         System.out.println("Button Cancel Clicked");
         delay(1);
         btnAlertFour.click();
         delay(1);
         System.out.println("Button Promt Clicked");
         driver.switchTo().alert().sendKeys("ads");
         driver.switchTo().alert().accept();
         System.out.println("Username Filled");
         delay(5);
     }
    static void delay(int detik) {
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
