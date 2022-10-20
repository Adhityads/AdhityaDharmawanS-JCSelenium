import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium {
    AndroidDriver driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_4_API_25");

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");

        dc.setCapability("appPackage", "com.android.calculator2");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator"); // This is Launcher activity of your app
        // (you can get it from apk info app)

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url, dc);

        Thread.sleep(5000);
        WebElement satu = driver.findElementById("com.android.calculator2:id/digit_1");
        satu.click();
        WebElement plus = driver.findElementById("com.android.calculator2:id/op_add");
        plus.click();
        WebElement dua = driver.findElementById("com.android.calculator2:id/digit_2");
        dua.click();
        WebElement equal = driver.findElementById("com.android.calculator2:id/eq");
        equal.click();
        String result = driver.findElementById("com.android.calculator2:id/result").getText();
        System.out.println("Test Automation Mobile Tambah Berhasil");
        System.out.println(result);

        WebElement tiga = driver.findElementById("com.android.calculator2:id/digit_3");
        tiga.click();
        WebElement multi = driver.findElementById("com.android.calculator2:id/op_mul");
        multi.click();
        WebElement empat = driver.findElementById("com.android.calculator2:id/digit_4");
        empat.click();
        equal.click();
        String results = driver.findElementById("com.android.calculator2:id/result").getText();
        System.out.println("Test Automation Mobile Kali Berhasil");
        System.out.println(results);


    }
}