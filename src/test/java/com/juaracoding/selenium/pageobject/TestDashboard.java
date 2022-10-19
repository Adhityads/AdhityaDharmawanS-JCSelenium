package com.juaracoding.selenium.pageobject;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import com.juaracoding.selenium.pageobject.pages.Dashboard;
import com.juaracoding.selenium.pageobject.pages.Login;
import com.juaracoding.selenium.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDashboard {
    public static WebDriver driver;
    private Login login;
    private Dashboard dashboard;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance("Chrome");
        driver = DriverSingleton.getDriver();
//        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//        driver.get(url);
    }

    @BeforeMethod
    public void pageObject() {

        login = new Login();
        dashboard = new Dashboard();
    }

    @AfterClass
    public void closeBrowser() {
        delay(Constants.DETIK);
        driver.quit();
    }

    @Test(priority = 1)
    public void testDashboardPage() {
        delay(Constants.DETIK);
        //PreCondition
//        login.login("Admin", "admin123");
        //step
        dashboard.menuDashboard();
        Assert.assertEquals(dashboard.getTxtDashboard(),"Launching Soon");
        System.out.println("Test Case Dashboard Page");
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
