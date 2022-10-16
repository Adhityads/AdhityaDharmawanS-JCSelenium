package com.juaracoding.selenium.adhityadsujiantiga.pages;

import com.juaracoding.selenium.adhityadsujiantiga.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
    private WebDriver driver;

    public Register() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
        @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")
        WebElement btnMyAccount;

        @FindBy(id = "reg_username")
        WebElement regUser;
        @FindBy(id = "reg_email")
        WebElement regEmail;
        @FindBy(id = "reg_password")
        WebElement regPass;
        @FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")
        WebElement btnRegister;

    public  void Regis(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        btnMyAccount.click();
        regUser.sendKeys("dhittydua");
        regEmail.sendKeys("dhitty2@email.com");
        regPass.sendKeys("dhittyjuaracoding");
        btnRegister.click();
        driver.navigate().back();
    }

}
