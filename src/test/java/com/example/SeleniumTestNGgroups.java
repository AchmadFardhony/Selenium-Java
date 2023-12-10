package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTestNGgroups {

   public WebDriver driver; 

    @BeforeTest(groups = "smoke")
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    
    }

    @Test(groups = "smoke")
    public void testMethod1() throws InterruptedException {
        driver.navigate().to("https://Google.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("persib bandung");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @Test(groups = "smoke")
    public void testMethod2() throws InterruptedException {
        driver.navigate().to("https://Google.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Persebaya surabaya");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @Test(groups = "regression")
    public void testMethod3() throws InterruptedException {
        driver.navigate().to("https://Google.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Persebaya Surabaya");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @AfterTest(groups = "smoke")
    public void testMethod4() throws InterruptedException {
        driver.close();
    }
}
