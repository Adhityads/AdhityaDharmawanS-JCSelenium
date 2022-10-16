package com.juaracoding.selenium.ujiantiga;

import com.github.dockerjava.core.dockerfile.DockerfileStatement;
import com.juaracoding.selenium.ujiantiga.drivers.DriverSingleton;
import com.juaracoding.selenium.ujiantiga.pages.AddToCart;
import com.juaracoding.selenium.ujiantiga.pages.Login;
import com.juaracoding.selenium.ujiantiga.pages.Register;
import com.juaracoding.selenium.ujiantiga.utils.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainApp {
    public static void main(String[] args) {
        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);


        Register register = new Register();
        register.Regis();

        Login login = new Login();
        login.Log();

        AddToCart addToCart = new AddToCart();
        addToCart.cart();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
