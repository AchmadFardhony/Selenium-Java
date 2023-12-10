package com.example;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Ignore;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;


public class SeleniumJUNIT {

    public WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    @Test
    public void test1()throws InterruptedException {
    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
    Username.sendKeys("Fardhony");
    WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
    Password.sendKeys("Fardhony123");
    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
    Thread.sleep(3000);

    if (driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).isDisplayed()){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 5000)");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        Thread.sleep(5000);


        }
    }

    @Ignore
    public void test2()throws InterruptedException {
    driver.navigate().to("https://Google.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Pesija Jakarta");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
    

    }


    @After
    public void quit() {
    driver.quit();
        }
    }

