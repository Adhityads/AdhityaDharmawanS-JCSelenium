package com.juaracoding.selenium.pageobject;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import com.juaracoding.selenium.pageobject.pages.Login;
import com.juaracoding.selenium.pageobject.pages.PostTestDelapanBelas;
import com.juaracoding.selenium.pageobject.pages.Recruitment;
import com.juaracoding.selenium.pageobject.utils.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPostTestDelapanBelas {public static WebDriver driver;
    private PostTestDelapanBelas postTestDelapanBelas;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance("Chrome");
        driver = DriverSingleton.getDriver();
        String url = "https://shop.demoqa.com/";
        driver.get(url);

    }

    @BeforeMethod
    public void pageObject() {
        postTestDelapanBelas = new PostTestDelapanBelas();
    }

    @AfterClass
    public void closeBrowser() {
        delay(Constants.DETIK);
        driver.quit();
    }

    @Test(priority = 1)
    public void testSearch(){
        delay(1);
        postTestDelapanBelas.search();
        Assert.assertEquals(postTestDelapanBelas.getTxtResult(),"Showing all 16 results");
        System.out.println("Test Search Berhasil Dilakukan");
    }
    @Test(priority = 2)
    public void testAddToWhishlist(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        postTestDelapanBelas.addToWishlist();
        delay(1);
        js.executeScript("window.scrollBy(0,500)");
        postTestDelapanBelas.menuWishlist();
        delay(1);
        js.executeScript("window.scrollBy(0,400)");
        Assert.assertTrue(postTestDelapanBelas.gettxtWishlistSatu().contains("DRESS"));
        Assert.assertTrue(postTestDelapanBelas.getTxtWishlistDua().contains("DRESS"));
        System.out.println("Test Wishlist Berhasil Dilakukan");

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
