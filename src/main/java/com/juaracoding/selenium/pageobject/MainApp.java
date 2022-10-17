package com.juaracoding.selenium.pageobject;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import com.juaracoding.selenium.pageobject.pages.Alerts;
import com.juaracoding.selenium.pageobject.pages.Frames;
import com.juaracoding.selenium.pageobject.pages.Login;
import com.juaracoding.selenium.pageobject.pages.ModalDialogs;
import com.juaracoding.selenium.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;

public class MainApp {
    public static void main(String[] args) {

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
//        driver.get(Constants.URL);

//        WebTables webTables = new WebTables();
//        webTables.registrationForm("Text 1", "Text 2","text@email.com","20","20000","SQA");
//
//        //Menutup Iklan
//        WebElement ads = driver.findElement(By.id("adplus-anchor"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", ads);

//        Alerts alert = new Alerts();
//        alert.alertButton();
//        alert.timerAlertButton();
//        alert.confirmButton();
//        alert.promtButton();
//        driver.quit();
//        driver.get("https://demoqa.com/modal-dialogs");
//        ModalDialogs modalDialogs = new ModalDialogs();
//        modalDialogs.showSmallModal();

        driver.get("https://demoqa.com/frames");
        Frames frames = new Frames();
        frames.sampleFrame();

        driver.quit();


    }

}
