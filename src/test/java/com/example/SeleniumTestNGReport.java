package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestNGReport {
    public ExtentHtmlReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest test;
    public WebDriver driver;


    @BeforeTest
    public void setUp() {
        htmlReporter = new ExtentHtmlReporter("test-output/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void Test1() throws InterruptedException {
        test = extent.createTest("Test Google Search");
        test.info("Test started");
        driver.navigate().to("https://Google.com/");
        test.pass("Navigated to Google");
        driver.manage().window().maximize();
        test.pass("Maximize Window");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Pesija Jakarta");
        test.pass("Input Text");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
        test.pass("Entered Button");
    }

    @Test
    public void Test2() throws InterruptedException {
        test = extent.createTest("Test Google Search");
        test.info("Test started");
        driver.navigate().to("https://Google.com/");
        test.pass("Navigated to Google");
        driver.manage().window().maximize();
        test.pass("Maximize Window");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Persib Bandung");
        test.pass("Input Text");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
        test.pass("Entered Button");
    }


    @Test
    public void Test3() throws InterruptedException {
        test = extent.createTest("Test Google Search");
        test.info("Test started");
        driver.navigate().to("https://Google.com/");
        test.pass("Navigated to Google");
        driver.manage().window().maximize();
        test.pass("Maximize Window");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Persebaya Surabaya");
        test.pass("Input Text");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
        test.pass("Entered Button");
    }


    @AfterTest
    public void tearDown() {
        driver.quit();
        extent.flush();
    }
}


