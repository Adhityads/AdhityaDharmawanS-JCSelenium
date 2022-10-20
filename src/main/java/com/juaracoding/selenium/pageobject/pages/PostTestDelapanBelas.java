package com.juaracoding.selenium.pageobject.pages;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class PostTestDelapanBelas {
    private WebDriver driver;

    public PostTestDelapanBelas(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='noo-search']")
    WebElement btnSearch;

    @FindBy(xpath = "//input[@name='s']")
    WebElement txtSearch;

    @FindBy(xpath = "//p[@class='woocommerce-result-count']")
    WebElement txtResult;

    @FindBy(xpath = "//div[@class='noo-row']//div[2]//div[1]//div[1]//div[1]//div[2]//div[1]//a[1]")
    WebElement btnWishlistSatu;

    @FindBy(xpath = "//div[@class='noo-product-item one noo-product-sm-4 not_featured post-1441 product type-product status-publish has-post-thumbnail product_cat-bodycon-dresses product_tag-bodycon-dresses product_tag-women has-featured last instock shipping-taxable purchasable product-type-variable']//div[@class='noo-product-meta']//div[2]//div[1]//a[1]")
    WebElement btnWishlistDua;

    @FindBy(xpath = "//a[@class='custom-logo-link']//img[@alt='ToolsQA Demo Site']")
    WebElement btnMenu;

    @FindBy(xpath = "//a[normalize-space()='My Wishlist']")
    WebElement btnMenuWishlist;

    @FindBy(xpath = "//a[normalize-space()='black ribbed short sleeve lettuce hem midi dress']")
    WebElement txtWishlistSatu;

    @FindBy(xpath = "//a[normalize-space()='white bandage cut out bodycon mini dress']")
    WebElement txtWishlistDua;

    public void search() {
        btnSearch.click();
        txtSearch.sendKeys("DRESS", Keys.ENTER);
    }

    public String getTxtResult(){
        return txtResult.getText();
    }

    public void addToWishlist(){
        btnWishlistSatu.click();
        delay(1);
        btnWishlistDua.click();
        btnMenu.click();
    }

    public void menuWishlist(){
        btnMenuWishlist.click();
    }

    public String gettxtWishlistSatu(){
        return txtWishlistSatu.getText();
    }

    public String getTxtWishlistDua(){
        return txtWishlistDua.getText();
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



