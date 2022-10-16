package com.juaracoding.selenium.adhityadsujiantiga;

import com.juaracoding.selenium.adhityadsujiantiga.drivers.DriverSingleton;
import com.juaracoding.selenium.adhityadsujiantiga.pages.AddToCart;
import com.juaracoding.selenium.adhityadsujiantiga.pages.Login;
import com.juaracoding.selenium.adhityadsujiantiga.pages.Register;
import com.juaracoding.selenium.adhityadsujiantiga.utils.Constants;
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
