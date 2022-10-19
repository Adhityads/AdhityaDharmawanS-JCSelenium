package com.juaracoding.selenium.pageobject;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import com.juaracoding.selenium.pageobject.pages.Dashboard;
import com.juaracoding.selenium.pageobject.pages.Login;
import com.juaracoding.selenium.pageobject.pages.Recruitment;
import com.juaracoding.selenium.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRecruitment {
    public static WebDriver driver;
    private Login login;
    private Recruitment recruitment;

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
        recruitment = new Recruitment();
    }

    @AfterClass
    public void closeBrowser() {
        delay(Constants.DETIK);
        driver.quit();
    }

    @Test
    public void testRecruitmentPage() {
        delay(Constants.DETIK);
        //PreCondition
        login.login("Admin", "admin123");
        //step
        recruitment.menuRecruitment();
        Assert.assertEquals(recruitment.getTxtRecruitment(),"Recruitment");
        System.out.println("Test Case Recruitment Page");
    }

    @Test
    public void testSearchHiringByManager(){
        delay(1);
        recruitment.searchByHiringManager();
        Assert.assertTrue(recruitment.getTxtLinda().contains("Linda"));
        System.out.println("Test Case Search by Hiring Manager");
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
