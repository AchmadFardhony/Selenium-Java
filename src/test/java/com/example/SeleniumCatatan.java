package com.example;

import static org.junit.Assert.assertArrayEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Ignore;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumCatatan {

    public WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\achma\\Documents\\demo\\src\\drivers\\chromedriver.exe");
    // WebDriver driver = new ChromeDriver();
    // WebDriverWait myWait = new WebDriverWait(driver, 10);
    }
    
    @Test
    public void test()throws InterruptedException {

    // driver.findElement(By.className(“someClassName”))
    // driver.findElement(By.cssSelector(“input#email”))
    // driver.findElement(By.id(“someId”))
    // driver.findElement(By.linkText(“REGISTRATION”))
    // driver.findElement(By.name(“someName”))
    // driver.findElement(By.partialLinkText(“REG”))
    // driver.findElement(By.tagName(“div”))
    // driver.findElement(By.xpath(“//html/body/div/table/tbody/tr/td[2]/table/
    // tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/ form/table/tbody/tr[5]”))
    // driver.switchTo().frame("classFrame");
    // String alertMessage = "";
    // alertMessage = driver.switchTo().alert().getText();
    // driver.switchTo().alert().accept();
    // driver.navigate().to()
    // driver.navigate().refresh()
    // driver.navigate().back()
    // driver.navigate().forward()
    // driver.close()
    // driver.quit()
    // driver.findElement(By.linkText(“REGISTRATION”)).isEnabled()
    // driver.findElement(By.linkText(“REGISTRATION”)).isDisplayed()
    // driver.findElement(By.linkText(“REGISTRATION”)).isSelected()
    // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    // clickAndHold()
    // contextClick()
    // doubleClick()

    // dragAndDrop(source, target)
    // source- element to emulate button down at.
    // target- element to move to and release the mouse at.

    // dragAndDropBy(source, x-offset, y-offset)
    // source- element to emulate button down at.
    // xOffset- horizontal move offset.
    // yOffset- vertical move offset.

    // keyDown(modifier_key)
    // modifier_key – any of the modifier keys (Keys.ALT, Keys.SHIFT, or Keys.CONTROL)
    // keyUp(modifier _key)	Performs a key release.
    // modifier_key – any of the modifier keys (Keys.ALT, Keys.SHIFT, or Keys.CONTROL)

    // moveByOffset(x-offset, y-offset)
    // x-offset- horizontal offset. A negative value means moving the mouse left.
    // y-offset- vertical offset. A negative value means moving the mouse down.

    // moveToElement(toElement)
    // toElement- element to move to.

}


    @After
    public void quit() {
    driver.quit();
        }
    }

