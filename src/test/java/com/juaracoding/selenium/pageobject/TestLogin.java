package com.juaracoding.selenium.pageobject;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import com.juaracoding.selenium.pageobject.pages.Login;
import com.juaracoding.selenium.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin {
    public static WebDriver driver;
    private Login login;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance("Chrome");
        driver = DriverSingleton.getDriver();
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(url);
    }

    @BeforeMethod
    public void pageObject() {

        login = new Login();
    }

    @AfterClass
    public void closeBrowser() {
        delay(3);
//        driver.quit();
    }

    @Test(priority = 3)
    public void testValidLogin() {
        delay(Constants.DETIK);
        login.login("Admin", "admin123");
        Assert.assertEquals(login.getTxtEmployeeInformation(),"Employee Information");
        System.out.println("Test Case valid login");
    }

    @Test(priority = 1)
    public void testInvalidLogin(){
        delay(Constants.DETIK);
        login.login("admin","admin11");
        Assert.assertEquals(login.getTxtInvalidLogin(),"Invalid credentials");
        System.out.println("Test Case Invalid Login");
    }

    @Test(priority = 2)
    public void testUsernamePasswordKosong(){
        delay(Constants.DETIK);
        login.login("","");
        Assert.assertEquals(login.getTxtRequired(),"Required");
        System.out.println("Test Case Username Empty");
        System.out.println("Test Case Password Empty");
    }

    static void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
