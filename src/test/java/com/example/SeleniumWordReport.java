package com.example;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFPicture;
import org.apache.poi.util.Units;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SeleniumWordReport {
    public static void main(String[] args) throws IOException, InvalidFormatException, InterruptedException {
        // Setup Selenium WebDriver
        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Setup Apache POI Word Document
        XWPFDocument document = new XWPFDocument();

        // Selenium Actions
        driver.get("https://Google.com");
        String pageTitle = driver.getTitle();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        // Take a screenshot1 
        File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("persib bandung");
        Thread.sleep(3000);
        // Take a screenshot 2
        File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);


        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        // Take a screenshot 3
        File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Generate Word Report
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText("Selenium Test Report");
        run.addBreak();
        run.setText("Page Title: " + pageTitle);

        try {
            // Add screenshot to the document
            paragraph = document.createParagraph();
            run = paragraph.createRun();

            // Add picture from file 1
            FileInputStream fis1 = new FileInputStream(screenshot1);
            XWPFPicture picture1 = run.addPicture(fis1, XWPFDocument.PICTURE_TYPE_PNG, "screenshot1.png", Units.toEMU(480), Units.toEMU(300));
            fis1.close();

            // Add picture from file 2
            FileInputStream fis2 = new FileInputStream(screenshot2);
            XWPFPicture picture2 = run.addPicture(fis2, XWPFDocument.PICTURE_TYPE_PNG, "screenshot2.png", Units.toEMU(480), Units.toEMU(300));
            fis2.close();

            // Add picture from file 3
            FileInputStream fis3 = new FileInputStream(screenshot3);
            XWPFPicture picture3 = run.addPicture(fis3, XWPFDocument.PICTURE_TYPE_PNG, "screenshot3.png", Units.toEMU(480), Units.toEMU(300));
            fis3.close();

            // Save the document
            try (FileOutputStream out = new FileOutputStream("SeleniumTestReport.docx")) {
                document.write(out);
                System.out.println("Selenium Test Report created successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close WebDriver
            driver.quit();
        }
    }
}
