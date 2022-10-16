package com.juaracoding.selenium.adhityadsujiantiga.pages;

import com.juaracoding.selenium.adhityadsujiantiga.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {
    private WebDriver driver;

    public AddToCart() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div/h3/a")
    WebElement btnPilih;
    @FindBy(id = "pa_color")
    WebElement pilihColor;
    @FindBy(id = "pa_size")
    WebElement pilihSize;
    @FindBy(xpath = "//*[@id=\"product-1497\"]/div[1]/div[2]/form/div/div[2]/button")
    WebElement add;

    public void cart(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        btnPilih.click();
        js.executeScript("window.scrollBy(0, 500)");
        WebElement elementSelectColor = pilihColor;
        Select color = new Select(elementSelectColor);
        color.selectByIndex(1);
        WebElement elementSelectSize = pilihSize;
        Select size = new Select(elementSelectSize);
        size.selectByIndex(2);
        add.click();
    }

}
