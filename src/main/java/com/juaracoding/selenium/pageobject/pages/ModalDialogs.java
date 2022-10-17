package com.juaracoding.selenium.pageobject.pages;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalDialogs {
        private WebDriver driver;

        public ModalDialogs(){
            this.driver = DriverSingleton.getDriver();
            PageFactory.initElements(driver, this);
        }

        @FindBy(id = "showSmallModal")
        WebElement btnModalOne;

        @FindBy(id = "closeSmallModal")
        WebElement btnCloseSmallmodal;
        //modal-body
        @FindBy(className = "modal-body")
        WebElement txtModalBody;

        public void showSmallModal(){
            btnModalOne.click();
            delay(5);
            System.out.println(txtModalBody.getText());
//            driver.switchTo().alert().dismiss();
            btnCloseSmallmodal.click();



        }

    static void delay(int detik) {
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
