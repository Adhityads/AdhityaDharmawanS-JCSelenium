package com.juaracoding.selenium.ujiantiga.pages;

import com.juaracoding.selenium.ujiantiga.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "username")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
    WebElement btnLogin;
    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/div/div/div/a/img")
    WebElement btnMenu;
    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")
    WebElement btnMyAccount;

    public void Log (){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        username.sendKeys("dhittydua");
        password.sendKeys("dhittyjuaracoding");
        btnLogin.click();
        btnMenu.click();

    }
}
