package com.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SeleniumExcel {

    public WebDriver driver;

    @BeforeTest ()
    public void setUp() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test ()
    public void testmethod4() throws InterruptedException, IOException {

        String excelFilePath = "C:\\Users\\achma\\Documents\\seleniumfirst\\Excel\\DataLogin.xlsx";
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
        Row row = sheet.getRow(i);

        String username = row.getCell(0).getStringCellValue();
        String password = row.getCell(1).getStringCellValue();

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
        Username.sendKeys(username);
        WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
        Password.sendKeys(password);
       
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
       
        workbook.close();

    }
}

     @AfterTest()
     public void testMethod5() throws InterruptedException {
            driver.close();
        }
    }
    

