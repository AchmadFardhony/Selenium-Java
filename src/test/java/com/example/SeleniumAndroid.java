package com.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumAndroid {

   public AndroidDriver driver;

    @BeforeTest()
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 9");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0.3.0");
        capabilities.setCapability(MobileCapabilityType.UDID, "77a2cac70408");
        // capabilities.setCapability("appPackage", "id.cerberus.brique");
        // capabilities.setCapability("appActivity", "com.example.brique.MainActivity");
        capabilities.setCapability("appPackage", "io.appium.android.apis");
        capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test()
    public void testMethod1() throws InterruptedException {
        driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("android:id/button1")).click();
        System.out.println("Application Started....");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Alert Dialogs\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Text Entry dialog\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"io.appium.android.apis:id/username_edit\"]")).sendKeys("Achmad Fardhony");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"io.appium.android.apis:id/password_edit\"]")).sendKeys("Persija 1928");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
        Thread.sleep(3000);
    }

    @Test()
    public void testMethod2() throws InterruptedException {
        driver.navigate().back();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Activity\"]")).click();
    }


    @AfterTest()
    public void teardown() throws InterruptedException {
        driver.closeApp();
        driver.quit();

    }
}
